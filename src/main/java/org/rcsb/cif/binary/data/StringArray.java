package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.util.Arrays;
import java.util.LinkedList;

public class StringArray extends AbstractEncodedData<String[]> {
    public StringArray(Object data, LinkedList<Encoding> encoding) {
        super(data, encoding);
    }

    StringArray(String[] data) {
        this(data, new LinkedList<>());
    }

    StringArray(String[] data, LinkedList<Encoding> encoding) {
        super(data, encoding);
    }

    @Override
    public String[] getData() {
        return (String[]) data;
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }

    public ByteArray encode(StringArrayEncoding encoding) {
        return Codec.STRING_ARRAY_CODEC.encode(this, encoding);
    }
}
