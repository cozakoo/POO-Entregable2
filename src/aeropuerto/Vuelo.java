package aeropuerto;

import java.util.ArrayList;

/**
 * 
 * Esta clase pretende contruir vuelo de la empresa
 * 
 * @author Martin Arcos
 *
 */

public class Vuelo {

	private static int GENERADOR_CODIGO = 1333;

	private int codigo;
	private Avion avion;
	private Persona piloto, copiloto;
	private Lugar origen, destino;

	private ArrayList<Pasaje> pasajes;
	private ArrayList<Persona> auxiliares;

	
	/**
	 * Constructor para crear al objeto vuelo
	 * @param avion el avion el cual se volara
	 * @param piloto el empleado que sera piloto 
	 * @param copiloto el copiloto
	 * @param origen ciudad de origen
	 * @param destino ciudad de destino
	 * se crea la lista de auxiliares
	 * se crea la lista de pasajes para el vuelo
	 */
	public Vuelo(Avion avion, Persona piloto, Persona copiloto, Lugar origen, Lugar destino) {

		this.avion = avion;
		this.piloto = piloto;
		this.copiloto = copiloto;
		this.origen = origen;
		this.destino = destino;

		this.pasajes = new ArrayList<Pasaje>();
		this.auxiliares = new ArrayList<Persona>();
		this.codigo = Vuelo.GENERADOR_CODIGO++;
	}

	/**
	 * permite agregar a un axuliar
	 * @param p auxiliar que se incorporara al vuelo
	 */
	public void agregarAuxiliar(Persona p) {
		this.auxiliares.add(p);
	}

	/**
	 * permite sacar a un auxiliar 
	 * @param p auxiliar a sacar de la lista
	 */
	public void sacarPersona(Persona p) {
		this.auxiliares.remove(p);
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Persona getPiloto() {
		return piloto;
	}

	public void setPiloto(Persona piloto) {
		this.piloto = piloto;
	}

	public Persona getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(Persona copiloto) {
		this.copiloto = copiloto;
	}

	public int getCodigo() {
		return codigo;
	}

	public Lugar getOrigen() {
		return origen;
	}

	public void setOrigen(Lugar origen) {
		this.origen = origen;
	}

	public Lugar getDestino() {
		return destino;
	}

	public void setDestino(Lugar destino) {
		this.destino = destino;
	}

	public ArrayList<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(ArrayList<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public ArrayList<Persona> getAuxiliares() {
		return auxiliares;
	}

	public void setAuxiliares(ArrayList<Persona> auxiliares) {
		this.auxiliares = auxiliares;
	}
	
	/**
	 * comprara a dos aviones para saber si tienen en el mismo vuelo de origen-destino 
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Vuelo) {
			Vuelo v1 = (Vuelo) obj;

			return (this.getOrigen() == v1.getOrigen()) && (this.getDestino() == v1.getDestino());
		} else
			return false;
	}

/**
 * Metodo que permite al cliente registrar su pasaje
 * @param pasaje pasaje del pasajero
 * @throws ExceptionVueloLleno excepcion que lanzara cuando el acion este lleno
 * @throws ExceptionPasajeSanitario exccepcion que se lanzara cuando se ingrese un pasaje sanitario a un avion comun
 * @throws ExceptionAsientoOcupado excepcion que se lanzara cuando el asiento este ocupado
 */
	public void registrarPasajes(Pasaje pasaje) throws ExceptionVueloLleno, ExceptionPasajeSanitario, ExceptionAsientoOcupado {

		try {
			if (this.pasajes.size() == this.getAvion().getCapacidadMaximaPajeros())
				throw new ExceptionVueloLleno(this.codigo);
			else {
				if ((pasaje instanceof PasajeSanitario) && !(this.avion instanceof AvionSanitario))
					throw new ExceptionPasajeSanitario(pasaje.getCodigo(), this.codigo);
				else {
					if (AsientoOcupado(pasaje.getNumeroAsiento()))
						throw new ExceptionAsientoOcupado(pasaje.getNumeroAsiento(), this.codigo);
					else
						this.pasajes.add(pasaje);
				}
			}

		} catch (ExceptionVueloLleno e) {
			System.out.println(e.getMessage());
		} catch (ExceptionPasajeSanitario e) {
			System.out.println(e.getMessage());
		} catch (ExceptionAsientoOcupado e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * metodo que verifica si el asinto ya esta ocupado
	 * @param numeroAsiento numero de asiento del pasajero
	 * @return verdadero si esta ocupado y falso si esta desocupado
	 */
	private boolean AsientoOcupado(int numeroAsiento) {

		boolean estaDisponible = false;

		for (Pasaje p : this.pasajes) {
			if (p.getNumeroAsiento() == numeroAsiento)
				estaDisponible = true;

		}
		return estaDisponible;
	}

	/**
	 * permite listar a todos los pasajeros registrados en el vuelo
	 */
	public void listarPasajeros() {

		System.out.println("LISTANDO PASAJEROS..");
		for (Pasaje p : this.pasajes) {

			System.out.println(String.format("%s", p.getPasajero().toString()));
		}

	}

}