package com.wedevs.supermercado.web.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.DTOs.productoDTO;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoDao extends CrudRepository<Producto, String> {

	//con JPA
	List<Producto> findByDescripcionLike(String descripcion);
	List<Producto> findByStockLessThan(int cantidad);
	
	@Query(value="select p.*\r\n" + 
			"from producto p, (select p.id_producto, l.fecha_vencimiento\r\n" + 
			"				  from producto p, lote l\r\n" + 
			"				  where l.fecha_vencimiento between current_date and cast (current_date + '1 month' \\:\\:INTERVAL as date)\r\n" + 
			"				 and p.lote_id = l.id_lote)por_expirar\r\n" + 
			"where p.id_producto = por_expirar.id_producto", nativeQuery = true)
	List <Producto> productosPorExpirar();
	
	
}
