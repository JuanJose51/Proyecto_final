package Service;

public class Motocicleta extends Vehiculo {
	protected String tipoManillar;
	protected int numRuedas;
	protected String tipoFreno;
	protected String cilindrada;
	public Motocicleta(String marca, String modelo, String vid, String color, int kilometrage, String año,
			String tipoManillar, int numRuedas, String tipoFreno, String cilindrada) {
		super(marca, modelo, vid, color, kilometrage, año);
		this.tipoManillar = tipoManillar;
		this.numRuedas = numRuedas;
		this.tipoFreno = tipoFreno;
		this.cilindrada = cilindrada;
	}
	public String getTipoManillar() {
		return tipoManillar;
	}
	public void setTipoManillar(String tipoManillar) {
		this.tipoManillar = tipoManillar;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String getTipoFreno() {
		return tipoFreno;
	}
	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
}
