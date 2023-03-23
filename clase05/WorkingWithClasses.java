
package clase05;

public class WorkingWithClasses {
	public static void main (String[] args) {
		//Producto
		
		Producto harina = new Producto("Harina","Sin levadura",5,500.0);
		Producto fideos = new Producto("Fideos","Sin levadura",2,480.0);
		Producto tomate = new Producto("Tomate","Sin levadura",1,700.0);
		System.out.println(harina.getNom());
		System.out.println(fideos.getNom());
		System.out.println(tomate.getNom());
		
		//Persona
		
		Persona juan = new Persona ("Juan", "Guerrero");
		System.out.println(juan.getNom());
		
		Carrito unCart = new Carrito(juan,harina,fideos,tomate);
		System.out.println("Costo final: "+ unCart.costoF()+" Comprador: "+ juan.getNom());
	}
}
