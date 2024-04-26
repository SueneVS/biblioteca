package com.senai.biblioteca.service;

import com.senai.biblioteca.entites.EmprestimosEntity;
import com.senai.biblioteca.repository.EmprestimosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmprestimosService {
    private final EmprestimosRepository emprestimosRepository;


    public List<EmprestimosEntity> listarEmprestimos() {
        return emprestimosRepository.findAll();
    }

    public EmprestimosEntity salvarEmprestimos(EmprestimosEntity emprestimosEntity) {
        return emprestimosRepository.save(emprestimosEntity);
    }


    public void deletarEmprestimos(Long id) {
        emprestimosRepository.deleteById(id);
    }

    public EmprestimosEntity atualizarEmprestimos(EmprestimosEntity emprestimosEntity) {
        return emprestimosRepository.update(
                emprestimosEntity.getId(),
                emprestimosEntity.getLivros(),
                emprestimosEntity.getMembros(),
                emprestimosEntity.getDataEmprestimo(),
                emprestimosEntity.getDataDevolucao()
        );
    }
}
