package org.rcsb.cif.model.pdbxnmrconstraintfile;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ConstraintFilename extends StrColumn {
    public ConstraintFilename(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ConstraintFilename(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ConstraintFilename(String name) {
        super(name);
    }
}