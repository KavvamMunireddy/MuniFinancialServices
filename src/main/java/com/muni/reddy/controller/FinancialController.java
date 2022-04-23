/**
 * 
 */
package com.muni.reddy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hp
 *
 */
@RestController
@RequestMapping(path="/api/financial")
public class FinancialController {
	@GetMapping(path="/getHomePage")
	public String getHomePage(){
		return "Welcome to Muni Financial Services!";
	}

}
