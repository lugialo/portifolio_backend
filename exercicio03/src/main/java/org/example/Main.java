package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de barcos
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco Pequeno 01", 5));
        barcos.add(new Barco("Barco Pequeno 02", 8));
        barcos.add(new Barco("Barco Grande 01", 12));
        barcos.add(new Barco("Barco Grande 02", 15));
        barcos.add(new Barco("Barco Grande 03", 20));

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        BasePorto portoGrande = new PortoGrande("Porto Grande");


        for (Barco barco : barcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
                System.out.println("Barco " + barco.getNome() + " atracado no " + portoPequeno.getNome());
            } else if (barco.getTamanho() >= 10) {
                portoGrande.atracarBarco(barco);
                System.out.println("Barco " + barco.getNome() + " atracado no " + portoGrande.getNome());
            }
            portoPequeno.atracarBarco(barco);
            portoGrande.atracarBarco(barco);
        }
    }
}