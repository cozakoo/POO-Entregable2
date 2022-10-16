package aeropuerto;

import java.util.ArrayList;

/**
 * Clase que genera aviones sanitarios
 * 
 * Hereda de los Aviones de corta distancia
 * 
 * 
 */
public class AvionSanitario extends AvionCortaDistancia {

	/**
	 * lista de todos los equipos medicos que posee 
	 */
	private ArrayList<EquipoMedico> equiposMedicos;

	/**
	 * Constructor de la clase 
	 * @param patente patente del avion
	 * @param capacidadMaximaPajeros capacidad maxima del avion para los pasajeros
	 * @param horasVueloMaxima cantidad de horas de vuelo maximo del avion 
	 * @param capacidadCombustible capacdad de combustible del avion
	 * crea la lista de los equipos medicos
	 */
	public AvionSanitario(String patente, int capacidadMaximaPajeros, int horasVueloMaxima, int capacidadCombustible,
			TipoDispositivoMecanico tipoDispositivo) {
		super(patente, capacidadMaximaPajeros, horasVueloMaxima, capacidadCombustible, tipoDispositivo);

		this.equiposMedicos = new ArrayList<EquipoMedico>();
	}

	
	/* 
	 * @param e equipo medico
	 */
	public void agregarEquipoMedico(EquipoMedico e) {
		this.equiposMedicos.add(e);
	}

	/**
	 * permite sacar un equipo medico
	 * @param e equipo medico que se quiere sacar
	 */
	public void sacarEquipoMedico(EquipoMedico e) {
		this.equiposMedicos.remove(e);
	}

	
	 /*
	 * @return devuelve los equipos medicos con los que cuenta el avion 
	 */
	public ArrayList<EquipoMedico> getEquiposMedicos() {
		return equiposMedicos;
	}

	/**
	 * setea los equipos medicos
	 * @param equiposMedicos nueva lista de equipos medicos
	 */
	public void setEquiposMedicos(ArrayList<EquipoMedico> equiposMedicos) {
		this.equiposMedicos = equiposMedicos;
	}
}
