package com.senai.biblioteca.controller;
import com.senai.biblioteca.entites.LivrosEntity;
import com.senai.biblioteca.service.LivrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor

public class LivrosController {

    private final LivrosService livrosService;

    @GetMapping
    public List<LivrosEntity> retornarLivros() {
        return livrosService.listarLivros();
    }

    @PostMapping
    public LivrosEntity salvarLivros(
            @RequestBody LivrosEntity livrosEntity
    ) {
        return livrosService.salvarLivros(livrosEntity);
    }

    @DeleteMapping
    public String deletarLivros(@RequestParam("id") Long id){
        livrosService.deletarLivros(id);
        return "Livro deletado";
    }


    @PutMapping
    public LivrosEntity atualizarLivros(@RequestBody LivrosEntity livrosEntity){
        return livrosService.atualizarLivros(livrosEntity);
    }


}