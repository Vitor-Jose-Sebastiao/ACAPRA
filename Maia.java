package com.example.adocao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AdocaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdocaoApplication.class, args);
    }
}

@RestController
class PetController {

    static class Pet {
        private String nome;
        private String sexo;
        private String porte;
        private String idade;
        private String descricao;

        public Pet(String nome, String sexo, String porte, String idade, String descricao) {
            this.nome = nome;
            this.sexo = sexo;
            this.porte = porte;
            this.idade = idade;
            this.descricao = descricao;
        }

        public String getNome() { return nome; }
        public String getSexo() { return sexo; }
        public String getPorte() { return porte; }
        public String getIdade() { return idade; }
        public String getDescricao() { return descricao; }
    }

    @GetMapping("/pet")
    public Pet getPet() {
        return new Pet(
                "Maia",
                "Fêmea",
                "Porte G",
                "1 ano",
                "Maia foi encontrada junto com sua irmã, Mavie, abandonada em Brusque. Foram resgatadas e agora Maia precisa de um lar com muito espaço, amor e carinho. É super carinhosa e protetora!"
        );
    }

    @GetMapping("/pets")
    public List<Pet> getTodosPets() {
        return Arrays.asList(
                new Pet("Maia", "Fêmea", "Porte G", "1 ano",
                        "Resgatada junto com sua irmã Mavie em Brusque, precisa de um lar com amor e espaço."),
        )
    }
}
