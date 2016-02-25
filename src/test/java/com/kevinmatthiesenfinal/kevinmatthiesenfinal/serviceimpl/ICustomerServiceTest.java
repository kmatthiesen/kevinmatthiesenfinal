package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.CustomerDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.CustomerService;

public class ICustomerServiceTest {
	
	private CustomerService service;
	private CustomerDao dao;
	private Customer customer;
	
	@Before
	public void setup() {
		
		service = new ICustomerService();
		dao = mock(CustomerDao.class);
		service.setDao(dao);
		customer = mock(Customer.class);
		
	}
	
	@Test
	public void addTest() {
		
		service.add(customer);
		verify(dao).add(customer);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCustomersTest() {
		
		List<Customer> expected = mock(ArrayList.class);
		
		when(service.getCustomers()).thenReturn(expected);
		
		service.getCustomers();
		verify(dao).getCustomers();
		
	}
	
	@Test
	public void updateCustomerTest() {
		
		service.updateCustomer(customer);
		verify(dao).updateCustomer(customer);
		
	}
	
	@Test
	public void getCustomerByIdTest() {
		
		Integer id = 1;
		
		when(dao.getCustomerById(anyInt())).thenReturn(customer);
		
		service.getCustomerById(id);
		verify(dao).getCustomerById(id);
		
	}

}
