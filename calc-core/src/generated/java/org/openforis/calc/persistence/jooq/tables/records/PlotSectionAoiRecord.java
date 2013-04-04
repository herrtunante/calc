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
public class PlotSectionAoiRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.PlotSectionAoiRecord> {

	private static final long serialVersionUID = 397525723;

	/**
	 * The table column <code>calc.plot_section_aoi.plot_section_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_plot_section_fk
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public void setPlotSectionId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.PLOT_SECTION_ID, value);
	}

	/**
	 * The table column <code>calc.plot_section_aoi.plot_section_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_plot_section_fk
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public java.lang.Integer getPlotSectionId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.PLOT_SECTION_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord 
	 * PlotSectionRecord}
	 */
	public void setPlotSectionId(org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.PLOT_SECTION_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.PLOT_SECTION_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION.PLOT_SECTION_ID));
		}
	}

	/**
	 * The table column <code>calc.plot_section_aoi.plot_section_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_plot_section_fk
	 * FOREIGN KEY (plot_section_id)
	 * REFERENCES calc.plot_section (plot_section_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.PlotSectionRecord fetchPlotSection() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION)
			.where(org.openforis.calc.persistence.jooq.tables.PlotSection.PLOT_SECTION.PLOT_SECTION_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.PLOT_SECTION_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.plot_section_aoi.aoi_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public void setAoiId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.AOI_ID, value);
	}

	/**
	 * The table column <code>calc.plot_section_aoi.aoi_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public java.lang.Integer getAoiId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.AOI_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.AoiRecord 
	 * AoiRecord}
	 */
	public void setAoiId(org.openforis.calc.persistence.jooq.tables.records.AoiRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.AOI_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.AOI_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.Aoi.AOI.AOI_ID));
		}
	}

	/**
	 * The table column <code>calc.plot_section_aoi.aoi_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_section_aoi__plot_section_aoi_aoi_fk
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (aoi_id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.AoiRecord fetchAoi() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.Aoi.AOI)
			.where(org.openforis.calc.persistence.jooq.tables.Aoi.AOI.AOI_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI.AOI_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached PlotSectionAoiRecord
	 */
	public PlotSectionAoiRecord() {
		super(org.openforis.calc.persistence.jooq.tables.PlotSectionAoi.PLOT_SECTION_AOI);
	}
}
