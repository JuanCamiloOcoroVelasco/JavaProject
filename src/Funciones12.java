import java.util.Scanner;

public class Funciones12 {
	//Funciín que pasa los Km a Millas
	public static double distancia(double kms) {
		
		//Declaración de variables
		double millas;
		
		//Pasador de Km a millas
		millas= kms * 0.621371;
		
		return millas;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Introducción de variables
		int km;
		
		//Petición de la distancia
		System.out.println("Dime la distancia en Km");
		km= leer.nextInt();
		
		//Salida por pantalla
		System.out.println(km + "Km son " + distancia(km) + " millas");
	}

}
