package aeropuerto;

import java.util.ArrayList;

/**
 * Crea al aeropuerto
 */

public class Aeropuerto {

	private ArrayList<Empresa> empresas;

	/**
	 * constructor de la empresa aeropuerto
	 */
	public Aeropuerto() {
		this.empresas = new ArrayList<Empresa>();
	}

	public void agregarEmpresa(Empresa e) {
		this.empresas.add(e);
	}

	public void sacarEmpresa(Empresa e) {
		this.empresas.remove(e);
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}
		
	/**
	 * Metodo el cual permite listar todos los vuelos que las empresas
	 * registradas en el aeropuerto han realizado
	 */
	public void listarVuelos() {

		System.out.println("\nLISTANDO VUELOS...\n");
		for (Empresa e : this.empresas) {

			System.out.println(String.format("EMPRESA: %s ", e.getNombreComercial()));
			e.listarVuelos();
			System.out.println("\n");
		}

	}

}
