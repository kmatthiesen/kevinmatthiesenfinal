package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.MakeDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Make;

@Transactional
@Component
public class IMakeDao implements MakeDao {
	
	private String getAllMakesQuery = "SELECT m FROM Make m";
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}

	public Make add(Make make) {

		em.persist(make);
		em.flush();
		return make;
		
	}

	public List<Make> getMakes() {

		return em.createQuery(getAllMakesQuery, Make.class).getResultList();
	}

}
