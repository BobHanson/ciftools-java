package org.rcsb.cif.model.reflnsysabs;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class I extends FloatColumn {
    public I(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public I(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public I(String name) {
        super(name);
    }
}