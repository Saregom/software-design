package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class Clients extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Clients() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 40, 704, 401);
		setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Clientes");
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(140, 11, 440, 28);
        add(lblNewLabel);
        
        JPanel clientsList = new JPanel();
        clientsList.setBackground(new Color(255, 255, 255));

        JScrollPane scrollPane_1 = new JScrollPane(clientsList);
        clientsList.setLayout(new BoxLayout(clientsList, BoxLayout.Y_AXIS));
        
        JPanel client = new JPanel();
        client.setBackground(new Color(255, 255, 255));
        clientsList.add(client);
        client.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 200, 45);
        client.add(panel);
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        
        JLabel name = new JLabel("<html>Pancho Perez</html>");
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 45, 200, 113);
        client.add(panel_1);
        scrollPane_1.setBounds(0, 50, 704,300);
        add(scrollPane_1);
	}

}
