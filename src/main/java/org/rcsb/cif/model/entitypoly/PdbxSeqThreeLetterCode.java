package org.rcsb.cif.model.entitypoly;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSeqThreeLetterCode extends StrColumn {
    public PdbxSeqThreeLetterCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxSeqThreeLetterCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxSeqThreeLetterCode(String name) {
        super(name);
    }
}