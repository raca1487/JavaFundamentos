package multimedia;

public class Ejecutable {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie("Game of Thrones", 8, "Ficcion", "Starks");
		Serie serie2 = new Serie("Suits", 7, "Abogados", "Hervey");
		Serie serie3 = new Serie("Breaking Bad", 5, "Drogas", "Heisenberg");
		Serie serie4 = new Serie("La Casa de Papel", 5, "Robos", "El Profesor");
		Serie serie5 = new Serie("Los Hombres de Paco", 3, "Policias", "Paco");
		Videojuego vd1 = new Videojuego("F1 2021", 100, "Coches", "EA Sports");
		Videojuego vd2 = new Videojuego("Fifa 2021", 200, "Futbol", "EA Sports");
		Videojuego vd3 = new Videojuego("NBA 2K21", 200, "Basket", "2K");
		Videojuego vd4 = new Videojuego("Call of Duty", 150, "Belico", "Codemasters");
		Videojuego vd5 = new Videojuego("SimCity", 50, "Construccion", "Parametrics");
		
		Serie[] misSeries = { serie1, serie2, serie3, serie4, serie5 };
		Videojuego[] misVideojuegos = { vd1, vd2, vd3, vd4, vd5 };
		
		serie1.entregar();
		serie3.entregar();
		vd2.entregar();
		vd4.entregar();
		vd5.entregar();
		
		int contador = 0;
		for (int i = 0; i < misSeries.length; i++) {
			if (misSeries[i].entregar()) {
				contador++;
			}
		}
		System.out.println("Se han entregado " + contador + " series.");
		for (int i = 0; i < misVideojuegos.length; i++) {
			if (misVideojuegos[i].entregar() == true) {
				contador++;
			}
		}
//		System.out.println("Se han entregado " + contador + " series y videojuegos.");
		

		
	}

}
