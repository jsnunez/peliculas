package com.jsnunez.peliculas.domain.repository;



import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jsnunez.peliculas.domain.entities.Actor;

public interface ActorRepository extends
JpaRepository<Actor,Long> {
}
