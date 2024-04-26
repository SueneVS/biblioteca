package com.senai.biblioteca.service;

import com.senai.biblioteca.entites.BibliotecariosEntity;
import com.senai.biblioteca.repository.BibliotecariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BibliotecariosService {

    private final BibliotecariosRepository bibliotecariosRepository;

    public List<BibliotecariosEntity> listarBibliotecarios(){
        return bibliotecariosRepository.findAll();
    }

    public BibliotecariosEntity salvarBibliotecarios(BibliotecariosEntity bibliotecariosEntity) {
        return bibliotecariosRepository.save(bibliotecariosEntity);
    }

    public void deletarBibliotecarios(Long id) {
       bibliotecariosRepository.deleteById(id);
    }

    public BibliotecariosEntity atualizarBibliotecarios(BibliotecariosEntity  bibliotecariosEntity) {
        return bibliotecariosRepository.update(
                bibliotecariosEntity.getId(),
                bibliotecariosEntity.getNome(),
                bibliotecariosEntity.getEmail(),
                bibliotecariosEntity.getSenha()
        );
    }
}
