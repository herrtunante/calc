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
public class PlotNumericValue extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord> {

	private static final long serialVersionUID = -1718710517;

	/**
	 * The singleton instance of calc.plot_numeric_value
	 */
	public static final org.openforis.calc.persistence.jooq.tables.PlotNumericValue PLOT_NUMERIC_VALUE = new org.openforis.calc.persistence.jooq.tables.PlotNumericValue();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord.class;
	}

	/**
	 * The table column <code>calc.plot_numeric_value.value_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Integer> VALUE_ID = createField("value_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_numeric_value.plot_section_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_plot_section_fkey
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Integer> PLOT_SECTION_ID = createField("plot_section_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_numeric_value.variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_variable_fkey
	 * FOREIGN KEY (variable_id)
	 * REFERENCES calc.variable (variable_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_numeric_value.value</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The table column <code>calc.plot_numeric_value.original</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Boolean> ORIGINAL = createField("original", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.plot_numeric_value.current</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN, this);

	public PlotNumericValue() {
		super("plot_numeric_value", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public PlotNumericValue(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_PLOT_NUMERIC_VALUE;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.PLOT_NUMERIC_VALUE_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord>>asList(org.openforis.calc.persistence.jooq.Keys.PLOT_NUMERIC_VALUE_PKEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.PLOT_NUMERIC_VALUE__PLOT_NUMERIC_VALUE_PLOT_SECTION_FKEY, org.openforis.calc.persistence.jooq.Keys.PLOT_NUMERIC_VALUE__PLOT_NUMERIC_VALUE_VARIABLE_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.PlotNumericValue as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.PlotNumericValue(alias);
	}
}
