package com.wedevs.supermercado.web.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevs.supermercado.web.app.dao.IProductoCarritoClienteDao;
@Service
public class ProductoCarritoClienteServiceImpl implements IProductoCarritoClienteService{

	@Autowired
	private IProductoCarritoClienteDao productoCarritoClienteDao;
	@Override
	public String estadoCarritoProducto(String idProducto) {
		// TODO Auto-generated method stub
		return (String)productoCarritoClienteDao.estadoCarritoProducto(idProducto);
	}

	
	
	
}
