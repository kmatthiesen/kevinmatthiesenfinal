package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

/**
 * Handles logic concerning vehicles.
 * 
 * @author kmatthiesen
 *
 */
public interface VehicleService {
	
	/**
	 * Setter for a vehicle dao.
	 * 
	 * @param dao
	 *            The dao to set.
	 */
	public void setDao(VehicleDao dao);

	/**
	 * Adds a new vehicle to the database.
	 * 
	 * @param vehicle
	 *            The new vehicle to be added.
	 */
	public void add(Vehicle vehicle);

	/**
	 * Gets a list of all vehicles from the database.
	 * 
	 * @return The list of all vehicles from the database.
	 */
	public List<Vehicle> getVehicles();

	/**
	 * Gets a vehicle from the database based on its id.
	 * 
	 * @param id
	 *            The id of the vehicle to get.
	 * @return The vehicle with the given id.
	 */
	public Vehicle getVehicleById(Integer id);

	/**
	 * Updates a vehicle in the database.
	 * 
	 * @param vehicle
	 *            The vehicle to update.
	 */
	public void update(Vehicle vehicle);

}
