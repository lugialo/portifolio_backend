package org.example;

public class Barco {
    private String nome;
    private int tamanho;

    // Construtor
    public Barco (String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
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
    public int getTamanho() {
        return this.tamanho;
    }

    // Setter
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
