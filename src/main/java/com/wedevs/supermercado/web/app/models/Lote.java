package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Persistent;

@Entity
public class Lote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
   @Temporal(value=TemporalType.DATE)
    private Date fechaArribo;
   @Temporal(value=TemporalType.DATE)
    private Date fechaVencimiento;
   @NotEmpty
    private String senasag;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date createAt;
    @PrePersist
    public void Prepersist() {
    	createAt=new Date();
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaArribo() {
		return fechaArribo;
	}
	public void setFechaArribo(Date fechaArribo) {
		this.fechaArribo = fechaArribo;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getSenasag() {
		return senasag;
	}
	public void setSenasag(String senasag) {
		this.senasag = senasag;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
    
    
	
}
