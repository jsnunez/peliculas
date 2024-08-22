package com.jsnunez.peliculas.controller;

import java.util.*;

import org.hibernate.internal.util.collections.ConcurrentReferenceHashMap.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsnunez.peliculas.domain.entities.Actor;
import com.jsnunez.peliculas.domain.service.ActorService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping("/pagina/{id}")
    public Page<Actor> getActors(
            @PathVariable int id,
            @RequestParam(defaultValue = "10") int size) { // Tamaño de la página (por defecto es 10)
        Pageable pageable = PageRequest.of(id - 1, size); // Restamos 1 ya que PageRequest usa base 0
        // En este caso, el ID no se usa para paginación pero podrías usarlo para obtener detalles específicos si es necesario
        return actorService.findAll(pageable);
    }

//     }
    @GetMapping("/all")
    public ResponseEntity<Page<Actor>> findAll(Pageable Pageable){
        
        Page<Actor> actorPage = actorService.findAll(Pageable);
        if (actorPage.hasContent()) {
            return ResponseEntity.ok(actorPage);
            
        }
return ResponseEntity.notFound().build();
    }

@GetMapping("/{id}")
public ResponseEntity<Actor> buscar(@PathVariable Long id){
      Optional<Actor> actorOpt = actorService.findById(id);  
    if (actorOpt.isPresent()) {
        return ResponseEntity.ok(actorOpt.orElseThrow());
        
    }
return ResponseEntity.notFound().build();
}


@PostMapping
public ResponseEntity<?> crear(@Valid @RequestBody Actor actor, BindingResult result){
        if (result.hasFieldErrors()) {
            return validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(actorService.save(actor));
    }
    private ResponseEntity<?> validation(BindingResult result) {
        Map<String, String> errors = new HashMap<>();
    
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
}


    
    


