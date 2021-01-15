package Constructores2;

public class PersonaMain {

	public static void main(String[] args) {
		
		//Creación del objeto
		Persona p1= new Persona("12345678M", "Juan Camilo", "Ocoro Velasco", 19);
		
		//Salida por pantalla
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " y con " + p1.edad + " años de edad");
	}

}
