package clase06;

public class Cuadro extends Obra {
	private int height;
	private int width;
	
	public Cuadro(String titulo, String autor ,int height, int width) {
		super(titulo,autor);
		this.setHeight(height);
		this.setWidth(width);
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getAtri() {
		return super.getAtri() + "\n El cuadro mide " + this.getHeight() +" x "+ this.getWidth();
	}
	

}
