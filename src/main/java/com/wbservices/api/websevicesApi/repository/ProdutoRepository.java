package com.wbservices.api.websevicesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wbservices.api.websevicesApi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
