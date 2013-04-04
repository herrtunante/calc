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
public class OperationParameter extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord> {

	private static final long serialVersionUID = -220320904;

	/**
	 * The singleton instance of calc.operation_parameter
	 */
	public static final org.openforis.calc.persistence.jooq.tables.OperationParameter OPERATION_PARAMETER = new org.openforis.calc.persistence.jooq.tables.OperationParameter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord.class;
	}

	/**
	 * The table column <code>calc.operation_parameter.operation_parameter_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, java.lang.Integer> OPERATION_PARAMETER_ID = createField("operation_parameter_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.operation_parameter.process_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT operation_parameter__operation_parameter_process_fkey
	 * FOREIGN KEY (process_id)
	 * REFERENCES calc.process (process_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, java.lang.Integer> PROCESS_ID = createField("process_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.operation_parameter.operation_parameter_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, java.lang.String> OPERATION_PARAMETER_NAME = createField("operation_parameter_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.operation_parameter.operation_parameter_value</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, java.lang.String> OPERATION_PARAMETER_VALUE = createField("operation_parameter_value", org.jooq.impl.SQLDataType.VARCHAR, this);

	public OperationParameter() {
		super("operation_parameter", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public OperationParameter(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.OperationParameter.OPERATION_PARAMETER);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_OPERATION_PARAMETER;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.OPERATION_PARAMETER_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord>>asList(org.openforis.calc.persistence.jooq.Keys.OPERATION_PARAMETER_PKEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.OPERATION_PARAMETER__OPERATION_PARAMETER_PROCESS_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.OperationParameter as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.OperationParameter(alias);
	}
}
