package com.example.exercicio08.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("https://parallelum.com.br/");

    @PostMapping("/valor")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> valor(@RequestBody Map<String, Object> dadosCarro) {
        String marca = (String) dadosCarro.get("marca");
        String modelo = (String) dadosCarro.get("modelo");
        String ano = dadosCarro.get("ano").toString();

        Map resposta = cliente
                .get()
                .uri("/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos/" + ano)
                .retrieve()
                .body(Map.class);

        Map<String, Object> respostaPersonalizada = new HashMap<>();
        respostaPersonalizada.put("valor", resposta.get("Valor"));
        respostaPersonalizada.put("mes", resposta.get("MesReferencia"));

        return ResponseEntity.ok(respostaPersonalizada);

//        {
//            "marca": "59",
//            "modelo": "5940",
//            "ano": "2021-3"
//        }
//        Exemplo de body
    }
}
