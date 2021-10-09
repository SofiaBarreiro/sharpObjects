package edu.it.components;

import java.util.UUID;

import com.github.javafaker.Faker;

import edu.it.entities.Usuario;

public class Utiles {
	public static Usuario inventarUsuario() {
		var fkr = new Faker();
		
		return new Usuario(
				UUID.randomUUID().toString(),
				fkr.address().firstName(),
				fkr.address().lastName(),
				fkr.address().streetName(),
				Integer.parseInt(fkr.address().streetAddressNumber()),
				fkr.address().city(),
				fkr.address().country()
		);
	}
	public static int[] range(int cantidad) {
		int[] arrTmp = new int[cantidad];
		
		for (int x = 1; x <= cantidad; x++) {
			arrTmp[x-1] = x;
		}
		
		return arrTmp;
	}
}
