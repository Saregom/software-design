package modelo;
import modelo.Persona;
import modelo.Comida;


// extendemos a la clase persona
public class Cliente extends Persona{
	// definimos atributos del cliente
	private Comida comida;
	
	// constructor para nuestro cliente
	public Cliente(int id, String cedula, String nombre, String direccion, int telefono, Comida comida) {
		// heredamos los atributos de persona
		super(id, cedula, nombre, direccion, telefono);
		this.comida = comida; 
	}
	
	// obtenemos lo que es el objeto comida del cliente
	public Comida getComida() {
		return comida;
	}
	
	// cambiamos comida del cliente
	public void setComida(Comida comida) {
		this.comida = comida;
	}
	
}
