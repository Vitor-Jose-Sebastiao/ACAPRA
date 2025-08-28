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
        private String vacina;
        private String idade;
        private String descricao;

        public Pet(String nome, String sexo, String vacina, String idade, String descricao) {
            this.nome = nome;
            this.sexo = sexo;
            this.vacina = vacina;
            this.idade = idade;
            this.descricao = descricao;
        }

        public String getNome() { return nome; }
        public String getSexo() { return sexo; }
        public String getVacina() { return vacina; }
        public String getIdade() { return idade; }
        public String getDescricao() { return descricao; }
    }

    
    @GetMapping("/pet")
    public Pet getPet() {
        return new Pet(
                "Difusor",
                "Macho",
                "Castrado e vacinado",
                "6 meses",
                "Difusor é um gatinho macho, que foi encontrado em uma fábrica de peças automotivas (por isso o nome), chegou em estado caquético, com extrema magreza. Aos poucos foi se recuperando e hoje é um jovem 100% saudável e cheio de amor! Se dá bem com outros animais (cães e gatos). Negativo para FIV e FELV."
        );
    }

    @GetMapping("/pets")
    public List<Pet> getTodosPets() {
        return Arrays.asList(
                new Pet("Difusor", "Macho", "Castrado e vacinado", "6 meses",
                        "Resgatado em uma fábrica de peças automotivas, hoje saudável e cheio de amor."),
                new Pet("Bartô", "Macho", "Vacinado", "2 anos",
                        "Gatinho tranquilo e carinhoso, ótimo companheiro."),
                new Pet("Mavie", "Fêmea", "Castrada e vacinada", "1 ano",
                        "Cachorrinha cheia de energia, adora brincar e passear."),
                new Pet("Luzia", "Fêmea", "Castrada", "3 anos",
                        "Muito dócil, gosta de ficar no colo e receber carinho.")
        );
    }
}