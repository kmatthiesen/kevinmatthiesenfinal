package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.PassDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;

@Transactional
@Component
public class IPassDao implements PassDao {
	
	private String getAllPassesQuery = "SELECT p FROM Pass p";
	private String getPassByIdQuery = "SELECT p FROM Pass p WHERE p.passId =:id";
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}

	public void add(Pass pass) {

		em.persist(pass);
		em.flush();

	}

	public List<Pass> getPasses() {

		return em.createQuery(getAllPassesQuery, Pass.class).getResultList();
		
	}

	public void updatePass(Pass pass) {

		em.merge(pass);
		em.flush();

	}

	public Pass getPassById(Integer id) {

		return em.createQuery(getPassByIdQuery, Pass.class).setParameter("id", id).getSingleResult();
		
	}

	public void deletePass(Pass pass) {

		em.remove(pass);
		
	}

}
