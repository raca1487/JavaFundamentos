package multimedia;

public class Videojuego implements Entregable {
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compagnia;
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getCompagnia() {
		return compagnia;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}
	
	public Videojuego() {
		this.titulo = "null";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "null";
		this.compagnia = "null";
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compagnia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compagnia= compagnia;
	}
	
	@Override
	public String toString() {
		return "Videojuego: " + getTitulo() + System.lineSeparator() + "Numero de horas estimadas: " + getHorasEstimadas()
			+ System.lineSeparator() + "Genero: " + getGenero() + System.lineSeparator() + "Compañia: " + getCompagnia();
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public boolean entregar() {
		return entregado = true;
	}

	@Override
	public boolean devolver() {
		return entregado = false;
	}
}
