package com.DevGatitos.Gatolandia.Domain.entities.User;

import com.DevGatitos.Gatolandia.Domain.entities.valueObjects.Endereco;

public class User {

    private String cpf;
    private String NomeCompleto;
    private String email;
    private String senha;
    private Endereco endereco;

    public User(String cpf, String nomeCompleto, String email, String senha) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("Insira um cpf válido");
        }
        if (nomeCompleto == null) {
            throw new IllegalArgumentException("Insira um nome completo");
        }
        if (email == null) {
            throw new IllegalArgumentException("Insira um email");
        }
        if (senha == null) {
            throw new IllegalArgumentException("Insira uma senha");
        }
        this.cpf = cpf;
        this.NomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
