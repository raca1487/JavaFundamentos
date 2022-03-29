package multimedia;

public class Serie implements Entregable {
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getCreador() {
		return creador;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public Serie() {
		this.titulo = "null";
		this.numeroDeTemporadas = 3;
		this.entregado = false;
		this.genero = "null";
		this.creador = "null";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	@Override
	public String toString() {
		return "Serie: " + getTitulo() + System.lineSeparator() + "Numero de temporadas: " + getNumeroDeTemporadas() + System.lineSeparator()
			+ "Genero: " + getGenero() + System.lineSeparator() + "Creador: " + getCreador();
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
