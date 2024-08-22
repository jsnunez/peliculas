package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Actor;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ActorService {

    Page<Actor> findAll(Pageable pageable);

    Optional<Actor> findById(Long id);

    Actor save(Actor Actor);

    Actor update(Long id);

    Optional<Actor> delete(Long id);

}