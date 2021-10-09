package edu.it.services;

import com.google.gson.Gson;

import edu.it.model.Compra0KM;

public class GrabadorCompra0KM_JSON implements GrabadorCompra0KM {
	public void grabar(Compra0KM compra0KM) {
		System.out.println("");
		var compraFormatoJson = new Gson().toJson(compra0KM);
		System.out.println(compraFormatoJson);
	}
}
