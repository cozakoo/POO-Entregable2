package aeropuerto;

/**
 * Clase que permite crear pasajes sanitarios
 * Hereda de pasaje
 */
public class PasajeSanitario extends Pasaje {

	private Persona doctor;

	/**
	 * Constuctor para el pasaje sanitario
	 * @param numeroAsiento numero del asiento
	 * @param pasajero psajero que lo compro
	 * @param Doctor el doctor de referencia 
	 */
	public PasajeSanitario(int numeroAsiento, Persona pasajero, Persona Doctor) {
		super(numeroAsiento, pasajero);
		this.doctor = doctor;
	}

	public Persona getDoctor() {
		return doctor;
	}

	public void setDoctor(Persona doctor) {
		this.doctor = doctor;
	}

}
