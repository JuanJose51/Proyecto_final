package Controller;

import javax.swing.JOptionPane;

import Service.Automovil;
import Service.Camion;
import Service.Cliente;
import Service.Concesionario;
import Service.Inventario;
import Service.Mantenimiento;
import Service.Motocicleta;
import Service.Vehiculo;

public class Controller {
	public static Concesionario concesionario = new Concesionario("el gangazo");
	public static Inventario inventario = new Inventario("invetario");

	public static void main(String[] args) {

		int opcionMenu = 0;
		String menu = "Ingrese una opcion del menu \n" + "1.registrar Cliente\n" + "2.eliminar Cliente\n"
				+ "3.Actualizar Cliente\n" + "4.buscar Cliente\n" + "5.registrar automovil\n" + "6.eliminar automovil\n"
				+ "7.buscar vehiculos\n" + "8.Agregar Mantenimiento\n" + "9.Listar Mantenimientos de un Vehiculo\n"
				+ "10.Salir";
		do {
			opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));
			opcMenu(opcionMenu);
		} while (opcionMenu != 10);

	}

	private static void opcMenu(int opc) {
		switch (opc) {
		case 1:
			agregarCliente();
			break;
		case 2:
			eliminarCliente();
			break;
		case 3:
			actualizarCliente();
			break;
		case 4:
			buscarCliente();
			break;
		case 5:
			agregarAutomovil();
			break;
		case 6:
			eliminarAutomovil();
			break;
		case 7:
			buscarVeiculo();
			break;
		case 8:
			agregarMantenimiento();
			break;
		case 9:
			listarMantenimiento();
			break;
		default:
			break;
		}
	}

	private static void agregarCliente() {
		String nombre = JOptionPane.showInputDialog("ingese el nombre del cliente :");
		String direccion = JOptionPane.showInputDialog("ingrese la direccion del cliente :");
		String numeroTelefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
		String correo = JOptionPane.showInputDialog("ingrese el correo del cliente:");

		Cliente cliente = new Cliente(nombre, direccion, numeroTelefono, correo);

		boolean estaAgregado = concesionario.agregarCliente(cliente);
		String mensaje;
		mensaje = estaAgregado == true ? "el cliente fue agregado con exito" : "el cliente no pudo ser agregado";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void eliminarCliente() {
		String numero = JOptionPane.showInputDialog("Ingrese el numero de el cliente");
		boolean estaEliminado = concesionario.eliminarCliente(numero);
		String mensaje = estaEliminado == true ? "se elimmino con exito" : "el cliente no existe";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void actualizarCliente() {
		String numero = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
		Cliente cliente = concesionario.buscarCliente(numero);
		String mensaje;
		if (cliente != null) {
			String nombre = JOptionPane.showInputDialog("ingese el nombre del cliente :");
			String direccion = JOptionPane.showInputDialog("ingrese la direccion del cliente :");
			String numeroTelefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
			String correo = JOptionPane.showInputDialog("ingrese el correo del cliente:");

			concesionario.actualizarCliente(nombre, direccion, numeroTelefono, correo, cliente);
			mensaje = "se actualizo con exito";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "Error, EL cliente no existe";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void buscarCliente() {
		String numero = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
		Cliente cliente = concesionario.buscarCliente(numero);
		String mensaje;
		if (cliente != null) {
			mensaje = concesionario.infoCliente(cliente);
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "No se encontro el cliente";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void buscarVeiculo() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid del vehiculo:");
		Vehiculo v = inventario.buscarVehiculos(vid);
		String mensaje;
		if (v != null) {
			mensaje = inventario.infoVehiculos(v);
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "No se encontro el vehiculo";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void agregarAutomovil() {
		String marca = JOptionPane.showInputDialog("Ingrese la maraca del Automovil:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Automovil:");
		String vid = JOptionPane.showInputDialog("Ingrese el vid del Automovil:");
		String color = JOptionPane.showInputDialog("Ingrese el color del Automovil:");
		int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));
		String año = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		int numPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas del automovil"));
		String tipoCombustible = JOptionPane.showInputDialog("Ingrese el tipode combustible del Automovil:");
		String tipoTransmicion = JOptionPane.showInputDialog("Ingrese el tipo de trasnmicion del Automovil:");
		String tipoTraccion = JOptionPane.showInputDialog("Ingrese el tipo de traccion del Automovil:");

		Automovil a = new Automovil(marca, modelo, vid, color, kilometrage, año, numPuertas, tipoCombustible,
				tipoTransmicion, tipoTraccion);

		boolean estaAgregado = inventario.crearAutomovil(a);
		String mensaje;
		mensaje = estaAgregado == true ? "el automovil fue agregado con exito" : "el automovil no pudo ser agregado";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void eliminarAutomovil() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid de el automovil");
		boolean estaEliminado = inventario.eliminarAuntomovil(vid);
		String mensaje = estaEliminado == true ? "se elimino con exito" : "el automovil no existe";
		JOptionPane.showMessageDialog(null, mensaje);

		inventario.eliminarAuntomovil(null);
	}

	private static void actualizarAutomovil() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid del automovil:");
		Vehiculo vehiculo = inventario.buscarVehiculos(vid);
		String mensaje;
		if (vehiculo != null) {
			String marca = JOptionPane.showInputDialog("Ingrese la maraca del Automovil:");
			String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Automovil:");
			String vid1 = JOptionPane.showInputDialog("Ingrese el vid del Automovil:");
			String color = JOptionPane.showInputDialog("Ingrese el color del Automovil:");
			int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));
			String año = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
			int numPuertas = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas del automovil"));
			String tipoCombustible = JOptionPane.showInputDialog("Ingrese el tipode combustible del Automovil:");
			String tipoTransmicion = JOptionPane.showInputDialog("Ingrese el tipo de trasnmicion del Automovil:");
			String tipoTraccion = JOptionPane.showInputDialog("Ingrese el tipo de traccion del Automovil:");

			inventario.actualizarAuntomovil(marca, modelo, vid1, color, kilometrage, año, numPuertas, tipoCombustible,
					tipoTransmicion, tipoTraccion, null);
			mensaje = "se actualizo con exito";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "Error, EL automovil no existe";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void agregarMotocicleta() {
		String marca = JOptionPane.showInputDialog("Ingrese la maraca del Automovil:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Automovil:");
		String vid = JOptionPane.showInputDialog("Ingrese el vid del Automovil:");
		String color = JOptionPane.showInputDialog("Ingrese el color del Automovil:");
		int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));
		String año = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		String tipoManillar = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		int numRuedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del Automovil:"));
		String tipoFreno = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		String cilindrada = JOptionPane.showInputDialog("Ingrese el año del Automovil:");

		Motocicleta m = new Motocicleta(marca, modelo, vid, color, kilometrage, año, tipoManillar, numRuedas, tipoFreno,
				cilindrada);

		boolean estaAgregado = inventario.crearMotocicleta(m);
		String mensaje;
		mensaje = estaAgregado == true ? "la motocicleta fue agregada con exito"
				: "la motocicleta no pudo ser agregada";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void eliminarMotocicleta() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid de el Motocicleta");
		boolean estaEliminado = inventario.eliminalMOtocicleta(vid);
		String mensaje = estaEliminado == true ? "se elimino con exito" : "la Motocicleta no existe";
		JOptionPane.showMessageDialog(null, mensaje);

		inventario.eliminalMOtocicleta(null);
	}

	private static void actualizarMotocicleta() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid de la motocicleta:");
		Vehiculo vehiculo = inventario.buscarVehiculos(vid);
		String mensaje;
		if (vehiculo != null) {
			String marca = JOptionPane.showInputDialog("Ingrese la maraca de la motocicleta:");
			String modelo = JOptionPane.showInputDialog("Ingrese el modelo de la motocicleta:");
			String vid1 = JOptionPane.showInputDialog("Ingrese el vid de la motocicleta:");
			String color = JOptionPane.showInputDialog("Ingrese el color de la motocicleta:");
			int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje de la motocicleta"));
			String año = JOptionPane.showInputDialog("Ingrese el año de la motocicleta:");
			String tipoManillar = JOptionPane.showInputDialog("Ingrese el tipo de manillar de la motocicleta:");
			int numRuedas = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas de la motocicleta:"));
			String tipoFreno = JOptionPane.showInputDialog("Ingrese el tipo de freno de la motocicleta:");
			String cilindrada = JOptionPane.showInputDialog("Ingrese la cilindrada de la motocicleta:");

			inventario.actualizarMotocicleta(marca, modelo, vid1, color, kilometrage, año, tipoManillar, numRuedas,
					tipoFreno, cilindrada, null);
			mensaje = "se actualizo con exito";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "Error, la motocicleta no existe";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void agregarCamion() {
		String marca = JOptionPane.showInputDialog("Ingrese la maraca del Automovil:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Automovil:");
		String vid = JOptionPane.showInputDialog("Ingrese el vid del Automovil:");
		String color = JOptionPane.showInputDialog("Ingrese el color del Automovil:");
		int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));
		String año = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		String capacidadCarga = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		String tipoCamion = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));
		int numEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Automovil"));

		Camion c = new Camion(marca, modelo, vid, color, kilometrage, año, capacidadCarga, tipoCamion, longitud,
				numEjes);

		boolean estaAgregado = inventario.crearCamion(c);
		String mensaje;
		mensaje = estaAgregado == true ? "el Camion fue agregado con exito" : "el Camion no pudo ser agregado";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void eliminarCamion() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid de el Camion");
		boolean estaEliminado = inventario.eliminarCamion(vid);
		String mensaje = estaEliminado == true ? "se elimino con exito" : "el Camion no existe";
		JOptionPane.showMessageDialog(null, mensaje);

		inventario.eliminarCamion(null);
	}

	private static void actualizarCamion() {
		String vid = JOptionPane.showInputDialog("Ingrese el vid del Camion:");
		Vehiculo vehiculo = inventario.buscarVehiculos(vid);
		String mensaje;
		if (vehiculo != null) {
			String marca = JOptionPane.showInputDialog("Ingrese la maraca del Camion:");
			String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Camion:");
			String vid1 = JOptionPane.showInputDialog("Ingrese el vid del Camion:");
			String color = JOptionPane.showInputDialog("Ingrese el color del Camion:");
			int kilometrage = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del Camion"));
			String año = JOptionPane.showInputDialog("Ingrese el año del Automovil:");
			String capacidadCarga = JOptionPane.showInputDialog("Ingrese el capacidad de carga del Camion:");
			String tipoCamion = JOptionPane.showInputDialog("Ingrese el tipo Camion:");
			int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud  del Camion"));
			int numEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes del Camion"));

			inventario.actualizarCamion(marca, modelo, vid1, color, kilometrage, año, capacidadCarga, tipoCamion,
					longitud, numEjes, null);

			mensaje = "se actualizo con exito";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "Error, EL Camion no existe";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	// MANTENIMIENTO

	public static void agregarMantenimiento() {
		try {
			String vid = JOptionPane.showInputDialog("Ingrese el VID del Vehículo:");
			boolean estado = concesionario.isVehiculoExisteMantenimiento(vid);
			Vehiculo vehiculo = inventario.buscarVehiculos(vid);

			if (vehiculo == null) {
				JOptionPane.showMessageDialog(null, "ERROR: El vehículo no existe.");
				return;
			}

			long costo = solicitarCosto();
			int opcTipoMantenimiento = solicitarTipoMantenimiento();

			String tipoMantenimiento = concesionario.opcionesMantenimiento(opcTipoMantenimiento);

			if (estado) {
				Mantenimiento mante = concesionario.buscaMantenimiento(vid);
				mante.agregarMantenimiento(tipoMantenimiento, costo);
			} else {
				Mantenimiento mantenimiento = new Mantenimiento(vehiculo);
				concesionario.agregarMantenimiento(mantenimiento);
				mantenimiento.agregarMantenimiento(tipoMantenimiento, costo);
			}

			JOptionPane.showMessageDialog(null, "El Mantenimiento fue registrado con éxito.");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"ERROR: Entrada inválida. Por favor, ingrese valores numéricos donde se requiera.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR: Ocurrió un error inesperado: " + e.getMessage());
		}
	}

	// Método para solicitar el costo del mantenimiento
	private static long solicitarCosto() {
		while (true) {
			try {
				String input = JOptionPane.showInputDialog("Ingrese el costo del mantenimiento:");
				return Long.parseLong(input);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese un número válido.");
			}
		}
	}

	// Método para solicitar el tipo de mantenimiento
	private static int solicitarTipoMantenimiento() {
		while (true) {
			try {
				String mensaje = JOptionPane.showInputDialog(
						"Ingrese el número correspondiente al tipo de mantenimiento:\n1. Preventivo\n2. Correctivo\n3. Predictivo");
				int opc = Integer.parseInt(mensaje);
				if (opc >= 1 && opc <= 3) {
					return opc;
				} else {
					JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese un número válido 1, 2 o 3.");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese un número válido.");
			}
		}
	}

	// METODO PARA LISTAR LOS MANTENIMIENTOS REALIZADOS A UN VEHICULO:)
	public static void listarMantenimiento() {
		String vid = JOptionPane.showInputDialog("ingrese el vid del Vehiculo");
		JOptionPane.showMessageDialog(null, concesionario.listarMantenimientoVehiculo(vid));

	}

}
