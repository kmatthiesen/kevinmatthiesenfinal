package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.PassService;

/**
 * Handles requests from the webpage concerning passes.
 * 
 * @author kmatthiesen
 *
 */
@RestController
public class PassWebService {

	@Autowired
	private PassService service;

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(PassService service) {

		this.service = service;

	}

	/**
	 * Adds a pass to the database.
	 * 
	 * @param pass
	 *            The new pass to be created on the database.
	 */
	@RequestMapping(value = "/pass", method = RequestMethod.POST)
	public void createpass(@RequestBody Pass pass) {
		
		service.add(pass);

	}

	/**
	 * Retrieves all passes from the database.
	 * 
	 * @return The list of passes from the database.
	 */
	@RequestMapping(value = "/pass", method = RequestMethod.GET)
	public List<Pass> getPasses() {

		return service.getPasses();

	}

	/**
	 * Update a pass in the database.
	 * 
	 * @param pass
	 *            The pass to be updated in the database.
	 */
	@RequestMapping(value = "/pass", method = RequestMethod.PUT)
	public void updatePass(@RequestBody Pass pass) {

		service.updatePass(pass);

	}

	/**
	 * Retrieve a pass by its id from the database.
	 * 
	 * @param id
	 *            The id of the pass to retrieve.
	 * @return The pass with the corresponding id.
	 */
	@RequestMapping(value = "/pass/{id}", method = RequestMethod.GET)
	public Pass getPassById(@PathVariable Integer id) {

		return service.getPassById(id);

	}

}
