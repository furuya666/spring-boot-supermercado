package com.wedevs.supermercado.web.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.wedevs.supermercado.web.app.dao.IPersonaDao;
import com.wedevs.supermercado.web.app.models.Persona;

@Service("personaServiceConJpa")
@Primary
public class PersonaServiceImpl implements IPersonaService{

	//Inyeccion de dependencias en atributo
	@Autowired
	private IPersonaDao personaDao;
	
	//Inyeccion de dependencias sin anotacion en constructor
//	public PersonaServiceImpl(IPersonaDao personaDao) {
//		this.personaDao = personaDao;
// }
	
	//Inyeccion de dependencias en metodo set
// @Autowired	
//	public void setPersonaDao(IPersonaDao personaDao) {
//		this.personaDao = personaDao;
//	}
	
	@Transactional
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}



	@Transactional
	public Persona findById(String id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id).orElse(null);
	}

	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}


}
