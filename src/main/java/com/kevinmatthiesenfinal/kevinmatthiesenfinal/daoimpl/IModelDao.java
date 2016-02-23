package com.kevinmatthiesenfinal.kevinmatthiesenfinal.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.ModelDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Model;

@Transactional
@Component
public class IModelDao implements ModelDao {
	
	private String getAllModelsQuery = "SELECT m FROM Model m";
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		
		this.em = em;
		
	}

	public Model add(Model model) {

		em.persist(model);
		em.flush();
		return model;
	}

	public List<Model> getModels() {

		return em.createQuery(getAllModelsQuery, Model.class).getResultList();
		
	}

}
