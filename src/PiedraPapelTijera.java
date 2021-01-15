import java.util.Random;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		
		
		//Introducción de variables
		int jugador1, jugador2;
		//Piedra es 0, papel es 1 y tijeras es 2
		jugador1= (int)(Math.random()*3 + 0);
		jugador2= (int)(Math.random()*3 + 0);
		
		//Selección de los elementos del jugador 1
		if(jugador1 == 0) {
			System.out.println("El jugador 1 ha escogido piedra");
		}
		if(jugador1 == 1) {
			System.out.println("El jugador 1 ha escogido papel");
		}
		if(jugador1 == 2) {
			System.out.println("El jugador 1 ha escogido tijeras");
		}
		
		//Parar el programa 2 segundos
		try {
			Thread.sleep(2*1000);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		//Selección de los elementos del jugador 2
		if(jugador2 == 0) {
			System.out.println("El jugador 2 ha escogido piedra");
		}
		if(jugador2 == 1) {
			System.out.println("El jugador 2 ha escogido papel");
		}
		if(jugador2 == 2) {
			System.out.println("El jugador 2 ha escogido tijeras");
		}
		
		//Parar el programa 2 segundos
		try {
			Thread.sleep(2*1000);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		//Selección de ganador
		//Empate de piedra
		if(jugador1 == 0 && jugador2 == 0) {
			System.out.println("Empate!");
		}
		//Empate de papel
		if(jugador1 == 1 && jugador2 == 1) {
			System.out.println("Empate!");
		}
		//Empate de tijeras
		if(jugador1 == 2 && jugador2 == 2) {
			System.out.println("Empate!");
		}
		//No hay empate
		if(jugador1 == 0 && jugador2 == 1) {
			System.out.println("Gana el jugador 2");
		}
		if(jugador1 == 0 && jugador2 == 2) {
			System.out.println("Gana el jugador 1");
		}
		if(jugador1 == 1 && jugador2 == 0) {
			System.out.println("Gana el jugador 1");
		}
		if(jugador1 == 1 && jugador2 == 2) {
			System.out.println("Gana el jugador 2");
		}
		if(jugador1 == 2 && jugador2 == 0) {
			System.out.println("Gana el jugador 2");
		}
		if(jugador1 == 2 && jugador2 == 1) {
			System.out.println("Gana el jugador 1");
		}
	}

}
