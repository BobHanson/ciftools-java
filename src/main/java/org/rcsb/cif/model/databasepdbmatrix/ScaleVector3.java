package org.rcsb.cif.model.databasepdbmatrix;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ScaleVector3 extends FloatColumn {
    public ScaleVector3(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ScaleVector3(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ScaleVector3(String name) {
        super(name);
    }
}