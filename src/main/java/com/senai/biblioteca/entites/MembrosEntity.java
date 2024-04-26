package com.senai.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="membros")
@Entity
@Data
public class MembrosEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String nome;
    private String endereco;
    private String telefone;

}
