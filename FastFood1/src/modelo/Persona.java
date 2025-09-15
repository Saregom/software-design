package modelo;

public class Persona {
	private int id;
	private String cedula;
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Persona(int id, String cedula, String nombre, String direccion, int telefono) {
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
		
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	} 
	
	
}
