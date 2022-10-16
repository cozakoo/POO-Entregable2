package aeropuerto;
/**
 * Excepcion que saltara cuando el avion este lleno
 */
public class ExceptionVueloLleno extends Exception {

	private int numeroDeVuelo;

	/**
	 * Constructor de la exception
	 * @param numeroDeVuelo numero del vuelo que se encuentra lleno
	 */
	public ExceptionVueloLleno(int numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	/**
	 * metodo que mostrara en pantalla cuando se lance la exception
	 */
	@Override
	public String getMessage() {
		return (String.format("El vuelo %d ya esta lleno, no se puede seguir agregando pasajeros", numeroDeVuelo));
	}

}
