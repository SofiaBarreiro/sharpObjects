package edu.it.services;

import edu.it.model.Compra0KM;

public class DecoradorGrabador0KM implements GrabadorCompra0KM {
	private GrabadorCompra0KM grabadorCompra0KMSQL;
	private GrabadorCompra0KM grabadorCompra0KM_JSON;
	
	public DecoradorGrabador0KM(GrabadorCompra0KM grabadorCompra0KMSQL, GrabadorCompra0KM grabadorCompra0KM_JSON) {
		this.grabadorCompra0KMSQL = grabadorCompra0KMSQL;
		this.grabadorCompra0KM_JSON = grabadorCompra0KM_JSON;
	}
	public void grabar(Compra0KM compra0kM) {
		
	}
}
