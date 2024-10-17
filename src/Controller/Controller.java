package Controller;

import javax.swing.JOptionPane;
import Service.Cliente;
import Service.Concesionario;

public class Controller {
	public static Concesionario concesionario = new Concesionario("el gangazo");

	public static void main(String[] args) {
		int opcionMenu = 0;
		String menu = "Ingrese una opcion del menu \n" + "1.registrar Cliente\n" + "2.eliminar Cliente\n"
				+ "3.Actualizar Cliente\n" + "4.buscar Cliente\n" + "5.Salir";
		do {
			opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menu));
			opcMenu(opcionMenu);
		} while (opcionMenu != 5);

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
		default:
			break;
		}
	}

	private static void agregarCliente() {
		String nombre = JOptionPane.showInputDialog("ingese el nombre del cliente :");
		String direccion = JOptionPane.showInputDialog("ingrese la direccion del cliente :");
		int numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente:"));
		String correo = JOptionPane.showInputDialog("ingrese el correo del cliente:");
		Cliente cliente = new Cliente(nombre, direccion, numeroTelefono, correo);
		boolean estaAgregado = concesionario.agregarCliente(cliente);
		String mensaje;
		mensaje = estaAgregado == true ? "el cliente fue agregado con exito" : "el contacto no pudo ser agregado";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void eliminarCliente() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de el cliente"));
		boolean estaEliminado = concesionario.eliminarCliente(numero);
		String mensaje = estaEliminado == true ? "se elimmino con exito" : "el cliente no existe";
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void actualizarCliente() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente:"));
		Cliente cliente = concesionario.buscarCliente(numero);
		String mensaje;
		if (cliente != null) {
			String nombre = JOptionPane.showInputDialog("ingese el nombre del cliente :");
			String direccion = JOptionPane.showInputDialog("ingrese la direccion del cliente :");
			int numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente:"));
			String correo = JOptionPane.showInputDialog("ingrese el correo del cliente:");
			Cliente clienteActualizar = new Cliente(nombre, direccion, numeroTelefono, correo);
			concesionario.actualizarCliente(nombre, direccion, numeroTelefono, correo, clienteActualizar);
			mensaje = "se actualizo con exito";
			JOptionPane.showMessageDialog(null, mensaje);
		} else {
			mensaje = "Error, EL cliente no existe";
			JOptionPane.showMessageDialog(null, mensaje);
		}
	}

	private static void buscarCliente() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente:"));
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
}
