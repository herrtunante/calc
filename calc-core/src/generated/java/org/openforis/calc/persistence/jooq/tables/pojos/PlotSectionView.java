/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PlotSectionView implements java.io.Serializable {

	private static final long serialVersionUID = 1819006293;

	private java.lang.Integer surveyId;
	private java.lang.Integer plotObsUnitId;
	private java.lang.String  plotObsUnitName;
	private java.lang.Integer stratumId;
	private java.lang.Integer stratumNo;
	private java.lang.Integer clusterId;
	private java.lang.String  clusterCode;
	private java.lang.Integer clusterX;
	private java.lang.Integer clusterY;
	private java.lang.Integer samplePlotId;
	private java.lang.Integer plotNo;
	private java.lang.Object  plotLocation;
	private java.lang.Object  plotShape;
	private java.lang.Integer samplingPhase;
	private java.lang.Boolean groundPlot;
	private java.lang.Boolean permanentPlot;
	private java.lang.Integer plotSectionId;
	private java.lang.String  plotSection;
	private java.lang.String  visitType;
	private java.sql.Date     plotSectionSurveyDate;
	private java.lang.Object  plotGpsReading;
	private java.lang.Double  plotDirection;
	private java.lang.Double  plotDistance;
	private java.lang.Object  plotActualLocation;
	private java.lang.Boolean accessible;
	private java.lang.Integer step;
	private java.lang.Object  plotSectionShape;
	private java.lang.Double  plotSectionArea;
	private java.lang.Double  plotShare;
	private java.lang.Boolean primarySection;
	private java.lang.Double  plotLocationDeviation;

	public java.lang.Integer getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(java.lang.Integer surveyId) {
		this.surveyId = surveyId;
	}

	public java.lang.Integer getPlotObsUnitId() {
		return this.plotObsUnitId;
	}

	public void setPlotObsUnitId(java.lang.Integer plotObsUnitId) {
		this.plotObsUnitId = plotObsUnitId;
	}

	public java.lang.String getPlotObsUnitName() {
		return this.plotObsUnitName;
	}

	public void setPlotObsUnitName(java.lang.String plotObsUnitName) {
		this.plotObsUnitName = plotObsUnitName;
	}

	public java.lang.Integer getStratumId() {
		return this.stratumId;
	}

	public void setStratumId(java.lang.Integer stratumId) {
		this.stratumId = stratumId;
	}

	public java.lang.Integer getStratumNo() {
		return this.stratumNo;
	}

	public void setStratumNo(java.lang.Integer stratumNo) {
		this.stratumNo = stratumNo;
	}

	public java.lang.Integer getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Integer clusterId) {
		this.clusterId = clusterId;
	}

	public java.lang.String getClusterCode() {
		return this.clusterCode;
	}

	public void setClusterCode(java.lang.String clusterCode) {
		this.clusterCode = clusterCode;
	}

	public java.lang.Integer getClusterX() {
		return this.clusterX;
	}

	public void setClusterX(java.lang.Integer clusterX) {
		this.clusterX = clusterX;
	}

	public java.lang.Integer getClusterY() {
		return this.clusterY;
	}

	public void setClusterY(java.lang.Integer clusterY) {
		this.clusterY = clusterY;
	}

	public java.lang.Integer getSamplePlotId() {
		return this.samplePlotId;
	}

	public void setSamplePlotId(java.lang.Integer samplePlotId) {
		this.samplePlotId = samplePlotId;
	}

	public java.lang.Integer getPlotNo() {
		return this.plotNo;
	}

	public void setPlotNo(java.lang.Integer plotNo) {
		this.plotNo = plotNo;
	}

	public java.lang.Object getPlotLocation() {
		return this.plotLocation;
	}

	public void setPlotLocation(java.lang.Object plotLocation) {
		this.plotLocation = plotLocation;
	}

	public java.lang.Object getPlotShape() {
		return this.plotShape;
	}

	public void setPlotShape(java.lang.Object plotShape) {
		this.plotShape = plotShape;
	}

	public java.lang.Integer getSamplingPhase() {
		return this.samplingPhase;
	}

	public void setSamplingPhase(java.lang.Integer samplingPhase) {
		this.samplingPhase = samplingPhase;
	}

	public java.lang.Boolean getGroundPlot() {
		return this.groundPlot;
	}

	public void setGroundPlot(java.lang.Boolean groundPlot) {
		this.groundPlot = groundPlot;
	}

	public java.lang.Boolean getPermanentPlot() {
		return this.permanentPlot;
	}

	public void setPermanentPlot(java.lang.Boolean permanentPlot) {
		this.permanentPlot = permanentPlot;
	}

	public java.lang.Integer getPlotSectionId() {
		return this.plotSectionId;
	}

	public void setPlotSectionId(java.lang.Integer plotSectionId) {
		this.plotSectionId = plotSectionId;
	}

	public java.lang.String getPlotSection() {
		return this.plotSection;
	}

	public void setPlotSection(java.lang.String plotSection) {
		this.plotSection = plotSection;
	}

	public java.lang.String getVisitType() {
		return this.visitType;
	}

	public void setVisitType(java.lang.String visitType) {
		this.visitType = visitType;
	}

	public java.sql.Date getPlotSectionSurveyDate() {
		return this.plotSectionSurveyDate;
	}

	public void setPlotSectionSurveyDate(java.sql.Date plotSectionSurveyDate) {
		this.plotSectionSurveyDate = plotSectionSurveyDate;
	}

	public java.lang.Object getPlotGpsReading() {
		return this.plotGpsReading;
	}

	public void setPlotGpsReading(java.lang.Object plotGpsReading) {
		this.plotGpsReading = plotGpsReading;
	}

	public java.lang.Double getPlotDirection() {
		return this.plotDirection;
	}

	public void setPlotDirection(java.lang.Double plotDirection) {
		this.plotDirection = plotDirection;
	}

	public java.lang.Double getPlotDistance() {
		return this.plotDistance;
	}

	public void setPlotDistance(java.lang.Double plotDistance) {
		this.plotDistance = plotDistance;
	}

	public java.lang.Object getPlotActualLocation() {
		return this.plotActualLocation;
	}

	public void setPlotActualLocation(java.lang.Object plotActualLocation) {
		this.plotActualLocation = plotActualLocation;
	}

	public java.lang.Boolean getAccessible() {
		return this.accessible;
	}

	public void setAccessible(java.lang.Boolean accessible) {
		this.accessible = accessible;
	}

	public java.lang.Integer getStep() {
		return this.step;
	}

	public void setStep(java.lang.Integer step) {
		this.step = step;
	}

	public java.lang.Object getPlotSectionShape() {
		return this.plotSectionShape;
	}

	public void setPlotSectionShape(java.lang.Object plotSectionShape) {
		this.plotSectionShape = plotSectionShape;
	}

	public java.lang.Double getPlotSectionArea() {
		return this.plotSectionArea;
	}

	public void setPlotSectionArea(java.lang.Double plotSectionArea) {
		this.plotSectionArea = plotSectionArea;
	}

	public java.lang.Double getPlotShare() {
		return this.plotShare;
	}

	public void setPlotShare(java.lang.Double plotShare) {
		this.plotShare = plotShare;
	}

	public java.lang.Boolean getPrimarySection() {
		return this.primarySection;
	}

	public void setPrimarySection(java.lang.Boolean primarySection) {
		this.primarySection = primarySection;
	}

	public java.lang.Double getPlotLocationDeviation() {
		return this.plotLocationDeviation;
	}

	public void setPlotLocationDeviation(java.lang.Double plotLocationDeviation) {
		this.plotLocationDeviation = plotLocationDeviation;
	}
}
