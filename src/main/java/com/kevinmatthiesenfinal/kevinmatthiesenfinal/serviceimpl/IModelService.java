package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.ModelDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Model;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.ModelService;

@Service
public class IModelService implements ModelService {
	
	@Autowired
	private ModelDao dao;

	/**
	 * @param dao the dao to set
	 */
	public void setDao(ModelDao dao) {
	
		this.dao = dao;
		
	}

	public Model add(Model model) {

		return dao.add(model);
				
	}

	public List<Model> getModels() {

		return dao.getModels();
		
	}

}
