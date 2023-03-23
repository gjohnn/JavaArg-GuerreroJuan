package clase05;

public class Producto {
	
	private String nom;
	private String descrip;
	private Integer pesoKg;
	private Double precio;
	
	private static final Double minPrecio = 0.1;
	
	public Producto(String nom) {
		this.setNom(nom);
		this.setPrecio(minPrecio);
		this.setPesoKg(pesoKg);
		this.setDescrip(descrip);
	}
	public Producto(String nom, String descrip, Integer pesoKg, Double precio) {
		this.setNom(nom);
		this.setDescrip(descrip);
		this.setPesoKg(pesoKg);
		this.setPrecio(precio);
		
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPesoKg(Integer pesoKg) {
		this.pesoKg = pesoKg;
	}
	public Integer getPesoKG() {
		return pesoKg;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getDescrip() {
		return descrip;
	}
	
}
