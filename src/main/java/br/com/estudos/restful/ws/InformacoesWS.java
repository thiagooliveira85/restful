package br.com.estudos.restful.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.estudos.restful.repository.Informacoes;

@RestController
public class InformacoesWS {
	
	@Autowired
	private Informacoes informacoes;
	
	@RequestMapping(value= "/api/listar", method = RequestMethod.GET)	
	public ResponseEntity<List<Informacao>> lista() {
		return new ResponseEntity<List<Informacao>>(informacoes.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value= "/api/listar/{id}", method = RequestMethod.GET)	
	public ResponseEntity<Informacao> getInfo(@PathVariable("id") long id) {
		try {
			return new ResponseEntity<Informacao>(informacoes.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<Informacao>(HttpStatus.NOT_FOUND);			
		}
	}
	
	@RequestMapping(value= "/api/salvar", method = RequestMethod.POST)	
	public void salvar(Informacao info) {
		
		if (info.getId() == 0)
			throw new RuntimeException("BAD REQUEST");
		
		informacoes.save(info);
	}
	
}
