package org.rcsb.cif.model.generated.emstartmodel;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Other extends SingleRowStrColumn {
    public Other(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Other(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Other(String name) {
        super(name);
    }
}