package modelo;

// objeto que usaremos de base para los involucrados en el restaurante
public class Persona {
	private static int contadorId = 1; // contador autoincremental
	
	private int id;
	private String cedula;
	private String nombre;
	private String direccion;
	private int telefono;


	// constructor de persona
	public Persona(String cedula, String nombre, String direccion, int telefono) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	// obtenemos la cedula del cliente
	public String getCedula() {
		return cedula;
	}
	
	// cambiamos la cedula del cliente
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	// obtenemos el ID del cliente 
	public int getId() {
		return id;
	}
	
	// cambiamos el ID del cliente
	public void setId(int id) {
		this.id = id;
	}
	
	// obtenemos nombre del cliente
	public String getNombre() {
		return nombre;
	}
	
	// cambiamos el nombre del cliente 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// obtenemos direccion del cliente 
	public String getDireccion() {
		return direccion;
	}
	// cambiamos direccion del cliente
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// obtenemos telefono del cliente
	public int getTelefono() {
		return telefono;
	}
	
	// cambiamos telefono del cliente
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	} 
	
	
}
