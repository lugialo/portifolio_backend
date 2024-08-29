package org.example;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    // Construtor
    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    // Getter nome
    public String getNome() {
        return this.nome;
    }

    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter vida
    public int getVida() {
        return this.vida;
    }

    // Setter vida
    public void setVida(int vida) {
        this.vida = vida;
    }

    // Getter ataque
    public int getAtaque() {
        return this.ataque;
    }

    // Setter ataque
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        if (this.getVida() > 0) {
            this.vida -= dano;
            if (this.getVida() <= 0) {
                System.out.println(this.nome + " foi derrotado!");
            }
        }
    }

    public void atacar(Personagem alvo) {
        if (alvo.getVida() >= 0) {
            alvo.receberDano(this.getAtaque());
        } else if (alvo.getVida() <= 0) {
            System.out.println("O ataque falhou!");
        }
    }
}
