
public class Matrices2 {
	
	public static void main(String[] args) {
		
		//Declaración de variables
		int matriz[][], num, prod, vector[];
		num= 1;
		prod= 1;
		matriz= new int[10][10];
		vector= new int[matriz.length];
		
		//Numeros del 1 al 10 en un vector
		for(int i = 0; i < vector.length; i++) {
			vector[i]= num;
			num++;
		}
		
		//Almacenamiento de los números
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= vector[j]*prod;
				num++;
			}
			prod++;
		}
		
		//Salida por pantalla
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
