package Constructores3;

public class RectanguloMain {

	public static void main(String[] args) {
		
		//Creación del objeto
		Rectangulo r= new Rectangulo(5, 7, 1, 2);
		
		System.out.println("El rectangulo instanciado tiene las siguientes coordenadas");
		
		System.out.println("(" + r.x1 + "," + r.y1 + ") y (" + r.x2 + "," + r.y2 + ")");
	}

}
