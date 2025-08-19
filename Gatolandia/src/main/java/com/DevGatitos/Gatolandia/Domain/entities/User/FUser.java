package com.DevGatitos.Gatolandia.Domain.entities.User;

import com.DevGatitos.Gatolandia.Domain.entities.valueObjects.Endereco;

public class FUser {

    private User user;

    public User fillUser(String cpf, String NomeCompleto,  String email, String senha) {
        this.user = new User(cpf, NomeCompleto, email, senha);
        return this.user;
    }
    public User includeAdress(String cep, String complemento, String bairro, String cidade, String estado) {
        this.user.setEndereco(new Endereco(cep, complemento, bairro, cidade, estado));
        return this.user;
    }
}
