package modelo;

import java.util.ArrayList;
import java.util.List;

import Controlador.Restaurante;

public class main {

	public static void main(String[] args) {
		Comida pizza = new Comida(1, "pizza", "9.99", "buena", new ArrayList<>(List.of("harina", "huevo"))); 
		Cliente saregom = new Cliente(1, "20203412421", "saregom", "nose", 1234, pizza);
		
		Cliente jhojan = new Cliente(2, "20203412421", "jhojan", "nose", 1234, pizza);
		Comida hamburguesa = new Comida(2, "hamburgesa", "9.99", "buena", new ArrayList<>(List.of("harina", "huevo"))); 

		Restaurante donJuan = new Restaurante();
		
		donJuan.agregarCliente(saregom);
		donJuan.agregarCliente(jhojan);
		
		donJuan.agregarProducto(pizza);
		donJuan.agregarProducto(hamburguesa);
		System.out.println(donJuan.listarClientes()); 
		System.out.println(donJuan.listarProductos());

	}

}
