package aeropuerto;
/**
 * Ubicacion donde el avion ira y de donde viene
 */
public class Lugar {

	private String nombre;

	/**
	 * Constructor del lugar 
	 * @param nombre nombre de la ciudad
	 */
	public Lugar(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
