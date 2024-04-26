package com.senai.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="bibliotecarios")
@Entity
@Data
public class BibliotecariosEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;
    private String email;
    private String senha;

}
