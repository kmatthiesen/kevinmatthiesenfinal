package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Model;

/**
 * Handles queries with the database involving vehicle models.
 * 
 * @author kmatthiesen
 *
 */
public interface ModelDao {

	/**
	 * Adds a model to the database.
	 * 
	 * @param vehicle
	 *            The new model to add to the database.
	 * @return The model that was added to the database.
	 */
	public Model add(Model model);

	/**
	 * Gets all models from the database.
	 * 
	 * @return The list of all models from the database.
	 */
	public List<Model> getModels();

}
