package com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Models a customer that buys a parking pass.
 * 
 * @author kmatthiesen
 *
 */
@Entity
public class Customer {

	private Integer customerId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	/**
	 * @return the customerId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCustomerId() {
	
		return customerId;
		
	}
	
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
	
		this.customerId = customerId;
		
	}
	
	/**
	 * @return the firstName
	 */
	@NotNull
	public String getFirstName() {
	
		return firstName;
		
	}
	
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
		
	}
	
	/**
	 * @return the lastName
	 */
	@NotNull
	public String getLastName() {
	
		return lastName;
		
	}
	
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
	
		this.lastName = lastName;
		
	}
	
	/**
	 * @return the phoneNumber
	 */
	@NotNull
	public String getPhoneNumber() {
	
		return phoneNumber;
		
	}
	
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
	
		this.phoneNumber = phoneNumber;
		
	}
	
	/**
	 * @return the email
	 */
	@NotNull
	public String getEmail() {
	
		return email;
		
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
	
		this.email = email;
		
	}
	
	
	
}
