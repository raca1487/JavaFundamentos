package es.lanyu.forum;

import java.time.Instant;

public class Comentario implements Comparable<Comentario>, Datable, Nombrable {

	private String texto;
	private Usuario usuario;
	private Tema tema;
	private Instant fecha;
	private int tamanoCadena = 20;

	public String getTexto() {
		return texto;
	}

	@Override
	public Usuario getUsuario() {
		return usuario;
	}

	public Tema getTema() {
		return tema;
	}

	@Override
	public Instant getFecha() {
		return fecha;
	}

	public Comentario(Usuario usuario, String texto, Tema tema, Instant fecha) {
		this.usuario = usuario;
		this.texto = texto;
		this.tema = tema;
		this.fecha = fecha;
	}

	public Comentario() {
		this(null, "Sin comentarios", null, null);
	}

	public String textoRecortado(String texto, int tamanoCadena) {
		String textoRecortado = texto;
		if (textoRecortado.length() > tamanoCadena) {
			textoRecortado = texto.substring(0, tamanoCadena) + "...";
		}
		return textoRecortado;
	}

	@Override
	public int compareTo(Comentario comentario) {
		return comentario.getFecha().compareTo(getFecha());
	}
	
	@Override
	public String toString() {
		return getUsuario().toString() + ": " + textoRecortado(getTexto(), tamanoCadena) + " en " + getTema().toString()
				+ " a las " + getFecha();
	}

}
