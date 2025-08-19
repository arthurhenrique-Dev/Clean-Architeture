package com.DevGatitos.Gatolandia.Domain.entities.valueObjects;

public class Endereco {

    private String cep;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String cep, String complemento, String bairro, String cidade, String estado) {
        if (cep == null || complemento == null || bairro == null || cidade == null || estado == null) {
            throw new IllegalArgumentException("Endereço inválido");
            }
            this.cep = cep;
            this.complemento = complemento;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
