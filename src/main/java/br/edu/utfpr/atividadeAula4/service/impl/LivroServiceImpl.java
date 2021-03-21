package br.edu.utfpr.atividadeAula4.service.impl;

import br.edu.utfpr.atividadeAula4.model.Livro;
import br.edu.utfpr.atividadeAula4.repository.LivroRepository;
import br.edu.utfpr.atividadeAula4.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl extends CrudServiceImpl<Livro, Long> implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    protected JpaRepository<Livro, Long> getRepository() {
        return livroRepository;
    }
}
