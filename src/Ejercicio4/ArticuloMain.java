package Ejercicio4;

public class ArticuloMain {

	public static void main(String[] args) {
		
		Articulo a1= new Articulo();
		
		//Declaración de los atributos
		a1.nombre= "Portatil";
		a1.precio= 15;
		a1.iva= 21;
		a1.cuantosQuedan= 700;
		
		//Salida por pantalla de los datos del producto
		System.out.println(a1.nombre + " - Precio:" + a1.precio + "€ - IVA:" + a1.iva + "% - PVP:" + (a1.precio + (a1.iva/100)) + "€");
		
		//Cambio del precio
		a1.precio= 12;
		
		System.out.println();
		
		//Salida por pantalla de los datos actualizados
		System.out.println(a1.nombre + " - Precio:" + a1.precio + "€ - IVA:" + a1.iva + "% - PVP:" + (a1.precio + (a1.iva/100)) + "€");
	}

}
