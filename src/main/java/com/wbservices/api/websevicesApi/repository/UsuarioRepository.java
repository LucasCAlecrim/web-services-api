package com.wbservices.api.websevicesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wbservices.api.websevicesApi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
