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
public class TmpCategoricalValue extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord> {

	private static final long serialVersionUID = -1586317816;

	/**
	 * The singleton instance of calc.tmp_categorical_value
	 */
	public static final org.openforis.calc.persistence.jooq.tables.TmpCategoricalValue TMP_CATEGORICAL_VALUE = new org.openforis.calc.persistence.jooq.tables.TmpCategoricalValue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord.class;
	}

	/**
	 * The table column <code>calc.tmp_categorical_value.transaction_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord, java.lang.Integer> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tmp_categorical_value.object_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord, java.lang.Integer> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tmp_categorical_value.category_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TmpCategoricalValueRecord, java.lang.Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public TmpCategoricalValue() {
		super("tmp_categorical_value", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public TmpCategoricalValue(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.TmpCategoricalValue.TMP_CATEGORICAL_VALUE);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.TmpCategoricalValue as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.TmpCategoricalValue(alias);
	}
}
