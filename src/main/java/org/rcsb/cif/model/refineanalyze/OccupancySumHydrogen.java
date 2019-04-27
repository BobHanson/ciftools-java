package org.rcsb.cif.model.refineanalyze;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class OccupancySumHydrogen extends FloatColumn {
    public OccupancySumHydrogen(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public OccupancySumHydrogen(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public OccupancySumHydrogen(String name) {
        super(name);
    }
}