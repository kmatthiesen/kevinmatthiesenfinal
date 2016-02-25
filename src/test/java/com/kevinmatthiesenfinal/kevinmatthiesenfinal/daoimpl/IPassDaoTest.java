package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.PassDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;

public class IPassDaoTest {
	
	private PassDao dao;
	private EntityManager em;
	private Pass pass;
	
	@Before
	public void setup() {
		
		dao = new IPassDao();
		em = mock(EntityManager.class);
		dao.setEm(em);
		pass = mock(Pass.class);
		
	}
	
	@Test
	public void addTest() {
		
		dao.add(pass);
		verify(em).persist(pass);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getPassTest() {
		
		TypedQuery<Pass> query = mock(TypedQuery.class);
		List<Pass> expected = new ArrayList<Pass>();
		
		when(em.createQuery(anyString(), eq(Pass.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(expected);
		
		dao.getPasses();
		verify(query).getResultList();
		
	}
	
	@Test
	public void updateTest() {
		
		dao.updatePass(pass);
		verify(em).merge(pass);
		verify(em).flush();
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getPassByIdTest() {
		
		TypedQuery<Pass> query = mock(TypedQuery.class);
		Pass expected = new Pass();
		
		when(em.createQuery(anyString(), eq(Pass.class))).thenReturn(query);
		when(query.setParameter(anyString(), anyInt())).thenReturn(query);
		when(query.getSingleResult()).thenReturn(expected);
		
		dao.getPassById(1);
		verify(query).getSingleResult();
		
	}
	
	@Test
	public void deletePassTest() {
		
		dao.deletePass(pass);
		verify(em).remove(pass);
		verify(em).flush();
		
	}

}
