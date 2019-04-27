package org.rcsb.cif.model.pdbxsolnscattermodel;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntryFittingList extends StrColumn {
    public EntryFittingList(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public EntryFittingList(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public EntryFittingList(String name) {
        super(name);
    }
}