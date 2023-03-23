package clase06Dimensiones;

public class Triangulo extends Dosdim {
	protected String clasif;
	public Triangulo(double alto, double base, String clasif) {
		super.base = base;
		super.alto = alto;
		this.clasif = clasif;
	}
	public double calcularArea() {
		return super.base * super.alto /2;
	}
	public void showArea() {
		System.out.println("El área es: "+this.calcularArea());
	}
}
