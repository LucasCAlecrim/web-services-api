package com.wbservices.api.websevicesApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wbservices.api.websevicesApi.controller.services.ProdutoService;
import com.wbservices.api.websevicesApi.model.Produto;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        List<Produto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
        Produto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @Autowired
    private ProdutoService service;
}
