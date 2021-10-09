package edu.it.model;

import java.util.UUID;

public class Compra0KM {
	public String id;
	public String nombreCliente;
	public String modelo;
	
	public Compra0KM(String nombreCliente, String modelo) {
		id = UUID.randomUUID().toString();
		this.nombreCliente = nombreCliente;
		this.modelo = modelo;
	}
}
