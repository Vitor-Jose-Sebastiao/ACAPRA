package com.acapra.controller;

import com.acapra.model.Voluntario;
import com.acapra.service.VoluntarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {

    private final VoluntarioService voluntarioService;

    public VoluntarioController(VoluntarioService voluntarioService) {
        this.voluntarioService = voluntarioService;
    }

    @PostMapping
    public String cadastrar(@RequestBody Voluntario voluntario) {
        voluntarioService.salvar(voluntario);
        return "Cadastro de voluntário realizado com sucesso!";
    }

    @GetMapping
    public List<Voluntario> listar() {
        return voluntarioService.listar();
    }
}
