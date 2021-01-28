package com.wedevs.supermercado.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;
import com.wedevs.supermercado.web.app.services.IPromocionProductoFacturaService;

@RestController
@RequestMapping("/supermercado")
public class PromocionProductoFacturaRestController {

	@Autowired
	private IPromocionProductoFacturaService promocionProductoFacturaService;
	@GetMapping("/promocion/clienteConMasCompras/{monto}")
	public List<Cliente> clienteConMasCompras(@PathVariable double monto) {
		// TODO Auto-generated method stub
		return (List<Cliente>)promocionProductoFacturaService.clienteConMasCompras(monto);
	}

	@GetMapping("/promocion/promocionProducto/{idProducto}")
	public List<Promocion> promocionConProducto(@PathVariable String idProducto) {
		// TODO Auto-generated method stub
		return (List<Promocion>)promocionProductoFacturaService.promocionConProducto(idProducto);
	}

	@GetMapping("/promocion/masComprada")
	public List<Promocion> promocionMasComprada() {
		// TODO Auto-generated method stub
		return (List<Promocion>)promocionProductoFacturaService.promocionMasComprada();
	}

}
