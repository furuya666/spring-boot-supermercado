package com.wedevs.supermercado.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.services.IProductoService;

//anotaciones
@RestController
@RequestMapping("/supermercado")

public class ProductoRestController {
	
	@Autowired
	public IProductoService productoService;
	@GetMapping("/")
    public String holamundo() {
    	return "Hola mundo soy gary";
    }
	
	@GetMapping("/producto/Descripcion/{descripcion}")
	public List<Producto> findByDescripcionLike(@PathVariable String descripcion) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoService.findByDescripcionLike(descripcion);
	}

	@GetMapping("/producto/agotados/{cantidad}")
	public List<Producto> findByStockLessThan(@PathVariable int cantidad) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoService.findByStockLessThan(cantidad);
	}

	@GetMapping("/producto/porExpirar")
	public List<Producto> productosPorExpirar() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoService.productosPorExpirar();
	}

}
