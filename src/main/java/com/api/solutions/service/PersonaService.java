package com.api.solutions.service;

import com.api.solutions.entity.Persona;
import com.api.solutions.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.swing.text.html.Option;
import javax.transaction.Transactional;
//import java.util.List;
import java.util.Optional;

//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional

public class PersonaService {

    //Inyección de dependecias (crea una instancia cuando lo requiera)
    @Autowired
    IPersonaRepository iPersonaRepository;

    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    /**
     * @return
     */
    public Optional<Persona> listaPersona(){
        return  iPersonaRepository.findAll();
    }

    
    
}
