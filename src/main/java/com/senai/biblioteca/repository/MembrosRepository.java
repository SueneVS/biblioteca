package com.senai.biblioteca.repository;


import com.senai.biblioteca.entites.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembrosRepository extends JpaRepository<MembrosEntity, Long> {
    @Query("Update MembrosEntity m " +
            " Set m.nome = :nome, " +
            " m.endereco = :endereco, " +
            " m.telefone = :telefone " +
            " where m.id = :id")
    MembrosEntity update(@Param("id") Long id,
                        @Param("nome") String nome,
                        @Param("endereco") String endereco,
                        @Param("telefone") String telefone);
}
