package com.senai.biblioteca.controller;

import com.senai.biblioteca.entites.MembrosEntity;
import com.senai.biblioteca.service.MembrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/membros")
    @RequiredArgsConstructor

    public class MembrosController {

        private final MembrosService membrosService;

        @GetMapping
        public List<MembrosEntity> retornarMembros() {
            return membrosService.listarMembros();
        }

        @PostMapping
        public MembrosEntity salvarMembros(
                @RequestBody MembrosEntity membrosEntity
        ) {
            return membrosService.salvarMembros(membrosEntity);
        }

        @DeleteMapping
        public String deletarMembros(@RequestParam("id") Long id){
            membrosService.deletarMembros(id);
            return "Emprestimo deletado";

        }

        @PutMapping
        public MembrosEntity atualizarMembros(@RequestBody  MembrosEntity membrosEntity){
            return membrosService.atualizarMembros(membrosEntity);

        }


    }

