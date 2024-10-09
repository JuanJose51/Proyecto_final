package Service;

public class Automovil extends Vehiculo {
	protected int numPuertas;
	protected String tipoCombustible;
	protected String tipoTransmicion;
	protected String tipoTraccion;
	public Automovil(String marca, String modelo, String vid, String color, int kilometrage, String año, int numPuertas,
			String tipoCombustible, String tipoTransmicion, String tipoTraccion) {
		super(marca, modelo, vid, color, kilometrage, año);
		this.numPuertas = numPuertas;
		this.tipoCombustible = tipoCombustible;
		this.tipoTransmicion = tipoTransmicion; 
		this.tipoTraccion = tipoTraccion;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public String getTipoTransmicion() {
		return tipoTransmicion;
	}
	public void setTipoTransmicion(String tipoTransmicion) {
		this.tipoTransmicion = tipoTransmicion;
	}
	public String getTipoTraccion() {
		return tipoTraccion;
	}
	public void setTipoTraccion(String tipoTaccion) {
		this.tipoTraccion = tipoTaccion;
	}
	

}
