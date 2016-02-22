package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

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

}
