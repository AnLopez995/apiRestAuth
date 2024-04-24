package com.api.auth.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.auth.domain.repository.UsuarioRepository;
import com.api.auth.persistence.entity.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.getAll();
    }

    public Optional <Usuario> getUsuario(int id){
        return usuarioRepository.getUsuario(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean delete(int id){
        return getUsuario(id).map(usuario -> {
            usuarioRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
