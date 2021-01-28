package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;
import java.util.Date;

public class productoDTO implements Serializable{

	/**
	 * 
	 */
	
	private  String id;
	private String nombre;
	private int stock;
	private Date fecha_vencimiento;
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
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

}
