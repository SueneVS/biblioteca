package com.senai.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name="livros")
@Data
public class LivrosEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String titulo;
    private String autor;
    @Column(name = "anoPublicacao")
    private String anoPublicacao;

}
