package Service;

public class Cliente {
	private String nombre;
	private String direccion;
	private int numeroTelefono;
	private String correo;
	public Cliente(String nombre, String direccion, int numeroTelefono, String correo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTelefono = numeroTelefono;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
