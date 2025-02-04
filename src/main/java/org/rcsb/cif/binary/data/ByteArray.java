package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.encoding.ByteArrayEncoding;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.StringArrayEncoding;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;

public class ByteArray extends AbstractEncodedData<byte[]> {
    ByteArray(byte[] data) {
        this(data, new LinkedList<>());
    }

    ByteArray(byte[] data, LinkedList<Encoding> encoding) {
        super(data, encoding);
    }

    @Override
    public byte[] getData() {
        return (byte[]) data;
    }

    @Override
    public int length() {
        return getData().length;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + Arrays.toString(getData());
    }

    public NumberArray decode(ByteArrayEncoding encoding) {
        return Codec.BYTE_ARRAY_CODEC.decode(this, encoding);
    }

    public StringArray decode(StringArrayEncoding encoding) {
        return Codec.STRING_ARRAY_CODEC.decode(this, encoding);
    }

    public Int8Array toInt8Array(LinkedList<Encoding> encoding) {
        int[] ints = new int[length()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(getData());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.get();
        }
        return new Int8Array(ints, encoding);
    }

	public Int16Array toInt16Array(LinkedList<Encoding> encoding) {
		byte[] data = getData();
		int[] ints;
		/**
		 * @j2sNative
		 * 
		 * 			ints=java.nio.Bits._toInt16$BA(data);
		 */
		{
			ints = new int[length() / 2];

			ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
			for (int i = 0; i < ints.length; i++) {
				ints[i] = byteBuffer.getShort();
			}
		}
		return new Int16Array(ints, encoding);
	}

	public Int32Array toInt32Array(LinkedList<Encoding> encoding) {
		byte[] data = getData();
		int[] ints;
		/**
		 * @j2sNative
		 * 
		 * 			ints=java.nio.Bits._toInt32$BA(data);
		 */
		{
			ints = new int[length() / 4];
			ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
			for (int i = 0; i < ints.length; i++) {
				ints[i] = byteBuffer.getInt();
			}
		}
		return new Int32Array(ints, encoding);
	}

    public Uint8Array toUint8Array(LinkedList<Encoding> encoding) {
        int[] ints = new int[length()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(getData());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.get() & 0xFF;
        }
        return new Uint8Array(ints, encoding);
    }

    public Uint16Array toUint16Array(LinkedList<Encoding> encoding) {
        int[] ints = new int[length() / 2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = byteBuffer.getShort() & 0xFFFF;
        }
        return new Uint16Array(ints, encoding);
    }

    public Uint32Array toUint32Array(LinkedList<Encoding> encoding) {
        int[] ints = new int[length() / 4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(getData()).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (byteBuffer.getInt() & 0xFFFFFFFFL);
        }
        return new Uint32Array(ints, encoding);
    }

	public Float32Array toFloat32Array(LinkedList<Encoding> encoding) {
		byte[] data = getData();
		double[] doubles;
		/**
		 * @j2sNative
		 * 
		 * 			doubles=java.nio.Bits._toFloat32$BA(data);
		 */
		{
			doubles = new double[length() / 4];
			ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
			for (int i = 0; i < doubles.length; i++) {
				doubles[i] = byteBuffer.getFloat();
			}
		}
		return new Float32Array(doubles, encoding);
	}

	public Float64Array toFloat64Array(LinkedList<Encoding> encoding) {
		byte[] data = getData();
		double[] doubles;
		/**
		 * @j2sNative
		 * 
		 * 		doubles=java.nio.Bits._toFloat64$BA(data);
		 */
		{
			doubles = new double[length() / 8];
			ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
			for (int i = 0; i < doubles.length; i++) {
				doubles[i] = byteBuffer.getDouble();
			}
		}
		return new Float64Array(doubles, encoding);
	}
}
