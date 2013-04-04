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
public class Interview extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord> {

	private static final long serialVersionUID = -986936399;

	/**
	 * The singleton instance of calc.interview
	 */
	public static final org.openforis.calc.persistence.jooq.tables.Interview INTERVIEW = new org.openforis.calc.persistence.jooq.tables.Interview();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.InterviewRecord.class;
	}

	/**
	 * The table column <code>calc.interview.interview_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Integer> INTERVIEW_ID = createField("interview_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.interview.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT interview__interview_obs_unit_fkey
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (obs_unit_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Integer> OBS_UNIT_ID = createField("obs_unit_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.interview.cluster_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT interview__interview_cluster_fkey
	 * FOREIGN KEY (cluster_id)
	 * REFERENCES calc.cluster (cluster_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Integer> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.interview.interview_no</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Integer> INTERVIEW_NO = createField("interview_no", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.interview.interview_date</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.sql.Date> INTERVIEW_DATE = createField("interview_date", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>calc.interview.interview_start_time</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.sql.Time> INTERVIEW_START_TIME = createField("interview_start_time", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The table column <code>calc.interview.interview_end_time</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.sql.Time> INTERVIEW_END_TIME = createField("interview_end_time", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The table column <code>calc.interview.interview_location</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Object> INTERVIEW_LOCATION = createField("interview_location", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.interview.interviewer_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.String> INTERVIEWER_NAME = createField("interviewer_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.interview.interviewee1_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.String> INTERVIEWEE1_NAME = createField("interviewee1_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.interview.interviewee2_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.String> INTERVIEWEE2_NAME = createField("interviewee2_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Interview() {
		super("interview", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public Interview(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.Interview.INTERVIEW);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_INTERVIEW;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.INTERVIEW_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord>>asList(org.openforis.calc.persistence.jooq.Keys.INTERVIEW_PKEY, org.openforis.calc.persistence.jooq.Keys.INTERVIEW_OBS_UNIT_ID_CLUSTER_ID_INTERVIEW_NO_KEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.InterviewRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.INTERVIEW__INTERVIEW_OBS_UNIT_FKEY, org.openforis.calc.persistence.jooq.Keys.INTERVIEW__INTERVIEW_CLUSTER_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.Interview as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.Interview(alias);
	}
}
