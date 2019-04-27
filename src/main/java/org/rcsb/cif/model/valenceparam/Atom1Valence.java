package org.rcsb.cif.model.valenceparam;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Atom1Valence extends IntColumn {
    public Atom1Valence(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Atom1Valence(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Atom1Valence(String name) {
        super(name);
    }
}