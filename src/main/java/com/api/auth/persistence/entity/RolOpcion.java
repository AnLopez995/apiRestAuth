package com.api.auth.persistence.entity;

import jakarta.persistence.*;

@Entity
public class RolOpcion {

    @EmbeddedId
    private RolesOpcionesPK id;

	public RolOpcion() {
		super();
	}

	public RolOpcion(RolesOpcionesPK id, Rol rol, Opcion opciones) {
		super();
		this.id = id;
	}

	public RolesOpcionesPK getId() {
		return id;
	}

	public void setId(RolesOpcionesPK id) {
		this.id = id;
	}

    
    

}
