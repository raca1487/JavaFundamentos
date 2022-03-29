package aplicacion;

public class Director extends Persona {

	public Director(String nombre, int agno, int month, int day, String paisNacimiento) {
		super(nombre, agno, month, day, paisNacimiento);
	}

	@Override
	public String toString() {
		return "Director:" + super.toString();
	}

}
