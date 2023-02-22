package com.fifeiros.fifa.dto.response;

import com.fifeiros.fifa.model.Usuario;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UsuarioResponse {

    private Integer id;
    private String nome;
    private Integer jogos;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer gols_pro;
    private Integer gols_contra;


    public static UsuarioResponse of(Usuario usuario) {

        return UsuarioResponse.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .jogos(usuario.getJogos())
                .vitorias(usuario.getVitorias())
                .empates(usuario.getEmpates())
                .derrotas(usuario.getDerrotas())
                .gols_pro(usuario.getGols_pro())
                .gols_contra(usuario.getGols_contra())

                .build();
    }

    public static List<UsuarioResponse> of(List<Usuario> usuarios) {

        if(usuarios == null) {

            return null;
        }

        List<UsuarioResponse> list = new ArrayList<>(usuarios.size());

        for(Usuario usuario : usuarios) {

            list.add(of (usuario));
        }

        return list;
    }
}
