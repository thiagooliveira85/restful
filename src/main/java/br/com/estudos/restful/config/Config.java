package br.com.estudos.restful.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.estudos.restful.repository.Contatos;
import br.com.estudos.restful.ws.ContatosWS;

@SpringBootApplication
@ComponentScan(basePackageClasses= {ContatosWS.class, Contatos.class})
public class Config {
	
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}

}
