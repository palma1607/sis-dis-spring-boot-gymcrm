package br.com.unicuritiba.gymcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.gymcrm.model.Aluno;

public interface AlunoRepository 
		extends JpaRepository<Aluno, Long> {

}
