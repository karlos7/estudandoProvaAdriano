package fvs.edu.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Revisao;
import fvs.edu.br.repository.RevisaoRepository;

@Service
public class RevisaoService {
	
	@Autowired
	private RevisaoRepository repository;
	
	public Revisao buscar (Integer id) {
		Optional<Revisao> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
