package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LsMatrixType extends SingleRowStrColumn {
    public LsMatrixType(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LsMatrixType(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LsMatrixType(String name) {
        super(name);
    }
}