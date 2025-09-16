package Controlador;
import modelo.Comida;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Empleado;


public class Restaurante {
	private ArrayList<Comida> productos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Empleado> empleados;
	
	
	public Restaurante() {
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
		if (!verificarCedula(cliente.getCedula())) {
			clientes.add(cliente);
		}
	}
	
	// validar si el cliente ya existe
	public boolean verificarCedula(String nuevaCedula) {
		for (Cliente c : clientes) {
	        if (c.getCedula().toLowerCase().equals(nuevaCedula.toLowerCase())) {
	            return true;
	        }
	    }
		return false;
	}
	
	// Actualizamos informacion del cliente del restaurante.
	public void modificarCliente(Cliente cliente) {
		for(Cliente client:clientes) {
			if(client.getCedula().equals(cliente.getCedula())) {
				// si todo sale bien actualiza la informacion del cliente.
				client.setNombre(cliente.getNombre());
				client.setDireccion(cliente.getDireccion());
				client.setTelefono(cliente.getTelefono());
				client.setComida(cliente.getComida());
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
		if (!verificarProducto(producto.getNombre())) {
			productos.add(producto);
		}
	}
	
	// validar si el producto ya existe
	public boolean verificarProducto(String nuevoNombre) {
		for (Comida p : productos) {
	        if (p.getNombre().toLowerCase().equals(nuevoNombre.toLowerCase())) {
	            return true;
	        }
	    }
		return false;
	}
	
	// modificamos la comida
	public void modificarProducto(Comida producto) {
		// hacer validaciones extra si es necesario, si existe, tiene mismo nombre pero ingredientes direfentes no se (Borrar este comentario)
		for(Comida comida:productos) {
			if(comida.getNombre().equals(producto.getNombre())) {
				// si todo sale bien actualiza la informacion del cliente.
				comida.setPrecio(producto.getPrecio());
				comida.setDescripcion(producto.getDescripcion());
				comida.setIngredientes(producto.getIngredientes());
				comida.setReceta(producto.getReceta());
			}
		}
		
	}
	
	// eliminamos la comida del restaurante. 
	public void eliminarProducto(Comida producto) {
		productos.remove(producto);
	}
	
	
	public ArrayList<Comida> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Comida> productos) {
		this.productos = productos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados( ArrayList<Empleado>  empleados) {
		this.empleados = empleados;
	}
	
}
