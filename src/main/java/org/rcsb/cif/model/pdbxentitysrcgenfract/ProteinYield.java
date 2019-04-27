package org.rcsb.cif.model.pdbxentitysrcgenfract;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ProteinYield extends FloatColumn {
    public ProteinYield(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ProteinYield(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ProteinYield(String name) {
        super(name);
    }
}