
public class Funciones20 {
	//Función para la tabla de multiplicar
	public static void tabla(int n) {
		
		//Declaración de variables
		int cont, num;
		cont= 1;
		do {
			num= n * cont;
			System.out.println(n + "x" + cont + "= " + num);
			cont++;
		} while(cont < 11);
	}

	//Función primcipal
	public static void main(String[] args) {
		
		//Tabla del 1
		System.out.println("Tabla del 1");
		tabla(1);
		System.out.println(" ");
		
		//Tabla del 2
		System.out.println("Tabla del 2");
		tabla(2);
		System.out.println(" ");
		
		//Tabla del 3
		System.out.println("Tabla del 3");
		tabla(3);
		System.out.println(" ");
				
		//Tabla del 4
		System.out.println("Tabla del 4");
		tabla(4);
		System.out.println(" ");
		
		//Tabla del 5
		System.out.println("Tabla del 5");
		tabla(5);
		System.out.println(" ");
		
		//Tabla del 6
		System.out.println("Tabla del 6");
		tabla(6);
		System.out.println(" ");
		
		//Tabla del 7
		System.out.println("Tabla del 7");
		tabla(7);
		System.out.println(" ");
		
		//Tabla del 8
		System.out.println("Tabla del 8");
		tabla(8);
		System.out.println(" ");
		
		//Tabla del 9
		System.out.println("Tabla del 9");
		tabla(9);
		System.out.println(" ");
		
		//Tabla del 10
		System.out.println("Tabla del 10");
		tabla(10);
	}

}
