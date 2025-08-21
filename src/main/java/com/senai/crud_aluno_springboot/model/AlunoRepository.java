package com.senai.crud_aluno_springboot.model;

import org.springframework.data.jpa.repository.JpaRepository;//Biblioteca

public interface AlunoRepository extends JpaRepository<Aluno, String> {

}
