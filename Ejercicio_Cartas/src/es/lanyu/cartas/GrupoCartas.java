package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrupoCartas {

	private List<Carta> cartas = new ArrayList<Carta>();

	public GrupoCartas() {
		super();
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void barajar() {
		Collections.shuffle(getCartas());
	}

	public Carta robar(Carta carta) {
		Carta encontrada = null;
		if (carta == null && getCartas().size() > 0) {
			encontrada = getCartas().get(0);
		}
		if (getCartas().size() > 0) {
			for (Carta unaCarta : getCartas()) {
				if (unaCarta.equals(carta)) {
					encontrada = unaCarta;
					break;
				}
			}
		}
		getCartas().remove(encontrada);

		return encontrada;
	}

	public boolean encuentraCarta(Carta carta) {
		return getCartas().contains(carta);
	}

}