import java.util.Scanner;

public class AmpliaciónMatrices {
	
	//Función de rellenar la matriz
	public static void rellenarMatriz(Scanner leer, int[][] matriz) {
		
		//Almacenamiento de los números
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.println("Dime un número");
				matriz[i][j]= leer.nextInt();
			}
		}
	}
	
	//Función para sumar una fila
	public static int sumaFila(int[][] matriz, int fila) {
		
		//Declaración de variables
		int suma;
		suma= 0;
		
		//Sumatorio
		for(int i = 0; i < matriz.length; i++) {
			suma+= matriz[fila][i];
		}
		
		return suma;
	}
	
	//Función para la suma de una columna
	public static int sumaColumna(int[][] matriz, int columna) {
		
		//Declaración de variables
		int suma;
		suma= 0;
		
		//Sumatorio
		for(int i = 0; i < matriz.length; i++) {
			suma+= matriz[i][columna];
		}
		
		return suma;
	}
	
	//Función para la suma de la diagonal principal
	public static int sumaDiagPrinc(int[][] matriz) {
		
		//Declaración de variables
		int suma;
		suma= 0;
		
		//Sumatorio
		for(int i = 0, j = 0; i < matriz.length; i++, j++) {
			suma+= matriz[i][j];
		}
		
		return suma;
	}
	
	//Función de la suma de la diagonal inversa
	public static int sumaDiagInv(int[][] matriz) {
		
		//Declaración de variables
		int suma;
		suma= 0;
		
		//Sumatorio
		for(int i = 0, j = 3; i < matriz.length; i++, j++) {
			suma+= matriz[i][j];
		}
		
		return suma;
	}
	
	//Función para el cálculo de la media
	public static double media(int[][] matriz) {
		
		//Declaración de variables
		double media;
		int suma;
		suma= 0;
		
		//Cálculo de la suma total
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				suma+= matriz[i][j];
			}
		}
		
		//Cálculo de la media
		media= suma / (matriz.length * matriz.length);
		
		return media;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int matriz[][], fila, columna, opcion;
		boolean salir, rellenar;
		matriz= new int[4][4];
		salir= false;
		rellenar= false;
		
		//Menú principal
		do {
			System.out.println("==========Matrices=========");
			System.out.println("=   1.Rellenar matriz     =");
			System.out.println("=   2.Suma de una fila    =");
			System.out.println("=   3.Suma de una columna =");
			System.out.println("=   4.Suma diag. princ.   =");
			System.out.println("=   5.Suma diag. inv.     =");
			System.out.println("=   6.Media de valores    =");
			System.out.println("=   7.Salir               =");
			System.out.println("===========================");
			System.out.println("Seleccione una opción");
			opcion= leer.nextInt();
		
			switch (opcion) {
				case 1:

					rellenarMatriz(leer, matriz);

					//Ahora se puede elegir las demás opciones
					rellenar = true;

				break;
				case 2:

					if (rellenar == true) {

						//Validamos la fila
						do {
							System.out.println("Elige una fila");
							fila = leer.nextInt();

						} while (!(fila >= 0 && fila < matriz.length));

						System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));

					} 
					else {
						System.out.println("Primero debes rellenar la matriz");
					}

					break;
				case 3:

					if (rellenar == true) {

						//Validamos la colunma
					do {

						System.out.println("Elige una columna");
						columna = leer.nextInt();

					} while (!(columna >= 0 && columna < matriz.length));

					System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna(matriz, columna));

					} 
					else {
						System.out.println("Primero debes rellenar la matriz");
					}

					break;
				case 4:

					if (rellenar == true) {

						System.out.println("La suma de la diagonal principal es: " + sumaDiagPrinc(matriz));

					} 
					else {
						System.out.println("Primero debes rellenar la matriz");
					}

					break;
				case 5:

					if (rellenar == true) {

						System.out.println("La suma de la diagonal inversa es: " + sumaDiagInv(matriz));

					} 
					else {
						System.out.println("Primer debes rellenar la matriz");
					}

					break;
				case 6:

					if (rellenar == true) {

						System.out.println("La media de los valores de la matriz es: " + media(matriz));

					} 
					else {
						System.out.println("Primero debes rellenar la matriz");
					}

					break;
				case 7:
					salir = true;
					break;
				default:
					System.out.println("Tienes que meter un número entre 1 y 7");

			}

		} while (salir != true);

		System.out.println("Hasta la próxima!");

	}
}
