import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class FuncionVector {
	
	//Instrucciones
	public static void Instrucciones() {
		//Aquí van las instrucciones
		System.out.println("Hola que tal, soy colosal");
	}
	
	//Función que pide un número por teclado (se va a utilizar 2 veces)
	public static int numerosAleatorios() {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int num1;
		
		//Petición de los números
		System.out.println("Dime un número");
		num1= leer.nextInt();
		
		return num1;
	}
	
	//Función que crea un vector con 20 números aleatorios entre los dos números introducidos
	public static int[] vectorAleatorio(int n, int m){
		//Declaración de variables
		int vectorAleatorio[], cont;
		vectorAleatorio= new int[20];
		cont= 1;
		
		//Almacenamiento de los números
		for(int i = 0; i < vectorAleatorio.length; i++) {
			vectorAleatorio[i]= (int)(Math.random()*(m - n + 1) + n);
		}
		
		//Salida por pantalla
		for(int i = 0; i < vectorAleatorio.length; i++) {
			System.out.println("Número " + cont + "= " + vectorAleatorio[i]);
			cont++;
		}
		
		return vectorAleatorio;
	}
	
	//Función que crea un vector con 20 números los cuales son la suma de todos los números entre dos aleatorios
	public static int[] vectorSumaAleatorio(int n) {
		
		//Declaración de variables
		int vectorSuma[], cont, suma, x;
		vectorSuma= new int[20];
		cont= 1;
		suma= 0;
		x= n;
		
		//Almacenamiento de los números
		for(int i = 0; i < vectorSuma.length; i++) {
			suma+= x;
			vectorSuma[i]= suma;
		}
		
		//Salida por pantalla
		for(int i = 00; i < vectorSuma.length; i++) {
			System.out.println("Número " + cont + "= " + vectorSuma[i]);
			cont++;
		}
		
		return vectorSuma;
	}
	
	//Funcion del productorio de 2 números aleatorios
	public static int[] vectorProductoAleatorio(int n) {
		
		//Introducción de variables
		int vectorProd[], x, prod, cont;
		cont= 1;
		prod= 1;
		vectorProd= new int[20];
		x= n;
		
		//Almacenamiento de los números
		for(int i = 0; i < vectorProd.length; i++) {
			prod*= x;
			vectorProd[i]= prod;
		}
		
		//Salida por pantalla
		for(int i = 0; i < vectorProd.length; i++) {
			System.out.println("Número " + cont + "= " + vectorProd[i]);
			cont++;
		}
		
		return vectorProd;
	}
	
	//Función del vector combinado
	public static int[] vectorCombinado(int[] vector1, int[] vector2, int[] vector3) {
		
		//Introducción de variables
		int vectorComb[], j, k, cont;
		vectorComb= new int [60];
		j= 0;
		k= 0;
		cont= 1;
		
		//Almacenamiento de los números
		for(int i = 0 ; i < 20; i++) {
			vectorComb[i]= vector1[i];
		}
		
		for(int i = 20; i < 40; i++) {
			vectorComb[i]= vector2[j];
			j++;
		}
		
		for(int i = 40; i < 60; i++) {
			vectorComb[i]= vector3[k];
			k++;
		}
		
		//Salida por pantalla
		for(int i = 0; i < vectorComb.length; i++) {
			System.out.println("Número " + cont + "= " + vectorComb[i]);
			cont++;
		}
		
		return vectorComb;
	}
	
	//Función que ordena el vector combinado de forma ascendente
	public static void ordenaVector(int[] vector) {
		
		//Ordenar el vector
		Arrays.parallelSort(vector);
		
		//Salida por pantalla
		System.out.println(Arrays.toString(vector));
	}
	
	//Función que busca el número máximo del vector combinado
	public static int buscaMaximo(int vector[]) {
		
		//Declaración de variables
		int max;
		max= 0;
		
		//Busqueda del máximo
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] > max) {
				max= vector[i];
			}
		}
		
		return max;
	}
	
	//Función que busca el número mínimo del vector combinado
	public static int buscaMinimo(int[] vector) {
		
		//Declaración de variables
		int min;
		min= 9999999;
		
		//Busqueda del mínimo
		for(int i = 0; i < vector.length; i ++) {
			if(vector[i] < min) {
				min= vector[i];
			}
		}
		
		return min;
	}
	
	//Función que busca los números primos del vector combinado
	public static void buscaPrimos(int[] vector) {
		
		//Declaración de variables
		int cont;
		cont= 0;
		
		//Busqueda de los primos
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] % 2 != 0) {
				if(vector[i] % 3 != 0) {
					cont++;
					System.out.println("El número " + vector[i] + " es primo");
				}
			}
		}
		System.out.println("Hay un total de " + cont + " números primos");
	}
	
	//Función principal
	public static void main(String[] args) {
		
		//Introducción de variables
		int num1, num2;
		
		//Salida de las instrucciones
		Instrucciones();
		
		//Petición de los dos números
		num1= numerosAleatorios();
		num2= numerosAleatorios();
		
		System.out.println(" ");
		
		//Salida de los 20 números aleatorios entre los dos anteriores
		System.out.println("20 números aleatorios entre los 2 introducidos");
		vectorAleatorio(num1, num2);
		System.out.println(" ");
		
		//Salida de los 20 números que son la suma de los que hay entre los dos aleatorios
		System.out.println("Sumatorio del primer número hasta 20 elementos");
		vectorSumaAleatorio(num1);
		System.out.println(" ");
		
		//Salida de los 20 números que son el producto de los que hay entre los dos aleatorios
		System.out.println("Productorio del primer número hasta 20 elementos");
		vectorProductoAleatorio(num1);
		System.out.println(" ");
		
		//Salida del vector combinado
		System.out.println("Vector que almacena los 3 vectores anteriores");
		vectorCombinado(vectorAleatorio(num1, num2), vectorSumaAleatorio(num1), vectorProductoAleatorio(num1));
		System.out.println(" ");
		
		//Salida del vector combinado ordenado de forma ascendente(de mayor a menor)
		System.out.println("Vector combinado ordenado de forma ascendente");
		ordenaVector(vectorCombinado(vectorAleatorio(num1, num2), vectorSumaAleatorio(num1), vectorProductoAleatorio(num1)));
		System.out.println(" ");
		
		//Salida del número mayor de todo el vector
		System.out.println("El número máximo de todo el vector es:");
		buscaMaximo(vectorCombinado(vectorAleatorio(num1, num2), vectorSumaAleatorio(num1), vectorProductoAleatorio(num1)));
		System.out.println(" ");
		
		//Salida del número mínimo de todo el vector
		System.out.println("El número mínimo de todo el vector es:");
		buscaMinimo(vectorCombinado(vectorAleatorio(num1, num2), vectorSumaAleatorio(num1), vectorProductoAleatorio(num1)));
		System.out.println(" ");
		
		//Salida de los números primos del vector
		System.out.println("Los números primos del vector son:");
		buscaPrimos(vectorCombinado(vectorAleatorio(num1, num2), vectorSumaAleatorio(num1), vectorProductoAleatorio(num1)));
		
	}

}
