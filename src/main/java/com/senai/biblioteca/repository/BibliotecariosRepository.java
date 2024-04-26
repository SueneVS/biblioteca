package com.senai.biblioteca.repository;

import com.senai.biblioteca.entites.BibliotecariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecariosRepository extends JpaRepository<BibliotecariosEntity, Long> {
    @Query("Update BibliotecariosEntity b " +
            " Set b.nome = :nome, " +
            " b.email = :email, " +
            " b.senha = :senha " +
            " where b.id = :id")
    BibliotecariosEntity update(@Param("id") Long id,
                         @Param("nome") String nome,
                         @Param("email") String email,
                         @Param("senha") String senha);

}
