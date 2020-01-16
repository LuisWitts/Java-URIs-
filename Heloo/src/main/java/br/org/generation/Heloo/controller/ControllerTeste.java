package br.org.generation.Heloo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController




// graças ao Controller posso ter varios metodos , varios links 
public class ControllerTeste {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World ! Nosso primeiro projeto SpringBoot";
		
	}
	@GetMapping("/bye")
	public String sayBye() {
		return "xau bgd";
		
	}	

}

