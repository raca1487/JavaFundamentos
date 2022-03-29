package aplicacion;

import java.util.Collection;

public class Actor extends Persona{
	
	Collection<Actor> actoresPrincipales;
	
	public Actor(String nombre, int agno, int month, int day, String paisNacimiento) {
		super(nombre, agno, month, day, paisNacimiento);
	}
	
	@Override
	public String toString() {
		return "Actor:" + super.toString();
	}
	
}
