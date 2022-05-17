package com.projectfasttrack.project22;

import com.projectfasttrack.project22.model.TransactionType;
import com.projectfasttrack.project22.model.entity.Transaction;
import com.projectfasttrack.project22.repository.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Project22Application {

	public static void main(String[] args) {
		SpringApplication.run(Project22Application.class, args);
	}

	@Bean
	CommandLineRunner atStartup(TransactionRepository repository){
		return args -> {
			repository.saveAll(List.of(
					new Transaction("Masa",1000, TransactionType.BUY),
					new Transaction("Laptop",3000, TransactionType.SELL),
					new Transaction("Paine",5.4, TransactionType.BUY),
					new Transaction("Monitor",450, TransactionType.SELL),
					new Transaction("Rucsac",232, TransactionType.BUY)
					));
		};
	}
}
