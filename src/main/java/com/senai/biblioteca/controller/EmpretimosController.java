package com.senai.biblioteca.controller;


import com.senai.biblioteca.entites.EmprestimosEntity;

import com.senai.biblioteca.service.EmprestimosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
@RequiredArgsConstructor
public class EmpretimosController {

    private final EmprestimosService emprestimosService;

    @GetMapping
    public List<EmprestimosEntity> retornarEmprestimos() {
        return emprestimosService.listarEmprestimos();
    }

    @PostMapping
    public EmprestimosEntity salvarEmprestimos(
            @RequestBody EmprestimosEntity emprestimosEntity
    ) {
        return emprestimosService.salvarEmprestimos(emprestimosEntity);
    }

    @DeleteMapping
    public String deletarEmprestimos(@RequestParam("id") Long id){
        emprestimosService.deletarEmprestimos(id);
        return "Emprestimo deletado";

    }

    @PutMapping
    public EmprestimosEntity atualizarEmprestimos(@RequestBody  EmprestimosEntity emprestimosEntity){
        return emprestimosService.atualizarEmprestimos(emprestimosEntity);

    }
}
