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
public class Category implements java.io.Serializable {

	private static final long serialVersionUID = -423641274;

	private java.lang.Integer categoryId;
	private java.lang.Integer variableId;
	private java.lang.String  categoryCode;
	private java.lang.String  categoryLabel;
	private java.lang.Integer categoryOrder;
	private java.lang.String  bandingInterval;
	private java.lang.Integer bandingSourceVariableId;
	private java.lang.String  categoryDescription;

	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(java.lang.Integer categoryId) {
		this.categoryId = categoryId;
	}

	public java.lang.Integer getVariableId() {
		return this.variableId;
	}

	public void setVariableId(java.lang.Integer variableId) {
		this.variableId = variableId;
	}

	public java.lang.String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(java.lang.String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public java.lang.String getCategoryLabel() {
		return this.categoryLabel;
	}

	public void setCategoryLabel(java.lang.String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}

	public java.lang.Integer getCategoryOrder() {
		return this.categoryOrder;
	}

	public void setCategoryOrder(java.lang.Integer categoryOrder) {
		this.categoryOrder = categoryOrder;
	}

	public java.lang.String getBandingInterval() {
		return this.bandingInterval;
	}

	public void setBandingInterval(java.lang.String bandingInterval) {
		this.bandingInterval = bandingInterval;
	}

	public java.lang.Integer getBandingSourceVariableId() {
		return this.bandingSourceVariableId;
	}

	public void setBandingSourceVariableId(java.lang.Integer bandingSourceVariableId) {
		this.bandingSourceVariableId = bandingSourceVariableId;
	}

	public java.lang.String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(java.lang.String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
}
