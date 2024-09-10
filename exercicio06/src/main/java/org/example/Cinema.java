package org.example;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Filme>filmesDisponiveis = new ArrayList<Filme>();
    private ArrayList<Ingresso>ingressosVendidos = new ArrayList<Ingresso>();

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String termo) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equals(termo)) {
                return filme;
            }
        }
        return null;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        for (Ingresso i : ingressosVendidos) {
            if (i.getAssento().equals(ingresso.getAssento())) {
                throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
            }
        }
        ingressosVendidos.add(ingresso);
        System.out.println("Ingresso vendido com sucesso! " + ingresso.getFilme().getNome() + " - " + ingresso.getAssento() + " - " + ingresso.getCliente().getNome());
    }



//    public void adicionarFilme(String nome, float preco, int idadeMinima) {
//        Filme filme = new Filme(nome, preco, idadeMinima);
//        filmesDisponiveis.add(filme);
//    }

}
