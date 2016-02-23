package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Model;

/**
 * Handles logic concerning vehicle models.
 * 
 * @author kmatthiesen
 *
 */
public interface ModelService {

	/**
	 * Adds a new model to the database.
	 * 
	 * @param model
	 *            The model to be added to the database.
	 * @return The model that was added to the database.
	 */
	public Model add(Model model);

	/**
	 * Gets a list of all models from the database.
	 * 
	 * @return The list of all models from the database.
	 */
	public List<Model> getModels();

}
