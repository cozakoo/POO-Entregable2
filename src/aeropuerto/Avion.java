package aeropuerto;

/**
 * clase abstracta que sera el padre de los aviones
 */

public abstract class Avion {

	private String patente;
	private int capacidadMaximaPajeros, horasVueloMaxima, capacidadCombustible;
	
	/**
	 * Constructor que permite generar al avion
	 * @param patente patente del avion
	 * @param capacidadMaximaPajeros capacidad maxima del avion para los pasajeros
	 * @param horasVueloMaxima cantidad de horas de vuelo maximo del avion 
	 * @param capacidadCombustible capacdad de combustible del avion
	 */
	public Avion(String patente, int capacidadMaximaPajeros, int horasVueloMaxima, int capacidadCombustible) {
		this.patente = patente;
		this.capacidadMaximaPajeros = capacidadMaximaPajeros;
		this.horasVueloMaxima = horasVueloMaxima;
		this.capacidadCombustible = capacidadCombustible;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getCapacidadMaximaPajeros() {
		return capacidadMaximaPajeros;
	}

	public void setCapacidadMaximaPajeros(int capacidadMaximaPajeros) {
		this.capacidadMaximaPajeros = capacidadMaximaPajeros;
	}

	public int getHorasVueloMaxima() {
		return horasVueloMaxima;
	}

	public void setHorasVueloMaxima(int horasVueloMaxima) {
		this.horasVueloMaxima = horasVueloMaxima;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	/**
	 * metodo que retorna la capacidad maxima, vuelo maximo y el combustible maximo del avion separado por guiones
	 * 
	 * @return devuelve los atributos del avion en formato String
	 */
	@Override
	public String toString() {
		return String.format("%s - CAPACIDAD MAXIMA: %d pasajeros - VUELO MAXIMO: %d - COMBUSTIBLE MAXIMO: %d",
				this.patente, this.capacidadMaximaPajeros, this.horasVueloMaxima, this.capacidadCombustible);
	}
}