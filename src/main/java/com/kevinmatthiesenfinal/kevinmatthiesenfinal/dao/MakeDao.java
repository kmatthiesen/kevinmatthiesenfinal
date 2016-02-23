package com.kevinmatthiesenfinal.kevinmatthiesenfinal.dao;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Make;

/**
 * Handles queries with the database involving vehicle makes.
 * 
 * @author kmatthiesen
 *
 */
public interface MakeDao {

	/**
	 * Adds a make to the database.
	 * 
	 * @param vehicle
	 *            The new make to add to the database.
	 * @return The make that was added to the database.
	 */
	public Make add(Make make);

	/**
	 * Gets all makes from the database.
	 * 
	 * @return The list of all makes from the databse.
	 */
	public List<Make> getMakes();

}
