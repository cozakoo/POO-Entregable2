package aeropuerto;

/**
 * Clase que se utilizara para crear a los pasajeros, pilotos, copilotos, medico y auxiliares
 */

public class Persona {

	private String apellido, nombre;
	private TipoDocumento tipoDocumento;
	private int dni;

	@Override
	public String toString() {
		return (String.format("%s %s %d", this.nombre, this.apellido, this.dni));
	}

	/**
	 * Constructor para crear a la persona
	 * @param apellido apellido de la persona
	 * @param nombre nombre de la persona 
	 * @param tipoDocumento tipo de documento (LC,LI,DNI;PASAPORTE)
	 * @param dni numero de documento
	 */
	public Persona(String apellido, String nombre, TipoDocumento tipoDocumento, int dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

}
