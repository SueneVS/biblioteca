package com.senai.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Data;

@Table(name= "visitantes")
@Entity
@Data
public class VisitantesEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;
    private String telefone;

}
