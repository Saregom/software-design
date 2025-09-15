package Controlador;
import modelo.Comida;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Empleado;


public class Restaurante {
	private ArrayList<Comida> productos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Empleado> empleados;
	
	
	public Restaurante(Comida[] productos, Cliente[] clientes,Empleado[] empleados) {
		this.productos = new ArrayList<Comida>();
		this.clientes = new ArrayList<Cliente>();
		this.empleados = new ArrayList<Empleado>();
	}
	
	// listamos Todos lo cliente
	public ArrayList<Cliente> listarClientes() {
		return clientes;
	}
	
	// Lo agregamos a la lista de clientes del restaurante. 
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	// Actualizamos informacion del cliente del restaurante.
	public void modificarCliente(Cliente cliente) {
		for(Cliente client:clientes) {
			if(client.getCedula().equals(cliente.getCedula())) {
				// si todo sale bien actualiza la informacion del cliente.
				
				// ACA validar si la comida del cliente existe. no se paque pero bueno
				
				client.setComida(cliente.getComida());
				client.setDireccion(cliente.getDireccion());
				client.setNombre(cliente.getNombre());
				client.setTelefono(cliente.getTelefono());
			}
		}
	}
	
	// eliminamos al cliente de la lista del restaurante
	public void eliminarCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	
	// listamos toda la comida disponible del restaurante. 
	public ArrayList<Comida> listarProductos() {
		return productos;
	}
	
	// agregamos una comida a la carta del restaurante.
	public void agregarProducto(Comida producto) {
		productos.add(producto);
	}
	
	// modificamos la comida
	public void modificarProducto(Comida producto) {
		// hacer validaciones extra si es necesario, si existe, tiene mismo nombre pero ingredientes direfentes no se (Borrar este comentario)
		for(Comida comida:productos) {
			if(comida.getNombre().equals(producto.getNombre())) {
				// si todo sale bien actualiza la informacion del cliente.
				
				// ACA validar si la comida del cliente existe. no se paque pero bueno
				
				comida.setDescripcion(producto.getDescripcion());
				comida.setNombre(producto.getNombre());
				comida.setPrecio(producto.getPrecio());
				comida.setIngredientes(producto.getIngredientes());
			}
		}
		
	}
	
	public void eliminarProducto(Comida producto) {
		
	}
	
	
	public Comida[] getProductos() {
		return productos;
	}

	public void setProductos(Comida[] productos) {
		this.productos = productos;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
}
