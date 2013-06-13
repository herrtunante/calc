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
public class DbtableTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord> {

	private static final long serialVersionUID = 1730309760;

	/**
	 * The singleton instance of calc.dbtable
	 */
	public static final org.openforis.calc.persistence.jooq.tables.DbtableTable DBTABLE = new org.openforis.calc.persistence.jooq.tables.DbtableTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.DbtableRecord.class;
	}

	/**
	 * The table column <code>calc.dbtable.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.dbtable.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT dbtable__FKdbtable788482
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.Integer> WORKSPACE_ID = createField("workspace_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.dbtable.name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.dbtable.type</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.dbtable.input_table</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.Boolean> INPUT_TABLE = createField("input_table", org.jooq.impl.SQLDataType.BOOLEAN, this);

	public DbtableTable() {
		super("dbtable", org.openforis.calc.persistence.jooq.CalcSchema.CALC);
	}

	public DbtableTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcSchema.CALC, org.openforis.calc.persistence.jooq.tables.DbtableTable.DBTABLE);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_DBTABLE;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.DBTABLE_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord>>asList(org.openforis.calc.persistence.jooq.Keys.DBTABLE_PKEY, org.openforis.calc.persistence.jooq.Keys.DBTABLE_WORKSPACE_ID_KEY, org.openforis.calc.persistence.jooq.Keys.DBTABLE_NAME_KEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.DbtableRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.DBTABLE__FKDBTABLE788482);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.DbtableTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.DbtableTable(alias);
	}
}