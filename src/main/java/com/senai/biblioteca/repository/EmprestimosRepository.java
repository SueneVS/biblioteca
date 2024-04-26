package com.senai.biblioteca.repository;

import com.senai.biblioteca.entites.EmprestimosEntity;

import com.senai.biblioteca.entites.LivrosEntity;
import com.senai.biblioteca.entites.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EmprestimosRepository extends JpaRepository<EmprestimosEntity, Long> {

    @Query("Update EmprestimosEntity e " +
                    " SET" +
                    " e.livros = :livro ," +
                    " e.membros = :membro ," +
                    " e.dataEmprestimo = :data_emprestimo ," +
                    " e.dataDevolucao = :data_devolucao " +
                    " where e.id = :id "
    )
    EmprestimosEntity update(@Param("id") Long id,
                             @Param("livro") LivrosEntity livro,
                             @Param("membro") MembrosEntity membro,
                             @Param("data_emprestimo") LocalDate dataEmprestimo,
                             @Param("data_devolucao") LocalDate dataDevolucao);
}

