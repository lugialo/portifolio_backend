package org.example;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barcoAtracando) {
        if (barcoAtracando.getTamanho() <= 10) {
            barcosAtracados.add(barcoAtracando);
        }
//         else {
//            System.out.println("Não foi possível atracar o barco " + barcoAtracando.getNome() + " no Porto Pequeno.");
//        }
    }
}
