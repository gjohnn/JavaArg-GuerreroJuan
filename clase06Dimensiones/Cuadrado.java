package clase06Dimensiones;

public class Cuadrado extends Dosdim{
	protected String clasificacion;
	public double calcularArea() {
		return this.base*this.alto;
	}
	public void showArea() {
		System.out.println("El área es: "+this.calcularArea());
	}

}
