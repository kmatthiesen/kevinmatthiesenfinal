package com.kevinmatthiesenfinal.kevinmatthiesenfinal.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao.MakeDao;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Make;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.MakeService;

@Service
public class IMakeService implements MakeService {
	
	@Autowired
	private MakeDao dao;

	/**
	 * @param dao the dao to set
	 */
	public void setDao(MakeDao dao) {
	
		this.dao = dao;
		
	}

	public Make add(Make make) {

		return dao.add(make);
		
	}

	public List<Make> getMakes() {

		return dao.getMakes();
		
	}

}
