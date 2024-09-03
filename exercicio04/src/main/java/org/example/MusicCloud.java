package org.example;

import java.util.ArrayList;

public class MusicCloud {
    private ArrayList<Musica> musicasDisponiveis = new ArrayList<Musica>();

    public void adicionarMusica(String titulo, String artista) {
        Musica musica = new Musica(titulo, artista);
        musicasDisponiveis.add(musica);
    }

    public Musica buscarMusica(String termo) throws RuntimeException {
        for (Musica item : musicasDisponiveis) {
            if (item.getTitulo().equals(termo)) {
                return item;
            }
        }
        throw new RuntimeException("A música " + termo + " não foi encontrada no sistema.");
    }
}
