package com.wedevs.supermercado.web.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.DTOs.facturaDTO;
import com.wedevs.supermercado.web.app.DTOs.facturaMasProductos;
import com.wedevs.supermercado.web.app.DTOs.productoMasVendidoDTO;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.models.ProductoFacturaCliente;

public interface IProductoFacturaClienteDao extends CrudRepository<ProductoFacturaCliente, Integer> {

	
	
	
	
	@Query(value="select p.*\r\n" + 
			"from producto p,(select pf.producto_id ,sum (cantidad)cantidad\r\n" + 
			"                 from producto_factura_cliente pf\r\n" + 
			"                 where pf.factura_id IN (select  id\r\n" + 
			"                                         from factura\r\n" + 
			"                                         where fecha between ?1 and current_date)\r\n" + 
			"                                         group by pf.producto_id)ventas\r\n" + 
			"                where p.id=ventas.producto_id\r\n" + 
			"                order by ventas.cantidad desc\r\n" + 
			"",nativeQuery = true)
	List<Producto> productosMasVendidos(Date Fecha);
	
	@Query(value="select f.*\r\n" +
			"from factura f,(select  cliente_ci,sum(cantidad)cantidad,factura_id\r\n" + 
			"                from producto_factura_cliente\r\n" + 
			"                group by cliente_ci,factura_id) productos\r\n" + 
			"where f.fecha between  ?1 and ?2\r\n" + 
			"and f.id = productos.factura_id\r\n" + 
			"and productos.cliente_ci like ?3\r\n" + 
			"order by productos.cantidad desc ",nativeQuery = true)
	List<Factura> laFacturaConMasProductos(Date a,Date b,String c);
	
	
}
