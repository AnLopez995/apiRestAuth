package com.api.auth.domain.repository;

import com.api.auth.persistence.crud.UsuarioCrudRepository;
import com.api.auth.persistence.entity.Usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository{
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    public List<Usuario> getAll(){
        return (List<Usuario>) usuarioCrudRepository.findAll();
    }

    public Optional <Usuario> getUsuario(int id){
        return usuarioCrudRepository.findById(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioCrudRepository.save(usuario);
    }

    public void delete(int id){
        usuarioCrudRepository.deleteById(id);
    }

}
