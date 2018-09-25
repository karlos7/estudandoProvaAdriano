package fvs.edu.br.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Revisao;
import fvs.edu.br.service.RevisaoService;

@RestController
@RequestMapping(value="/revisao")
public class RevisaoSource {

	@Autowired
	private RevisaoService service;
	
	public ResponseEntity<?> listar(@PathVariable Integer id){
		Revisao revisao = service.buscar(id);
		return ResponseEntity.ok().body(revisao);
	}
	
}
