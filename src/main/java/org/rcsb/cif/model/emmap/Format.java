package org.rcsb.cif.model.emmap;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Format extends SingleRowStrColumn {
    public Format(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Format(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Format(String name) {
        super(name);
    }
}