package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.CustomerService;

/**
 * Handles request from the webpage concerning customers.
 * 
 * @author kmatthiesen
 *
 */
@RestController
public class CustomerWebService {

	@Autowired
	private CustomerService service;

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(CustomerService service) {

		this.service = service;

	}

	/**
	 * Adds a customer to the database.
	 * 
	 * @param customer
	 *            The new customer to be created on the database.
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void createCustomer(@RequestBody Customer customer) {

		service.add(customer);

	}

	/**
	 * Retrieves all customers from the database.
	 * 
	 * @return The list of customers from the database.
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Customer> getCustomers() {

		return service.getCustomers();

	}

	/**
	 * Update a customer in the database.
	 * 
	 * @param customer
	 *            The customer to be updated in the database.
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer) {

		service.updateCustomer(customer);

	}

	/**
	 * Retrieve a customer by their id from the database.
	 * 
	 * @param id
	 *            The id of the customer to retrieve.
	 * @return The customer with the corresponding id.
	 */
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable Integer id) {

		return service.getCustomerById(id);

	}

}
