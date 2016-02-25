package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.VehicleService;

public class VehicleWebServiceTest {

	private VehicleWebService webService;

	private VehicleService service;

	private Vehicle vehicle;

	@Before
	public void setup() {

		webService = new VehicleWebService();
		service = mock(VehicleService.class);
		webService.setService(service);
		vehicle = mock(Vehicle.class);

	}

	@Test
	public void addTest() {

		webService.add(vehicle);
		verify(service).add(vehicle);

	}

	@SuppressWarnings("unchecked")
	@Test
	public void getVehiclesTest() {

		List<Vehicle> expected = mock(ArrayList.class);

		when(service.getVehicles()).thenReturn(expected);

		webService.getVehicles();
		verify(service).getVehicles();

	}

	@Test
	public void updateVehicleTest() {

		webService.updateVehicle(vehicle);
		verify(service).update(vehicle);

	}

	@Test
	public void getVehicleByIdTest() {

		Integer id = 1;

		when(service.getVehicleById(anyInt())).thenReturn(vehicle);

		webService.getVehicleById(id);
		verify(service).getVehicleById(id);

	}

}
