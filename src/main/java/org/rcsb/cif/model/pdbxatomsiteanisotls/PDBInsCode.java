package org.rcsb.cif.model.pdbxatomsiteanisotls;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PDBInsCode extends StrColumn {
    public PDBInsCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PDBInsCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PDBInsCode(String name) {
        super(name);
    }
}