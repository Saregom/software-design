package modelo;
import modelo.Persona;
public class Empleado extends Persona{
	private String cargo;
	private String contrasenia;
	public Empleado(int id, String cedula, String nombre, String direccion, int telefono, String cargo, String contrasenia) {
		super(id, cedula, nombre, direccion, telefono);
		this.setCargo(cargo);
		this.setContrasenia(contrasenia);
		
		// TODO Auto-generated constructor stub
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
