package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.CustomerService;

public class CustomerWebServiceTest {
	
	private CustomerWebService webService;
	private CustomerService service;
	private Customer customer;
	
	@Before
	public void setup() {
		
		webService = new CustomerWebService();
		service = mock(CustomerService.class);
		webService.setService(service);
		customer = mock(Customer.class);
		
	}
	
	@Test
	public void addTest() {
		
		webService.add(customer);
		verify(service).add(customer);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCustomersTest() {
		
		List<Customer> expected = mock(ArrayList.class);
		
		when(service.getCustomers()).thenReturn(expected);
		
		webService.getCustomers();
		verify(service).getCustomers();
		
	}
	
	@Test
	public void updateCustomerTest() {
		
		webService.updateCustomer(customer);
		verify(service).updateCustomer(customer);
		
	}
	
	@Test
	public void getCustomerByIdTest() {
		
		Integer id = 1;
		
		when(service.getCustomerById(anyInt())).thenReturn(customer);
		
		webService.getCustomerById(id);
		verify(service).getCustomerById(id);
		
	}

}
