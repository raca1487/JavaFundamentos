import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Taller {

	private List<Vehiculo> listaVehiculos;
	private List<Averia> listaAverias;
	private Collection<Repuesto> almacenRepuestos;

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public List<Averia> getListaAverias() {
		return listaAverias;
	}

	public Collection<Repuesto> getAlmacenRepuestos() {
		return almacenRepuestos;
	}

	public void setListaAverias(Averia averia) {
		if (getListaAverias() == null) {
			listaAverias = new ArrayList<Averia>();
		} else {
			getListaAverias().add(averia);
		}
	}

	public void setAlmacenRepuestos(Repuesto piezaRepuesto) {
		if (getAlmacenRepuestos() == null) {
			almacenRepuestos = new ArrayList<Repuesto>();
		} else {
			getAlmacenRepuestos().add(piezaRepuesto);
		}
	}

	public void diagnosticar(Vehiculo vehiculo) {
		
	}

}
