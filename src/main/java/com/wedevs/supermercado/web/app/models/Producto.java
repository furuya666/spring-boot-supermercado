package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
@Entity
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
     private String id;
	@NotEmpty
     private double precio;
	@NotEmpty
     private int stock;
	@NotEmpty
     private String descripcion;
	@Temporal(value = TemporalType.TIMESTAMP)
     private  Date createAt;
	@NotEmpty
     private String nombre;
	@ManyToOne
	@NotEmpty
	private Lote Lote;
     /*
      *******1RA FORMA****************
      *CARDINALIDAD DE MUCHOS A MUCHOS
     @JoinTable(
    		 name="promocion_producto",
    		 joinColumns=@JoinColumn(name="id_producto"),
    		 inverseJoinColumns = @JoinColumn(name="id_promocion")
    		 )
     @ManyToMany
     private List<Promocion> promociones;
     */
     @PrePersist
     public void Prepersist() {
    	 createAt=new Date();
     }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
     
     
     
}
