package com.jsnunez.peliculas.domain.repository;



import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Actor;

public interface ActorRepository extends
CrudRepository<Actor,Short> {

}
