package aeropuerto;

/**
 * Equipos medios que llevaran los aviones sanitarios
 * 
 * @author Martin Arcos
 * 
 */
public class EquipoMedico {

	private String descripcion;

	/**
	 * constructor
	 * @param descripcion nombre del equipo medico
	 */
	public EquipoMedico(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
