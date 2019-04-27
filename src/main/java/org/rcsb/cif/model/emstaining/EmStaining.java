package org.rcsb.cif.model.emstaining;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmStaining extends BaseCategory {
    public EmStaining(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStaining(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStaining(String name) {
        super(name);
    }

    /**
     * Staining procedure used in the specimen preparation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is the primary key of the category.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The staining  material.
     * @return Material
     */
    public Material getMaterial() {
        return (Material) (isText ? textFields.computeIfAbsent("material",
                Material::new) : getBinaryColumn("material"));
    }

    /**
     * Foreign key relationship to the EMD SPECIMEN category
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * type of staining
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}