package org.rcsb.cif.model.ndbstructnabasepairstep;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Slide extends FloatColumn {
    public Slide(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Slide(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Slide(String name) {
        super(name);
    }
}