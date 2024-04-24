package com.api.auth.persistence.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Table(name = "tipocentro")
@Entity
public class TipoCentro implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 20)
    private String tipo;

	public TipoCentro() {
		super();
	}

	public TipoCentro(Integer id, @Size(max = 20) String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
}
