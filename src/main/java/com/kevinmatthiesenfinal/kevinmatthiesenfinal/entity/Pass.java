package com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Models a parking pass.
 * 
 * @author kmatthiesen
 *
 */
@Entity
public class Pass {

	private Integer passId;
	private Customer customer;
	private Vehicle vehicle;
	private Date expirationDate;
	private Double price;
	
	/**
	 * @return the passId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPassId() {
		
		return passId;		
		
	}
	
	/**
	 * @param passId the passId to set
	 */
	public void setPassId(Integer passId) {
	
		this.passId = passId;
		
	}
	
	/**
	 * @return the customer
	 */
	@OneToOne
	@JoinColumn(name="customerId")
	@NotNull
	public Customer getCustomer() {
	
		return customer;
		
	}
	
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
	
		this.customer = customer;
		
	}
	
	/**
	 * @return the vehicle
	 */
	@OneToOne
	@JoinColumn(name="vehicleId")
	@NotNull
	public Vehicle getVehicle() {
	
		return vehicle;
		
	}
	
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
	
		this.vehicle = vehicle;
		
	}
	
	/**
	 * @return the expirationDate
	 */
	@NotNull
	public Date getExpirationDate() {
	
		return expirationDate;
		
	}
	
	/**
	 * @param date the expirationDate to set
	 */
	public void setExpirationDate(java.util.Date date) {
	
		this.expirationDate = date;
		
	}

	/**
	 * @return the price
	 */
	@NotNull
	public Double getPrice() {
	
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
	
		this.price = price;
	}
	
	
	
}
