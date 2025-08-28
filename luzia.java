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
        private String statusSaude;
        private String idade;
        private String descricao;

        public Pet(String nome, String sexo, String statusSaude, String idade, String descricao) {
            this.nome = nome;
            this.sexo = sexo;
            this.statusSaude = statusSaude;
            this.idade = idade;
            this.descricao = descricao;
        }

        public String getNome() { return nome; }
        public String getSexo() { return sexo; }
        public String getStatusSaude() { return statusSaude; }
        public String getIdade() { return idade; }
        public String getDescricao() { return descricao; }
    }

    @GetMapping("/pet")
    public Pet getPet() {
        return new Pet(
                "Luzia",
                "Fêmea",
                "FELV +",
                "2 anos",
                "Luzia chegou até nós através de um pedido de ajuda, onde a pessoa que pediu ajuda relatava que tinha um 'monstro' em sua casa. Quando fomos resgatar, descobrimos que esse 'monstro', na verdade é uma linda princesa assustada e muito carinhosa!"
        );
    }

    @GetMapping("/pets")
    public List<Pet> getTodosPets() {
        return Arrays.asList(
                new Pet("Luzia", "Fêmea", "FELV +", "2 anos",
                        "Resgatada após um pedido de ajuda, é uma gatinha muito carinhosa."),
                new Pet("Bartô", "Macho", "Saudável", "2 anos",
                        "Gato tranquilo, adora carinho e é muito companheiro."),
                new Pet("Mavie", "Fêmea", "Porte G", "1 ano",
                        "Resgatada junto com sua irmã Maia em Brusque, precisa de um lar com amor e espaço."),
                new Pet("Luma", "Fêmea", "Saudável", "2 anos",
                        "Cachorrinha alegre e brincalhona, ótima com famílias.")
        );
    }
}
