package com.naver.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naver.demo.dao.PersonRepository;
import com.naver.demo.model.Person;

/**
 * Handles requests for the application home page.
 */
@RestController
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonRepository personRepository;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public List<Person> list(Model model) {
		List<Person> persons = personRepository.findAll();
		return persons;
	}
}
