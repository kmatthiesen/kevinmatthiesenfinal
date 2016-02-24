package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.VehicleService;

@Service
public class IVehicleService implements VehicleService {
	
	@Autowired
	private VehicleDao dao;

	/**
	 * @param dao the dao to set
	 */
	public void setDao(VehicleDao dao) {
	
		this.dao = dao;
		
	}

	public void add(Vehicle vehicle) {

		dao.add(vehicle);
		
	}

	public List<Vehicle> getVehicles() {

		return dao.getVehicles();
	}

	public Vehicle getVehicleById(Integer id) {

		return dao.getVehicleById(id);
		
	}

	public void update(Vehicle vehicle) {

		dao.update(vehicle);
		
	}

}
