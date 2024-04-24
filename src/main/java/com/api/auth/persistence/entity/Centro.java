package com.api.auth.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Table(name = "Centro")
@Entity
public class Centro implements Serializable{

    @Id
    private String codigo;

    @Size(max = 30)
    private String nombre;

    @Size(max = 1)
    private String estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtipocentro")
    private TipoCentro tipocentros;

	public Centro() {
		super();
	}

	public Centro(String codigo, @Size(max = 30) String nombre, @Size(max = 1) String estado, TipoCentro tipocentros) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.tipocentros = tipocentros;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public TipoCentro getTipocentros() {
		return tipocentros;
	}

	public void setTipocentros(TipoCentro tipocentros) {
		this.tipocentros = tipocentros;
	}

	

    
}
