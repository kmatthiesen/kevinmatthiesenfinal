package com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Models the model of a vehicle.
 * 
 * @author kmatthiesen
 *
 */
@Entity
public class Model {

	private Integer modelId;
	private String modelName;
	
	/**
	 * @return the modelId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getModelId() {
	
		return modelId;
		
	}
	
	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(Integer modelId) {
	
		this.modelId = modelId;
		
	}
	
	/**
	 * @return the modelName
	 */
	public String getModelName() {
	
		return modelName;
		
	}
	
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
	
		this.modelName = modelName;
		
	}
	
}
