package com.wedevs.supermercado.web.app.services;

import java.util.List;

import com.wedevs.supermercado.web.app.DTOs.productoDTO;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoService {

	List<Producto> findByDescripcionLike(String descripcion);
	List<Producto> findByStockLessThan(int cantidad);
	List<Producto>productosPorExpirar();
}
