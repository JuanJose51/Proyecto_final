package Service;
import java.util.ArrayList;

public class Inventario {
	private String nombre;
	private ArrayList<Vehiculo> vehiculos; 
	public Inventario(String nombre) {
		this.nombre = nombre;
		this.vehiculos = new ArrayList<>(); 
	}
/*******************************
 *     METODOS DE AUTOMOVIL    *
 *******************************/
	
	public boolean crearAutomovil(Automovil automovil) {
		if(isAutomovilExistente(automovil) == false) {
			vehiculos.add(automovil);
			return true;
	}
	return false;
    }
	public boolean isAutomovilExistente(Automovil automovil) {
		for (Vehiculo v : vehiculos) {
		   String vid = automovil.getVid();
			if(v.getVid().equalsIgnoreCase(vid))
				return true;
		}
		return false;
	}
	public boolean eliminarAuntomovil(String vid) {
		for (Vehiculo v : vehiculos) {
			if(v.getVid().equalsIgnoreCase(vid))
				vehiculos.remove(v);
				return true;
		}
		return false;
	}

/*************************************
*   	METODOS DE MOTOCICLETA       *
*************************************/
	public boolean crearMotocicleta(Motocicleta motocicleta) {
		if(isMotocicletaExistente(motocicleta) == false) {
			vehiculos.add(motocicleta);
		    return true;
	}
	return false;
	}
	public boolean isMotocicletaExistente(Motocicleta motocicleta) {
		for (Vehiculo v : vehiculos) {
			String vid = motocicleta.getVid();
			if(v.getVid().equalsIgnoreCase(vid));
			    return true;
		}
		return false;
	}
	public boolean eliminalMOtocicleta(String vid) {
		for (Vehiculo v : vehiculos) {
			if(v.getVid().equalsIgnoreCase(vid));
			vehiculos.remove(v);
			    return true;
		}
		return false;
	}

/*******************************
*      METODOS DE CAMION      *
*******************************/
	public boolean crearCamion(Camion camion) {
		if(isCamionExistente(camion) == false) {
			vehiculos.add(camion);	
	        return true;
	}
	return false;
	}
	public boolean isCamionExistente(Camion camion) {
		for (Vehiculo v : vehiculos) {
			String vid = camion.getVid();
			if(v.getVid().equalsIgnoreCase(vid));
			    return true;
		}
		return false;
	}
	public boolean eliminarCamion(String vid) {
		for (Vehiculo v : vehiculos) {
			if(v.getVid().equalsIgnoreCase(vid));
			vehiculos.remove(v);
			    return true;
		}
		return false;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
