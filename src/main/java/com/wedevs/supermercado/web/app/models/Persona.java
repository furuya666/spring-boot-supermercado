package com.wedevs.supermercado.web.app.models;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, nullable = true)
	private String CI;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellido1;
	
	@NotEmpty
	private String apellido2;
	
	@NotEmpty
	private String DireccionNroPuerta;
	
	@NotEmpty
	private String DireccionCalle;
	
	@Size(min=4, max=12)
	private String DireccionCiudad;
	
	private String foto;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createAt;
	
	private int telefono;
	
	@OneToMany(mappedBy = "persona")
	private List<Correo> correos;
	
	@PrePersist
	public void Prepersist() {
		createAt= new Date();
	}

	public String getCI() {
		return CI;
	}

	public void setCI(String cI) {
		CI = cI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccionNroPuerta() {
		return DireccionNroPuerta;
	}

	public void setDireccionNroPuerta(String direccionNroPuerta) {
		DireccionNroPuerta = direccionNroPuerta;
	}

	public String getDireccionCalle() {
		return DireccionCalle;
	}

	public void setDireccionCalle(String direccionCalle) {
		DireccionCalle = direccionCalle;
	}

	public String getDireccionCiudad() {
		return DireccionCiudad;
	}

	public void setDireccionCiudad(String direccionCiudad) {
		DireccionCiudad = direccionCiudad;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
		
}
