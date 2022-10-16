package aeropuerto;

/**
 * Clase que permite generar aviones de corta distancia
 * Hereda de la clase Avion
 */

public class AvionCortaDistancia extends Avion {

	/**
	 * atributo que indica si el avion utiliza helice o turbina
	 */
	private TipoDispositivoMecanico tipoDispositivo;

	/**
	 * Contructor que genera avion de corta distancia y realiza una llamada a la clase Avion 
	 * @param tipoDispositivo le indica si el avion utiliza turbina o helice
	 * @param patente patente del avion
	 * @param capacidadMaximaPajeros capacidad maxima del avion para los pasajeros
	 * @param horasVueloMaxima cantidad de horas de vuelo maximo del avion 
	 * @param capacidadCombustible capacdad de combustible del avion 
	 */
	public AvionCortaDistancia(String patente, int capacidadMaximaPajeros, int horasVueloMaxima,
			int capacidadCombustible, TipoDispositivoMecanico tipoDispositivo) {
		super(patente, capacidadMaximaPajeros, horasVueloMaxima, capacidadCombustible);

		this.tipoDispositivo = tipoDispositivo;

	}

	public TipoDispositivoMecanico getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(TipoDispositivoMecanico tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

}
