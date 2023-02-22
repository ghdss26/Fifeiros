package com.fifeiros.fifa.controller;

import com.fifeiros.fifa.dto.request.UsuarioRequest;
import com.fifeiros.fifa.dto.response.UsuarioResponse;
import com.fifeiros.fifa.model.Usuario;
import com.fifeiros.fifa.repository.UsuarioRepository;
import com.fifeiros.fifa.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api_usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    public void cadastrar(@RequestBody UsuarioRequest request) {

        service.cadastrarUsuario(request);
    }

    @GetMapping("/usuarios")
    public List<UsuarioResponse> listar() {

        return service.buscarUsuarios();
    }

    @DeleteMapping("/usuario")
    public void deletarUsuario(@RequestBody @Valid Usuario usuario) {

        usuarioRepository.delete(usuario);
    }

    @PutMapping("/usuario")
    public Usuario atualizaUsuario(@RequestBody @Valid Usuario usuario) {

        return usuarioRepository.save(usuario);
    }
 }
