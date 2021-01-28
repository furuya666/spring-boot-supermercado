package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Integer> {

}
