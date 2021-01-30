package com.example.alura.sbpractice.controllers;

import com.example.alura.sbpractice.models.Curso;
import com.example.alura.sbpractice.models.Topico;
import com.example.alura.sbpractice.models.dtos.TopicoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @GetMapping("/topicos")
    public List<TopicoDTO> getTopicos() {
        //simulando dados do banco
        Topico topico =
                new Topico("Certeza",
                        "mensagem duvida",
                        new Curso("Spring", "Programação"));

        return TopicoDTO.converter(Arrays.asList(topico,topico,topico,topico));
    }
}
