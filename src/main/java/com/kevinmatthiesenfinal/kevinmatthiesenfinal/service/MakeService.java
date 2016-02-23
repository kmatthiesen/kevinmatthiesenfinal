package com.kevinmatthiesenfinal.kevinmatthiesenfinal.service;

import java.util.List;

import com.kevinmatthiesenfinal.kevinmatthiesenfinal.entity.Make;

/**
 * Handles logic concerning vehicle makes.
 * 
 * @author kmatthiesen
 *
 */
public interface MakeService {

	/**
	 * Add a new make to the database.
	 * 
	 * @param make
	 *            The make to be added to the database.
	 * @return The make that was added to the database.
	 */
	public Make add(Make make);

	/**
	 * Gets a list of all makes from the database.
	 * 
	 * @return The list of all makes from the database.
	 */
	public List<Make> getMakes();

}
