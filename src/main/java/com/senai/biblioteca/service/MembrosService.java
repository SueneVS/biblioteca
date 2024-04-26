package com.senai.biblioteca.service;

import com.senai.biblioteca.entites.MembrosEntity;
import com.senai.biblioteca.entites.MembrosEntity;
import com.senai.biblioteca.repository.MembrosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MembrosService {

    private final MembrosRepository membrosRepository;
    public List<MembrosEntity> listarMembros() {
        return membrosRepository.findAll();
    }

    public MembrosEntity salvarMembros(MembrosEntity membrosEntity) {
        return membrosRepository.save(membrosEntity);
    }

    public void deletarMembros(Long id) {
      membrosRepository.deleteById(id);
    }

    public MembrosEntity atualizarMembros(MembrosEntity membrosEntity) {
        return membrosRepository.update(
                membrosEntity.getId(),
                membrosEntity.getNome(),
                membrosEntity.getEndereco(),
                String.valueOf(membrosEntity.getTelefone())
        );
    }
}
