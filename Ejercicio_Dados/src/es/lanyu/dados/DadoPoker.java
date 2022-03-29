package es.lanyu.dados;

import com.github.dice.PokerDice;
import com.github.dice.PokerFace;

public class DadoPoker extends PokerDice implements Dado<PokerFace> {

	@Override
	public PokerFace[] getCarasDado() {
		return getDiceFaces();
	}

	@Override
	public PokerFace getCaraVista() {
		return getCurrent();
	}

	@Override
	public void lanzar() {
		roll();
	}

}
