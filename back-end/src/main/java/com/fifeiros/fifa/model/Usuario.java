package com.fifeiros.fifa.model;

import com.fifeiros.fifa.dto.request.UsuarioRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Builder // Gerar um Objeto com a classe
@Data  // Fazer Get, Set e To String
@Entity // Para dizer uma Entidade
@AllArgsConstructor // Cria um construtor com todos os argumentos
@NoArgsConstructor // Cria um construtor sem nenhum argumento
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", length = 45)
    private String nome;

    @Column(name = "jogos", length = 30)
    private Integer jogos;

    @Column(name = "vitorias", length = 30)
    private Integer vitorias;

    @Column(name = "empates", length = 30)
    private Integer empates;

    @Column(name = "derrotas", length = 30)
    private Integer derrotas;

    @Column(name = "gols_pro", length = 30)
    private Integer gols_pro;

    @Column(name = "gols_contra", length = 30)
    private Integer gols_contra;

    public Usuario (Integer id) {

        this.id = id;
    }

    public static Usuario of(UsuarioRequest request) {

        var usuario = new Usuario();

        BeanUtils.copyProperties(request, usuario);

        return usuario;
    }

}
