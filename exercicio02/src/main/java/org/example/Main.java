package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem[] listaInimigos = new Personagem[3];

        listaInimigos[0] = new Personagem();
        listaInimigos[1] = new Personagem();
        listaInimigos[2] = new Personagem();

        listaInimigos[0].nome = "Orc Shaman";
        listaInimigos[1].nome = "Elf Scout";
        listaInimigos[2].nome = "Forest Fury";

        listaInimigos[0].ataque = 3;
        listaInimigos[1].ataque = 2;
        listaInimigos[2].ataque = 1;

        listaInimigos[0].vida = 20;
        listaInimigos[1].vida = 15;
        listaInimigos[2].vida = 10;

        Personagem jogador = new Personagem();
        jogador.nome = "Denis Tacador de Runa";
        jogador.vida = 10;
        jogador.ataque = 5;

        Random gerador = new Random();

        while (listaInimigos[0].vida > 0 || listaInimigos[1].vida > 0 || listaInimigos[2].vida > 0) {
            jogador.atacar(listaInimigos[gerador.nextInt(listaInimigos.length)]);
        }


        System.out.println(listaInimigos[0].vida);
        System.out.println(listaInimigos[1].vida);
        System.out.println(listaInimigos[2].vida);

    }
}