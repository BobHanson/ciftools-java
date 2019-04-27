package org.rcsb.cif.model.reflns;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class LimitLMin extends SingleRowIntColumn {
    public LimitLMin(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public LimitLMin(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public LimitLMin(String name) {
        super(name);
    }
}