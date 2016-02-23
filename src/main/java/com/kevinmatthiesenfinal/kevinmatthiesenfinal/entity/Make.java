package com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Models the make of a vehicle.
 * 
 * @author kmatthiesen
 *
 */
@Entity
public class Make {

	private Integer makeId;
	private String makeName;
	
	/**
	 * @return the makeId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getMakeId() {
	
		return makeId;
		
	}
	
	/**
	 * @param makeId the makeId to set
	 */
	public void setMakeId(Integer makeId) {
	
		this.makeId = makeId;
		
	}
	
	/**
	 * @return the makeName
	 */
	@NotNull
	@Column(unique = true)
	public String getMakeName() {
	
		return makeName;
		
	}
	
	/**
	 * @param makeName the makeName to set
	 */
	public void setMakeName(String makeName) {
	
		this.makeName = makeName;
		
	}
	
}
