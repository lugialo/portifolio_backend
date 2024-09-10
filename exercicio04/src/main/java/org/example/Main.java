package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MusicCloud musicCloud = new MusicCloud();
        Scanner scanner = new Scanner(System.in);

        musicCloud.adicionarMusica("wonderful life", "Bring Me The Horizon");
        musicCloud.adicionarMusica("Até que Durou", "Péricles");
        musicCloud.adicionarMusica("Jorginho Me Empresta a 12", "Mc Carol");

        System.out.println("Insira o nome da playlist:");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.println("Digite o nome da música, ou digite 'Sair' para sair do programa.");
            String nomeMusica = scanner.nextLine();

            if (nomeMusica.equals("Sair") || nomeMusica.equals("sair")) {
                if (playlist.getMusicas().isEmpty()) {
                    System.out.println("Playlist vazia.");
                } else {
                    System.out.println("Playlist: ");
                    for (Musica musica : playlist.getMusicas()) {
                        System.out.println("* " + musica.getTitulo() + " - " + musica.getArtista());
                    }
                }
                break;
            }

            try {
                Musica musica = musicCloud.buscarMusica(nomeMusica);
                playlist.adicionarMusica(musica);
                System.out.println("Você adicionou a música " + musica.getTitulo() + ", do artista " + musica.getArtista() + " na playlist " + playlist.getNome() +".");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }



    }
}