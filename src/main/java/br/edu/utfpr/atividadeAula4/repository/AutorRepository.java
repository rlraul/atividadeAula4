package br.edu.utfpr.atividadeAula4.repository;

import br.edu.utfpr.atividadeAula4.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
