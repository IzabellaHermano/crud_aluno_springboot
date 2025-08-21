package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Aluno {
    @Id //Anotação
    @GeneratedValue(strategy = GenerationType.UUID)// Informa a jdk que é necessario seguir essa anoção para execução do código
    private String id;

    private String nome;
    private String cpf;
    private int idAcesso;
    private String email;
    private String curso;

    //Construtor
    public Aluno(String id, String nome, String cpf, int idAcesso, String email, String curso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idAcesso = idAcesso;
        this.email = email;
        this.curso = curso;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
