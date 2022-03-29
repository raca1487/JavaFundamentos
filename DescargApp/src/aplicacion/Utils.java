package aplicacion;

import java.util.*;

public class Utils {

	private static final Comparator<Fichero> COMPARADOR_ID = new Comparator<Fichero>() {
		
		@Override
		public int compare(Fichero f1, Fichero f2) {
			return f1.getContenido().getId().compareTo(f2.getContenido().getId());
		}
	};
	
	public static float cantidadMegas(Collection<Fichero> ficheros) {
		float acumulador = 0;
		for (Fichero fichero : ficheros) {
			acumulador += fichero.getTamano();
		}

		return acumulador;
	}

	public static float cantidadMegas(Fichero[] ficheros) {
		return cantidadMegas(Arrays.asList(ficheros));
	}

	public static String conversionTiempo(float segundosAConvertir) {
		int hora = (int)segundosAConvertir / 3600;
		int segundo = (int)segundosAConvertir % 3600;
		int minuto = segundo / 60;
		segundo = segundo % 60;
		String conversion = "";
		
		if (hora == 0) {
			conversion += "";
		} else {
			conversion += hora + " hora(s) ";
		}
		if (minuto == 0) {
			conversion += "";
		} else {
			conversion += minuto + " minutos ";
		}
		if (segundo == 0) {
			conversion += "";
		} else {
			conversion += segundo + " segundos ";
		}
		return conversion;
	}
	
	// Metodo que nos devuelve los ids de los ficheros
//	public static String extraerId(Identificable contenido) {
//		return contenido.getId();
//	}

	public static String informeDescargas(List<Fichero> listaDescarga, Conexion conexion) {
		String informe = "INFORME DE DESCARGA (ORDENADA POR ID)";
		listaDescarga.sort(COMPARADOR_ID);
		for (Fichero fichero : listaDescarga) {
			informe += System.lineSeparator() + fichero.toString();
		}
		float megasTotales = cantidadMegas(listaDescarga);
		informe += System.lineSeparator() + "Tamaño total: " + megasTotales + " MB";
		informe += System.lineSeparator() + "Tiempo de descarga: " + conversionTiempo(conexion.tiempoDescarga(megasTotales));
		
		return informe;
	}

}
