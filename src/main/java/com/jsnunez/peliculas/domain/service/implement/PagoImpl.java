package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Pago;
import com.jsnunez.peliculas.domain.repository.PagoRepository;
import com.jsnunez.peliculas.domain.service.PagoService;

@Service
public class PagoImpl implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    @Transactional
    @Override
    public List<Pago> findAll() {
        return (List<Pago>) pagoRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Pago> findById(Integer id) {
        return pagoRepository.findById(id);
    }

    @Transactional
    @Override
    public Pago save(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Transactional
    @Override
    public Pago update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Pago> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
