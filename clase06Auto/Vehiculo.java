package clase06Auto;

public class Vehiculo {
	private String color;
	private int velMax;
	public void getInfo() {
		System.out.println("Color: " + color + " | " +"Velocidad máx: "+velMax);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	
}
