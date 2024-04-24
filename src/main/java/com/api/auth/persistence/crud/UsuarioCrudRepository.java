package com.api.auth.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.auth.persistence.entity.Usuario;

public interface UsuarioCrudRepository extends JpaRepository<Usuario, Integer>{



}
