package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.CustomerDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Customer;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.CustomerService;

@Service
public class ICustomerService implements CustomerService {
	
	@Autowired
	private CustomerDao dao;

	/**
	 * @param dao the dao to set
	 */
	public void setDao(CustomerDao dao) {
	
		this.dao = dao;
		
	}

	public void add(Customer customer) {

		dao.add(customer);

	}

	public List<Customer> getCustomers() {

		return dao.getCustomers();
		
	}

}
