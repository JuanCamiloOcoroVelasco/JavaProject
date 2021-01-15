import java.util.Scanner;

public class Funciones9 {
	//Función para saber cuál es más grande
	public static int esMayor(int n1, int n2) {
		
		//Declaración de variables
		int mayor;
		
		//Cálculo del mayor
		if(n1 < n2) {
			mayor= n2;
		}
		else {
			mayor= n1;
		}
		
		return mayor;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int num1, num2, num3;
		
		//Petición de los números
		System.out.println("Dime el primer número.");
		num1= leer.nextInt();
		
		System.out.println("Ahora el seguno número.");
		num2= leer.nextInt();
		
		System.out.println("Y, por último, el tercero.");
		num3= leer.nextInt();
		
		//Salida por pantalla
		if(num1 < num2) {
			System.out.println("El mayor es: " + esMayor(num2, num3));
		}
		else {
			System.out.println("El mayor es: " + esMayor(num1, num3));
		}
	}

}
