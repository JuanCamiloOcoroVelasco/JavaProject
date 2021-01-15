package Constructores4;

public class Articulo {
	
	//Declaración de variables
	String nombre;
	int iva, cuantosQuedan;
	double precio;
	
	//Constructor
	public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
		this.nombre= nombre;
		this.cuantosQuedan= cuantosQuedan;
		this.precio= precio;
		this.iva= iva;
		
		if(nombre == "" || precio < 0 || iva < 0 || cuantosQuedan < 0) {
			System.err.println("ERROR al instanciar el articulo");
		}
	}
}
