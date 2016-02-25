package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.CustomerDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;

public class ICustomerDaoTest {
	
	private CustomerDao dao;
	private EntityManager em;
	private Customer customer;
	
	@Before
	public void setup() {
		
		dao = new ICustomerDao();
		em = mock(EntityManager.class);
		dao.setEm(em);
		customer = mock(Customer.class);
		
	}
	
	@Test
	public void addTest() {
		
		dao.add(customer);
		verify(em).persist(customer);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCustomersTest() {
		
		TypedQuery<Customer> query = mock(TypedQuery.class);
		List<Customer> expected = new ArrayList<Customer>();
		
		when(em.createQuery(anyString(), eq(Customer.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(expected);
		
		dao.getCustomers();
		verify(query).getResultList();
		
	}
	
	@Test
	public void updateTest() {
		
		dao.updateCustomer(customer);
		verify(em).merge(customer);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCustomerByIdTest() {
		
		TypedQuery<Customer> query = mock(TypedQuery.class);
		Customer expected = new Customer();
		
		when(em.createQuery(anyString(), eq(Customer.class))).thenReturn(query);
		when(query.setParameter(anyString(), anyInt())).thenReturn(query);
		when(query.getSingleResult()).thenReturn(expected);
		
		dao.getCustomerById(1);
		verify(query).getSingleResult();
		
	}

}
