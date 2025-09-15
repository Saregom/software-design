package modelo;
import java.util.ArrayList;
public class Comida {
	private int id;
	private String nombre;
	private String precio;
	private String descripcion;
	private ArrayList<String> Ingredientes = new ArrayList<>();
	
	Comida(int id, String nombre, String precio, String descripcion){
		
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<String> getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(ArrayList<String> ingredientes) {
		Ingredientes = ingredientes;
	}
	
}
