package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

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
        clientsList.setLayout(new BoxLayout(clientsList, BoxLayout.X_AXIS));

        JScrollPane scrollPane = new JScrollPane(clientsList);
        scrollPane.setBounds(0, 50, 704, 256);
        add(scrollPane);

        for (int i = 1; i <= 10; i++) {
            JPanel client = new JPanel();
            client.setBackground(new Color(255, 255, 255));
            client.setPreferredSize(new Dimension(205, 190));
            client.setLayout(null);

            // Panel principal del cliente
            JPanel clientMainInfo = new JPanel();
            clientMainInfo.setBounds(0, 0, 200, 45);
            client.add(clientMainInfo);
            clientMainInfo.setLayout(new GridLayout(0, 1, 0, 0));

            JLabel name = new JLabel("<html>Pancho Perez</html>");
            name.setBackground(new Color(210, 210, 210));
            name.setHorizontalAlignment(SwingConstants.CENTER);
            name.setFont(new Font("Tahoma", Font.BOLD, 14));
            clientMainInfo.add(name);

            // Detalles del cliente
            JPanel clientDetails = new JPanel();
            clientDetails.setBounds(0, 45, 200, 100);
            client.add(clientDetails);
            clientDetails.setLayout(new BoxLayout(clientDetails, BoxLayout.Y_AXIS));

            JLabel document = new JLabel("Cédula");
            document.setFont(new Font("Tahoma", Font.BOLD, 11));
            document.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(document);

            JLabel documentID = new JLabel("1019842178");
            documentID.setFont(new Font("Tahoma", Font.PLAIN, 11));
            documentID.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(documentID);

            JLabel address = new JLabel("Dirección");
            address.setFont(new Font("Tahoma", Font.BOLD, 11));
            address.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(address);

            JLabel addressValue = new JLabel("Cra 53C #128B - 20");
            addressValue.setFont(new Font("Tahoma", Font.PLAIN, 11));
            addressValue.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(addressValue);

            JLabel phone = new JLabel("Teléfono");
            phone.setFont(new Font("Tahoma", Font.BOLD, 11));
            phone.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(phone);

            JLabel phoneNumber = new JLabel("3170835965");
            phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
            phoneNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
            clientDetails.add(phoneNumber);

            // Comida favorita
            JPanel favFoodPanel = new JPanel();
            favFoodPanel.setBounds(0, 145, 200, 45);
            client.add(favFoodPanel);
            favFoodPanel.setLayout(new BoxLayout(favFoodPanel, BoxLayout.Y_AXIS));

            JLabel favFood = new JLabel("Comida preferida");
            favFood.setFont(new Font("Tahoma", Font.BOLD, 11));
            favFood.setAlignmentX(Component.CENTER_ALIGNMENT);
            favFoodPanel.add(favFood);

            JLabel favFoodValue = new JLabel("Hamburguesa");
            favFoodValue.setFont(new Font("Tahoma", Font.PLAIN, 11));
            favFoodValue.setAlignmentX(Component.CENTER_ALIGNMENT);
            favFoodPanel.add(favFoodValue);
            
            JPanel panel = new JPanel();
            panel.setBounds(0, 190, 200, 45);
            client.add(panel);
            panel.setLayout(new GridLayout(1, 0, 0, 0));
            
            JButton editButton = new JButton("Editar");
            panel.add(editButton);
            
            JButton btnNewButton_1 = new JButton("Eliminar");
            panel.add(btnNewButton_1);
            
            clientsList.add(client);
        }
        
        JButton addButton = new JButton("Agregar cliente");
        addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        addButton.setBounds(277, 317, 150, 29);
        add(addButton);
    }
}