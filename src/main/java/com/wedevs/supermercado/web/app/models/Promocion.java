package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
@Entity
public class Promocion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
     @Temporal(value=TemporalType.DATE)
	private Date fecha_inicio;
     @Temporal(value=TemporalType.DATE)
	private Date fecha_fin;
     @NotEmpty
	private  double descuento;
     @Temporal(value=TemporalType.TIMESTAMP)
	private Date createAt;
	/*
	 *********** 1RA FORMA***********
	 *CARDINALIDAD DE MUCHOS  A MUCHOS
	@ManyToMany(mappedBy = "promociones")
	private List<Producto> productos;
     */
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
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
