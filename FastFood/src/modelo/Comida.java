package modelo;
import java.util.ArrayList;
public class Comida {
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private ArrayList<String> ingredientes = new ArrayList<>();
	private String receta;
	
	public Comida(int id, String nombre, double precio, String descripcion, ArrayList<String> ingredientes, String receta){
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.ingredientes = ingredientes;
		this.receta = receta;
	}
	
	public Comida(int i, String string, String string2, String string3, ArrayList<String> arrayList) {
		// TODO Auto-generated constructor stub
	}

	public void addIngredients(ArrayList<String> nuevosIngredientes) {
		ingredientes.addAll(nuevosIngredientes);
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<String> NuevosIngredientes) {
		ingredientes = NuevosIngredientes;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	
	
}
