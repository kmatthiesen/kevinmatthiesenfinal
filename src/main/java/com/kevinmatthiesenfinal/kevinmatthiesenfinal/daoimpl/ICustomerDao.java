package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.CustomerDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;

@Transactional
@Component
public class ICustomerDao implements CustomerDao {
	
	/**
	 * Query to retrieve a list of all customers from the database.
	 */
	private String getAllCustomersQuery = "SELECT c FROM Customer c";

	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}
	
	public void add(Customer customer) {

		em.persist(customer);
		em.flush();

	}

	public List<Customer> getCustomers() {

		return em.createQuery(getAllCustomersQuery, Customer.class).getResultList();
		
	}

}
