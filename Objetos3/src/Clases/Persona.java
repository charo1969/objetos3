package Clases;

/**
 * clase que almacena los datos de una persona.
 * 
 * @author charo
 *
 */

public class Persona {

	// Estado o variables de instancia

	private String nombre;
	private int edad;
	private String dni;

	// constructor vacio
	public Persona() {
		this.nombre = "";
		this.dni = "";
		edad = 0;
	}

	// constructor con argumentos
	public Persona(String n, int e, String d) {

		this.nombre = n;
		this.edad = e;
		this.setDni(d);

	}
	// crear los getters y setters.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	/**
	 * cambiar la funci�n dni para poner una condici�n con la funci�n String con
	 * charAt y length.
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
			this.dni = dni;
		}

	}

	// crear una funci�n mostrar() no devuelve nada y sin par�metros
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("DNI: " + dni);
	}

	// crear un funci�n esMayorDeEdad() devuelve un boolean y sin par�metros.
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		}
		return false;
	}

}
