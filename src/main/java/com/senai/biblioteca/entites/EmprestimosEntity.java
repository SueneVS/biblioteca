package com.senai.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table(name="emprestimos")
@Data
public class EmprestimosEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;


    @ManyToOne
    private LivrosEntity livros;

    @ManyToOne
    private MembrosEntity membros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


}
