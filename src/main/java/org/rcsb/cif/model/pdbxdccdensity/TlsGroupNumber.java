package org.rcsb.cif.model.pdbxdccdensity;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class TlsGroupNumber extends IntColumn {
    public TlsGroupNumber(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public TlsGroupNumber(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public TlsGroupNumber(String name) {
        super(name);
    }
}