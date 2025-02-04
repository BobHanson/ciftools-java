package org.rcsb.cif.api.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ION_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * information is repeated.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxIonInfo extends BaseCategory {
    public PdbxIonInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxIonInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxIonInfo(String name) {
        super(name);
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Name of ion.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Number of ion molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumbPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("numb_per_asym_unit", IntColumn::new) :
                getBinaryColumn("numb_per_asym_unit"));
    }
}
