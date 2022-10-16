package aeropuerto;

/**
 * Clase que permite generar aviones de larga distancia 
 * Hereda de la clase Avion
 */

public class AvionLargaDistancia extends Avion {
	
	/**
	 * permite saber si el avion tiene radar o no
	 */
	private boolean tieneRadar;

	/**
	 * constructor
	 * @param patente patente del avion
	 * @param capacidadMaximaPajeros capacidad maxima del avion para los pasajeros
	 * @param horasVueloMaxima cantidad de horas de vuelo maximo del avion 
	 * @param capacidadCombustible capacdad de combustible del avion
	 * @param tieneRadar true si tiene radar y false si no posee radar
	 */
	public AvionLargaDistancia(String patente, int capacidadMaximaPajeros, int horasVueloMaxima,
			int capacidadCombustible, boolean tieneRadar) {
		super(patente, capacidadMaximaPajeros, horasVueloMaxima, capacidadCombustible);

		this.tieneRadar = tieneRadar;
	}

	public boolean isTieneRadar() {
		return tieneRadar;
	}

	public void setTieneRadar(boolean tieneRadar) {
		this.tieneRadar = tieneRadar;
	}

}
