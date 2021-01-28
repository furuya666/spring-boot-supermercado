package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Carrito;

public interface ICarritoDao extends CrudRepository<Carrito, Integer> {

}
