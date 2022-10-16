package aeropuerto;

import java.util.ArrayList;



public class Prueba {

	public static void main(String[] args)
			throws ExceptionVueloLleno, ExceptionPasajeSanitario, ExceptionAsientoOcupado {

		Aeropuerto aeropuerto = new Aeropuerto();

		ArrayList<Empresa> empresas = new ArrayList<Empresa>();

		Empresa empresa1 = new Empresa("LAN", "S.R.L", 8888);
		Empresa empresa2 = new Empresa("VOLAR", "S.R.L", 8545);
		Empresa empresa3 = new Empresa("DON OTTO", "S.R.L", 7532);

		empresas.add(empresa1);
		empresas.add(empresa2);
		empresas.add(empresa3);

		aeropuerto.setEmpresas(empresas);

		AvionCortaDistancia avionCortaDistancia1 = new AvionCortaDistancia("WES - 321", 100, 9000, 12334,
				TipoDispositivoMecanico.HELICES);
		AvionCortaDistancia avionCortaDistancia2 = new AvionCortaDistancia("TGS - 252", 100, 9000, 12334,
				TipoDispositivoMecanico.TURBINA);
		AvionLargaDistancia avionLargaDistancia1 = new AvionLargaDistancia("TGD - 963", 150, 1234444, 654332, true);
		AvionLargaDistancia avionLargaDistancia2 = new AvionLargaDistancia("TGD - 963", 150, 1234444, 654332, false);
		AvionSanitario avionSanitario = new AvionSanitario("IGG - 515", 50, 12334, 533322,
				TipoDispositivoMecanico.HELICES);

		ArrayList<EquipoMedico> equiposMedicos = new ArrayList<EquipoMedico>();
		EquipoMedico equipoMedico1 = new EquipoMedico("Botiquin");
		EquipoMedico equipoMedico2 = new EquipoMedico("Jeringa");
		EquipoMedico equipoMedico3 = new EquipoMedico("Respirador");

		equiposMedicos.add(equipoMedico1);
		equiposMedicos.add(equipoMedico2);
		equiposMedicos.add(equipoMedico3);

		avionSanitario.setEquiposMedicos(equiposMedicos);

		avionSanitario.agregarEquipoMedico(equipoMedico1);
		avionSanitario.agregarEquipoMedico(equipoMedico2);
		avionSanitario.agregarEquipoMedico(equipoMedico3);

		Persona piloto1 = new Persona("Ramiro", "Juan", TipoDocumento.DNI, 9514545);
		Persona copiloto1 = new Persona("Martinez", "Martin", TipoDocumento.LC, 6488956);

		Persona piloto2 = new Persona("Monzalve", "Hector", TipoDocumento.LI, 3265655);
		Persona copiloto2 = new Persona("Diaz", "German", TipoDocumento.PASAPORTE, 5778855);

		Lugar ciudad1 = new Lugar("Buenos Aires");
		Lugar ciudad2 = new Lugar("Trelew");
		Lugar ciudad3 = new Lugar("Tucuman");
		Lugar ciudad4 = new Lugar("Dolavon");

		Vuelo vuelo1 = new Vuelo(avionCortaDistancia1, piloto1, copiloto1, ciudad1, ciudad2);
		Vuelo vuelo2 = new Vuelo(avionLargaDistancia1, piloto2, copiloto2, ciudad3, ciudad4);

		Vuelo vuelo3 = new Vuelo(avionCortaDistancia2, piloto2, copiloto2, ciudad2, ciudad4);
		Vuelo vuelo4 = new Vuelo(avionLargaDistancia2, piloto2, copiloto2, ciudad3, ciudad1);

		Vuelo vuelo5 = new Vuelo(avionSanitario, piloto1, copiloto2, ciudad1, ciudad4);
		Vuelo vuelo6 = new Vuelo(avionSanitario, piloto2, copiloto1, ciudad1, ciudad3);

		empresa1.agregarVuelo(vuelo1);
		empresa1.agregarVuelo(vuelo2);
		empresa2.agregarVuelo(vuelo3);
		empresa2.agregarVuelo(vuelo4);
		empresa3.agregarVuelo(vuelo5);
		empresa3.agregarVuelo(vuelo6);

		ArrayList<Persona> auxiliares = new ArrayList<Persona>();
		Persona auxiliar1 = new Persona("Flores", "Pedro", TipoDocumento.DNI, 9564656);
		Persona auxiliar2 = new Persona("Kaiser", "Marcos", TipoDocumento.DNI, 9663425);
		Persona auxiliar3 = new Persona("Arcos", "Martrin", TipoDocumento.DNI, 1478527);

		auxiliares.add(auxiliar1);
		auxiliares.add(auxiliar2);
		auxiliares.add(auxiliar3);

		vuelo1.setAuxiliares(auxiliares);
		vuelo2.setAuxiliares(auxiliares);
		vuelo3.setAuxiliares(auxiliares);
		vuelo4.setAuxiliares(auxiliares);
		vuelo5.setAuxiliares(auxiliares);
		vuelo6.setAuxiliares(auxiliares);

		Persona pasajero1 = new Persona("Ramirez", "Raul", TipoDocumento.DNI, 8597878);
		Persona pasajero2 = new Persona("Alvarez", "Juaquin", TipoDocumento.DNI, 95447711);
		Persona pasajero3 = new Persona("Robinson", "Round", TipoDocumento.DNI, 1471147);
		Persona pasajero4 = new Persona("Ayala", "Lucia", TipoDocumento.DNI, 1235569);

		Persona pasajero5 = new Persona("Dimitri", "Carlos", TipoDocumento.DNI, 7412589);
		Persona pasajero6 = new Persona("Lavin", "Juaquin", TipoDocumento.DNI, 9632145);

		Pasaje pasaje1 = new Pasaje(1, pasajero1);
		Pasaje pasaje2 = new Pasaje(1, pasajero2); // cada vez que se use este objeto lanzara exception por el numero de
													// asiento
		Pasaje pasaje3 = new Pasaje(3, pasajero3);
		Pasaje pasaje4 = new Pasaje(5, pasajero4);
		Pasaje pasaje5 = new Pasaje(5, pasajero5);
		Pasaje pasaje6 = new Pasaje(6, pasajero6);

		Persona doctor1 = new Persona("Galante", "Rony", TipoDocumento.LI, 789559978);
		Persona doctor2 = new Persona("Musante", "Bianca", TipoDocumento.LI, 852147896);

		PasajeSanitario pasajeSanitario1 = new PasajeSanitario(4, pasajero5, doctor1);
		PasajeSanitario pasajeSanitario2 = new PasajeSanitario(6, pasajero6, doctor2);

		System.out.println("REGISTRANDO PASAJES \n");
		vuelo1.registrarPasajes(pasaje1);
		vuelo1.registrarPasajes(pasaje2);

		vuelo2.registrarPasajes(pasajeSanitario1); // lanza exception
		vuelo2.registrarPasajes(pasaje4);

		vuelo3.registrarPasajes(pasaje5);
		vuelo3.registrarPasajes(pasaje6);

		vuelo4.registrarPasajes(pasaje1);
		vuelo4.registrarPasajes(pasaje2);

		vuelo5.registrarPasajes(pasajeSanitario1);
		vuelo5.registrarPasajes(pasajeSanitario2);

		vuelo6.registrarPasajes(pasajeSanitario1);
		vuelo6.registrarPasajes(pasajeSanitario2);

		aeropuerto.listarVuelos();

		// falta crear los pasajes

	}

}
