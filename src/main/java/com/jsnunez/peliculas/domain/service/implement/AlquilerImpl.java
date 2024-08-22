package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Alquiler;
import com.jsnunez.peliculas.domain.repository.AlquilerRepository;
import com.jsnunez.peliculas.domain.service.AlquilerService;

@Service
public class AlquilerImpl implements AlquilerService {

    @Autowired
    private AlquilerRepository alquilerRepository;

    @Transactional
    @Override
    public List<Alquiler> findAll() {
        return (List<Alquiler>) alquilerRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Alquiler> findById(Integer id) {
        return alquilerRepository.findById(id);
    }

    @Transactional
    @Override
    public Alquiler save(Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }

    @Transactional
    @Override
    public Alquiler update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Alquiler> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
