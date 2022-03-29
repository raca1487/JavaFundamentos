package aplicacion;

public class Conexion {

	private float velocidadDescarga;

	public float getVelocidadDescarga() {
		return velocidadDescarga;
	}

	public Conexion(float velocidadDescarga) {
		super();
		this.velocidadDescarga = velocidadDescarga;
	}

	/**
	 * Metodo que sirve ara calcular el tiempo empleado por esta conexion para los
	 * Megas pasados.
	 * 
	 * @param megas Tamagno total para descargar en MB.
	 * @return segundos que tarda la conexion para la descarga.
	 */
	public float tiempoDescarga(float megas) {
		return megas / getVelocidadDescarga();
	}
}
