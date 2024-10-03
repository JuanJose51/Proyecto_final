package Service;
import java.util.ArrayList;

public class Inventario {
	private String nombre;
	private ArrayList<Vehiculo> vehiculos; 
	public Inventario(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new ArrayList<>(); 
	}
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	

}
