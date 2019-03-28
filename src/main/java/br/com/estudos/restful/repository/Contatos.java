package br.com.estudos.restful.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.estudos.restful.ws.Contato;

@Service
public class Contatos {
	
	public static List<Contato> contatos = new ArrayList<Contato>();
	
	static{
		contatos.add(new Contato("Thiago", "976088105", "toliveira@metatron.com.br"));
		contatos.add(new Contato("Rodrigo", "956125245", "rrodrigues@metatron.com.br"));
		contatos.add(new Contato("Jamal", "925458878", "asodre@metatron.com.br"));
	}

	public List<Contato> findAll() {
		return contatos;
	}

	public void save(Contato contato) {
		contatos.add(contato);
	}

}
