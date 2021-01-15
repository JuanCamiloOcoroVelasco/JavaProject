package Ejercicio2;

public class PersonaMain {

	public static void main(String[] args) {
		
		//Creación de los 2 objetos persona
		Persona persona1= new Persona();
		Persona persona2= new Persona();
		
		//Datos de la persona 1
		persona1.nombre= "Carlos";
		persona1.apellidos= "Sánchez Granados";
		persona1.dni= "12345678X";
		persona1.edad= 24;
		
		//Datos de la persona 2
		persona2.nombre= "María";
		persona2.apellidos= "Serrano Gozalbo";
		persona2.dni= "87654321Y";
		persona2.edad= 16;
		
		//Salida por pantalla
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + " es mayor de edad");
		System.out.println();
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + " no es mayor de edad");
	}

}
