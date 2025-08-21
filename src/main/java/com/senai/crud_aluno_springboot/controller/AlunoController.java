package com.senai.crud_aluno_springboot.controller;

import com.senai.crud_aluno_springboot.model.Aluno;
import com.senai.crud_aluno_springboot.model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// Quando receber uma requisição REST, direcina para o controller
@RequestMapping("/aluno")//toda requisição que recebe, faz um mapeamento dela e direciona para o lugar certo
//mapear: pegar valor e converter para outro valor

public class AlunoController {

    @Autowired//Instancia o repositorio
    private AlunoRepository alunoRepository;

    // Criar um novo aluno
    @PostMapping
    public Aluno creatAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    //Listar Alunos
    @GetMapping
    public List <Aluno> getAllAluno(){
        return alunoRepository.findAll();
    }

    //Buscar por ID
    /*@GetMapping ("/{id}")
    public Aluno getAlunosById(@PathVariable String id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }*/

    //Atualizar Aluno
    /*@PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno alunoDetails) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        aluno.setNome(alunoDetails.getNome());
        aluno.setCpf(alunoDetails.getCpf());
        aluno.setEmail(alunoDetails.getEmail());
        aluno.setCurso(alunoDetails.getCurso());

        return alunoRepository.save(aluno);
    }*/

    //Excluir Aluno
    @DeleteMapping ("/{id}")
    public void deleteAluno(@PathVariable String id) {
        alunoRepository.deleteById(id);
    }


}
