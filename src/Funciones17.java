import java.util.Scanner;

public class Funciones17 {
	
	//Función para saber si el número es primo o no
	public static boolean primo(int n) {
		
		//Introducción de variables
		boolean prim;
		int cont;
		cont= 2;
		prim= true;
		
		//Ver si el número es primo o no
		while(cont != n) {
			if(n % cont == 0) {
				prim= false;
			}
			cont++;
		}
		
		return prim;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int num;
		
		//Petición del número hasta que se introduzca un 0;
		do {
			System.out.println("Introduce un número y te diré si es primo o no");
			num= leer.nextInt();
			if(primo(num) == true) {
				System.out.println("El número es primo");
			}
			else {
				System.out.println("El número NO es primo");
			}
		} while(num != 0);
	}

}
