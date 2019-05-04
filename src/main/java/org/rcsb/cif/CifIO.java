package org.rcsb.cif;

import org.rcsb.cif.binary.BinaryCifReader;
import org.rcsb.cif.binary.BinaryCifWriter;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.text.TextCifReader;
import org.rcsb.cif.text.TextCifWriter;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Collection of IO operations to retrieve, process, and write CIF files.
 */
public class CifIO {
    private static final int BUFFER_SIZE = 65536;
    private static final CifOptions DEFAULT_OPTIONS = CifOptions.builder().build();

    public static CifFile readById(String pdbId) throws IOException {
        return readById(pdbId, DEFAULT_OPTIONS);
    }

    public static CifFile readById(String pdbId, CifOptions options) throws IOException {
        return readFromURL(new URL(String.format(options.getFetchUrl(), pdbId)), options);
    }

    public static CifFile readFromURL(URL url) throws IOException {
        return readFromURL(url, DEFAULT_OPTIONS);
    }

    public static CifFile readFromURL(URL url, CifOptions options) throws IOException {
        return readFromInputStream(url.openStream(), DEFAULT_OPTIONS);
    }

    public static CifFile readFromPath(Path path) throws IOException {
        return readFromPath(path, DEFAULT_OPTIONS);
    }

    public static CifFile readFromPath(Path path, CifOptions options) throws IOException {
        return readFromInputStream(Files.newInputStream(path), options);
    }

    public static CifFile readFromInputStream(InputStream inputStream) throws IOException {
        return readFromInputStream(inputStream, DEFAULT_OPTIONS);
    }

    private static final byte[] TEXT_MAGIC = new byte[] { 0x64, 0x61, 0x74, 0x61 };

    public static CifFile readFromInputStream(InputStream inputStream, CifOptions options) throws IOException {
        // performance: explicitly buffer stream, increases performance drastically
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream, BUFFER_SIZE);
        }

        // while reading the stream, check if gzipped
        boolean streamStart = true;
        boolean gzipped = false;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int bytesRead;
        byte[] buffer = new byte[BUFFER_SIZE];
        while ((bytesRead = inputStream.read(buffer, 0, buffer.length)) != -1) {
            // check first two bytes of stream for magic
            if (streamStart) {
                gzipped = GZIPInputStream.GZIP_MAGIC == (buffer[0] & 0xff | ((buffer[1] << 8) & 0xff00));
                streamStart = false;
            }

            byteArrayOutputStream.write(buffer, 0, bytesRead);
        }

        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        inputStream.close();

        // determine binary or text
        byte[] probe = Arrays.copyOf(byteArray, TEXT_MAGIC.length);
        boolean text = Arrays.equals(TEXT_MAGIC, probe);

//        System.out.println("is gzip: " + gzipped);
//        System.out.println("is text: " + text);

        return text ? new TextCifReader(options).read(byteArray) : new BinaryCifReader(options).read(byteArray);
    }

    public static void writeBinary(CifFile cifFile, Path outputFile) throws IOException {
        writeBinary(cifFile, outputFile, DEFAULT_OPTIONS);
    }

    public static void writeBinary(CifFile cifFile, Path outputFile, CifOptions options) throws IOException {
        Files.write(outputFile, writeBinary(cifFile, options));
    }

    public static byte[] writeBinary(CifFile cifFile) throws IOException {
        return writeBinary(cifFile, DEFAULT_OPTIONS);
    }

    public static byte[] writeBinary(CifFile cifFile, CifOptions options) throws IOException {
        byte[] raw = new BinaryCifWriter(options).write(cifFile);
        return options.isGzip() ? compress(raw) : raw;
    }

    public static void writeText(CifFile cifFile, Path outputFile) throws IOException {
        writeText(cifFile, outputFile, DEFAULT_OPTIONS);
    }

    public static void writeText(CifFile cifFile, Path outputFile, CifOptions options) throws IOException {
        Files.write(outputFile, writeText(cifFile, options));
    }

    public static byte[] writeText(CifFile cifFile) throws IOException {
        return writeText(cifFile, DEFAULT_OPTIONS);
    }

    public static byte[] writeText(CifFile cifFile, CifOptions options) throws IOException {
        byte[] raw = new TextCifWriter(options).write(cifFile);
        return options.isGzip() ? compress(raw) : raw;
    }

    private static byte[] compress(byte[] bytes) throws IOException {
        byte[] output;
        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream(bytes.length)) {
            try (GZIPOutputStream zipStream = new GZIPOutputStream(byteStream)) {
                zipStream.write(bytes);
            }
            output = byteStream.toByteArray();
        }
        return output;
    }
}