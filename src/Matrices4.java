import java.util.Scanner;


public class Matrices4 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int notas[][], max1, min1, max2, min2, max3, min3, max4, min4,  media1, media2, media3, media4, nota;
		int suma1, suma2, suma3, suma4;
		notas= new int[5][4];
		suma1= 0;
		suma2= 0;
		suma3= 0;
		suma4= 0;
		
		//Almacenamiento de las notas
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.println("Introduce la nota.");
				nota= leer.nextInt();
				notas[i][j]= nota;
			}
		}
		//Máximos y mínimos
		max1= notas[0][0];
		min1= notas[0][0];
		max2= notas[1][0];
		min2= notas[0][0];
		max3= notas[2][0];
		min3= notas[0][0];
		max4= notas[3][0];
		min4= notas[0][0];
		//Max y min Alumno 1
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j == 0; j++) {
				if(notas[i][j] > max1) {
					max1= notas[i][j];
				}
				if(notas[i][j] < min1) {
					min1= notas[i][j];
				}
			}
		}
		
		//Max y min Alumno 2
		for(int i = 0; i < notas.length; i++) {
			for(int j = 1; j == 1; j++) {
				if(notas[i][j] > max2) {
					max2= notas[i][j];
				}
				if(notas[i][j] < min2) {
					min2= notas[i][j];
				}
			}
		}
				
		//Max y min Alumno 3
		for(int i = 0; i < notas.length; i++) {
			for(int j = 2; j == 2; j++) {
				if(notas[i][j] > max3) {
					max3= notas[i][j];
				}
				if(notas[i][j] < min3) {
					min3= notas[i][j];
				}
			}
		}
		
		//Max y min Alumno 4
		for(int i = 0; i < notas.length; i++) {
			for(int j = 3; j == 3; j++) {
				if(notas[i][j] > max4) {
					max4= notas[i][j];
				}
				if(notas[i][j] < min4) {
					min4= notas[i][j];
				}
			}
		}
		
		//Media Alumno 1
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j == 0; j++) {
				suma1+= notas[i][j];
			}
		}
		media1= suma1 / notas.length;
		
		//Media Alumno 2
		for(int i = 0; i < notas.length; i++) {
			for(int j = 1; j == 1; j++) {
				suma2+= notas[i][j];
			}
		}
		media2= suma2 / notas.length;
		
		//Media Alumno 3
		for(int i = 0; i < notas.length; i++) {
			for(int j = 2; j == 2; j++) {
				suma3+= notas[i][j];
			}
		}
		media3= suma3 / notas.length;
		
		//Media Alumno 4
		for(int i = 0; i < notas.length; i++) {
			for(int j = 3; j == 3; j++) {
				suma4+= notas[i][j];
			}
		}
		media4= suma4 / notas.length;
		
		//Salida por pantalla
		System.out.println("Alumno1        Alumno2         Alumno3         Alumno4");
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print("  " + notas[i][j] + "             ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println("Nota máxima, mínima y media del Alumno 1");
		System.out.println("Máxima= " + max1);
		System.out.println("Mínima= " + min1);
		System.out.println("Media= " + media1);
		
		System.out.println(" ");
		System.out.println("Nota máxima, mínima y media del Alumno 2");
		System.out.println("Máxima= " + max2);
		System.out.println("Mínima= " + min2);
		System.out.println("Media= " + media2);
		
		System.out.println(" ");
		System.out.println("Nota máxima, mínima y media del Alumno 3");
		System.out.println("Máxima= " + max3);
		System.out.println("Mínima= " + min3);
		System.out.println("Media= " + media3);
		
		System.out.println(" ");
		System.out.println("Nota máxima, mínima y media del Alumno 4");
		System.out.println("Máxima= " + max4);
		System.out.println("Mínima= " + min4);
		System.out.println("Media= " + media4);
	}

}
