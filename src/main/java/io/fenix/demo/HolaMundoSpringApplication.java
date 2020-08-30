package io.fenix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoSpringApplication.class, args);
		System.out.println("Hola Mundo con Spring boot");
		System.out.println("Nueva Linea modificada desde GitHub");
		System.out.println("Nueva Linea modificada desde GitHub con conexión SSH");
	}

}
