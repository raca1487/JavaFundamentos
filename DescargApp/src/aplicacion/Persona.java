package aplicacion;

import java.util.*;

public class Persona implements Identificable, Nombrable {

	private String nombre;
	private Date fechaNacimiento;
	private String paisNacimiento;
	private String id;

//	Persona persona1 = new Persona("Clint", "Eastwood", 1930, 5, 31, "Estados Unidos");
//	Persona persona2 = new Persona("Will", "Smith", 1968, 9, 25, "Estados Unidos");
//	Persona persona3 = new Persona("Jason", "Derulo", 1989, 9, 21, "Estados Unidos");

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public Persona(String nombre, int agno, int month, int day, String paisNacimiento) {
		this.nombre = nombre;
		GregorianCalendar fechNac = new GregorianCalendar(agno, month - 1, day);
		fechaNacimiento = fechNac.getGregorianChange();
		this.paisNacimiento = paisNacimiento;
	}

	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "\n\tNombre y Apellidos:\t" + getNombre() + "\n\tFecha de Nacimiento:\t"
				+ getFechaNacimiento() + "\n\tPais de Nacimiento:\t" + getPaisNacimiento();
	}
	
}