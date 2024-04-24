package com.api.auth.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RolesOpcionesPK implements Serializable {

    @Column(name = "id_rol", insertable = false, updatable = false)
    private Integer idRol;

    @Column(name = "opcion",insertable=false, updatable=false)
    private String idOpcion;

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getIdOpcion() {
		return idOpcion;
	}

	public void setIdOpcion(String idOpcion) {
		this.idOpcion = idOpcion;
	}

}
