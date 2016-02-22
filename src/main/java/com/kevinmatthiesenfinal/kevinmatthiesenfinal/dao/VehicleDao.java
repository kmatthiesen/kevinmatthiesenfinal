package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

/**
 * Handles queries with the database involving vehicles.
 * 
 * @author kmatthiesen
 *
 */
@Transactional
@Component
public interface VehicleDao {

	/**
	 * Adds a vehicle to the database.
	 * 
	 * @param vehicle
	 *            The new vehicle to add to the database.
	 */
	public void add(Vehicle vehicle);

}
