package Service;
import java.util.ArrayList;
import java.time.LocalDate;

public class Mantenimiento {
	private Vehiculo vehiculoMantenimiento;
	private ArrayList<String> tipoMantenimiento;
	private ArrayList<Integer> costoMantenimiento;
	private ArrayList<LocalDate> fechaMantenimiento;
	public Mantenimiento(Vehiculo vehiculoMantenimiento) {
		super();
		this.vehiculoMantenimiento = vehiculoMantenimiento;
		this.tipoMantenimiento = new ArrayList<>();
		this.costoMantenimiento = new ArrayList<>();
		this.fechaMantenimiento = new ArrayList<>();
	}
	public Vehiculo getVehiculoMantenimiento() {
		return vehiculoMantenimiento;
	}
	public void setVehiculoMantenimiento(Vehiculo vehiculoMantenimiento) {
		this.vehiculoMantenimiento = vehiculoMantenimiento;
	}
	public ArrayList<String> getTipoMantenimiento() {
		return tipoMantenimiento;
	}
	public void setTipoMantenimiento(String tipoMantenimiento) {
		this.tipoMantenimiento.add(tipoMantenimiento);
	}
	public ArrayList<Integer> getCostoMantenimiento() {
		return costoMantenimiento;
	}
	public void setCostoMantenimiento(int costoMantenimiento) {
		this.costoMantenimiento.add(costoMantenimiento);
	}
	public ArrayList<LocalDate> getFechaMantenimiento() {
		return fechaMantenimiento;
	}
	public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
		this.fechaMantenimiento.add(fechaMantenimiento);
	}
	
}
	


