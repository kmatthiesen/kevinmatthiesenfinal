package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Make;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.MakeService;

/**
 * Handles requests from the webpage concerning vehicle makes.
 * 
 * @author kmatthiesen
 *
 */
@RestController
public class MakeWebService {

	@Autowired
	private MakeService service;

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(MakeService service) {

		this.service = service;

	}

	/**
	 * Adds a new make to the database.
	 * 
	 * @param make
	 *            The new make to add to the database.
	 * @return The make that was added.
	 */
	@RequestMapping(value = "/make", method = RequestMethod.POST)
	public Make add(@RequestBody Make make) {

		return service.add(make);

	}

	/**
	 * Gets a list of all makes from the database.
	 * 
	 * @return The list of of makes from the database.
	 */
	@RequestMapping(value = "/make", method = RequestMethod.GET)
	public List<Make> getMakes() {

		return service.getMakes();

	}

}
