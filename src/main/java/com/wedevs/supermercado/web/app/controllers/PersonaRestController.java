package com.wedevs.supermercado.web.app.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.models.Persona;
import com.wedevs.supermercado.web.app.services.IPersonaService;

@RestController
@RequestMapping("/supermercado")
public class PersonaRestController {

	@Autowired
	public IPersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> Personas() {
		return personaService.findAll();
	}
	
	@GetMapping("/personas/{ci}")
	public Persona findById(@PathVariable String ci){
		return personaService.findById(ci);	
	}
	
	@PostMapping("/personas")
	public Persona registrar(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@PutMapping("/personas/{ci}")
	public Persona actualizar(@PathVariable String ci,@RequestBody Persona persona) {
		
		Persona personaActual= (Persona)personaService.findById(ci);
		personaActual.setDireccionCalle(persona.getDireccionCalle());
		personaActual.setDireccionCiudad(persona.getDireccionCiudad());
		personaActual.setDireccionNroPuerta(persona.getDireccionNroPuerta());
		personaActual.setTelefono(persona.getTelefono());
		return personaService.save(personaActual);
	}
	
	@DeleteMapping("/personas/{ci}")
	public void delete(@PathVariable String ci) {
		personaService.delete(ci);
	}
	
	
}
