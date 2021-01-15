import java.util.Scanner;

public class Funciones10 {
	
	//Función para saber si la fecha es correcta
	public static boolean fecha(int dia, int mes) {
		
		//Declaración de variables
		boolean fecha;
		fecha= false;
		
		//Comprovación de la fecha
		if(mes > 0 && mes <= 12) {
			if(dia > 0 && dia <= 30) {
				fecha= true;
			}
		}
		return fecha;
	}

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int dia, mes, año;
		
		//Petición de la fecha
		//Día
		System.out.print("Dime el día: ");
		dia= leer.nextInt();
		
		//Mes
		System.out.print("Dime el mes: ");
		mes= leer.nextInt();
		
		//Año
		System.out.print("Dime el año: ");
		año= leer.nextInt();
		
		//Salida por pantalla
		if(fecha(dia, mes) == true) {
			System.out.println("La fecha existe");
		}
		else {
			System.out.println("La fecha NO existe");
		}
	}

}
