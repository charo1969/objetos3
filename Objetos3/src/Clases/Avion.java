package Clases;

public class Avion {

	private String nFabricante;
	private int nMotores;

	// constructor
	public Avion() {
		this.nFabricante = "No inicializado";
		this.nMotores = 0;
	}

	public Avion(String a) {
		this.nFabricante = a;
	}

	public Avion(String a, int n) {
		this.nFabricante = a;
		this.nMotores = n;
	}

	public String getnFabricante() {
		return nFabricante;
	}

	public void setnFabricante(String nFabricante) {
		this.nFabricante = nFabricante;
	}

	public int getnMotores() {
		return nMotores;
	}

	public void setnMotores(int nMotores) {
		this.nMotores = nMotores;
	}

	public void imprimirFabricante() {
		System.out.println("Nombre del Fabricante: " + nFabricante);
	}

	public void cambiarFabricante() {
		nFabricante = "Lookheed";
	}

	public void mostrar() {
		System.out.println("Nombre del Fabricante: " + nFabricante);
		System.out.println("Número de motores: " + nMotores);
	}

}
