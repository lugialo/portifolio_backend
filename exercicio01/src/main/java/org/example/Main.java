package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] filmes = {"The Walking Dead", "Zumbilândia", "Todo Mundo em Pânico", "O Hereditário"};

        Scanner leitor = new Scanner(System.in);
        System.out.println("Pergunta 1: Qual sua categoria de filme favorita?");
        System.out.println("1. Zumbis");
        System.out.println("2. Terror");
        String resposta1 = leitor.nextLine();

        String stringResultado = "Você deveria assistir";

        System.out.println("Pergunta 2: Qual seu gênero favorito?");
        System.out.println("1. Drama");
        System.out.println("2. Comédia");
        String resposta2 = leitor.nextLine();

        String respostaCombinada = resposta1 + resposta2;

        switch (respostaCombinada) {
            case "12":
                System.out.println(stringResultado + filmes[0]);
                break;
            case "11":
                System.out.println(stringResultado + filmes[1]);
                break;
            case "21":
                System.out.println(stringResultado + filmes[3]);
                break;
            case "22":
                System.out.println(stringResultado + filmes[2]);
                break;
            default:
                System.out.println("Infelizmente não encontramos nenhum filme o qual você possa assistir.");
                break;
        }

    }
}