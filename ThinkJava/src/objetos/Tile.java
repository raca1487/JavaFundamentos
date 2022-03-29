package objetos;

public class Tile {

	public static void main(String[] args) {
		Tile aTile = testTile();
		aTile.setValue(20);
		printTile(aTile);
		System.out.println(aTile.equals(testTile()) + " " + aTile.getLetter());
	}
	
	private char letter;
	private int value;
	
	
	
	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	public static void printTile(Tile tile) {
		System.out.println("Tile [letter: " + tile.letter + ", value: " + tile.value + "]");
	}
	
	public static Tile testTile() {
		Tile tile = new Tile('Z', 10);
		printTile(tile);
		return tile;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		return letter == other.letter && value == other.value;
	}

	@Override
	public String toString() {
		return "Tile [letter=" + letter + ", value=" + value + "]";
	}
	
	
	
}
