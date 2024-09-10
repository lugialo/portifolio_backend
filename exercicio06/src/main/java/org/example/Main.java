package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("The Batman", 20.0, 16));
        cinema.adicionarFilme(new Filme("Vingadores: Guerra Infinita", 25.0, 12));
        cinema.adicionarFilme(new Filme("Titanic", 15.0, 14));
        cinema.adicionarFilme(new Filme("1917", 30.0, 16));
        cinema.adicionarFilme(new Filme("As Longas Tranças de um Careca", 18.0, 20));

        while (true) {
            try {
                System.out.println("Qual o seu nome? ");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade? ");
                int idadeCliente = scanner.nextInt();
                scanner.nextLine();

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                System.out.println("Que filme você deseja assistir? ");
                String nomeFilme = scanner.nextLine();

                Filme filme = cinema.buscarFilme(nomeFilme);
                if (filme == null) {
                    throw new Exception("Filme não encontrado.");
                }

                if (cliente.getIdade() < filme.getIdadeMinima()) {
                    throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
                }

                String assento;
                while (true) {
                    System.out.print("Qual assento você deseja? (de A1 a F5): ");
                    assento = scanner.nextLine().toUpperCase();

                    // Verificar o formato do assento
                    if (Pattern.matches("^[A-F][1-5]$", assento)) {
                        break;
                    } else {
                        System.out.println("Assento inválido. Por favor, insira um assento de A1 a F5.");
                    }
                }

                Ingresso ingresso = new Ingresso(cliente, filme, assento);

                cinema.venderIngresso(ingresso);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra venda? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}
