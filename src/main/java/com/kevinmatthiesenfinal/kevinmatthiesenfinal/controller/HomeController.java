package com.kevinmatthiesenfinal.kevinmatthiesenfinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controls the page to page navigation of the webpage.
 * 
 * @author kmatthiesen
 *
 */
@Controller
public class HomeController {

	/**
	 * Directs the user to the home page upon hitting the default url.
	 * 
	 * @return The location of the home page.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "/index.html";

	}
}
