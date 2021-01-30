package com.example.alura.sbpractice.models.dtos;

import com.example.alura.sbpractice.models.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TopicoDTO {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoDTO(Topico topico) {
        this.id = topico.getId();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.titulo = topico.getTitulo();
    }

    public static List<TopicoDTO> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
    }
}
