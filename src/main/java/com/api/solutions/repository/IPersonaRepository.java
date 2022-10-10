package com.api.solutions.repository;

import com.api.solutions.entity.Persona;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Notación para indicar que es un repositorio
@Repository
public interface IPersonaRepository {
    // Con @Repository le indico los metodos principales select, create, update, delete

    //Convención sobre convicción
    //CrudRepository permite realizar busquedas por campo según la entidad
    Optional<Persona> findById(int id);

    Optional<Persona> findAll();

    boolean existsByNombresPersona(String nombres);
}
