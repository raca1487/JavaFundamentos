package com.forum;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import es.lanyu.forum.Comentario;
import es.lanyu.forum.LikeDatado;
import es.lanyu.forum.Tema;
import es.lanyu.forum.Usuario;
import es.lanyu.forum.UsuarioExterno;
import es.lanyu.forum.UsuarioImpl;
import es.lanyu.forum.test.DatosPrueba;

import com.github.likes.Likes;

public class Application {

	private final static List<Comentario> COMENTARIOS = new ArrayList<Comentario>(DatosPrueba.COMENTARIOS);
	
	public static List<Comentario> getComentarios() {
		return COMENTARIOS;
	}
	
	public static void main(String[] args) {
		
		System.out.println("INICIO EJERCICIO");
		System.out.println("-------------");
		
		getComentarios().forEach(System.out::println);
		System.out.println("-------------");
		
		Usuario user3 = new UsuarioImpl("user3");
		Comentario comentario1 = getComentarios().get(0);
		Tema tema1 = comentario1.getTema();
		comentar(user3, 	tema1, "Comentario añadido");
		getComentarios().forEach(System.out::println);
		System.out.println("-------------");
		
		Usuario usuarioExterno = new UsuarioExterno("usuarioExterno");
		comentar(usuarioExterno, tema1, "Soy un usuario externo");
		getComentarios().forEach(System.out::println);
		System.out.println("-------------");
		
		System.out.println(">> Ordenando los comentarios por FECHA DESCENDENTE:");
		getComentarios().sort(null);
		getComentarios().forEach(System.out::println);
		System.out.println("-------------");
		
		Comentario comentario2 = getComentarios().get(1);
		Likes.recomendar(comentario1, user3.getNombre());
		Likes.recomendar(comentario2, user3.getNombre());
		Likes.recomendar(comentario2, usuarioExterno.getNombre());
		System.out.println("Recomendaciones (Likes):");
		System.out.println(textoRecomendacion(comentario1));
		System.out.println(textoRecomendacion(comentario2));
		System.out.println("-------------");
		
		Comparator<Comentario> comparador = new Comparator<Comentario>() {

			@Override
			public int compare(Comentario c1, Comentario c2) {
				int resultado = Integer.compare(Likes.getLikesFor(c2).length, Likes.getLikesFor(c1).length);
				if (resultado == 0) {
					resultado = c1.getFecha().compareTo(c2.getFecha());
				}
				return resultado;
			}
		};
		
		Comentario comentario3 = getComentarios().get(2);
		Usuario user1 = comentario1.getUsuario();
		Likes.recomendar(comentario3, user1.getNombre());
		Likes.recomendar(comentario3, usuarioExterno.getNombre());
		getComentarios().sort(comparador);
		System.out.println("Ordenado por recomendación (likes):");
		for (Comentario comentario : getComentarios()) {
			System.out.println(textoRecomendacion(comentario));
		}
		System.out.println("-------------");
		
		Likes.getLikes().add(new LikeDatado<Comentario>(comentario3, user3.getNombre()));
		System.out.println("Usando boundaries:");
		for (Comentario comentario : getComentarios()) {
			System.out.println(textoRecomendacion(comentario));
		}
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("FIN EJERCICIO");
		
	}
	
	public static boolean comentar(Usuario user, Tema tema, String texto) {
		Comentario comentario = new Comentario(user, texto, tema, Instant.now());
		boolean agregado = false;
		if (getComentarios().add(comentario)) {
			agregado = true;
			System.err.println("El comentario se añadió correctamente");
		} else {
			System.err.println("El comentario no se pudo añadir");
		}
		return agregado;
	}

	static Usuario mapStringToUsuario(Collection<Usuario> users, String username) {
		Usuario userBuscado = null;
		for (Usuario usuario : users) {
			if (usuario.getNombre().equals(username)) {
				userBuscado = usuario;
				break;
			}
		}
		return userBuscado;
	}
	
	private static <T extends Comentario> String textoRecomendacion(T contenido) {
		String texto = contenido.textoRecortado(contenido.getTexto(), 20);
		String likes = Likes.getLikesFor(contenido).length + "* ";
		String[] users = Likes.getLikesFor(contenido);
		
		return texto + " " + likes + Arrays.toString(users).toUpperCase();
	}
	
}
