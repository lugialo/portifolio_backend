package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String[] elementos = { "Água", "Fogo", "Ar", "Terra" };

        while (true) {
            String[] vetorElementos = new String[4];
            vetorElementos[0] = "Água";
            vetorElementos[1] = "Fogo";
            vetorElementos[2] = "Ar";
            vetorElementos[3] = "Terra";

            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o primeiro nome");
            String primeiroNome = leitor.nextLine();

            if (primeiroNome == "") return;

            System.out.println("Digite o segundo nome");
            String segundoNome = leitor.nextLine();

            Random geradorAleatorio = new Random();
            Integer numeroAleatorio = geradorAleatorio.nextInt(100);
            Integer indiceAleatorio = geradorAleatorio.nextInt(4);
            String elemento = vetorElementos[indiceAleatorio];

            System.out.println(elemento + primeiroNome + segundoNome + numeroAleatorio);
        }
    }
}