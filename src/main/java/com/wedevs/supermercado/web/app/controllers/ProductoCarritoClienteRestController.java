package com.wedevs.supermercado.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.services.IProductoCarritoClienteService;

@RestController
@RequestMapping("/supermercado")
public class ProductoCarritoClienteRestController {

	@Autowired 
	private IProductoCarritoClienteService productoCarritoClienteService;
	
	@GetMapping("/carrito/estadoProducto/{idProducto}")
	public String estadoCarritoProducto(@PathVariable String idProducto) {
		// TODO Auto-generated method stub
		return (String)productoCarritoClienteService.estadoCarritoProducto(idProducto);
	}

}
