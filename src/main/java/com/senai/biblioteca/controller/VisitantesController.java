package com.senai.biblioteca.controller;


import com.senai.biblioteca.entites.VisitantesEntity;
import com.senai.biblioteca.entites.VisitantesEntity;
import com.senai.biblioteca.service.VisitantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitantesController {

    private final VisitantesService visitantesService;

    @GetMapping
    public List<VisitantesEntity> retornarVisitantes() {
        return visitantesService.listarVisitantes();
    }

    @PostMapping
    public VisitantesEntity salvarVisitantes(
            @RequestBody VisitantesEntity visitantesEntity
    ) {
        return visitantesService.salvarVisitantes(visitantesEntity);
    }
    
    @DeleteMapping
    public String deletarVisitantes(@RequestParam("id") Long id){
        visitantesService.deletarVisitantes(id);
        return "Emprestimo deletado";

    }

    @PutMapping
    public VisitantesEntity atualizarVisitantes(@RequestBody  VisitantesEntity visitantesEntity){
        return visitantesService.atualizarVisitantes(visitantesEntity);

    }
}
