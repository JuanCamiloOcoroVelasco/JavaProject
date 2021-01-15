import java.util.Scanner;

public class Funciones6 {
	
	//Declaración de la función
	public static double precioConIVA(double precio) {
		//Introducción de variables
		double coste;
		
		//Suma del IVA
		coste= precio + (precio * 0.25);
		
		return coste;
	}
	
	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		double precio1, precio2, precio3, precio4, precio5;
		
		//Petición de los precios
		System.out.println("Dime el precio del producto 1.");
		precio1= leer.nextDouble();
		
		System.out.println("Dime el precio del producto 2.");
		precio2= leer.nextDouble();
		
		System.out.println("Dime el precio del producto 3.");
		precio3= leer.nextDouble();
		
		System.out.println("Dime el precio del producto 4.");
		precio4= leer.nextDouble();
		
		System.out.println("Dime el precio del producto 5.");
		precio5= leer.nextDouble();
		
		double x= precioConIVA(precio1);
		//Salida por pantalla
		System.out.println("El precio con IVA del producto 1 es: " + x);
		System.out.println("El precio con IVA del producto 2 es: " + precioConIVA(precio2));
		System.out.println("El precio con IVA del producto 3 es: " + precioConIVA(precio3));
		System.out.println("El precio con IVA del producto 4 es: " + precioConIVA(precio4));
		System.out.println("El precio con IVA del producto 5 es: " + precioConIVA(precio5));
	}
	
}
