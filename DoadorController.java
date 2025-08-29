package com.acapra.controller;

import com.acapra.model.Doador;
import com.acapra.service.DoadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doadores")
public class DoadorController {

    private final DoadorService doadorService;

    public DoadorController(DoadorService doadorService) {
        this.doadorService = doadorService;
    }

    @PostMapping
    public String cadastrar(@RequestBody Doador doador) {
        doadorService.salvar(doador);
        return "Cadastro de doador realizado com sucesso!";
    }

    @GetMapping
    public List<Doador> listar() {
        return doadorService.listar();
    }
}
