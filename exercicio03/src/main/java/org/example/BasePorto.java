package org.example;

import java.util.ArrayList;

public class BasePorto {
    private String nome;
    protected ArrayList<Barco> barcosAtracados = new ArrayList<Barco>();

    public BasePorto (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void atracarBarco (Barco barcoAtracando) {
        barcosAtracados.add(barcoAtracando);
    }

    public void desatracarBarco (Barco barcoDesatracando) {
        barcosAtracados.remove(barcoDesatracando);
    }
}
