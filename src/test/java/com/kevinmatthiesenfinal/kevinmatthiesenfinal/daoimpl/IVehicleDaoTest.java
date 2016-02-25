package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.VehicleDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Vehicle;

public class IVehicleDaoTest {
	
	private VehicleDao dao;
	private EntityManager em;
	private Vehicle vehicle;
	
	@Before
	public void setup() {
		
		dao = new IVehicleDao();
		em = mock(EntityManager.class);
		dao.setEm(em);
		vehicle = mock(Vehicle.class);
		
	}
	
	@Test
	public void addTest() {
		
		dao.add(vehicle);
		verify(em).persist(vehicle);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getVehiclesTest() {
		
		TypedQuery<Vehicle> query = mock(TypedQuery.class);
		List<Vehicle> expected = new ArrayList<Vehicle>();
		
		when(em.createQuery(anyString(), eq(Vehicle.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(expected);
		
		dao.getVehicles();
		verify(query).getResultList();
		
	}
	
	@Test
	public void updateTest() {
		
		dao.update(vehicle);
		verify(em).merge(vehicle);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getVehicleByIdTest() {
		
		TypedQuery<Vehicle> query = mock(TypedQuery.class);
		Vehicle expected = new Vehicle();
		
		when(em.createQuery(anyString(), eq(Vehicle.class))).thenReturn(query);
		when(query.setParameter(anyString(), anyInt())).thenReturn(query);
		when(query.getSingleResult()).thenReturn(expected);
		
		dao.getVehicleById(1);
		verify(query).getSingleResult();
		
	}

}
