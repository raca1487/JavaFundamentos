package es.lanyu.dados;

import com.github.dice.PokerDice;

public class DadoPoker extends PokerDice implements Dado {

	@Override
	public int getNumeroCaras() {
		return getDiceFaces();
	}

	@Override
	public int getCaraVista() {
		return getCurrent();
	}

	@Override
	public int lanzar() {
		return roll();
	}

}
