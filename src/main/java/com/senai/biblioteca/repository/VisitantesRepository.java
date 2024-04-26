package com.senai.biblioteca.repository;

import com.senai.biblioteca.entites.MembrosEntity;
import com.senai.biblioteca.entites.VisitantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitantesRepository extends JpaRepository<VisitantesEntity, Long> {

    @Query("Update VisitantesEntity v " +
            " Set v.nome = :nome, " +
            " v.telefone = :telefone " +
            " where v.id = :id")
    VisitantesEntity update(@Param("id") Long id,
                         @Param("nome") String nome,
                         @Param("telefone") String telefone);

}
