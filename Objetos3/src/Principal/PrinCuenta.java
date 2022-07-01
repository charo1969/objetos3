package Principal;

import Clases.Cuenta;
import Clases.Persona;

public class PrinCuenta {

	public static void main(String[] args) {

		/**
		 * mostrar y crear un objeto Persona
		 */
		Persona p = new Persona("Antonio", 25, "12345678D");

		/* p.setNombre("Charo"); */
		System.out.println("La persona es: ");

		p.mostrar();
		Cuenta icuenta = new Cuenta(p);
		System.out.println("La cuenta es: ");
		icuenta.mostrarCuenta();

		// otro objeto De las Clases Persona y Cuenta
		Persona p2 = new Persona("charo", 26, "12341278B");
		Cuenta cuenta2 = new Cuenta(p2, 2000);
		System.out.println("La cuenta 2 es: ");
		cuenta2.mostrarCuenta();
		
		// aqui se cambiaria el nombre de la cuenta porque se hace referencia.
		p2.setNombre("Antonio");
		cuenta2.mostrarCuenta();

		/**
		 * ingresar cuenta y retirar dinero
		 */

		/*
		 * icuenta.mostrarCuenta(); icuenta.ingresar(500);
		 * System.out.println("despues de ingreso"); icuenta.mostrarCuenta();
		 * 
		 * 
		 * icuenta.retirar(300); System.out.println("despues de retirar");
		 * icuenta.mostrarCuenta(); icuenta.retirar(500);
		 * System.out.println("despues de retirar"); icuenta.mostrarCuenta();
		 */

	}

}
