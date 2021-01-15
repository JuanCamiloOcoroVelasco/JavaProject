package Constructores4;

public class ArticuloMain {

	public static void main(String[] args) {
		
		//Creación del objeto
		Articulo a= new Articulo("Coche", -3, 21, 30);
		
		System.out.println(a.nombre + " - Precio:" + a.precio + "€ - IVA:" + a.iva + "% - PVP:" + (a.precio + (a.iva/100)) + "€");
	}

}
