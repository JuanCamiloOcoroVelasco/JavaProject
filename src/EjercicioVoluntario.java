import java.util.Scanner;

public class EjercicioVoluntario {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		//Introducción de variables
        int num, fib1, fib2;
        fib1= 1;
        fib2= 1;
        
        //Petición del número
        do {
        System.out.print("Introduce un numero mayor que 1: ");
        num = leer.nextInt();
        System.out.println(" ");
        if(num <= 1) {
        	System.out.println("El número introducido no sirve");
        	System.out.println(" ");
        }
        } while(num <= 1);
        
        //Salida por pantalla
        System.out.println("Los " + num + " primeros términos de la serie de Fibonacci son:");                 

        System.out.print(fib1 + " ");
        for(int i = 2; i <= num; i++) {
            System.out.print(fib2 + " ");
            fib2= fib1 + fib2;
            fib1= fib2 - fib1;
        }
	}

}
