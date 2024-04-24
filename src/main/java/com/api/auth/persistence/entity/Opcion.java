package com.api.auth.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Opcion {

    @Id
    private String opcion;

	@Size(max = 50)
    private String descripcion;

	@Size(max = 100)
    private String ruta;

	@Size(max = 20)
    private String icono;

    private Integer nivel;

	@Size(max = 20)
    private String opcionPadre;

    private Integer orden;

	@Size(max = 1)
    private String titulo;

	@Size(max = 20)
    private String role;

	public Opcion() {
		super();
	}

	public Opcion(String opcion, @Size(max = 50) String descripcion, @Size(max = 100) String ruta,
			@Size(max = 20) String icono, Integer nivel, @Size(max = 20) String opcionPadre, Integer orden,
			@Size(max = 1) String titulo, @Size(max = 20) String role) {
		super();
		this.opcion = opcion;
		this.descripcion = descripcion;
		this.ruta = ruta;
		this.icono = icono;
		this.nivel = nivel;
		this.opcionPadre = opcionPadre;
		this.orden = orden;
		this.titulo = titulo;
		this.role = role;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getOpcionPadre() {
		return opcionPadre;
	}

	public void setOpcionPadre(String opcionPadre) {
		this.opcionPadre = opcionPadre;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
    
}
