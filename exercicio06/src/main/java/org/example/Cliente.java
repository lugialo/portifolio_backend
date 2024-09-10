package org.example;

public class Cliente {
    private String nome;
    private int idade;

    // Construtor
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter
    public String getNome() {
        return this.nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public int getIdade() {
        return this.idade;
    }

    // Setter
    public void setIdade(int idade) {
        this.idade = idade;
    }


}
