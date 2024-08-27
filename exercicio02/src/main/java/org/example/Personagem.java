package org.example;

public class Personagem {
    public String nome;
    public Integer vida = 10;
    public Integer ataque = 5;

    public void receberDano(int dano) {
        if (this.vida <= 0) {
            System.out.println("O personagem " + this.nome + " foi derrotado.");
        } else {
            this.vida -= dano;
        }

    }

    public void atacar(Personagem alvo) {
        if (alvo.vida >= 0) {
            alvo.receberDano(this.ataque); // Aplicando o method no alvo.
//            System.out.println("O personagem " + this.nome + " atacou " + alvo.nome + "!");
        } else {
            System.out.println("O ataque falhou.");
        }

    }
}
