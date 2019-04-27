package org.rcsb.cif.model.pdbxdccgeometry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RamachandranAllowedPercent extends FloatColumn {
    public RamachandranAllowedPercent(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public RamachandranAllowedPercent(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public RamachandranAllowedPercent(String name) {
        super(name);
    }
}