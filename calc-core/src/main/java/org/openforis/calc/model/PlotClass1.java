package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PlotClass1 generated by hbm2java
 */
@Entity
@Table(name = "plot_class1")
public class PlotClass1 implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String fullCode;
	private String level1Name;
	private String level2Name;
	private String level3Name;
	private String level1Code;
	private String level2Code;
	private String level3Code;
	private Set<PlotObs> plotObses = new HashSet<PlotObs>(0);

	public PlotClass1() {
	}

	public PlotClass1(int id) {
		this.id = id;
	}

	public PlotClass1(int id, String fullCode, String level1Name, String level2Name, String level3Name, String level1Code, String level2Code, String level3Code, Set<PlotObs> plotObses) {
		this.id = id;
		this.fullCode = fullCode;
		this.level1Name = level1Name;
		this.level2Name = level2Name;
		this.level3Name = level3Name;
		this.level1Code = level1Code;
		this.level2Code = level2Code;
		this.level3Code = level3Code;
		this.plotObses = plotObses;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "full_code", length = 25)
	public String getFullCode() {
		return this.fullCode;
	}

	public void setFullCode(String fullCode) {
		this.fullCode = fullCode;
	}

	@Column(name = "level1_name")
	public String getLevel1Name() {
		return this.level1Name;
	}

	public void setLevel1Name(String level1Name) {
		this.level1Name = level1Name;
	}

	@Column(name = "level2_name")
	public String getLevel2Name() {
		return this.level2Name;
	}

	public void setLevel2Name(String level2Name) {
		this.level2Name = level2Name;
	}

	@Column(name = "level3_name")
	public String getLevel3Name() {
		return this.level3Name;
	}

	public void setLevel3Name(String level3Name) {
		this.level3Name = level3Name;
	}

	@Column(name = "level1_code", length = 25)
	public String getLevel1Code() {
		return this.level1Code;
	}

	public void setLevel1Code(String level1Code) {
		this.level1Code = level1Code;
	}

	@Column(name = "level2_code", length = 25)
	public String getLevel2Code() {
		return this.level2Code;
	}

	public void setLevel2Code(String level2Code) {
		this.level2Code = level2Code;
	}

	@Column(name = "level3_code", length = 25)
	public String getLevel3Code() {
		return this.level3Code;
	}

	public void setLevel3Code(String level3Code) {
		this.level3Code = level3Code;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plotClass1")
	public Set<PlotObs> getPlotObses() {
		return this.plotObses;
	}

	public void setPlotObses(Set<PlotObs> plotObses) {
		this.plotObses = plotObses;
	}

}
