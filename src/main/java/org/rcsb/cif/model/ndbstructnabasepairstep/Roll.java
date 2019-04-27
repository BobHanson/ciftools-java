package org.rcsb.cif.model.ndbstructnabasepairstep;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Roll extends FloatColumn {
    public Roll(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Roll(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Roll(String name) {
        super(name);
    }
}