package org.example;

public class Filme {
    private String nome;
    private double preco;
    private int idadeMinima;

    // Construtor
    public Filme(String nome, double preco, int idadeMinima) {
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
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
    public double getPreco() {
        return this.preco;
    }

    // Setter
    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Getter
    public int getIdadeMinima() {
        return this.idadeMinima;
    }

    // Setter
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }


}
