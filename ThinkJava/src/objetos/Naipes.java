package objetos;

import java.util.Arrays;

public class Naipes {

	private int rango;
	private int palo;

	public static final String[] PALOS = { "Oros", "Bastos", "Copas", "Espadas" };
	public static final String[] RANGOS = { null, "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" };

	public int getRango() {
		return rango;
	}

	public int getPalo() {
		return palo;
	}

	public Naipes(int rango, int palo) {
		this.rango = rango;
		this.palo = palo;
	}

	public String toString() {
		return RANGOS[getRango()] + " de " + PALOS[getPalo()];
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(makeBaraja()));
		System.out.println();
		Naipes miBaraja = new Naipes(8, 0); 
		System.out.println(miBaraja);
		System.out.println();
		manoPalo(new Naipes[5]);
		
	}

	public static Naipes[] makeBaraja() {
		Naipes[] baraja = new Naipes[40];

//		if (baraja[0] == null) {
//			System.out.println("Aún no se ha cogido carta");
//		}

		int indice = 0;
		for (int palo = 0; palo <= 3; palo++) {
			for (int rango = 1; rango <= 10; rango++) {
				baraja[indice] = new Naipes(rango, palo);
				indice++;
			}
		}
		return baraja;
	}

	public static int[] manoPalo(Naipes[] cartas) {
		int mano = 4;
		int[] result = new int[mano];
		for (Naipes carta : cartas) {
			result[carta.getPalo()] += 1;
		}
		return result;
	}

	public static boolean manoColor(Naipes[] cartas) {
		for (int count : manoPalo(cartas)) {
			if (count >= 5) {
				return true;
			}
		}
		return false;
	}

}
