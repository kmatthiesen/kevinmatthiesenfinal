package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;

/**
 * Handles queries with the database involving customers.
 * 
 * @author kmatthiesen
 *
 */
public interface CustomerDao {

	/**
	 * Setter for an EntityManager
	 * 
	 * @param em
	 *            The EntityManager to set
	 */
	public void setEm(EntityManager em);

	/**
	 * Adds a customer to the database.
	 * 
	 * @param customer
	 *            The new customer to add to the database.
	 */
	public void add(Customer customer);

	/**
	 * Retrieves a list of all customers from the database.
	 * 
	 * @return The list of all customers from the database.
	 */
	public List<Customer> getCustomers();

	/**
	 * Updates a customer in the database.
	 * 
	 * @param customer
	 *            The customer to update;
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
