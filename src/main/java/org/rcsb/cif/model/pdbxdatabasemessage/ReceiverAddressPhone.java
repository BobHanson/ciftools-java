package org.rcsb.cif.model.pdbxdatabasemessage;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReceiverAddressPhone extends StrColumn {
    public ReceiverAddressPhone(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public ReceiverAddressPhone(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public ReceiverAddressPhone(String name) {
        super(name);
    }
}