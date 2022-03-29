package aplicacion;

import java.util.*;
import static aplicacion.Utils.*;

public class DescargApp {

	public static void main(String[] args) {

		Pelicula pelicula1 = new Pelicula("01", "Terminator");
		Pelicula pelicula2 = new Pelicula("02", "Terminator 2");
		Libro libro1 = new Libro("ABCDE-12345", "Game of Thrones");

		Fichero fichero1 = new Fichero(800, pelicula1);
		Fichero fichero2 = new Fichero(2000, pelicula2);
		Fichero fichero3 = new Fichero(30, libro1);

		Collection<Fichero> listaDescarga = new ArrayList<>();
		listaDescarga.add(fichero1);
		listaDescarga.add(fichero2);
		listaDescarga.add(fichero3);
		List<Fichero> listaFicheros = (List<Fichero>)listaDescarga;

		Conexion conexion = new Conexion(2);

		System.out.println(informeDescargas(listaFicheros, conexion));

		// Prueba para probar que nos devuelve los ids de los ficheros
//		for (Fichero fichero : listaDescarga) {
//			System.out.println(extraerId(fichero.getContenido()));
//		}

	}

}
