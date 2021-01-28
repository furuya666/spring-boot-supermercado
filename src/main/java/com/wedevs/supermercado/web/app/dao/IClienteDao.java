package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, String> {

}
