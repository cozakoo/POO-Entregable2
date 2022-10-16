package aeropuerto;

/**
 * Excepcion que se levanta cuando el asiento ya esta registrado dentro del avion 
 *
 */

public class ExceptionAsientoOcupado extends Exception {

	private int numeroAsiento, codigoVuelo;

	/**
	 * Constructor de la exception
	 * @param numeroAsiento numero del asiento que se encuentra ocupado
	 * @param codigoVuelo codigo del vuelo
	 */
	public ExceptionAsientoOcupado(int numeroAsiento, int codigoVuelo) {
		super();
		this.numeroAsiento = numeroAsiento;
		this.codigoVuelo = codigoVuelo;
	}

	/**
	 * mensaje que mostrara en pantalla
	 */
	@Override
	public String getMessage() {
		return (String.format("El asiento %d del vuelo %d esta ocupado", numeroAsiento, codigoVuelo));
	}

}