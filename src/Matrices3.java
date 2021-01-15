import java.util.Scanner;

public class Matrices3 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int matriz[][], N, M, num;
		
		//Petición del tamaño de la matriz
		System.out.println("Cuántas filas quieres?");
		N= leer.nextInt();
		
		System.out.println("Cuántas columnas quieres?");
		M= leer.nextInt();
		
		matriz= new int[N][M];
		
		//Almacenamiento de los números en la matriz
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.println("Introduce un número.");
				num= leer.nextInt();
				matriz[i][j]= num;
			}
		}
		
		//Salida por pantalla
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
