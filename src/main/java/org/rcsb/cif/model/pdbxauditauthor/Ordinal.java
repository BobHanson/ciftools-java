package org.rcsb.cif.model.pdbxauditauthor;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Ordinal extends IntColumn {
    public Ordinal(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Ordinal(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Ordinal(String name) {
        super(name);
    }
}