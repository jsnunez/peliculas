package com.jsnunez.peliculas.domain.service;

import com.jsnunez.peliculas.domain.entities.Actor;
import java.util.List;
import java.util.Optional;

public interface ActorService {

    List<Actor> findAll();

    Optional<Actor> findById(Short id);

    Actor save(Actor Actor);

    Actor update(Long id);

    Optional<Actor> delete(Long id);

}