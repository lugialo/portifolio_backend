package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        String nome = leitor.nextLine();


        // Instancia um documento PDF
        PDDocument documento = new PDDocument();

        // Instancia uma página em branco
        PDPage pagina = new PDPage();

        // Adiciona a página no documento.
        documento.addPage(pagina);

        //
        PDPageContentStream escritor = new PDPageContentStream(documento, pagina);

        PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.TIMES_BOLD);

        escritor.setFont(fonte, 14);
        escritor.beginText();
        escritor.newLineAtOffset(25, 500);
        escritor.showText("xD");
        escritor.newLineAtOffset(0, -30);
        escritor.showText(nome + " xD 2");
        escritor.endText();
        escritor.close();

        documento.save("teste.pdf");


    }
}