package org.rcsb.cif.model.pdbxphasingmadshell;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Reflns extends IntColumn {
    public Reflns(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Reflns(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Reflns(String name) {
        super(name);
    }
}