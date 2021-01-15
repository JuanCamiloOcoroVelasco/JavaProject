import java.util.Scanner;

public class Funciones8 {
	
	//Función del sumatorio
	public static int suma1aN(int n) {
		
		//Declaración de variables
		int suma;
		suma= 0;
		
		//Calculo del sumatorio
		for(int i = 0; i <= n; i++) {
			suma+= i;
		}
		
		return suma;
	}
	
	//Funcion del productorio
	public static int producto1aN(int n) {
		
		//Declaración de variables
		int prod;
		prod= 1;
		
		//Calculo del productorio
		for(int i = 1; i <= n; i++) {
			prod*= i;
		}
		
		return prod;
	}
	
	//Función del numero intermedio
	public static double intermedio1aN(int n) {
		
		//Declaración de variables
		double medio;
		
		medio= (n / 2) + 1;
		
		return medio;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int N;
		
		//Petición del número
		System.out.print("Dime un número: ");
		N= leer.nextInt();
		
		//Salida por pantalla
		//Sumatorio
		System.out.print("El sumatorio de 1 a " + N + " es: " + suma1aN(N));
		
		//Hueco intermedio
		System.out.println(" ");
		
		//Productorio
		System.out.print("El productorio de 1 a " + N + " es: " + producto1aN(N));
		
		//Hueco intermedio
		System.out.println(" ");
		
		//Número intermedio
		System.out.print("Y el número que hay entre 1 y " + N + " es: " + intermedio1aN(N));
	}

}
