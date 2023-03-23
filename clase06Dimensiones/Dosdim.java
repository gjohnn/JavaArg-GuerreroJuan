package clase06Dimensiones;

public class Dosdim {
	protected double alto;
	protected double base;
	static String dimension = "DosDim";
	public double calcularArea() {
		return this.base*this.alto;
	}
	public void showArea() {
		System.out.println("El área es: "+ this.calcularArea());
	}
}
