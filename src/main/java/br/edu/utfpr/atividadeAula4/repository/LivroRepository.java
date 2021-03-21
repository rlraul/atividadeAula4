package br.edu.utfpr.atividadeAula4.repository;

import br.edu.utfpr.atividadeAula4.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
