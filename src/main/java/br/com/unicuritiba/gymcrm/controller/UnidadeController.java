package br.com.unicuritiba.gymcrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnidadeController {

	@GetMapping("/unidades")
	public String getUnidades() {
		return "Olá unidades!!!";
	}
	
	
	
	
}
