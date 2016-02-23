package com.kevinmatthiesenfinal.kevinmatthiesenfinal.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Model;
import com.kevinmatthiesenfinal.kevinmatthiesenfinal.service.ModelService;

/**
 * Handles requests from the webpage concerning vehicle models.
 * 
 * @author kmatthiesen
 *
 */
@RestController
public class ModelWebService {

	@Autowired
	private ModelService service;

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(ModelService service) {

		this.service = service;

	}

	/**
	 * Adds a new model to the database.
	 * 
	 * @param model
	 *            The model to add to the database.
	 * @return The model added to the database.
	 */
	@RequestMapping(value = "/model", method = RequestMethod.POST)
	public Model add(@RequestBody Model model) {

		return service.add(model);

	}

	/**
	 * Gets a list of models from the database.
	 * 
	 * @return The list of models from the database.
	 */
	@RequestMapping(value = "/model", method = RequestMethod.GET)
	public List<Model> getModels() {

		return service.getModels();

	}

}
