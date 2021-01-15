package Ejercicio3;

public class RectanguloMain {

	public static void main(String[] args) {
		
		//Creación de los 2 objetos rectangulo
		Rectangulo r1= new Rectangulo();
		Rectangulo r2= new Rectangulo();
		
		//Declaración de las posiciones del rectangulo 1
		r1.x1= 0;
		r1.y1= 0;
		r1.x2= 5;
		r1.y2= 5;
		
		//Posiciones del rectangulo 2
		r2.x1= 7;
		r2.y1= 9;
		r2.x2= 2;
		r2.y2= 3;
		
		//Salida por pantalla
		//Rectangulo 1 y sus datos
		System.out.println("Coordenadas del primer rectangulo: (" + r1.x1 + "," + r1.y1 + ") y (" + r1.x2 + "," + r1.y2 + ")");
		//Perímetro
		System.out.println("El perímetro es: " + ((r1.x2 - r1.x1) + (r1.y2 - r1.y1) * 2));
		//Área
		System.out.println("El área es: " + (r1.x2 - r1.x1) * (r1.y2 - r1.y1));
		
		System.out.println();
		
		//Rectangulo 2 y sus datos
		System.out.println("Coordenadas del primer rectangulo: (" + r2.x1 + "," + r2.y1 + ") y (" + r2.x2 + "," + r2.y2 + ")");
		//Perímetro
		System.out.println("El perímetro es: " + ((r2.x1 - r2.x2) + (r2.y1 - r2.y2) * 2));
		//Área
		System.out.println("El área es: " + (r2.x1 - r2.x2) * (r2.y1 - r2.y2));
	}

}
