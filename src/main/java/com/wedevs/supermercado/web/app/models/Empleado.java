package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.hibernate.engine.spi.ValueInclusion;

@Entity
public class Empleado extends Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	@Id
	private String idEmpleado;
	*/
	@Temporal(value = TemporalType.DATE)
	private Date fechaIngreso;
	@NotEmpty
	private String descripcion;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createAt;
	@PrePersist
	public void Prepersist() {
		createAt=new Date();
		
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	

}
