package com.DevGatitos.Gatolandia.Application.Gateways;

import com.DevGatitos.Gatolandia.Domain.entities.User.User;

import java.util.List;

public interface RepositorioDeUsuario {

    User cadastrarUsuario (User user);

    List<User> listarUsuarios();
}
