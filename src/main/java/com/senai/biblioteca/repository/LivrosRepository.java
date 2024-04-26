package com.senai.biblioteca.repository;


import com.senai.biblioteca.entites.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivrosEntity, Long> {
    @Query( "Update LivrosEntity l" +
            " Set l.titulo = :titulo, " +
            " l.anoPublicacao = :anoPublicacao" +
            " where l.id = :id")
    LivrosEntity update(@Param("id") Long id,
                       @Param("titulo") String titulo,
                       @Param("anoPublicacao") String anoPublicacao);
}
