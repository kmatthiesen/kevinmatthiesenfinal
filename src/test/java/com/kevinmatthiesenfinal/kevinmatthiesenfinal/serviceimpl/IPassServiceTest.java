package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.PassDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.PassService;

public class IPassServiceTest {
	
	private PassService service;
	private PassDao dao;
	private Pass pass;
	
	@Before
	public void setup() {
		
		service = new IPassService();
		dao = mock(PassDao.class);
		service.setDao(dao);
		pass = mock(Pass.class);
		
	}
	
	@Test
	public void addTest() {
		
		service.add(pass);
		verify(dao).add(pass);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCustomersTest() {
		
		List<Pass> expected = mock(ArrayList.class);
		
		when(service.getPasses()).thenReturn(expected);
		
		service.getPasses();
		verify(dao).getPasses();
		
	}
	
	@Test
	public void updateCustomerTest() {
		
		service.updatePass(pass);
		verify(dao).updatePass(pass);
		
	}
	
	@Test
	public void getCustomerByIdTest() {
		
		Integer id = 1;
		
		when(dao.getPassById(anyInt())).thenReturn(pass);
		
		service.getPassById(id);
		verify(dao).getPassById(id);
		
	}
	
	@Test
	public void deletePassTest() {
		
		service.deletePass(pass);
		verify(dao).deletePass(pass);
		
	}

}
