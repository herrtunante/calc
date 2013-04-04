/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class TmpNumericValue extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord> {

	private static final long serialVersionUID = -2011666919;

	/**
	 * The singleton instance of calc.tmp_numeric_value
	 */
	public static final org.openforis.calc.persistence.jooq.tables.TmpNumericValue TMP_NUMERIC_VALUE = new org.openforis.calc.persistence.jooq.tables.TmpNumericValue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord.class;
	}

	/**
	 * The table column <code>calc.tmp_numeric_value.transaction_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord, java.lang.Integer> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tmp_numeric_value.object_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord, java.lang.Integer> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tmp_numeric_value.variable_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tmp_numeric_value.value</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpNumericValueRecord, java.lang.Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this);

	public TmpNumericValue() {
		super("tmp_numeric_value", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public TmpNumericValue(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.TmpNumericValue.TMP_NUMERIC_VALUE);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.TmpNumericValue as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.TmpNumericValue(alias);
	}
}
