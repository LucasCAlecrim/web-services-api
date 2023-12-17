package com.wbservices.api.websevicesApi.repository;
import com.wbservices.api.websevicesApi.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
