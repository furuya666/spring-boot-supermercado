package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Factura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
   private String id;
	@Temporal(value = TemporalType.DATE)
   private Date fecha;
	@Temporal(value = TemporalType.TIME)
   private Date hora;
	@Temporal(value = TemporalType.TIMESTAMP)
   private Date createAt;
   @PrePersist
   public void Preppersist() {
	   createAt= new Date();
   }
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public Date getHora() {
	return hora;
}
public void setHora(Date hora) {
	this.hora = hora;
}
public Date getCreateAt() {
	return createAt;
}
public void setCreateAt(Date createAt) {
	this.createAt = createAt;
}
   
   
   
}
