package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Almacen;
import com.jsnunez.peliculas.domain.repository.AlmacenRepository;
import com.jsnunez.peliculas.domain.service.AlmacenService;

@Service
public class AlmacenImpl implements AlmacenService {

    @Autowired
    private AlmacenRepository almacenRepository;

    @Transactional
    @Override
    public List<Almacen> findAll() {
        return (List<Almacen>) almacenRepository.findAll();
    }


    @Transactional
    @Override
    public Almacen save(Almacen almacen) {
        return almacenRepository.save(almacen);
    }

    @Transactional
    @Override
    public Almacen update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Almacen> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    @Transactional
    @Override
    public Optional<Almacen> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
