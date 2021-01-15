import java.util.Scanner;

public class Funciones3 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int a, b;
		
		//Petición de los números
		System.out.println("Dime el primer número.");
		a= leer.nextInt();
		
		System.out.println("Dime el segundo número.");
		b= leer.nextInt();
		
		//Salida por pantalla
		if(minimo(a, b) == 1) {
			System.out.println("El mínimo es: " + a);
		}
		else {
			System.out.println("El mínimo es: " + b);
		}
	}
	
	public static int minimo(int a, int b) {
		
		//Declaración de variables
		int min;
		min= 0;
		
		//Cual es el minimo
		if(a < b) {
			min = 1;
		}
		
		return min;
	}
}
