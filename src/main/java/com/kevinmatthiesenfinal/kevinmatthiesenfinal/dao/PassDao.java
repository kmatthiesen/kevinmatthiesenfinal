package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Pass;

/**
 * Handles queries with the database involving passes.
 * 
 * @author kmatthiesen
 *
 */
public interface PassDao {

	/**
	 * Setter for an EntityManager
	 * 
	 * @param em
	 *            The EntityManager to set
	 */
	public void setEm(EntityManager em);
	
	/**
	 * Adds a pass to the database.
	 * 
	 * @param pass
	 *            The new pass to add to the database.
	 */
	public void add(Pass pass);

	/**
	 * Retrieves a list of all passes from the database.
	 * 
	 * @return The list of all passes from the database.
	 */
	public List<Pass> getPasses();

	/**
	 * Updates a pass in the database.
	 * 
	 * @param pass
	 *            The pass to update;
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
	 * Deletes a pass from the database.
	 * 
	 * @param pass
	 *            The pass to delete.
	 */
	public void deletePass(Pass pass);

}
