package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
public class ProductoCarritoCliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@NotEmpty
	private Producto Producto;
	@ManyToOne
	@NotEmpty
	private Carrito Carrito;
	@ManyToOne
	@NotEmpty
	private Cliente Cliente;
	@NotEmpty
	private String estado;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date createAt;
	
	@PrePersist
	public void Prepersist() {
		createAt= new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Producto getProducto() {
		return Producto;
	}
	public void setProducto(Producto producto) {
		Producto = producto;
	}
	public Carrito getCarrito() {
		return Carrito;
	}
	public void setCarrito(Carrito carrito) {
		Carrito = carrito;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	

}
