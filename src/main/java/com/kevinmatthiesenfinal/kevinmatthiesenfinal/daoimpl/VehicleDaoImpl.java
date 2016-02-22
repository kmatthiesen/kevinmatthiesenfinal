package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;

public class VehicleDaoImpl implements VehicleDao {

	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}
	
}
