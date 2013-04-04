/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PlotNumericValueRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord> {

	private static final long serialVersionUID = 1063811689;

	/**
	 * The table column <code>calc.plot_numeric_value.value_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setValueId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VALUE_ID, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.value_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getValueId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VALUE_ID);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.plot_section_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_plot_section_fkey
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public void setPlotSectionId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.PLOT_SECTION_ID, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.plot_section_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_plot_section_fkey
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public java.lang.Integer getPlotSectionId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.PLOT_SECTION_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord 
	 * PlotSectionRecord}
	 */
	public void setPlotSectionId(org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.PLOT_SECTION_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.PLOT_SECTION_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION.PLOT_SECTION_ID));
		}
	}

	/**
	 * The table column <code>calc.plot_numeric_value.plot_section_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_plot_section_fkey
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord fetchPlotSection() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION)
			.where(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION.PLOT_SECTION_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.PLOT_SECTION_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.plot_numeric_value.variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_variable_fkey
	 * FOREIGN KEY (variable_id)
	 * REFERENCES calc.variable (variable_id)
	 * </pre></code>
	 */
	public void setVariableId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_variable_fkey
	 * FOREIGN KEY (variable_id)
	 * REFERENCES calc.variable (variable_id)
	 * </pre></code>
	 */
	public java.lang.Integer getVariableId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.VariableRecord 
	 * VariableRecord}
	 */
	public void setVariableId(org.openforis.calc.persistence.jooq.tables.records.VariableRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID));
		}
	}

	/**
	 * The table column <code>calc.plot_numeric_value.variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_numeric_value__plot_numeric_value_variable_fkey
	 * FOREIGN KEY (variable_id)
	 * REFERENCES calc.variable (variable_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.VariableRecord fetchVariable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE)
			.where(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.plot_numeric_value.value</code>
	 */
	public void setValue(java.lang.Double value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VALUE, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.value</code>
	 */
	public java.lang.Double getValue() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VALUE);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.original</code>
	 */
	public void setOriginal(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.ORIGINAL, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.original</code>
	 */
	public java.lang.Boolean getOriginal() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.ORIGINAL);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.current</code>
	 */
	public void setCurrent(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.CURRENT, value);
	}

	/**
	 * The table column <code>calc.plot_numeric_value.current</code>
	 */
	public java.lang.Boolean getCurrent() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.CURRENT);
	}

	/**
	 * Create a detached PlotNumericValueRecord
	 */
	public PlotNumericValueRecord() {
		super(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE);
	}
}
