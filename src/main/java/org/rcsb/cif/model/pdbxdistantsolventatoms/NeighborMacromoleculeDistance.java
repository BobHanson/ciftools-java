package org.rcsb.cif.model.pdbxdistantsolventatoms;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NeighborMacromoleculeDistance extends FloatColumn {
    public NeighborMacromoleculeDistance(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public NeighborMacromoleculeDistance(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public NeighborMacromoleculeDistance(String name) {
        super(name);
    }
}