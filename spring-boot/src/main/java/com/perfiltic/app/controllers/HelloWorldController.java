package com.perfiltic.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.perfiltic.app.service.IHelloWorldService;

//crea un controlador REST
@RestController
public class HelloWorldController {

	@Autowired
	private IHelloWorldService helloWorldServiceEN;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloworld(@RequestParam String user, @RequestParam String email) {
		return helloWorldServiceEN.getHelloWorld();
	}

}
