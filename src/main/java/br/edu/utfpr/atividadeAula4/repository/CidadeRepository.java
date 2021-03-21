package br.edu.utfpr.atividadeAula4.repository;

import br.edu.utfpr.atividadeAula4.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
