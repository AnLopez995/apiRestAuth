package com.api.auth.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


@Table(name = "Usuario")
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 10)
    private String login;

    @Size(max = 64)
    private String clave;

    @Size(max = 1)
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "id_rol", insertable = false, updatable = false)
    private Rol rol;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_centro", insertable = false, updatable = false)
    private Centro centro;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, @Size(max = 10) String login, @Size(max = 64) String clave, @Size(max = 1) String estado,
			Integer idRol, String codigoCentro, Rol rol, Centro centro) {
		super();
		this.id = id;
		this.login = login;
		this.clave = clave;
		this.estado = estado;
		this.rol = rol;
		this.centro = centro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

    

    
    


    

}
