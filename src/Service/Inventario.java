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
	public void setRemoverVehiculo(Vehiculo vehiculo) {
		this.vehiculos.remove(vehiculo);
	}
	public void setAgregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	

}
