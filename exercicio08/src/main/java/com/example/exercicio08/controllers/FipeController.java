package com.example.exercicio08.controllers;

import com.example.exercicio08.CarDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("https://parallelum.com.br");

    @PostMapping("/valor")
    @ResponseBody
    public Map<String, String> valor(@RequestBody CarDetails carDetails) {
        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        HashMap<String, String> resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/" + carDetails.getMarca() + "/modelos/")
                .retrieve()
                .body(HashMap.class);
        respostaPersonalizada.put("valor", resposta.get("marcas"));
        respostaPersonalizada.put("nome", resposta.get("Nome"));

        return respostaPersonalizada;
    }
}
