package org.rcsb.cif.model.pdbxdepuistatusflags;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class HasViewedValidationReport extends SingleRowStrColumn {
    public HasViewedValidationReport(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public HasViewedValidationReport(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public HasViewedValidationReport(String name) {
        super(name);
    }
}