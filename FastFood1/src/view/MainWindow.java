package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame implements AppActions{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Clients clients;
	Products productsPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();	
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Comida Rapida");
		setLocationRelativeTo(null);
	
		Header header = new Header(this);
		contentPane.add(header);
		
		productsPanel = new Products();
		contentPane.add(productsPanel);
		
		clients = new Clients();
		contentPane.add(clients);
	}
	
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
}

interface AppActions {
	void showPanel(int index);
}