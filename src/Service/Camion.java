package Service;

public class Camion extends Vehiculo {
	protected String capacidadCarga;
	protected String tipoCamion;
	protected int longitud;
	protected int numEjes;
	public Camion(String marca, String modelo, String vid, String color, int kilometrage, String año,
			String capacidadCarga, String tipoCamion, int longitud, int numEjes) {
		super(marca, modelo, vid, color, kilometrage, año);
		this.capacidadCarga = capacidadCarga;
		this.tipoCamion = tipoCamion;
		this.longitud = longitud;
		this.numEjes = numEjes;
	}
	public String getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(String capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public String getTipoCamion() {
		return tipoCamion;
	}
	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getNumEjes() {
		return numEjes;
	}
	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
}
