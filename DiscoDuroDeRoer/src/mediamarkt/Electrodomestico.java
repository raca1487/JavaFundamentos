package mediamarkt;

public class Electrodomestico {

	private final static double PRECIOBASE_DEF = 100;;
	private final static String COLOR_DEF = "Blanco";
	private final static char CONSUMOENERGETICO_DEF = 'F';
	private final static double PESO_DEF = 5;

	private double precio;
	private String color;
	private char consumoEnergetico;
	private double peso;

	String[] colores = { "Blanco", "Rojo", "Negro", "Azul", "Gris" };

	public double getPrecio() {
		return precio;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public Electrodomestico() {
		this.precio = PRECIOBASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = PESO_DEF;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		if (letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F') {
			this.consumoEnergetico = CONSUMOENERGETICO_DEF;
		}
	}

	private void comprobarColor(String color) {
		for (int i = 0; i < colores.length; i++) {
			if (color.equalsIgnoreCase(colores[i])) {
				this.color = color;
			} else {
				this.color = COLOR_DEF;
			}
		}
	}

	public double precioFinal() {
		switch (consumoEnergetico) {
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		}
		if (peso <= 19) {
			precio += 10;
		} else if (peso <= 49) {
			precio += 50;
		} else if (peso <= 79) {
			precio += 80;
		} else {
			precio += 100;
		}
		return precio;
	}
}
