package org.rcsb.cif.model.pdbxnmrensemble;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AverageConstraintsPerResidue extends IntColumn {
    public AverageConstraintsPerResidue(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public AverageConstraintsPerResidue(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public AverageConstraintsPerResidue(String name) {
        super(name);
    }
}