import java.util.Scanner;

public class Funciones14 {
	
	//Función para crear la pirámide
	public static void piramide(char let, int n) {
		
		//Creación de la pirámide
		for(int i = 1; i <= n; i++) {
			
			//Espacio para que el caracter quede centrado
			for(int j = 1; j <= n-i; ++j) {
				System.out.print(" ");
			}
			
			//Insertar el carácter
			int k= 0;
			while(k!= 2 * i - 1) {
				System.out.print(let);
				k++;
			}
			
			//Nueva linea
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int num;
		char letra;
		
		//Petición de los valores
		//Carácter a representar
		System.out.println("De que letra quieres que esté hecha la pirámide?");
		letra= leer.next().charAt(0);
		
		//Tamaño de la pirámide
		System.out.println("De cuantas lineas quieres la pirámide?");
		num= leer.nextInt();
		
		//Salida por pantalla
		piramide(letra, num);
	}

}
