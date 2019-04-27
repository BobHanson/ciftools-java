package org.rcsb.cif.model.pdbxnmrchemshiftref;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Solvent extends StrColumn {
    public Solvent(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public Solvent(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public Solvent(String name) {
        super(name);
    }
}