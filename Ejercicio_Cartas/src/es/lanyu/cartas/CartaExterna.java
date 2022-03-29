package es.lanyu.cartas;

import com.github.cards.Card;

public class CartaExterna extends Card implements Carta<Integer> {

	public CartaExterna(int suit, int rank) {
		super(suit, rank);
	}

	@Override
	public Integer getPalo() {
		return getSuit();
	}

	@Override
	public int getNumeroCarta() {
		return getRank();
	}

	@Override
	public String getPaloString() {
		return getSuitString();
	}

	@Override
	public String getNumeroString() {
		return getRankString();
	}

}
