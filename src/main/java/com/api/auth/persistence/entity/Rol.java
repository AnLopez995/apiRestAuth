package com.api.auth.persistence.entity;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Size(max = 50)
    private String nombre;

    @Size(max = 1)
    private String estado;

    @Column(name="idtipocentro")
    private Integer idtipocentro;

	public Rol() {
		super();
	}

	public Rol(Integer id, @Size(max = 50) String nombre, @Size(max = 1) String estado, Integer idtipocentro,
			List<Usuario> usuarios) {
		super();
		Id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.idtipocentro = idtipocentro;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getIdtipocentro() {
		return idtipocentro;
	}

	public void setIdtipocentro(Integer idtipocentro) {
		this.idtipocentro = idtipocentro;
	}

	

    

}
