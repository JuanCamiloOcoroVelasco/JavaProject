import java.util.Scanner;

public class Funciones5 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int distancia;
		
		//Petición de la distancia
		System.out.println("Dime la distancia en millas que desea pasar a kilómetros");
		distancia= leer.nextInt();
		
		//Salida por pantalla
		System.out.println("La distancia en kilómetros es: " + millas_a_kilometros(distancia) + "km");
	}
	
	public static double millas_a_kilometros(int millas) {
		
		//Declaración de variables
		double prod;
		
		//Cálculo de la distancia
		prod= millas * 1.69034;
		
		return prod;
	}
}
