package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RepositorioMusical spotify = new RepositorioMusical();

        spotify.adicionarMusica("Hope", "Foo Fighters");
        spotify.adicionarMusica("Até Que Durou", "Péricles");
        spotify.adicionarMusica("Copa do Mundo 2014", "Mc Champions");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de uma música: ");
        String pesquisa = scanner.nextLine();

       try {
           Musica musicaPesquisada = spotify.buscarMusica(pesquisa);

           System.out.println(musicaPesquisada.getNome() + " - " + musicaPesquisada.getArtista());
       } catch (RuntimeException exception) {
           System.out.println(exception.getMessage());
       }
    }
}