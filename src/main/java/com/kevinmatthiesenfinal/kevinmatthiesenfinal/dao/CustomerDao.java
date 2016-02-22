package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;

/**
 * Handles queries with the database involving vehicles.
 * 
 * @author kmatthiesen
 *
 */
public interface CustomerDao {

	/**
	 * Adds a customer to the database.
	 * 
	 * @param vehicle
	 *            The new vehicle to add to the database.
	 */
	public void add(Customer customer);

	/**
	 * Retrieves a list of all customers from the database.
	 * 
	 * @return The list of all customers from the database.
	 */
	public List<Customer> getCustomers();

}
