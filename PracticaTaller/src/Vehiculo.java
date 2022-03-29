
public class Vehiculo implements Identificable<String> {

	private String matricula;
	private String modelo;
	private String color;

	@Override
	public String getId() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, String modelo, String color) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
	}

	@Override
	public String toString() {
		return "\tModelo:\t\t" + getModelo() + System.lineSeparator() + "\tColor:\t\t" + getColor()
				+ System.lineSeparator() + "\tMatricula: \t" + getId() + System.lineSeparator()
				+ "El vehiculo no esta averiado";
	}

}