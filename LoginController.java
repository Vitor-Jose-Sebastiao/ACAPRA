package com.acapra.controller;

import com.acapra.model.Usuario;
import com.acapra.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public String login(@RequestBody Usuario usuario) {
        boolean autenticado = usuarioService.autenticar(usuario.getEmail(), usuario.getSenha());
        return autenticado ? "Login realizado com sucesso!" : "Credenciais inválidas!";
    }
}
