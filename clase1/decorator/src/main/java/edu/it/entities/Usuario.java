package edu.it.entities;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	public String id;
	@Column(name="nombre_del_usuario")
	public String nombreDelUsuario;
	public String apellido;
	public String calle;
	public Integer altura;
	public String ciudad;
	public String pais;
	
	public Usuario(String id, String nombreDelUsuario, String apellido, String calle, Integer altura, String ciudad,
			String pais) {

		this.id = id;
		this.nombreDelUsuario = nombreDelUsuario;
		this.apellido = apellido;
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	public Usuario() {
		
	}
}
