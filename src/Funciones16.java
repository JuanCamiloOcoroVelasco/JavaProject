import java.util.Scanner;

public class Funciones16 {
	
	//Función del número aleatorio
	public static int numRandom(int n) {
		//Declaración de variables
		int num;
		
		//Número aleatorio
		num= (int)(Math.random()*1000 + 1);
		n= num;
		
		return n;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int vector[], num, n;
		n= 0;
		
		//Tamaño del vector
		System.out.println("Dime cuántos números quieres almacenar");
		num= leer.nextInt();
		vector= new int[num];
		
		//Almacenamiento de los números
		for(int i = 0; i < vector.length; i++) {
			vector[i]= numRandom(n);
		}
		
		//Salida por pantalla
		for(int i = 0; i < vector.length; i++) {
			System.out.println("En la posición " + i + " está el mnúmero " + vector[i]);
		}
	}

}
