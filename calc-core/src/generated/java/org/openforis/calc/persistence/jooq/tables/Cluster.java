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
public class Cluster extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord> {

	private static final long serialVersionUID = 1352917969;

	/**
	 * The singleton instance of calc.cluster
	 */
	public static final org.openforis.calc.persistence.jooq.tables.Cluster CLUSTER = new org.openforis.calc.persistence.jooq.tables.Cluster();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.ClusterRecord.class;
	}

	/**
	 * The table column <code>calc.cluster.cluster_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.Integer> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.cluster.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT cluster__cluster_survey_fkey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (survey_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.Integer> SURVEY_ID = createField("survey_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.cluster.cluster_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.String> CLUSTER_CODE = createField("cluster_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.cluster.cluster_x</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.Integer> CLUSTER_X = createField("cluster_x", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.cluster.cluster_y</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.Integer> CLUSTER_Y = createField("cluster_y", org.jooq.impl.SQLDataType.INTEGER, this);

	public Cluster() {
		super("cluster", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public Cluster(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.Cluster.CLUSTER);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_CLUSTER;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.CLUSTER_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord>>asList(org.openforis.calc.persistence.jooq.Keys.CLUSTER_PKEY, org.openforis.calc.persistence.jooq.Keys.CLUSTER_CODE_UKEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ClusterRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.CLUSTER__CLUSTER_SURVEY_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.Cluster as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.Cluster(alias);
	}
}
