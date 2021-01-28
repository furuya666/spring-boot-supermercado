package com.wedevs.supermercado.web.app.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevs.supermercado.web.app.dao.IFacturaDao;
import com.wedevs.supermercado.web.app.dao.IProductoFacturaClienteDao;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;

@Service
public class ProductoFacturaClienteServiceImpl implements IProductoFacturaClienteService {

	@Autowired
	private IProductoFacturaClienteDao productoFacturaClienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Override
	public List<Factura> facturaConMasProductos(Date fecha) {
		// TODO Auto-generated method stub
		return (List<Factura>)facturaDao.facturaConMasProductos(fecha);
	}
	@Override
	public List<Producto> productosMasVendidos(Date Fecha) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoFacturaClienteDao.productosMasVendidos(Fecha);
	}

	@Override
	public List<Factura> laFacturaConMasProductos(Date a, Date b, String c) {
		// TODO Auto-generated method stub
		return (List<Factura>)productoFacturaClienteDao.laFacturaConMasProductos(a, b, c);
	}

}
