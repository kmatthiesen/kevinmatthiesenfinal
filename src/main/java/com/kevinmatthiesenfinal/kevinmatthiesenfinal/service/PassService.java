package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;

/**
 * Handles logic concerning passes.
 * 
 * @author kmatthiesen
 *
 */
public interface PassService {

	/**
	 * Adds a pass to the database.
	 * 
	 * @param pass
	 *            The pass to be added to the database.
	 */
	public void add(Pass pass);

	/**
	 * Retrieves a list of all passes from the database.
	 * 
	 * @return The list of all passes from the database.
	 */
	public List<Pass> getPasses();

	/**
	 * Update a pass in the database.
	 * 
	 * @param pass
	 *            The pass to be updated in the database.
	 */
	public void updatePass(Pass pass);

	/**
	 * Retrieve a pass by their id from the database.
	 * 
	 * @param id
	 *            The id of the pass to retrieve.
	 * @return The pass with the corresponding id.
	 */
	public Pass getPassById(Integer id);

	/**
	 * Delete a pass from the database.
	 * 
	 * @param pass
	 *            The pass to delete.
	 */
	public void deletePass(Pass pass);

}
