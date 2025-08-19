package com.DevGatitos.Gatolandia.Domain.entities.Gato;

public class Gato {

    private Long id;
    private String nome;
    private String raça;
    private Float idade;
    private Float peso;
    private String personalidade;
    private String resgate;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getIdade() {
        return idade;
    }

    public void setIdade(Float idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public String getResgate() {
        return resgate;
    }

    public void setResgate(String resgate) {
        this.resgate = resgate;
    }

    public Gato(String nome, String raça, Float idade, Float peso, String personalidade, String resgate) {
        if (nome == null) {
            throw new IllegalArgumentException("Insira um nome");
        }
        if (raça == null) {
            throw new IllegalArgumentException("Insira uma raça");
        }
        if (idade == null) {
            throw new IllegalArgumentException("Insira uma idade");
        }
        if (peso== null) {
            throw new IllegalArgumentException("Insira um peso");
        }
        if (resgate== null) {
            throw new IllegalArgumentException("Insira a experiência de resgate");
        }
        if (personalidade == null) {
            throw new IllegalArgumentException("Insira um personalidade (mesmo que indefinida)");
        }
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;
        this.peso = peso;
        this.personalidade = personalidade;
        this.resgate = resgate;
    }
}
