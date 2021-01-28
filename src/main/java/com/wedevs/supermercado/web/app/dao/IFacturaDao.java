package com.wedevs.supermercado.web.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.DTOs.facturaMasProductos;
import com.wedevs.supermercado.web.app.models.Factura;

public interface IFacturaDao extends CrudRepository<Factura, String>{

	@Query(value="select f.*\r\n" + 
			"from producto_factura_cliente pf, factura f\r\n" + 
			"where f.fecha between ?1 and current_date\r\n" + 
			"and f.id = pf.factura_id\r\n" + 
			"limit 2", nativeQuery=true)
	List<Factura> facturaConMasProductos(Date fecha);
}
