package aeropuerto;

/**
 * pasaje que una vez creado se ingresara al vuelo
 */

public class Pasaje {

	private static int GENERADOR_CODIGO = 100;

	private int codigo, numeroAsiento;
	private Persona pasajero;

	/**
	 * constructor 
	 * @param numeroAsiento numero de asiento del pasajero
	 * @param pasajero pasajero que lo compro
	 */
	public Pasaje(int numeroAsiento, Persona pasajero) {
		this.numeroAsiento = numeroAsiento;
		this.pasajero = pasajero;
		this.codigo = Pasaje.GENERADOR_CODIGO++;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public Persona getPasajero() {
		return pasajero;
	}

	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
}
