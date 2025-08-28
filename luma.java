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
        private String porteOuStatus;
        private String idade;
        private String descricao;

        public Pet(String nome, String sexo, String porteOuStatus, String idade, String descricao) {
            this.nome = nome;
            this.sexo = sexo;
            this.porteOuStatus = porteOuStatus;
            this.idade = idade;
            this.descricao = descricao;
        }

        public String getNome() { return nome; }
        public String getSexo() { return sexo; }
        public String getPorteOuStatus() { return porteOuStatus; }
        public String getIdade() { return idade; }
        public String getDescricao() { return descricao; }
    }

    @GetMapping("/pet")
    public Pet getPet() {
        return new Pet(
                "Luma",
                "Fêmea",
                "Porte G",
                "3 anos",
                "Luma vivia nas ruas com seu irmão Juca. Ele foi adotado, mas ela ainda segue esperando seu tão sonhado lar. Luma é puro amor e calmaria! Precisa de um lar com muito amor e carinho."
        );
    }

    @GetMapping("/pets")
    public List<Pet> getTodosPets() {
        return Arrays.asList(
                new Pet("Luma", "Fêmea", "Porte G", "3 anos",
                        "Vivia nas ruas com seu irmão Juca. Muito dócil e calma."),
                new Pet("Bartô", "Macho", "Saudável", "2 anos",
                        "Gato tranquilo, adora carinho e é muito companheiro."),
                new Pet("Mavie", "Fêmea", "Porte G", "1 ano",
                        "Resgatada junto com sua irmã Maia em Brusque, precisa de um lar com amor e espaço."),
                new Pet("Luzia", "Fêmea", "FELV +", "2 anos",
                        "Resgatada após um pedido de ajuda, é uma gatinha muito carinhosa.")
        );
    }
}
