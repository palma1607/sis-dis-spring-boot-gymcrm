package br.com.unicuritiba.gymcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.gymcrm.model.Aluno;
import br.com.unicuritiba.gymcrm.repository.AlunoRepository;

@RestController
public class AlunoController {

	@Autowired
	private AlunoRepository repositorio;
	
	@GetMapping("/alunos")
	public ResponseEntity<List<Aluno>> getAlunos() {
		
		List<Aluno> alunos = repositorio.findAll();
		
		return ResponseEntity.ok(alunos);
	}
	
	@PostMapping("/alunos")
	public ResponseEntity<Aluno> saveAluno(
			@RequestBody Aluno aluno){
		
		Aluno alunoSalvo = repositorio.save(aluno);
		
		return ResponseEntity.ok(alunoSalvo);
	}
	
}
