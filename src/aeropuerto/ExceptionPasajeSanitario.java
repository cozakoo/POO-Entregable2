package aeropuerto;
/**
 * Excepcion que saltara cuando el pasaje sea sanitario y el avion no es sanitario
 */
public class ExceptionPasajeSanitario extends Exception {

	private int codigoPasaje, codigoVuelo;

	/**
	 * Constructor de la exception
	 * @param codigoPasaje codigo del pasaje 
	 * @param codigoVuelo codigo del vuelo
	 */
	public ExceptionPasajeSanitario(int codigoPasaje, int codigoVuelo) {
		this.codigoPasaje = codigoPasaje;
		this.codigoVuelo = codigoVuelo;
	}

	/**
	 * metodo que mostrara en pantalla al momento de lanzar la exception
	 */
	@Override
	public String getMessage() {
		return (String.format("No se puede registrar el pasaje %d en el vuelo %d porque el pasaje es sanitario",
				codigoPasaje, codigoVuelo));
	}

}
