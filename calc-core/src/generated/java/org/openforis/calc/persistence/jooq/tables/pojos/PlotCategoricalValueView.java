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
public class PlotCategoricalValueView implements java.io.Serializable {

	private static final long serialVersionUID = -1062312194;

	private java.lang.Integer valueId;
	private java.lang.Integer plotSectionId;
	private java.lang.Integer categoryId;
	private java.lang.Boolean original;
	private java.lang.Boolean current;
	private java.lang.Integer variableId;
	private java.lang.String  variableType;
	private java.lang.String  variableName;
	private java.lang.Integer variableOrder;
	private java.lang.String  categoryCode;
	private java.lang.String  categoryLabel;
	private java.lang.Integer categoryOrder;

	public java.lang.Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(java.lang.Integer valueId) {
		this.valueId = valueId;
	}

	public java.lang.Integer getPlotSectionId() {
		return this.plotSectionId;
	}

	public void setPlotSectionId(java.lang.Integer plotSectionId) {
		this.plotSectionId = plotSectionId;
	}

	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(java.lang.Integer categoryId) {
		this.categoryId = categoryId;
	}

	public java.lang.Boolean getOriginal() {
		return this.original;
	}

	public void setOriginal(java.lang.Boolean original) {
		this.original = original;
	}

	public java.lang.Boolean getCurrent() {
		return this.current;
	}

	public void setCurrent(java.lang.Boolean current) {
		this.current = current;
	}

	public java.lang.Integer getVariableId() {
		return this.variableId;
	}

	public void setVariableId(java.lang.Integer variableId) {
		this.variableId = variableId;
	}

	public java.lang.String getVariableType() {
		return this.variableType;
	}

	public void setVariableType(java.lang.String variableType) {
		this.variableType = variableType;
	}

	public java.lang.String getVariableName() {
		return this.variableName;
	}

	public void setVariableName(java.lang.String variableName) {
		this.variableName = variableName;
	}

	public java.lang.Integer getVariableOrder() {
		return this.variableOrder;
	}

	public void setVariableOrder(java.lang.Integer variableOrder) {
		this.variableOrder = variableOrder;
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
}
