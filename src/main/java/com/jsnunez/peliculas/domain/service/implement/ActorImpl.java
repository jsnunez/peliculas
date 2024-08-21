package com.jsnunez.peliculas.domain.service.implement;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jsnunez.peliculas.domain.entities.Actor;
import com.jsnunez.peliculas.domain.repository.ActorRepository;
import com.jsnunez.peliculas.domain.service.ActorService;

@Service
public class ActorImpl implements ActorService{


    @Autowired
    private ActorRepository actorRepository;

@Transactional
    @Override
    public List<Actor> findAll() {
        return (List<Actor>) actorRepository.findAll();

    }
    @Transactional
    @Override
    public Optional<Actor> findById(Short id) {
        return actorRepository.findById(id);
    }
    @Transactional
    @Override
    public Actor save(Actor Actor) {
        return actorRepository.save(Actor);

    }
    @Transactional
    @Override
    public Actor update(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Transactional
    @Override
    public Optional<Actor> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    

}