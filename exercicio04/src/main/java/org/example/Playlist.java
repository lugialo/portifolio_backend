package org.example;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    // Construtor
    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    // Getter
    public String getNome() {
        return this.nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do ArrayList
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    // Setter do ArrayList
    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }
}
