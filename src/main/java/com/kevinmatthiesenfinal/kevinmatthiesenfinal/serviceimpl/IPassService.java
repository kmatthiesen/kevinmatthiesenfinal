package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.PassDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.PassService;

@Service
public class IPassService implements PassService {
	
	@Autowired
	private PassDao dao;

	/**
	 * @param dao the dao to set
	 */
	public void setDao(PassDao dao) {
	
		this.dao = dao;
		
	}

	public void add(Pass pass) {
		
		dao.add(pass);

	}

	public List<Pass> getPasses() {

		return dao.getPasses();

	}

	public void updatePass(Pass pass) {

		dao.updatePass(pass);

	}

	public Pass getPassById(Integer id) {

		return dao.getPassById(id);

	}

	public void deletePass(Pass pass) {

		dao.deletePass(pass);
		
	}

}
