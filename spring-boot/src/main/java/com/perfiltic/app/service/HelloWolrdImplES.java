package com.perfiltic.app.service;

import org.springframework.stereotype.Service;

@Service("helloWorldServiceES")
public class HelloWolrdImplES implements IHelloWorldService {

	@Override
	public String getHelloWorld() {
		return "Hola Mundo Servicio ES";
	}

}