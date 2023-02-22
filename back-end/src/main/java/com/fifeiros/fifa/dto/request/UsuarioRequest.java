package com.fifeiros.fifa.dto.request;

import lombok.Data;

@Data
public class UsuarioRequest {

    private Integer id;
    private String nome;
    private Integer jogos;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer gols_pro;
    private Integer gols_contra;
}
