package br.com.unicuritiba.gymcrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

	@GetMapping("/professores")
	public String getProfessores() {
		return "Olá professor!!!";
	}
	
	
	
	
}
