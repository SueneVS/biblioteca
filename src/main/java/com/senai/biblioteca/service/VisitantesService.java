package com.senai.biblioteca.service;

import com.senai.biblioteca.entites.VisitantesEntity;
import com.senai.biblioteca.entites.VisitantesEntity;
import com.senai.biblioteca.repository.VisitantesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitantesService {

    private final VisitantesRepository visitantesRepository;

    public List<VisitantesEntity> listarVisitantes() {
        return visitantesRepository.findAll();
    }

    public VisitantesEntity salvarVisitantes(VisitantesEntity visitantesEntity) {
        return visitantesRepository.save(visitantesEntity);
    }

    public void deletarVisitantes(Long id) {
        visitantesRepository.deleteById(id);
    }

    public VisitantesEntity atualizarVisitantes(VisitantesEntity visitantesEntity) {
        return visitantesRepository.update(
                visitantesEntity.getId(),
                visitantesEntity.getNome(),
                String.valueOf(visitantesEntity.getTelefone())
        );
    }
}
