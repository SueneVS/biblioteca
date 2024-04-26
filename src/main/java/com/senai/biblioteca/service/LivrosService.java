package com.senai.biblioteca.service;


import com.senai.biblioteca.entites.LivrosEntity;
import com.senai.biblioteca.repository.LivrosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivrosService {

    private final LivrosRepository livrosRepository;


    public List<LivrosEntity> listarLivros() {

        return livrosRepository.findAll();
    }

    public LivrosEntity salvarLivros(LivrosEntity livrosEntity) {
        return livrosRepository.save(livrosEntity);

    }

    public void deletarLivros(Long id) {
        livrosRepository.deleteById(id);
    }

    public LivrosEntity atualizarLivros(LivrosEntity livrosEntity) {
        return livrosRepository.update(
                livrosEntity.getId(),
                livrosEntity.getTitulo(),
                livrosEntity.getAnoPublicacao()
        );
    }



}
