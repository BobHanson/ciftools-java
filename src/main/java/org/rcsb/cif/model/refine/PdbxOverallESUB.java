package org.rcsb.cif.model.refine;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxOverallESUB extends SingleRowFloatColumn {
    public PdbxOverallESUB(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxOverallESUB(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxOverallESUB(String name) {
        super(name);
    }
}