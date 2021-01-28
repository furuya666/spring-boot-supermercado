package com.wedevs.supermercado.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevs.supermercado.web.app.dao.IProductoDao;
import com.wedevs.supermercado.web.app.models.Producto;
@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	public List<Producto> findByDescripcionLike(String descripcion) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findByDescripcionLike(descripcion);
	}

	@Override
	public List<Producto> findByStockLessThan(int cantidad) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findByStockLessThan(cantidad);
	}

	@Override
	public List<Producto> productosPorExpirar() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.productosPorExpirar();
	}

}
