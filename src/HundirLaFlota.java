
public class HundirLaFlota {
	

	//Función principal
	public static void main(String[] args) {
		
		//DECLARACIÓN DE VARIABLES
		/* Cada letra representa un elemento del juego:
		 * L es Lancha, B es Buque, Z es Acorazado,
		 * P es Portaaviones, A es Agua y para la posición
		 * tocada o hundida se utilizará la X.
		 * Para la posición que todavía no ha sido disparada
		 * se utilizará el símbolo -
		 */
		char L, B, Z, P, A, X;
		int cont;
		String matriz[][], contLetras[];
		matriz= new String[10][10];
		cont= 0;
		contLetras= new String[10];
		
		//Almacenamiento de las letras para las filas del tablero
		contLetras[0]= "A";
		contLetras[1]= "B";
		contLetras[2]= "C";
		contLetras[3]= "D";
		contLetras[4]= "E";
		contLetras[5]= "F";
		contLetras[6]= "G";
		contLetras[7]= "H";
		contLetras[8]= "I";
		contLetras[9]= "J";
		
		//Almacenamiento del tablero
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]= "-";
			}
		}
		
		
		//Salida del tablero
		System.out.print("  ");
		for(int i = 0; i < 10; i++) {
			System.out.print(cont + " ");
			cont++;
		}
		System.out.println(" ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(contLetras[i] + " ");
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
