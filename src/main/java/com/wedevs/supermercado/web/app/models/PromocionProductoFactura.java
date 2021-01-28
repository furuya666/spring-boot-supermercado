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
public class PromocionProductoFactura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@NotEmpty
	private  Promocion Promocion;
	@ManyToOne
	@NotEmpty
	private Producto Producto;
	@ManyToOne
	@NotEmpty
	private Factura Factura;
	@ManyToOne
	@NotEmpty
	private Cliente Cliente;
	@NotEmpty
	private int stockPromocion;
	@NotEmpty
	private double precio;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date createAt;

	@PrePersist
	public  void Prepersist() {
		createAt=new Date();
	}
	public Promocion getPromocion() {
		return Promocion;
	}
	public void setPromocion(Promocion Promocion) {
		this.Promocion = Promocion;
	}
	public Producto getProducto() {
		return Producto;
	}
	public void setProducto(Producto Producto) {
		this.Producto = Producto;
	}
	public int getStockPromocion() {
		return stockPromocion;
	}
	public void setStockPromocion(int stockPromocion) {
		this.stockPromocion = stockPromocion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
