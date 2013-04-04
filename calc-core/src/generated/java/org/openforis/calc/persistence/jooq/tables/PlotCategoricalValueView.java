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
public class PlotCategoricalValueView extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord> {

	private static final long serialVersionUID = -515936335;

	/**
	 * The singleton instance of calc.plot_categorical_value_view
	 */
	public static final org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView PLOT_CATEGORICAL_VALUE_VIEW = new org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord.class;
	}

	/**
	 * The table column <code>calc.plot_categorical_value_view.value_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> VALUE_ID = createField("value_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.plot_section_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> PLOT_SECTION_ID = createField("plot_section_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.category_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.original</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Boolean> ORIGINAL = createField("original", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.current</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.variable_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.variable_type</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.String> VARIABLE_TYPE = createField("variable_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.variable_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.String> VARIABLE_NAME = createField("variable_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.variable_order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> VARIABLE_ORDER = createField("variable_order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.category_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.String> CATEGORY_CODE = createField("category_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.category_label</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.String> CATEGORY_LABEL = createField("category_label", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.plot_categorical_value_view.category_order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotCategoricalValueViewRecord, java.lang.Integer> CATEGORY_ORDER = createField("category_order", org.jooq.impl.SQLDataType.INTEGER, this);

	public PlotCategoricalValueView() {
		super("plot_categorical_value_view", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public PlotCategoricalValueView(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView.PLOT_CATEGORICAL_VALUE_VIEW);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView(alias);
	}
}
