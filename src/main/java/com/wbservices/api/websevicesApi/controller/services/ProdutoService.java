package com.wbservices.api.websevicesApi.controller.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wbservices.api.websevicesApi.model.Produto;
import com.wbservices.api.websevicesApi.repository.ProdutoRepository;

@Service
public class ProdutoService {
    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> obj = repository.findById(id);
        return obj.get();
    }

    @Autowired
    private ProdutoRepository repository;
}
