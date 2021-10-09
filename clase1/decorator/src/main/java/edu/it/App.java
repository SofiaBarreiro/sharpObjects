package edu.it;

import edu.itfactories.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Curso patrones - Decorator");
        
        var lector = Factory.crearLectorCompra();
        var grabador = Factory.crearGrabadorCompra();
        
        for (;;) {
        	var compra = lector.leer();
            grabador.grabar(compra);
            System.out.println("");
            System.out.println("");
        }
    }
}
