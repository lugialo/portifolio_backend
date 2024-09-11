package org.example.exemplosemana06.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mundo")
public class OlaController {
    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá mundo!";
    }
}
