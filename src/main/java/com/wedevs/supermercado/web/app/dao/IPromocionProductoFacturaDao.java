package com.wedevs.supermercado.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;
import com.wedevs.supermercado.web.app.models.PromocionProductoFactura;

public interface IPromocionProductoFacturaDao extends CrudRepository<PromocionProductoFactura, Integer> {

	@Query(value="select c.*\r\n" + 
			"from cliente c,\r\n" + 
			"(select cliente_ci, sum(precio)precio\r\n" + 
			"from  promocion_producto_factura\r\n" + 
			"group by cliente_ci) totalA,\r\n" + 
			"(select  cliente_ci,sum(precio) precio\r\n" + 
			"from producto_factura_cliente\r\n" + 
			"group by cliente_ci) totalB\r\n" + 
			"where totalA.precio+totalB.precio >= ?1\r\n" + 
			"and c.ci=totalA.cliente_ci\r\n" + 
			"and c.ci=totalB.cliente_ci", nativeQuery = true)
	List<Cliente> clienteConMasCompras(double monto);
	
	
	
	@Query(value = "select prom.*\r\n" + 
			"from promocion prom,\r\n" + 
			"(select  promocion_id,producto_id\r\n" + 
			"from promocion_producto_factura) proms\r\n" + 
			"where prom.id=proms.promocion_id\r\n" + 
			"and proms.producto_id like ?1", nativeQuery = true)
	List<Promocion>promocionConProducto(String idProducto);
	
	
	
	
	@Query(value = "select prom.*\r\n" + 
			"from promocion prom,(select MAX (maxin.precio)\r\n" + 
			"                    from (select  promocion_id,sum (precio) precio\r\n" + 
			"                          from promocion_producto_factura\r\n" + 
			"                          group by promocion_id)maxin)maximo,(select promocion_id, sum(precio) precio\r\n" + 
			"                                                             from promocion_producto_factura\r\n" + 
			"                                                             group by  promocion_id)sumas\r\n" + 
			"where sumas.promocion_id=prom.id\r\n" + 
			"and maximo.max=sumas.precio",nativeQuery = true)
	List<Promocion> promocionMasComprada();
}
