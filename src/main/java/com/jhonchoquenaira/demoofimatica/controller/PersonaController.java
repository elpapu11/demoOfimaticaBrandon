package com.jhonchoquenaira.demoofimatica.controller;

import com.jhonchoquenaira.demoofimatica.model.Persona;
import com.jhonchoquenaira.demoofimatica.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persona", produces = "application/json")
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;

    @PostMapping("/")
    public Persona crearPersona(@RequestBody Persona nuevaPersona){
        Persona guardado = personaRepository.save(nuevaPersona);
        return guardado;
    }
}
