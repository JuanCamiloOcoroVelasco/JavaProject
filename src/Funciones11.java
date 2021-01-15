import java.util.Scanner;

public class Funciones11 {
	
	//Función de la tabla de multiplicar
	public static void multiplicar(int n){
		//Introducción de variables
		int tabla[], prod, prod2;
		tabla= new int[10];
		prod= 1;
		prod2= 1;
		
		//Almacenamiento de los resultados
		for(int i = 0; i < tabla.length; i++) {
			tabla[i]= n * prod;
			prod++;
		}
		
		//Salida de la tabla
		for(int i = 0; i < tabla.length; i++) {
			System.out.println(n + "x" + prod2 + "= " + tabla[i]);
			prod2++;
		}
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int num;
		
		//Petición del número
		System.out.println("Dime un número y te digo su tabla de multiplicar");
		num= leer.nextInt();
		
		//Salida por pantalla
		multiplicar(num);
	}

}
