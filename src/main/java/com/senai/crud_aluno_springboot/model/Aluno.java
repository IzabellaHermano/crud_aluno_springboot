package com.senai.crud_aluno_springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Data//envolve todas as outras anotações
@Entity
public class Aluno {

    //Constrains
    @Id //Anotação
    @GeneratedValue(strategy = GenerationType.UUID)// Informa a jdk que é necessario seguir essa anoção para execução do código
    private String id;

    @NotBlank(message = "O nome do aluno não pode estar vazio")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank(message = "O CPF do aluno não pode estar vazio")/*NotBlank-> Para String | NotNull -> Para int */
    @Column(nullable = false, length = 100)
    private String cpf;

    private int idAcesso;
    private String email;
    private String curso;

}
