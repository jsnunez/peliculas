package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Ciudad;
import com.jsnunez.peliculas.domain.repository.CiudadRepository;
import com.jsnunez.peliculas.domain.service.CiudadService;

@Service
public class CiudadImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Transactional
    @Override
    public List<Ciudad> findAll() {
        return (List<Ciudad>) ciudadRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Ciudad> findById(Long id) {
        return ciudadRepository.findById(id);
    }

    @Transactional
    @Override
    public Ciudad save(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Transactional
    @Override
    public Ciudad update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Ciudad> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
