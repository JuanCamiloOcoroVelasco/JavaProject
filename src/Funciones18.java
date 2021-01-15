import java.util.Scanner;

public class Funciones18 {
	
	//Función para saber la letra del DNI
	public static char letraDNI(int n) {
		
		//Declaración de variables
		String letra;
		char DNI;
		letra= "TRWAGMYFPDXBNJZSQVHLCKE";
		
		//Cálculo de la letra del DNI
		DNI= letra.charAt(n % 23);
		
		return DNI;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int dni;
		
		//Petición del DNI
		System.out.println("Dime el número del DNI sin la letra");
		dni= leer.nextInt();
		
		//Salida por pantalla
		System.out.println("La letra del DNI es " + letraDNI(dni));
	}

}
