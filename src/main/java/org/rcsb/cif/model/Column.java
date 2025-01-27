package org.rcsb.cif.model;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Represents a column of information in a {@link CifFile}, e.g. the coordinates in x-dimension of all atoms.
 */
public interface Column {
    int COLUMN_TYPE_INT = 0;
	int COLUMN_TYPE_FLOAT = 1;
	int COLUMN_TYPE_STRING = 2;
	int PRESENT = 0;
	int NOT_PRESENT = 1;
	int UNKNOWN = 2;
	String[] STR_PRESENCE = new String[] {null, ".", "?"};

	/**
     * The name of this {@link Column}.
     * @return the <code>String</code> which is used to acquire this column from its parent {@link Category}
     */
    String getColumnName();

    /**
     * The number of rows in this {@link Column}. 0 indicates undefined a {@link Column}.
     * @return the length of this {@link Column}
     */
    int getRowCount();

    /**
     * Access to entries of this {@link Column} without any assumptions about the content type. No checks about the
     * validity of the row argument are made. However, values smaller than 0 or larger or equal to the row count will
     * raise exceptions.
     * @param row index of the element to retrieve
     * @return the <code>String</code> representation of the corresponding row
     */
    String getStringData(int row);

    /**
     * Access to all entries of this column as <code>String</code> values.
     * @return a {@link Stream} of all <code>String</code> values
     */
    default Stream<String> stringData() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::getStringData);
    }

    /**
     * States the {@link ValueKind} for a particular row. Elements may either be 'present', 'not_specified' (.) or
     * 'unknown' (?).
     * @param row index of the element for which the {@link ValueKind} should be retrieved
     * @return the corresponding {@link ValueKind} enum entry
     */
    ValueKind getValueKind(int row);

    /**
     * {@link Stream} of all {@link ValueKind} annotations.
     * @return a {@link Stream} with a number of ValueKinds equal to row count
     */
    Stream<ValueKind> valueKinds();

    /**
     * Queries this column whether it is defined. To avoid {@link NullPointerException} being thrown left, right, and
     * center, categories and columns not present in a parsed file will be presented by an undefined state.
     * @return <code>false</code> if this {@link Column} has row count 0 and no data in it
     */
    boolean isDefined();

	int getType();
}
