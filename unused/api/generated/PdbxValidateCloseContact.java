package org.rcsb.cif.api.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_VALIDATE_CLOSE_CONTACT category list the
 * atoms within the entry that are in close contact with regard
 * the distances expected from either covalent bonding or closest
 * approach by van der Waals contacts. Contacts within
 * the asymmetric unit are considered.
 * 
 * For those contacts not involving hydrogen a limit of
 * 2.2 Angstroms is used. For contacts involving a hydrogen atom
 * a cutoff of 1.6 Angstroms is used.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxValidateCloseContact extends BaseCategory {
    public PdbxValidateCloseContact(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxValidateCloseContact(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxValidateCloseContact(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_validate_close_contact.id must uniquely identify
     * each item in the PDBX_VALIDATE_CLOSE_CONTACT list.
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model number for the given contact
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("PDB_model_num", IntColumn::new) :
                getBinaryColumn("PDB_model_num"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_1", StrColumn::new) :
                getBinaryColumn("auth_asym_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the close contact.
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_1", StrColumn::new) :
                getBinaryColumn("auth_atom_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_1", StrColumn::new) :
                getBinaryColumn("auth_comp_id_1"));
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_1", StrColumn::new) :
                getBinaryColumn("auth_seq_id_1"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id_2", StrColumn::new) :
                getBinaryColumn("auth_atom_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the close contact.
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_2", StrColumn::new) :
                getBinaryColumn("auth_asym_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id_2", StrColumn::new) :
                getBinaryColumn("auth_comp_id_2"));
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the close contact.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id_2", StrColumn::new) :
                getBinaryColumn("auth_seq_id_2"));
    }

    /**
     * Optional identifier of the first of the two atom sites that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_1", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_1"));
    }

    /**
     * Optional identifier of the second of the two atom sites that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("PDB_ins_code_2", StrColumn::new) :
                getBinaryColumn("PDB_ins_code_2"));
    }

    /**
     * An optional identifier of the first of the two atoms that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_1", StrColumn::new) :
                getBinaryColumn("label_alt_id_1"));
    }

    /**
     * An optional identifier of the second of the two atoms that
     * define the close contact.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id_2", StrColumn::new) :
                getBinaryColumn("label_alt_id_2"));
    }

    /**
     * The symmetry of the first of the two atoms define the close contact.
     * The Symmetry equivalent position is given in the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSymmAsXyz1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symm_as_xyz_1", StrColumn::new) :
                getBinaryColumn("symm_as_xyz_1"));
    }

    /**
     * The symmetry of the second of the two atoms define the close contact.
     * The Symmetry equivalent position is given in the 'xyz' representation.
     * @return StrColumn
     */
    public StrColumn getSymmAsXyz2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symm_as_xyz_2", StrColumn::new) :
                getBinaryColumn("symm_as_xyz_2"));
    }

    /**
     * The value of the close contact for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist", FloatColumn::new) :
                getBinaryColumn("dist"));
    }
}
