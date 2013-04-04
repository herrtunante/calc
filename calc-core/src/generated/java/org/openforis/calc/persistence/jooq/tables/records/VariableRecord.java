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
public class VariableRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.VariableRecord> {

	private static final long serialVersionUID = 1442211767;

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setVariableId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID, value);
	}

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getVariableId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID);
	}

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> fetchCategoryListByBandingSourceVariableId() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Category.CATEGORY)
			.where(org.openforis.calc.persistence.jooq.tables.Category.CATEGORY.BANDING_SOURCE_VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> fetchCategoryListByVariableId() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Category.CATEGORY)
			.where(org.openforis.calc.persistence.jooq.tables.Category.CATEGORY.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.InterviewNumericValueRecord> fetchInterviewNumericValueList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.InterviewNumericValue.INTERVIEW_NUMERIC_VALUE)
			.where(org.openforis.calc.persistence.jooq.tables.InterviewNumericValue.INTERVIEW_NUMERIC_VALUE.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.variable_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.PlotNumericValueRecord> fetchPlotNumericValueList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE)
			.where(org.openforis.calc.persistence.jooq.tables.PlotNumericValue.PLOT_NUMERIC_VALUE.VARIABLE_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.variable.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_obs_unit_fkey
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (obs_unit_id)
	 * </pre></code>
	 */
	public void setObsUnitId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.OBS_UNIT_ID, value);
	}

	/**
	 * The table column <code>calc.variable.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_obs_unit_fkey
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (obs_unit_id)
	 * </pre></code>
	 */
	public java.lang.Integer getObsUnitId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.OBS_UNIT_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord 
	 * ObservationUnitRecord}
	 */
	public void setObsUnitId(org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.OBS_UNIT_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.OBS_UNIT_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.ObservationUnit.OBSERVATION_UNIT.OBS_UNIT_ID));
		}
	}

	/**
	 * The table column <code>calc.variable.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT variable__variable_obs_unit_fkey
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (obs_unit_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord fetchObservationUnit() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.ObservationUnit.OBSERVATION_UNIT)
			.where(org.openforis.calc.persistence.jooq.tables.ObservationUnit.OBSERVATION_UNIT.OBS_UNIT_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.OBS_UNIT_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.variable.variable_name</code>
	 */
	public void setVariableName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_NAME, value);
	}

	/**
	 * The table column <code>calc.variable.variable_name</code>
	 */
	public java.lang.String getVariableName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_NAME);
	}

	/**
	 * The table column <code>calc.variable.variable_type</code>
	 */
	public void setVariableType(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_TYPE, value);
	}

	/**
	 * The table column <code>calc.variable.variable_type</code>
	 */
	public java.lang.String getVariableType() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_TYPE);
	}

	/**
	 * The table column <code>calc.variable.variable_order</code>
	 */
	public void setVariableOrder(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ORDER, value);
	}

	/**
	 * The table column <code>calc.variable.variable_order</code>
	 */
	public java.lang.Integer getVariableOrder() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_ORDER);
	}

	/**
	 * The table column <code>calc.variable.variable_label</code>
	 */
	public void setVariableLabel(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_LABEL, value);
	}

	/**
	 * The table column <code>calc.variable.variable_label</code>
	 */
	public java.lang.String getVariableLabel() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_LABEL);
	}

	/**
	 * The table column <code>calc.variable.variable_description</code>
	 */
	public void setVariableDescription(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_DESCRIPTION, value);
	}

	/**
	 * The table column <code>calc.variable.variable_description</code>
	 */
	public java.lang.String getVariableDescription() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.VARIABLE_DESCRIPTION);
	}

	/**
	 * The table column <code>calc.variable.for_analysis</code>
	 */
	public void setForAnalysis(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.FOR_ANALYSIS, value);
	}

	/**
	 * The table column <code>calc.variable.for_analysis</code>
	 */
	public java.lang.Boolean getForAnalysis() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.FOR_ANALYSIS);
	}

	/**
	 * The table column <code>calc.variable.uom</code>
	 */
	public void setUom(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.UOM, value);
	}

	/**
	 * The table column <code>calc.variable.uom</code>
	 */
	public java.lang.String getUom() {
		return getValue(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE.UOM);
	}

	/**
	 * Create a detached VariableRecord
	 */
	public VariableRecord() {
		super(org.openforis.calc.persistence.jooq.tables.Variable.VARIABLE);
	}
}
