import java.util.Scanner;

public class Funciones4 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		//Declaración de variables
		int num;
		
		//Petición del número
		System.out.println("Qué numero desea introducir?");
		num= leer.nextInt();
		
		//Salida por pantalla
		System.out.println(dimeSigno(num));
	}
	
	public static int dimeSigno(int num) {
		
		//Declaración de variables
		int sign;
		sign= 0;
		
		//Asignación del signo
		if(num < 0) {
			sign= -1;
		}
		if(num == 0) {
			sign= 0;
		}
		if(num > 0) {
			sign= 1;
		}
		
		return sign;
	}

}
