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
	

}
