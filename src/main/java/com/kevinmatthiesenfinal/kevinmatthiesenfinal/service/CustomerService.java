package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;

/**
 * Handles logic concerning customers.
 * 
 * @author kmatthiesen
 *
 */
public interface CustomerService {

	/**
	 * Adds a customer to the database.
	 * 
	 * @param customer
	 *            The customer to be added to the database.
	 */
	public void add(Customer customer);

	/**
	 * Retrieves a list of all customers from the database.
	 * 
	 * @return The list of all customers from the database.
	 */
	public List<Customer> getCustomers();

	/**
	 * Update a customer in the database.
	 * 
	 * @param customer
	 *            The customer to be updated in the database.
	 */
	public void updateCustomer(Customer customer);

	/**
	 * Retrieve a customer by their id from the database.
	 * 
	 * @param id
	 *            The id of the customer to retrieve.
	 * @return The customer with the corresponding id.
	 */
	public Customer getCustomerById(Integer id);
	
}
