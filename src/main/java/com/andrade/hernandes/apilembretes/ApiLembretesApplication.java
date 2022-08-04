package com.andrade.hernandes.apilembretes;

import com.andrade.hernandes.apilembretes.model.Lembretes;
import com.andrade.hernandes.apilembretes.repository.LembretesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiLembretesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiLembretesApplication.class, args);
    }

    /*@Bean
    CommandLineRunner initDatabase(LembretesRepository lembretesRepository) {
        return args -> {
            lembretesRepository.deleteAll();

            Lembretes lembretes = new Lembretes();
            lembretes.setTitle("Teste New");
            lembretes.setDescription("Testando descrição New");
            lembretes.setPriority("alta");

            lembretesRepository.save(lembretes);
        };
    }*/

}
