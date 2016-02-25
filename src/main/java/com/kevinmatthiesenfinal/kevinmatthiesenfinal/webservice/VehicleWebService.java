package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.VehicleService;

/**
 * Handles requests from the webpage concerning vehicles.
 * 
 * @author kmatthiesen
 *
 */
@RestController
public class VehicleWebService {

	@Autowired
	private VehicleService service;

	/**
	 * @param service the service to set
	 */
	public void setService(VehicleService service) {
	
		this.service = service;
		
	}

	/**
	 * Adds a vehicle to the database.
	 * 
	 * @param vehicle
	 *            The vehicle to add to the database.
	 */
	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public void add(@RequestBody Vehicle vehicle) {

		service.add(vehicle);

	}
	
	/**
	 * Gets a list of all vehicles from the database.
	 * 
	 * @return The list of all vehicles from the database.
	 */
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public List<Vehicle> getVehicles() {
		
		return service.getVehicles();
		
	}
	
	/**
	 * Gets a vehicle from the database based on its id.
	 * 
	 * @param id
	 *            The id of the vehicle to get.
	 * @return The vehicle with the given id.
	 */
	@RequestMapping(value = "/vehicle/{id}", method = RequestMethod.GET)
	public Vehicle getVehicleById(@PathVariable Integer id) {

		return service.getVehicleById(id);

	}
	
	/**
	 * Updates a vehicle in the database.
	 * 
	 * @param vehicle The vehicle to update.
	 */
	@RequestMapping(value = "/vehicle", method = RequestMethod.PUT)
	public void updateVehicle(@RequestBody Vehicle vehicle) {

		service.update(vehicle);

	}


}
