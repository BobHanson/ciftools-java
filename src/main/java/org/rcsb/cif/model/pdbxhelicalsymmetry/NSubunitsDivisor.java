package org.rcsb.cif.model.pdbxhelicalsymmetry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NSubunitsDivisor extends SingleRowIntColumn {
    public NSubunitsDivisor(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NSubunitsDivisor(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NSubunitsDivisor(String name) {
        super(name);
    }
}