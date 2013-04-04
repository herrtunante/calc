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
public class SamplePlotAoiStratumCntRecord extends org.jooq.impl.TableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.SamplePlotAoiStratumCntRecord> {

	private static final long serialVersionUID = -208756012;

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.stratum_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_stratum_fk
	 * FOREIGN KEY (stratum_id)
	 * REFERENCES calc.stratum (stratum_id)
	 * </pre></code>
	 */
	public void setStratumId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.STRATUM_ID, value);
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.stratum_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_stratum_fk
	 * FOREIGN KEY (stratum_id)
	 * REFERENCES calc.stratum (stratum_id)
	 * </pre></code>
	 */
	public java.lang.Integer getStratumId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.STRATUM_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.StratumRecord 
	 * StratumRecord}
	 */
	public void setStratumId(org.openforis.calc.persistence.jooq.tables.records.StratumRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.STRATUM_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.STRATUM_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.Stratum.STRATUM.STRATUM_ID));
		}
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.stratum_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_stratum_fk
	 * FOREIGN KEY (stratum_id)
	 * REFERENCES calc.stratum (stratum_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.StratumRecord fetchStratum() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Stratum.STRATUM)
			.where(org.openforis.calc.persistence.jooq.tables.Stratum.STRATUM.STRATUM_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.STRATUM_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.aoi_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public void setAoiId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.AOI_ID, value);
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.aoi_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public java.lang.Integer getAoiId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.AOI_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.AoiRecord 
	 * AoiRecord}
	 */
	public void setAoiId(org.openforis.calc.persistence.jooq.tables.records.AoiRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.AOI_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.AOI_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.Aoi.AOI.AOI_ID));
		}
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.aoi_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sample_plot_aoi_stratum_cnt__sample_plot_aoi_stratum_cnt_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.AoiRecord fetchAoi() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Aoi.AOI)
			.where(org.openforis.calc.persistence.jooq.tables.Aoi.AOI.AOI_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.AOI_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.count</code>
	 */
	public void setCount(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.COUNT, value);
	}

	/**
	 * The table column <code>calc.sample_plot_aoi_stratum_cnt.count</code>
	 */
	public java.lang.Integer getCount() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT.COUNT);
	}

	/**
	 * Create a detached SamplePlotAoiStratumCntRecord
	 */
	public SamplePlotAoiStratumCntRecord() {
		super(org.openforis.calc.persistence.jooq.tables.SamplePlotAoiStratumCnt.SAMPLE_PLOT_AOI_STRATUM_CNT);
	}
}
