package com.acapra.service;

import com.acapra.model.Voluntario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VoluntarioService {
    private List<Voluntario> voluntarios = new ArrayList<>();

    public void salvar(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public List<Voluntario> listar() {
        return voluntarios;
    }
}
