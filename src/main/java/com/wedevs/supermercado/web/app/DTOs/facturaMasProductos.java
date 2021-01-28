package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;

public class facturaMasProductos implements Serializable{

	/**
	 * 
	 */
	private String idFactura;
	private String idCliente;
	private int total;
	
	private static final long serialVersionUID = 1L;

	public String getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
