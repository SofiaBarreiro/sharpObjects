package edu.itfactories;

import edu.it.services.GrabadorCompra0KM;
import edu.it.services.LectorCompra0KM;

public class Factory {
	public static LectorCompra0KM crearLectorCompra() {
		try {
			return (LectorCompra0KM)Class.forName("edu.it.services.IngresoCompraPorConsola")
					.getConstructor()
					.newInstance();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	public static GrabadorCompra0KM crearGrabadorCompra() {
		try {
			return (GrabadorCompra0KM)Class.forName("edu.it.services.GrabadorCompra0KMSQL")
				.getConstructor()
				.newInstance();
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}
