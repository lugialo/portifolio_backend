package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Shrek", 10, 10));
        inimigos.add(new Personagem("Burro", 5, 5));
        inimigos.add(new Personagem("Dragão", 5, 10));

        Personagem personagem = new Personagem("Denis Tacador de Runa", 100, 5);

        Random random = new Random();


        while (personagem.getVida() > 0 || (inimigos.get(0).getVida() > 0  && inimigos.get(1).getVida() > 0 && inimigos.get(2).getVida() > 0))
        {
            Personagem inimigoAleatorio = inimigos.get(random.nextInt(inimigos.size()));

            if (inimigoAleatorio.getVida() > 0) {
                personagem.atacar(inimigoAleatorio);
            }

            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(personagem);
                }
            }
        }

    }
}