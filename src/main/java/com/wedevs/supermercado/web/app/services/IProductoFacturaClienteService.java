package com.wedevs.supermercado.web.app.services;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoFacturaClienteService {

	List<Factura>facturaConMasProductos(Date fecha);
	
	List<Producto> productosMasVendidos(@DateTimeFormat(pattern = "dd-MM-yyyy") Date fecha);
	
	List<Factura> laFacturaConMasProductos(Date a,Date b,String c);
	
}
