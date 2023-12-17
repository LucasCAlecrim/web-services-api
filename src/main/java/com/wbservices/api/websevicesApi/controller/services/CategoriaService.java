package com.wbservices.api.websevicesApi.controller.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wbservices.api.websevicesApi.model.Categoria;
import com.wbservices.api.websevicesApi.repository.CategoriaRepository;

public class CategoriaService {
    
    public List<Categoria> findAll(){
        return repository.findAll();
    }
    public Categoria findById(Long id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.get();
    }
    @Autowired
    private CategoriaRepository repository;
}
