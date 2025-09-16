package modelo;
import modelo.Persona;
import modelo.Comida;

public class Cliente extends Persona{
	private Comida comida;
	
	
	public Cliente(int id, String cedula, String nombre, String direccion, int telefono, Comida comida) {
		super(id, cedula, nombre, direccion, telefono);
		this.comida = comida; 
	}
	
	
	public Comida getComida() {
		return comida;
	}
	public void setComida(Comida comida) {
		this.comida = comida;
	}

	
}
