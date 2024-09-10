package br.net.lugialo.spring_semana05;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá mundo!";
    }

    @GetMapping("/temperatura")
    public Double converteTemperatura(@RequestParam Double fahrenheit) {
        Double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        return celsius;
    }

    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> gerarPdf(@RequestParam String nome) throws IOException {
        PDDocument documento = new PDDocument();

        // Instancia uma página em branco
        PDPage pagina = new PDPage();

        // Adiciona a página no documento.
        documento.addPage(pagina);

        // gera um escritor
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

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        documento.save(outputStream);
        byte[] binario = outputStream.toByteArray();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(binario);
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.status(201).contentType(MediaType.APPLICATION_PDF).body(resource);
    }

}
