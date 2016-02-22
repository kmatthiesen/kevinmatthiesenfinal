package com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Models a vehicle owned by a customer for a parking pass.
 * 
 * @author kmatthiesen
 *
 */
@Entity
public class Vehicle {

	private Integer vehicleId;
	private String make;
	private String model;
	private String licensePlate;
	private String licenseLocation;
	private String color;
	
	/**
	 * @return the vehicleId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getVehicleId() {
	
		return vehicleId;
		
	}
	
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(Integer vehicleId) {
	
		this.vehicleId = vehicleId;
		
	}
	
	/**
	 * @return the make
	 */
	public String getMake() {
	
		return make;
		
	}
	
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
	
		this.make = make;
		
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
	
		return model;
		
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
	
		this.model = model;
		
	}
	
	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
	
		return licensePlate;
		
	}
	
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
	
		this.licensePlate = licensePlate;
		
	}
	
	/**
	 * @return the licenseLocation
	 */
	public String getLicenseLocation() {
	
		return licenseLocation;
		
	}
	
	/**
	 * @param licenseLocation the licenseLocation to set
	 */
	public void setLicenseLocation(String licenseLocation) {
	
		this.licenseLocation = licenseLocation;
		
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
	
		return color;
		
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
	
		this.color = color;
		
	}
	
}
