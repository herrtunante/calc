package org.openforis.calc.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base class for user-controlled objects.  Since this base class also defines
 * mutator methods, is for use only by persistable objects whose name and
 * description may be changed at run-time.
 * 
 * @author G. Miceli
 * @author M. Togna
 */
@MappedSuperclass
public abstract class UserObject implements Identifiable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
	
	@Override
	public String toString() {
		return name + " [" + id + "]";
	}
}