package com.wedevs.supermercado.web.app.services;

import java.util.List;

import com.wedevs.supermercado.web.app.models.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	public Persona findById(String id);
	
	public Persona save(Persona persona);
	
	public void delete(String id);

}

