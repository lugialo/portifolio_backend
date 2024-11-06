package com.example.exercicio13.controller;

import com.example.exercicio13.dto.JogadorDTO;
import com.example.exercicio13.mapper.JogadorMapper;
import com.example.exercicio13.model.Jogador;
import com.example.exercicio13.repository.JogadorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    @PostMapping
    public ResponseEntity<JogadorDTO> createJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return ResponseEntity.ok(jogadorMapper.toDTO(jogador));
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> getAllJogadores() {
        List<Jogador> jogadores = jogadorRepository.findAll();
        List<JogadorDTO> jogadorDTOs = jogadores.stream()
                .map(jogadorMapper::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(jogadorDTOs);
    }
}