import java.util.Scanner;


public class Funciones1 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		double a, b, prod;
		
		//Peticion de los números
		System.out.println("Dime el primer número.");
		a= leer.nextDouble();
		
		System.out.println("Dime el segundo número para multiplicarlo al primero.");
		b= leer.nextDouble();
		
		prod= multiplica(a, b);
		
		//Salida por pantalla
		System.out.println("El resultado es: " + prod);
	}
	
	public static double multiplica(double a, double b) {
		
		//Declaración de variables
		double prod;
		prod= a * b;
		
		return prod;
	}

}
