package aeropuerto;

import java.util.ArrayList;

/**
 * Empresas que van a trabajar en el aeropuerto
 *
 */
public class Empresa {

	private String nombreComercial, razonSocial;
	private int cuit;
	private ArrayList<Vuelo> vuelos;

	/**
	 * Constructor de la clase empresa
	 * @param nombreComercial nombre comercial de la empresa
	 * @param razonSocial la razon social de la empresa 
	 * @param cuit cuit de la empresa
	 */
	public Empresa(String nombreComercial, String razonSocial, int cuit) {
		this.nombreComercial = nombreComercial;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.vuelos = new ArrayList<Vuelo>();
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	/**
	 * permite agregar un vuelo a la empresa
	 * @param v el vuelo
	 */
	public void agregarVuelo(Vuelo v) {
		this.vuelos.add(v);
	}

	/**
	 * Metodo que saca un vuelo de la empresa
	 * @param v vuelo a sacar
	 */
	public void sacarVuelo(Vuelo v) {
		this.vuelos.remove(v);
	}
	
	/**
	 * Permite imprimir todos los vuelo de la empresa 
	 * 
	 */
	public void listarVuelos() {
		for (Vuelo v : this.vuelos) {

			System.out.println(String.format("AVION: %s \nORIGEN: %s\nDESTINO: %s", v.getAvion().toString(),
					v.getOrigen().getNombre(), v.getDestino().getNombre()));
			v.listarPasajeros();
		}
	}

}
