package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

@Transactional
@Component
public class IVehicleDao implements VehicleDao {

	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}

	public void add(Vehicle vehicle) {
		
		em.persist(vehicle);
		em.flush();
		
	}
	
}
