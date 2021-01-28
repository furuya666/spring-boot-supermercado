package com.wedevs.supermercado.web.app.services;

import java.util.List;

import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;

public interface IPromocionProductoFacturaService {

	List<Cliente> clienteConMasCompras(double monto);
	
	List<Promocion>promocionConProducto(String idProducto);
	
	List<Promocion> promocionMasComprada();
}
