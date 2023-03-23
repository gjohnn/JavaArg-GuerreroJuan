package clase05;

import java.time.LocalDateTime;

public class Persona {
	private String nom;
	private String ape;
	private LocalDateTime fechaDeNacimiento;
	public Persona (String nom, String ape) {
		this.setNom(nom);
		this.setApe(ape);
	}
	public void SetAtributos (String nom, String ape) {
		this.setNom(nom);
		this.setApe(ape);
	}
	
	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
