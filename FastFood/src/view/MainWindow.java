package view;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Restaurante;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Clients clients;
	Products productsPanel;
	
	Restaurante RestauranteDonJuan;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainWindow frame = new MainWindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();	
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainWindow(Restaurante RestauranteDonJuan) {
		this.RestauranteDonJuan = RestauranteDonJuan;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		setLocationRelativeTo(null);
		setTitle("Comida Rapida");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		Header header = new Header(new AppActions() {
			@Override
		    public void showPanel(int index) {
		        if (index == 0) {
		        	productsPanel.setVisible(true);
		        	clients.setVisible(false);
		        } else if (index == 1) {
		        	productsPanel.setVisible(false);
		        	clients.setVisible(true);
		        }
		    }
		});
		contentPane.add(header);
		
		productsPanel = new Products(RestauranteDonJuan);
		contentPane.add(productsPanel);
		
		clients = new Clients(RestauranteDonJuan);
		contentPane.add(clients);
	}
	
}

interface AppActions {
	void showPanel(int index);
}