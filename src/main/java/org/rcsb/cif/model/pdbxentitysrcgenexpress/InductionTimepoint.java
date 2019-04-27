package org.rcsb.cif.model.pdbxentitysrcgenexpress;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class InductionTimepoint extends FloatColumn {
    public InductionTimepoint(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public InductionTimepoint(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public InductionTimepoint(String name) {
        super(name);
    }
}