package com.DevGatitos.Gatolandia.Infra.Persistence;

import com.DevGatitos.Gatolandia.Domain.entities.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<User,String> {
}
