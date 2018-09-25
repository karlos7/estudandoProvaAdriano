package fvs.edu.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.Revisao;

@Repository
public interface RevisaoRepository extends JpaRepository<Revisao, Integer>{

}
