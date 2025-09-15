package mainPackage;

import gui.MainWindow;

public class Main {
	public static void main(String[] args) {
		System.out.print(0);
		showWindow();
	}

	private static void showWindow() {
		MainWindow window = new MainWindow();
		window.setVisible(true);
	}
}
