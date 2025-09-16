package app;

import java.util.ArrayList;
import java.util.List;

import Controlador.Restaurante;
import modelo.Cliente;
import modelo.Comida;
import view.MainWindow;

public class Main {
	public static void main(String[] args) {
		showWindow();
	}

	private static void showWindow() {
		Comida pizza = new Comida(1, "Pizza", 8.99, "Pizza 3 quesos con borde relleno de Cum", new ArrayList<>(List.of("Harina", "Huevo", "Queso")), "1.Realizar la masa, 2.Agregar ingredientes"); 
		Comida hamburguesa = new Comida(2, "Hamburgesa", 10.99, "Hamburguesa sencilla de la casa", new ArrayList<>(List.of("Pan", "Carne 230gr")), "1.Calentar la carte, 2. Agregar queso y lechuga, 3.Servir");
		Comida perroCaliente = new Comida(2, "Perro Caliente", 10.99, "Hamburguesa sencilla de la casa", new ArrayList<>(List.of("Pan", "Carne 230gr")), "1.Calentar la carte, 2. Agregar queso y lechuga, 3.Servir");
		Comida burrito = new Comida(2, "Burrito", 10.99, "Hamburguesa sencilla de la casa", new ArrayList<>(List.of("Pan", "Carne 230gr")), "1.Calentar la carte, 2. Agregar queso y lechuga, 3.Servir");
		
		Cliente saregom = new Cliente(1, "1019842178", "Saregom Gómez", "Cra 53C #128A - 47", 317083596, hamburguesa);
		Cliente jhojan = new Cliente(2, "1019292384", "Jhojan Stiven Smirnoff", "Calle 149A #32B - 10", 1234567891, pizza);
		Cliente kevin = new Cliente(1, "1019842178", "Kevin Ta Loco", "Cra 53C #128A - 47", 317083596, hamburguesa);
		Cliente Helio = new Cliente(2, "1019292384", "Profe Helio", "Calle 149A #32B - 10", 1234567891, pizza);
		
		Restaurante restauranteDonJuan = new Restaurante();
		
		restauranteDonJuan.agregarCliente(saregom);
		restauranteDonJuan.agregarCliente(jhojan);
		restauranteDonJuan.agregarCliente(kevin);
		restauranteDonJuan.agregarCliente(Helio);
		
		restauranteDonJuan.agregarProducto(pizza);
		restauranteDonJuan.agregarProducto(hamburguesa);
		restauranteDonJuan.agregarProducto(perroCaliente);
		restauranteDonJuan.agregarProducto(burrito);
		
		MainWindow window = new MainWindow(restauranteDonJuan);
		window.setVisible(true);
	}
}
