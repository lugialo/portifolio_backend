package org.example.exemplosemana06.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.HashMap;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("https://parallelum.com.br/");

    @GetMapping("/valor")
    @ResponseBody
    public String valor(@RequestParam String ano) {
        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/59/modelos/5940/anos/" + ano)
                .retrieve()
                .body(HashMap.class);
        respostaPersonalizada.put("valor", resposta.get("Valor"));
        respostaPersonalizada.put("nome", resposta.get("Nome"));

    }
}
