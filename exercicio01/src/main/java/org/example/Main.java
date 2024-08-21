package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] arrayFilmes = {
                {"The Walking Dead", "Zumbilândia"},
                {"Todo Mundo em Pânico", "O Hereditário"} // Dividindo em dois arrays, pra pegar o valor de cada um. O primeiro array é a categoria e o segundo é o gênero.
        };
        Scanner leitor = new Scanner(System.in);
        System.out.println("Pergunta 1: Qual sua categoria de filme favorita?");
        System.out.println("1. Zumbis");
        System.out.println("2. Terror");
        Integer respostaCategoria = leitor.nextInt() - 1;

        System.out.println("Pergunta 2: Qual seu gênero favorito?");
        System.out.println("1. Drama");
        System.out.println("2. Comédia");
        Integer respostaGenero = leitor.nextInt() - 1;

        String stringResultado = "Você deveria assistir ";
        String respostaCombinada = arrayFilmes[respostaCategoria][respostaGenero];

        System.out.println(stringResultado + respostaCombinada);


    }
}