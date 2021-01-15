
public class Funciones15 {
	
	//Función del cálculo de la suma
	public static int suma(int sum) {
		
		//Declaración de variables
		int naturales[], num, Suma;
		naturales= new int[100];
		num= 1;
		Suma= 0;
		
		//Almacenamiento de los números
		for(int i = 0; i < naturales.length; i++) {
			naturales[i]= num;
			num++;
		}
		
		//Sumatorio
		for(int i = 0; i < naturales.length; i++) {
			Suma+= naturales[i];
		}
		
		return Suma;
	}
	
	//Función del cálculo de la media
	public static double media(double media) {
		
		//Introducción variables
		int naturales[], num, Suma;
		double med;
		naturales= new int[100];
		num= 1;
		Suma= 0;
		
		//Almacenamiento de los números
		for(int i = 0; i < naturales.length; i++) {
			naturales[i]= num;
			num++;
		}
		//Cálculo de la media
		//Sumatorio
		for(int i = 0; i < naturales.length; i++) {
			Suma+= naturales[i];
		}
		
		//Media
		med= Suma / naturales.length;
		
		return med;
	}

	//Función principal
	public static void main(String[] args) {
		
		//Introducción de variables
		int sum, media;
		sum= 0;
		media= 0;
		
		//Salida por pantalla
		//Suma
		System.out.println("La suma de los 100 primeros números naturales es: " + suma(sum));
		
		//Media
		System.out.println("La media de los 100 primeros números naturales es: " + media(media));
	}

}
