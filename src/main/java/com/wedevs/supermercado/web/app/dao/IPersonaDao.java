package com.wedevs.supermercado.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Persona;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IPersonaDao extends CrudRepository <Persona, String> {
   
	
}
