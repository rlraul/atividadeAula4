package br.edu.utfpr.atividadeAula4.service.impl;

import br.edu.utfpr.atividadeAula4.model.Genero;
import br.edu.utfpr.atividadeAula4.repository.GeneroRepository;
import br.edu.utfpr.atividadeAula4.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl extends CrudServiceImpl<Genero, Long> implements GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    protected JpaRepository<Genero, Long> getRepository() {
        return generoRepository;
    }
}
