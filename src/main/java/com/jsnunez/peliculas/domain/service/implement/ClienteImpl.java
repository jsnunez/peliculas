package com.jsnunez.peliculas.domain.service.implement;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Cliente;
import com.jsnunez.peliculas.domain.repository.ClienteRepository;
import com.jsnunez.peliculas.domain.service.ClienteService;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional
    @Override
    public Cliente update(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Transactional
    @Override
    public Optional<Cliente> delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
