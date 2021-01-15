import java.util.Scanner;

public class Funciones21 {
	
	
	//Función del menú
	public static int menu (int n){
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int num;
		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("3. Volumen");
		System.out.println("4. Todo");
		System.out.println("5. Salir");
		System.out.println("Seleccione una opción");
		num= leer.nextInt();
		if(num < 1 || num > 5) {
			do {
				System.out.println("Número introducido no válido");
				num= leer.nextInt();
			} while(num < 1 || num > 5);
		}
		
		return num;
	}
	
	//Función de petición del radio
	public static double radio(int n) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		double radio;
		
		//Petición del radio
		System.out.println("Introduce el radio");
		radio= leer.nextDouble();
		
		return radio;
	}
	
	//Función para calcular el perímetro
	public static double perimetro(double r) {
		
		//Introducción de variables
		double pi, per;
		pi= 3.141592653;
		
		//Cálculo del perímetro
		per= 2 * pi * r;
		
		return per;
	}
	
	//Función para calcular el área
	public static double area(double r) {
		
		//Declaración de variables
		double pi, area;
		pi= 3.141592653;
		
		//Cálculo del área
		area= pi * (r*r);
		
		return area;
	}
	
	//Función para calcular el volumen
	public static double volumen(double r) {
		
		//Declaración de variables
		double volumen, pi;
		pi= 3.141592653;
		
		//Cálculo del volumen
		volumen= (4/3) * pi * (r*r*r);
		
		return volumen;
	}

	//Función principal
	public static void main(String[] args) {
		
		//Salida por pantalla
		do {
			menu(0);
			if(menu(0) == 1) {
				radio(0);
				System.out.println("El perímetro de la circumferéncia introducida es " + perimetro(radio(0)));
			}
			if(menu(0) == 2) {
				radio(0);
				System.out.println("El área de la circumferéncia introducida es " + area(radio(0)));
			}
			if(menu(0) == 3) {
				radio(0);
				System.out.println("El volumen de la esfera introducida es " + volumen(radio(0)));
			}
			if(menu(0) == 4) {
				radio(0);
				System.out.println("El perímetro de la circumferéncia introducida es " + perimetro(radio(0)));
				System.out.println("El área de la circumferéncia introducida es " + area(radio(0)));
				System.out.println("El volumen de la esfera introducida es " + volumen(radio(0)));
			}
			if(menu(0) == 4) {
				System.out.println("Hasta luego! ;)");
				System.exit(0);
			}
		} while(menu(0) != 5);
		
	}

}
