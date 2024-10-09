package Service;
import java.time.LocalDate;

public class Venta {
	private Cliente clienteComprador;
	private Vehiculo vehiculoComprado;
	private LocalDate fechaVenta;
	public Venta(Cliente clientescompradores, Vehiculo vehiculosComprados) {
		super();
		this.clienteComprador = clientescompradores;
		this.vehiculoComprado = vehiculosComprados;
		this.fechaVenta = LocalDate.now();
	}
	public Cliente getClienteComprador() {
		return clienteComprador;
	}
	public void setClienteComprador(Cliente clientescompradores) {
		this.clienteComprador = clientescompradores;
	}
	public Vehiculo getVehiculosComprados() {
		return vehiculoComprado;
	}
	public void setVehiculosComprados(Vehiculo vehiculosComprados) {
		this.vehiculoComprado = vehiculosComprados;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
}
