package com.fifeiros.fifa.service;

import com.fifeiros.fifa.dto.request.UsuarioRequest;
import com.fifeiros.fifa.dto.response.UsuarioResponse;
import com.fifeiros.fifa.model.Usuario;
import com.fifeiros.fifa.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public void cadastrarUsuario (UsuarioRequest request) {

        repository.save(Usuario.of(request));
    }

    public List<UsuarioResponse> buscarUsuarios() {

        return UsuarioResponse.of(repository.findAll());
    }

    public Usuario buscarPorid(Integer id) {

        return repository.findById(id).get();
    }

    @Transactional
    public UsuarioResponse atualizarUsuario(UsuarioRequest request, Integer id) {

        var usuario = buscarPorid(id);
        BeanUtils.copyProperties(Usuario.of(request), usuario, "id");

        return UsuarioResponse.of(repository.save(usuario));
    }

    public void deletarUsuario (Integer id) {

        var usuario = buscarPorid(id);
        repository.delete(usuario);
    }

}
