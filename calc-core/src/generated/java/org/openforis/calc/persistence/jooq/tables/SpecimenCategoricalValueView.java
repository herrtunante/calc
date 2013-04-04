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
public class SpecimenCategoricalValueView extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord> {

	private static final long serialVersionUID = -393051891;

	/**
	 * The singleton instance of calc.specimen_categorical_value_view
	 */
	public static final org.openforis.calc.persistence.jooq.tables.SpecimenCategoricalValueView SPECIMEN_CATEGORICAL_VALUE_VIEW = new org.openforis.calc.persistence.jooq.tables.SpecimenCategoricalValueView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord.class;
	}

	/**
	 * The table column <code>calc.specimen_categorical_value_view.value_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> VALUE_ID = createField("value_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.specimen_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> SPECIMEN_ID = createField("specimen_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.category_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.original</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Boolean> ORIGINAL = createField("original", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.current</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.variable_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.category_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.String> CATEGORY_CODE = createField("category_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.category_label</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.String> CATEGORY_LABEL = createField("category_label", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.category_order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> CATEGORY_ORDER = createField("category_order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.banding_interval</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.String> BANDING_INTERVAL = createField("banding_interval", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.banding_source_variable_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.Integer> BANDING_SOURCE_VARIABLE_ID = createField("banding_source_variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.specimen_categorical_value_view.category_description</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoricalValueViewRecord, java.lang.String> CATEGORY_DESCRIPTION = createField("category_description", org.jooq.impl.SQLDataType.VARCHAR, this);

	public SpecimenCategoricalValueView() {
		super("specimen_categorical_value_view", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public SpecimenCategoricalValueView(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.SpecimenCategoricalValueView.SPECIMEN_CATEGORICAL_VALUE_VIEW);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.SpecimenCategoricalValueView as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.SpecimenCategoricalValueView(alias);
	}
}
