package edu.it.services;

import edu.it.model.Compra0KM;

public class GrabadorCompra0KMSQL implements GrabadorCompra0KM {
	public void grabar(Compra0KM compra0KM) {
		System.out.println("Grabando compra");
		System.out.println("Nombre");
		System.out.println(compra0KM.nombreCliente);
		System.out.println("Modelo");
		System.out.println(compra0KM.modelo);
	}
}
