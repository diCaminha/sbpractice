package com.example.alura.sbpractice.models.dtos;

import com.example.alura.sbpractice.models.Curso;
import com.example.alura.sbpractice.models.Resposta;
import com.example.alura.sbpractice.models.StatusTopico;
import com.example.alura.sbpractice.models.Usuario;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TopicoDTO {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
}
