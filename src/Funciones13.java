import java.util.Scanner;

public class Funciones13 {

	//Función de cálculo del descuento
	public static int descuento(double precio1, double precio2) {
		
		//Declaración de variables
		int descuento;
		
		//Cálculo del descuento
		descuento= 100 - (((int)precio2 * 100) / (int)precio1);
		
		return descuento;
	}

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		double precioEntero, precioDescontado;
		
		//Petición de los precios
		//Precio original
		System.out.println("Dime el precio antes del descuento");
		precioEntero= leer.nextDouble();
		
		//Precio descontado
		System.out.println("Ahora dime el precio que tiene después del descuento");
		precioDescontado= leer.nextDouble();
		
		//Salida por pantalla
		System.out.println("El porcentaje de descuento es del " + descuento(precioEntero, precioDescontado) + "%");
	}

}
