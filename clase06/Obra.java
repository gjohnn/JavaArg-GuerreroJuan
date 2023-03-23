package clase06;

public class Obra {
	
	private String titulo;
	private String autor;
	public Obra(String titulo, String autor) {
		this.setAutor(autor);
		this.setTitulo(titulo);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAtri() {
		return "El autor de " + titulo + " es " + autor;
	}

}
