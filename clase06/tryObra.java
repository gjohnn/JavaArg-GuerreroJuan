package clase06;

public class tryObra {

	public static void main(String[] args) {
		//Clase cuadro
		Cuadro cuadro1 = new Cuadro ("La Mona Lisa", "Da Vinci", 400, 500);
		System.out.println(cuadro1.getAtri());
		//Clase libro
		Libro libro1 = new Libro ("The Lord of The Rings", "JR.Tolkien", 12);
		System.out.println(libro1.getAtri());
		//Clase Articulo
		Articulo art1 = new Articulo("titulo del art", "nom del autor");
		System.out.println(art1.getAtri());
	}

}
