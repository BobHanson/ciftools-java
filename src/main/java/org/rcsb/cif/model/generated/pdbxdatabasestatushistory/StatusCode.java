package org.rcsb.cif.model.generated.pdbxdatabasestatushistory;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StatusCode extends SingleRowStrColumn {
    public StatusCode(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public StatusCode(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public StatusCode(String name) {
        super(name);
    }
}