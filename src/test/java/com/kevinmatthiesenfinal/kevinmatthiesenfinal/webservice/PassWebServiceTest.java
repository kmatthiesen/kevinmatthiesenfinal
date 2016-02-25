package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.PassService;

public class PassWebServiceTest {
	
	private PassWebService webService;
	private PassService service;
	private Pass pass;
	
	@Before
	public void setup() {
		
		webService = new PassWebService();
		service = mock(PassService.class);
		webService.setService(service);
		pass = mock(Pass.class);
		
	}
	
	@Test
	public void addTest() {
		
		webService.add(pass);
		verify(service).add(pass);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getPassesTest() {
		
		List<Pass> expected = mock(ArrayList.class);
		
		when(service.getPasses()).thenReturn(expected);
		
		webService.getPasses();
		verify(service).getPasses();
		
	}
	
	@Test
	public void updatePassTest() {
		
		webService.updatePass(pass);
		verify(service).updatePass(pass);
		
	}
	
	@Test
	public void getPassByIdTest() {
		
		Integer id = 1;
		
		when(service.getPassById(anyInt())).thenReturn(pass);
		
		webService.getPassById(id);
		verify(service).getPassById(id);
		
	}
	
	@Test
	public void deletePassTest() {
		
		Integer id = 1;
		
		when(service.getPassById(anyInt())).thenReturn(pass);
		
		webService.deletePass(id);
		verify(service).deletePass(pass);
		
	}

}
