package fvs.edu.br.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Revisao;
import fvs.edu.br.service.RevisaoService;

@RestController
@RequestMapping(value="/revisao")
public class RevisaoResource {

	@Autowired
	private RevisaoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id){
		Revisao revisao = service.buscar(id);
		return ResponseEntity.ok().body(revisao);
	}
	
}
