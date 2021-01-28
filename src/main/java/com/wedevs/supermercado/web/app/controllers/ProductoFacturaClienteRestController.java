package com.wedevs.supermercado.web.app.controllers;

import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.services.IProductoFacturaClienteService;

@RestController
@RequestMapping("/supermercado")
public class ProductoFacturaClienteRestController {

	@Autowired
	private IProductoFacturaClienteService productoFacturaClienteService;
	
	@GetMapping("/productos/masVendidos/{fecha}")
	public List<Factura> facturaConMasProductos(@PathVariable String fecha) {
		// TODO Auto-generated method stub
		SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
		 Date fechaNueva=null;
		try {
			 fechaNueva=formato.parse(fecha);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return (List<Factura>)productoFacturaClienteService.facturaConMasProductos(fechaNueva);
	}
	@GetMapping("/productos/masVendidosSemana/{fecha}")
	public List<Producto> productosMasVendidos(@PathVariable Date Fecha) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoFacturaClienteService.productosMasVendidos(Fecha);
	}

	@GetMapping("/productos/facturasCliente/{a}/{b}/{c}")
	public List<Factura> laFacturaConMasProductos(@PathVariable Date a, @PathVariable Date b, @PathVariable String c) {
		// TODO Auto-generated method stub
		return (List<Factura>)productoFacturaClienteService.laFacturaConMasProductos(a, b, c);
	}

}
