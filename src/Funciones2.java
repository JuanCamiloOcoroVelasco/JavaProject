import java.util.Scanner;

public class Funciones2 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaradión de variables
		int edad;
		
		//Petición de la edad
		System.out.println("¿Cuántos años tienes?");
		edad= leer.nextInt();
		
		//Salida por pantalla
		if(esMayorEdad(edad) == true) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("NO eres mayor de edad");
		}
	}
	
	public static boolean esMayorEdad(int edad) {
		
		//Declaración de variables
		boolean mayor;
		mayor= false;
		
		if(edad >= 18) {
			mayor= true;
		}
		
		return mayor;
	}

}
