package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;
import java.util.Date;

public class productoMasVendidoDTO  implements Serializable{

	/**
	 * 
	 */
	private  String id;
	private String nombre;
	private int stock;
	private String cantidad;
	private static final long serialVersionUID = 1L;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

}
