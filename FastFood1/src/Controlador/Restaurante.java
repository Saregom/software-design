package Controlador;
import modelo.Comida;
import modelo.Cliente;
import modelo.Empleado;
public class Restaurante {
	private Comida[] productos;
	private Cliente[] clientes;
	private Empleado[] empleados;
	public Restaurante(Comida[] productos, Cliente[] clientes,Empleado[] empleados) {
		this.productos = productos;
		this.clientes = clientes;
		this.empleados = empleados;
	}
	public Cliente[] listarClientes() {
		return null;
	}
	public void agregarCliente(Cliente cliente) {
		
	}
	public void modificarCliente(Cliente cliente) {
		
	}
	public void eliminarCliente(Cliente cliente) {
		
	}
	public Comida[] listarProductos() {
		return null;
	}
	public void agregarProducto(Comida producto) {
		
	}
	public void modificarProducto(Comida producto) {
		
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
