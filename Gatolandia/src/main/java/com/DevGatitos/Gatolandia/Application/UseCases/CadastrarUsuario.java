import com.DevGatitos.Gatolandia.Application.Gateways.RepositorioDeUsuario;
import com.DevGatitos.Gatolandia.Domain.entities.User.User;
import com.DevGatitos.Gatolandia.Infra.Gateways.RepositorioDeUsuarioJpa;

import java.util.List;

public class CadastrarUsuario {

    private RepositorioDeUsuario repositorioDeUsuario;

    public CadastrarUsuario(RepositorioDeUsuario repositorioDeUsuario) {
        this.repositorioDeUsuario = repositorioDeUsuario;
    }

    public User cadastrarUsuario(User user) {
        return repositorioDeUsuario.cadastrarUsuario(user);
    }

    public List<User> listarUsuarios() {
        return repositorioDeUsuario.listarUsuarios();
    }
}
}