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
public class Cluster implements java.io.Serializable {

	private static final long serialVersionUID = -1533282803;

	private java.lang.Integer clusterId;
	private java.lang.Integer surveyId;
	private java.lang.String  clusterCode;
	private java.lang.Integer clusterX;
	private java.lang.Integer clusterY;

	public java.lang.Integer getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Integer clusterId) {
		this.clusterId = clusterId;
	}

	public java.lang.Integer getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(java.lang.Integer surveyId) {
		this.surveyId = surveyId;
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
}
