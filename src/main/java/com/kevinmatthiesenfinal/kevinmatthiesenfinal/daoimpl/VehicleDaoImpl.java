package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

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
