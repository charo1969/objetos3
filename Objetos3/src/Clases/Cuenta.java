package Clases;

public class Cuenta {

	// Estado de una variables

	private Persona titular; // esta es una variable compuesta de la clase persona.
	private double cantidad;

	// constructores---------------------------------------------

	/*
	 * public Cuenta() { this.titular = new Persona(); this.cantidad = 0; }
	 */

	public Cuenta(Persona titular) {

		this.titular = titular;
		this.cantidad = 0;
	}

	public Cuenta(Persona titular, double cantidad) {

		this.titular = titular;
		this.cantidad = cantidad;
	}

	// getters y setters.
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	/**
	 * creamos funcion para mostrar los datos de la cuenta y llamamos a mostrar() de
	 * la clase Persona.
	 */
	public void mostrarCuenta() {
		titular.mostrar();
		System.out.println("saldo:" + this.cantidad);

	}

	/**
	 * 
	 * @param cantI
	 */

	public void ingresar(double cantI) {

		if (cantI > 0) {
			this.cantidad = this.cantidad + cantI;
		}
	}

	/**
	 * 
	 * @param cantR
	 */
	public void retirar(double cantR) {

		if (cantR < cantidad) {
			this.cantidad = this.cantidad - cantR;
		}

	}

}
