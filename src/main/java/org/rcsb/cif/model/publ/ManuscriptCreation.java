package org.rcsb.cif.model.publ;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ManuscriptCreation extends SingleRowStrColumn {
    public ManuscriptCreation(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ManuscriptCreation(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ManuscriptCreation(String name) {
        super(name);
    }
}