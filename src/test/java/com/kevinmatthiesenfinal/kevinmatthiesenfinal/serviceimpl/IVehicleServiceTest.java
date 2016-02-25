package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.VehicleService;

public class IVehicleServiceTest {
	
	private VehicleService service;
	private VehicleDao dao;
	private Vehicle vehicle;
	
	@Before
	public void setup() {
		
		service = new IVehicleService();
		dao = mock(VehicleDao.class);
		service.setDao(dao);
		vehicle = mock(Vehicle.class);
		
	}
	
	@Test
	public void addTest() {
		
		service.add(vehicle);
		verify(dao).add(vehicle);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getVehiclesTest() {
		
		List<Vehicle> expected = mock(ArrayList.class);
		
		when(service.getVehicles()).thenReturn(expected);
		
		service.getVehicles();
		verify(dao).getVehicles();
		
	}
	
	@Test
	public void updateVehicleTest() {
		
		service.update(vehicle);
		verify(dao).update(vehicle);
		
	}
	
	@Test
	public void getCustomerByIdTest() {
		
		Integer id = 1;
		
		when(dao.getVehicleById(anyInt())).thenReturn(vehicle);
		
		service.getVehicleById(id);
		verify(dao).getVehicleById(id);
		
	}

}
