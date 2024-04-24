package com.api.auth.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.api.auth.domain.service.UsuarioService;
import com.api.auth.persistence.entity.Usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/all")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    public Usuario save(Usuario usuario){
        return usuarioService.save(usuario);
    }

    public boolean delete(int id){
        return usuarioService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional <Usuario> getUsuario(@PathVariable int id){
        return usuarioService.getUsuario(id);
    }
}
