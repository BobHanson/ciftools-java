package org.rcsb.cif.model.pdbxentitysrcgenproteolysis;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CleavageBufferId extends StrColumn {
    public CleavageBufferId(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public CleavageBufferId(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public CleavageBufferId(String name) {
        super(name);
    }
}