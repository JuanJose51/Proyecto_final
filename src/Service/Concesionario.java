package Service;

import java.util.ArrayList;

public class Concesionario {
	private String nombre;
	private Inventario inventario;
	private ArrayList<Venta> ventas;
	private ArrayList<Mantenimiento> mantenimientos;
	private ArrayList<Cliente> clientes;

	public Concesionario(String nombre) {
		super();
		this.nombre = nombre;
		this.inventario = new Inventario("inventario");
		this.ventas = new ArrayList<>();
		this.mantenimientos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	/****************************
	 * METODOS DE CLIENTE *
	 ****************************/
	public boolean ExisteCliente(Cliente cliente) {
		for (Cliente c : this.clientes) {
			int numero = cliente.getNumeroTelefono();
			int numeroLista = c.getNumeroTelefono();
			if (numeroLista == numero) {
				return true;
			}
		}
		return false;
	}

	public boolean agregarCliente(Cliente cliente) {
		boolean existe = ExisteCliente(cliente);
		if (existe != true) {
			this.clientes.add(cliente);
			return true;
		} else {
			return false;
		}
	}

	public Cliente buscarCliente(int numero) {
		for (Cliente c : this.clientes) {
			if (numero == c.getNumeroTelefono()) {
				return c;
			}
		}
		return null;
	}

	public boolean eliminarCliente(int numero) {
		Cliente cliente = buscarCliente(numero);
		if (cliente != null) {
			clientes.remove(cliente);
			return true;
		}
		return false;
	}

	public void actualizarCliente(String nombre, String direccion, int numerotelefono, String correo, Cliente c) {
		c.setNombre(nombre);
		c.setDireccion(direccion);
		c.setNumeroTelefono(numerotelefono);
		c.setCorreo(correo);
	}

	public String infoCliente(Cliente c) {
		String mensaje;
		mensaje = " Nombre :" + c.getNombre() + "\n Direccion :" + c.getDireccion() + "\n Numero :"
				+ c.getNumeroTelefono() + "\n Correo:" + c.getCorreo();
		return mensaje;
	}

}
