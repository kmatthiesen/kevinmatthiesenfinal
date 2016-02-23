package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

@Transactional
@Component
public class IVehicleDao implements VehicleDao {
	
	private String getAllVehiclesQuery = "SELECT v FROM Vehicle v";
	private String getVehicleByIdQuery = "SELECT v FROM Vehicle v WHERE v.vehicleId =:id";

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

	public List<Vehicle> getVehicles() {

		return em.createQuery(getAllVehiclesQuery, Vehicle.class).getResultList();
		
	}

	public Vehicle getVehicleById(Integer id) {

		return em.createQuery(getVehicleByIdQuery, Vehicle.class).setParameter("id", id).getSingleResult();
	}
	
}
