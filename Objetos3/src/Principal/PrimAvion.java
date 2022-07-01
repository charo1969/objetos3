package Principal;

import Clases.Avion;

public class PrimAvion {

	public static void main(String[] args) {
		Avion a1 = new Avion("Airbus", 4);
		a1.mostrar();

		Avion a2 = new Avion("Lookheed", 4);
		a2.mostrar();

		a1.cambiarFabricante();
		a1.mostrar();

	}

}
