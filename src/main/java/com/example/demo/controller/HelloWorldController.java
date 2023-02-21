package com.example.demo.controller;

import com.example.demo.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {

    @GetMapping("/say-hello")
    public ResponseEntity<Map<String,String>> sayHello(){
        Map<String,String> response= new HashMap<>();
        response.put("message","Hello world");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/persona")
    public ResponseEntity<Persona> getPersona(){
        Persona p= new Persona();
        p.setNombre("Andres");
        p.setEdad(33);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
    @GetMapping("/persona/list")
    public ResponseEntity<List<Persona>> getPersonas(){
        Persona p= new Persona();
        p.setNombre("Andres");
        p.setEdad(33);
        Persona p2= new Persona();
        p2.setNombre("Juanito");
        p2.setEdad(20);
        List<Persona> personaList= new ArrayList<>();
        personaList.add(p);
        personaList.add(p2);
        return new ResponseEntity<>(personaList, HttpStatus.OK);
    }

    @PostMapping("/persona/save")
    public ResponseEntity<Persona> savePersona(@RequestBody Persona p){
        p.getNombre();
        p.getEdad();
        //Llamada al metodo de nuestro servicio que va a guardar a una persona
        return new ResponseEntity<>(p,HttpStatus.OK);
    }

}
