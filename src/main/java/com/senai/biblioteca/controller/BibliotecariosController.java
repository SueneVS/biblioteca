package com.senai.biblioteca.controller;


import com.senai.biblioteca.entites.BibliotecariosEntity;
import com.senai.biblioteca.entites.BibliotecariosEntity;
import com.senai.biblioteca.service.BibliotecariosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor

public class BibliotecariosController {

    private final BibliotecariosService bibliotecariosService;

    @GetMapping
    public List<BibliotecariosEntity> retornarBibliotecarios() {
        return bibliotecariosService.listarBibliotecarios();
    }

    @PostMapping
    public BibliotecariosEntity salvarBibliotecarios(
            @RequestBody BibliotecariosEntity bibliotecariosEntity
    ) {
        return bibliotecariosService.salvarBibliotecarios(bibliotecariosEntity);
    }

    @DeleteMapping
    public String deletarBibliotecarios(@RequestParam("id") Long id){
        bibliotecariosService.deletarBibliotecarios(id);
        return "Bibliotecario deletado";
    }


    @PutMapping
    public BibliotecariosEntity atualizarBibliotecarios(@RequestBody BibliotecariosEntity bibliotecariosEntity){
        return bibliotecariosService.atualizarBibliotecarios(bibliotecariosEntity);
    }



}
