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
		Comida pizza = new Comida(
		    "Pizza 3 Quesos",
		    8.99,
		    "Pizza artesanal con mezcla de mozzarella, parmesano y queso azul, al horno con borde crujiente.",
		    new ArrayList<>(List.of("Masa de pizza", "Salsa de tomate", "Queso mozzarella", "Queso parmesano", "Queso azul", "Orégano", "Aceite de oliva")),
		    "1. Precalentar el horno a 220°C. 2. Estirar la masa y untar la salsa. 3. Añadir los quesos y orégano. 4. Hornear 12 minutos hasta gratinar. 5. Cortar y servir caliente."
		);

		Comida hamburguesa = new Comida(
		    "Hamburguesa Sencilla",
		    10.99,
		    "Hamburguesa clásica con carne de res 120g, queso cheddar, vegetales frescos y pan tostado.",
		    new ArrayList<>(List.of("Pan para hamburguesa", "Carne de res molida", "Queso cheddar", "Lechuga", "Tomate", "Cebolla", "Mayonesa", "Kétchup")),
		    "1. Formar y cocinar la carne en la plancha. 2. Colocar el queso encima para derretir. 3. Tostar ligeramente el pan. 4. Armar con lechuga, tomate, cebolla y salsas. 5. Servir con papas fritas."
		);

		Comida perroCaliente = new Comida(
		    "Perro Caliente Italiano",
		    9.99,
		    "Salchicha italiana en pan suave con pimientos, cebolla salteada, salsa marinara y queso mozzarella gratinado.",
		    new ArrayList<>(List.of("Pan de perro caliente", "Salchicha italiana", "Pimiento rojo", "Pimiento verde", "Cebolla", "Salsa marinara", "Queso mozzarella")),
		    "1. Saltear pimientos y cebolla. 2. Cocinar la salchicha en plancha. 3. Colocar en el pan con vegetales. 4. Añadir salsa marinara y queso. 5. Gratinar en horno 3 minutos y servir."
		);

		Comida burrito = new Comida(
		    "Burrito",
		    11.49,
		    "Tortilla de harina rellena de arroz, frijoles, carne desmechada, queso y pico de gallo, sellada a la plancha.",
		    new ArrayList<>(List.of("Tortilla de harina", "Arroz cocido", "Frijoles negros", "Carne desmechada", "Queso rallado", "Pico de gallo", "Guacamole")),
		    "1. Calentar la tortilla en plancha. 2. Colocar arroz, frijoles, carne y queso. 3. Añadir pico de gallo y guacamole. 4. Enrollar cerrando bien los extremos. 5. Sellar en la plancha y servir."
		);
		
		Cliente saregom = new Cliente("1019842178", "Saregom Gómez", "Cra 53C #128A - 47", 317083596, hamburguesa);
		Cliente jhojan = new Cliente("1019292384", "Jhojan Stiven Smirnoff", "Calle 149A #32B - 10", 1234567891, pizza);
		Cliente kevin = new Cliente("1017343171", "Kevin El Ñangas", "Cra 23C #131D - 17", 309283536, burrito);
		Cliente Helio = new Cliente("1982292381", "Messi Ronaldo", "Calle 1 #1B - 1", 111111111, perroCaliente);
		
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
