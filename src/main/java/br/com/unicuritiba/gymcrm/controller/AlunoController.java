package br.com.unicuritiba.gymcrm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.gymcrm.model.Aluno;
import br.com.unicuritiba.gymcrm.repository.AlunoRepository;

@RestController
public class AlunoController {

	private final AlunoRepository repositorio;

	AlunoController(AlunoRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	@GetMapping("/alunos")
	public ResponseEntity<List<Aluno>> getAlunos() {
		
		List<Aluno> alunos = repositorio.findAll();
		return ResponseEntity.ok(alunos);
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<Aluno> getAlunoById(
			@PathVariable long id){
		
		Aluno aluno = repositorio.getReferenceById(id);
		return ResponseEntity.ok(aluno);
	}
	
	@DeleteMapping("/alunos/{id}")
	public ResponseEntity<Aluno> deleteAlunoById(
			@PathVariable long id){
		
		repositorio.deleteById(id);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("/alunos/{id}")
	public ResponseEntity<Aluno> updateAlunoById(
			@PathVariable long id,
			@RequestBody Aluno aluno){
		
		aluno.setId(id);
		Aluno alunoAtualizado = repositorio.save(aluno);
		return ResponseEntity.ok(alunoAtualizado);
	}
	
	@PostMapping("/alunos")
	public ResponseEntity<Aluno> saveAluno(
			@RequestBody Aluno aluno){
		
		Aluno alunoSalvo = repositorio.save(aluno);
		return ResponseEntity.ok(alunoSalvo);
	}
	
}
