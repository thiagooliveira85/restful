package br.com.estudos.restful.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.estudos.restful.repository.Informacoes;
import br.com.estudos.restful.ws.InformacoesWS;

@SpringBootApplication
@ComponentScan(basePackageClasses= {InformacoesWS.class, Informacoes.class})
public class Config {
	
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = hoje.format(formatador); // 08/04/2014
		
		System.out.println(format);
		
	}

}
