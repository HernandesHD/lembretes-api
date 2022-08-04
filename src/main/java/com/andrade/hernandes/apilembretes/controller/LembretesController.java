package com.andrade.hernandes.apilembretes.controller;

import com.andrade.hernandes.apilembretes.model.Lembretes;
import com.andrade.hernandes.apilembretes.repository.LembretesRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lembretes")
@AllArgsConstructor
public class LembretesController {

    private final LembretesRepository lembretesRepository;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Lembretes> listarLembretes() {
        return lembretesRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @CrossOrigin(origins = "http://localhost:4200")
    public Lembretes create(@RequestBody Lembretes lembrete) {
        return lembretesRepository.save(lembrete);
    }

}
