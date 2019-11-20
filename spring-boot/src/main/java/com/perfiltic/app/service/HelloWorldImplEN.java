package com.perfiltic.app.service;

import org.springframework.stereotype.Service;

@Service("helloWorldServiceEN")
public class HelloWorldImplEN implements IHelloWorldService {

	@Override
	public String getHelloWorld() {
		return "Hello Wolrd Service EN";
	}

}
