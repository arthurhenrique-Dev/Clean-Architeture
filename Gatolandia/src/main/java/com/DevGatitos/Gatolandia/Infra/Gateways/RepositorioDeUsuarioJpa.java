package com.DevGatitos.Gatolandia.Infra.Gateways;

import com.DevGatitos.Gatolandia.Application.Gateways.RepositorioDeUsuario;
import com.DevGatitos.Gatolandia.Domain.entities.User.User;
import com.DevGatitos.Gatolandia.Infra.Persistence.UsuarioRepository;


import java.util.List;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario {

    private UsuarioRepository usuarioRepository;

    public RepositorioDeUsuarioJpa(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public User cadastrarUsuario(User user) {
        return usuarioRepository.save(user);
    }

    @Override
    public List<User> listarUsuarios() {
        return usuarioRepository.findAll();
    }
}


