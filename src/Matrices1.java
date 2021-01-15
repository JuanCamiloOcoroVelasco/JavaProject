
public class Matrices1 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int numeros[][], num;
		numeros= new int[5][5];
		num= 1;
		
		//Almacenamiento de los números
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				numeros[i][j]= num;
				num++;
			}
		}
		
		//Salida por pantalla
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
