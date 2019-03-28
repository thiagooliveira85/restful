package br.com.estudos.restful.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.restful.repository.Contatos;

@RestController
public class ContatosWS {
	
	@Autowired
	private Contatos contatos;
	
	@RequestMapping(value= "/api/listar", method = RequestMethod.GET)	
	public ResponseEntity<List<Contato>> listaContatos() {
		return new ResponseEntity<List<Contato>>(contatos.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value= "/api/salvar", method = RequestMethod.POST)	
	public void salvar(Contato contato) {
		contatos.save(contato);
	}
	
}
