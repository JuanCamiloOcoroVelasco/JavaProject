import java.util.Scanner;

public class Funciones7 {
	
	//Función del perimetro
	public static double perimetroRectangulo(double ancho, double alto) {
		
		//Declaración de variables
		double perimetro;
		
		//Calculo del perimetro
		perimetro= (alto * 2) + (ancho * 2);
		
		return perimetro;
	}
	
	//Función del área
	public static double areaRectangulo(double ancho, double alto) {
		
		//Declaración de variables
		double area;
		
		//Calculo del area
		area= alto * ancho;
		
		return area;
	}

	//Función principal
	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		double alto, ancho;
		
		//Petición de los datos del rectángulo
		//Altura
		System.out.print("Dime la altura del rectángulo(en cm): ");
		alto= leer.nextDouble();
		
		//Hueco de por medio
		System.out.println(" ");
		
		//Ancho
		System.out.print("Ahora el ancho del rectámgulo(en cm): ");
		ancho= leer.nextDouble();
		
		//Salida por pantalla
		//Perimetro
		System.out.println("El perimetro del rectángulo es " + perimetroRectangulo(alto, ancho) + "cm");
		
		//Hueco de por medio
		System.out.println(" ");
		
		//Area
		System.out.println("Y el área del rectángulo es " + areaRectangulo(alto, ancho) + "cm2");
	}

}
