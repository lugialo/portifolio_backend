package com.example.exercicio07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Filmes {
    String[][] arrayFilmes = {
            {"The Walking Dead", "Zumbilândia"},
            {"Todo Mundo em Pânico", "O Hereditário"}
    };

    @GetMapping("/recomendar")
    public String recomendar(@RequestParam int categoria, @RequestParam int genero) {


        if (categoria < 1 || categoria > 2 || genero < 1 || genero > 2) {
            return "Por favor, selecione uma categoria e um gênero válidos.";
        }

        categoria -= 1;
        genero -= 1;

        String respostaCombinada = arrayFilmes[categoria][genero];
        return "Você deveria assistir " + respostaCombinada;
    }
}
