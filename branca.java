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

    // Endpoint que retorna todos os pets
    @GetMapping("/pets")
    public List<Pet> getTodosPets() {
        return Arrays.asList(
                new Pet(
                        "Mimi",
                        "Fêmea",
                        "Castrada e vacinada",
                        "1 ano",
                        "Mimi foi abandonada em uma residência e viveu um tempo na rua até ser resgatada. Muito amorosa e carente. Negativa para FIV e FELV."
                ),
                new Pet(
                        "Bartô",
                        "Macho",
                        "Saudável",
                        "2 anos",
                        "Gato tranquilo, adora carinho e é muito companheiro."
                ),
                new Pet(
                        "Mavie",
                        "Fêmea",
                        "Porte G",
                        "1 ano",
                        "Resgatada junto com sua irmã Maia em Brusque. Precisa de um lar com amor e espaço."
                ),
                new Pet(
                        "Luzia",
                        "Fêmea",
                        "FELV +",
                        "2 anos",
                        "Resgatada após um pedido de ajuda, é uma gatinha muito carinhosa."
                ),
                new Pet(
                        "Luma",
                        "Fêmea",
                        "Porte G",
                        "3 anos",
                        "Luma vivia nas ruas com seu irmão Juca. Ele foi adotado, mas ela segue esperando seu lar. Muito calma e amorosa."
                ),
                new Pet(
                        "Cléo",
                        "Fêmea",
                        "Porte GG",
                        "7 anos",
                        "Cléo foi encontrada abandonada na BR junto com sua filha Glória. Muito doce, ativa e amigável, não apresenta problemas de saúde."
                ),
                new Pet(
                        "Glória",
                        "Fêmea",
                        "Porte GG",
                        "10 anos",
                        "Glória, mãe da Cléo, foi resgatada na BR. Apesar da idade, é brincalhona, amorosa e precisa de um lar com espaço e carinho."
                ),
                new Pet(
                        "Branca",
                        "Fêmea",
                        "Porte G",
                        "2 anos",
                        "Branca foi retirada de maus tratos, usada de forma indevida para caça. Muito dócil, querida e brincalhona, mas apresenta um certo grau de medo. Precisa de um lar com muito amor, carinho e paciência."
                )
        );
    }
}
