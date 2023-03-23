package clase06;

public class Libro extends Obra {
	
	private int nPag;
	
	public Libro(String titulo, String autor, int nPag) {
		super(titulo,autor);
		this.nPag = nPag;
	}

	public int getnPag() {
		return nPag;
	}

	public void setnPag(int nPag) {
		this.nPag = nPag;
	}
	
}
