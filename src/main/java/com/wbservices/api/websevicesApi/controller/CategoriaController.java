package com.wbservices.api.websevicesApi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wbservices.api.websevicesApi.controller.services.CategoriaService;
import com.wbservices.api.websevicesApi.model.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){ 
    Categoria obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
    }
    @Autowired
    CategoriaService service;
}
