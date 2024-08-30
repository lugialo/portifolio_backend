package org.example;

public class Musica {
    private String titulo;
    private String artista;

    // Construtor
    public Musica (String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }



    // Getter
    public String getArtista() {
        return this.artista;
    }

    // Setter
    public void setArtista(String artista) {
        this.artista = artista;
    }

}
