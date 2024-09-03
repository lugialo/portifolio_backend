package org.example;

public class PortoGrande extends BasePorto{

    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco (Barco barcoAtracando) {
        if (barcoAtracando.getTamanho() >= 10) {
            barcosAtracados.add(barcoAtracando);
        } else {
//            System.out.println("Não foi possível atracar o barco " + barcoAtracando.getNome() + " no Porto Grande ");
        }
    }
}
