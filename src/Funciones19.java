import java.util.Scanner;

public class Funciones19 {
	
	//Función para comprobar si es o no una ecuación de Pitágoras
	public static boolean pitagoras(int n, int m) {
		
		//Declaración de variables
		boolean pita;
		pita= false;
		
		//Comprobación
		if(n == m*m) {
			pita= true;
		}
		
		return pita;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int x, y, z, xy;
		
		//Petición de valores
		//Valor de x
		System.out.println("Dame el valor de X");
		x= leer.nextInt();
		//Valor de y
		System.out.println("Dame el valor de Y");
		y= leer.nextInt();
		//Valor de z
		System.out.println("Dame el valor de Z");
		z= leer.nextInt();
		
		xy= (x*x) + (y*y);
		
		//Salida por pantalla
		if(pitagoras(xy, z) == true) {
			System.out.println("Se cumple la ecuación pitagórica");
		}
		else {
			System.out.println("NO se cumple la ecuación pitagórica");
		}
	}

}
