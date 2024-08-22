package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Pais;
import com.jsnunez.peliculas.domain.repository.PaisRepository;
import com.jsnunez.peliculas.domain.service.PaisService;

@Service
public class PaisImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Transactional
    @Override
    public List<Pais> findAll() {
        return (List<Pais>) paisRepository.findAll();
    }



    @Transactional
    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    @Transactional
    @Override
    public Pais update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Pais> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Transactional
    @Override
    public Optional<Pais> findById(Long id) {
        return paisRepository.findById(id);
        }
}
