package edu.it.services;

import java.util.Scanner;
import edu.it.model.Compra0KM;

public class IngresoCompraPorConsola implements LectorCompra0KM {
	public Compra0KM leer() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		var nombre = scn.nextLine();
		System.out.println("Ingrese modelo");
		var modelo = scn.nextLine();
		return new Compra0KM(nombre, modelo);
	}
}
