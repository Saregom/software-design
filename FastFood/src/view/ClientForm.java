package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controlador.Restaurante;
import modelo.Cliente;
import modelo.Comida;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ClientForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField documentField;
	private JTextField nameField;
	private JTextField addressField;
	private JTextField phoneField;
	JComboBox<Comida> favFoodComboBox;
	
	Restaurante restauranteDonJuan;
	Cliente editClient;
	ClientActions clientActions;

	/**
	 * Creacion y definicion de la ventana de formulario del cliente
	 */
	public ClientForm(Restaurante restauranteDonJuan, Cliente editClient, ClientActions clientActions) {
		this.restauranteDonJuan = restauranteDonJuan;
		this.editClient = editClient;
		this.clientActions = clientActions;
		
		setBounds(100, 100, 350, 460);
		setLocationRelativeTo(null);
		setTitle("Cliente");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel newClientTitle = new JLabel("Agregar nuevo cliente");
		newClientTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		newClientTitle.setHorizontalAlignment(SwingConstants.CENTER);
		newClientTitle.setBounds(36, 11, 262, 27);
		contentPane.add(newClientTitle);
		
		JLabel lblDocument = new JLabel("Cédula");
		lblDocument.setBounds(79, 49, 175, 14);
		contentPane.add(lblDocument);
		
		documentField = new JTextField();
		documentField.setBounds(79, 65, 175, 25);
		contentPane.add(documentField);
		documentField.setColumns(10);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(79, 101, 175, 14);
		contentPane.add(lblName);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(79, 117, 175, 25);
		contentPane.add(nameField);
		
		JLabel lblAddress = new JLabel("Dirección");
		lblAddress.setBounds(79, 153, 175, 14);
		contentPane.add(lblAddress);

		addressField = new JTextField();
		addressField.setColumns(10);
		addressField.setBounds(79, 169, 175, 25);
		contentPane.add(addressField);
		
		JLabel lblPhone = new JLabel("Teléfono");
		lblPhone.setBounds(79, 205, 219, 14);
		contentPane.add(lblPhone);

		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(79, 220, 175, 25);
		contentPane.add(phoneField);
		
		JLabel lblFavFood = new JLabel("Comida preferida");
		lblFavFood.setBounds(79, 256, 175, 14);
		contentPane.add(lblFavFood);

		favFoodComboBox = new JComboBox<>(restauranteDonJuan.getProductos().toArray(new Comida[0]));
		favFoodComboBox.setBounds(79, 270, 175, 25);
		contentPane.add(favFoodComboBox);
		
		JButton saveButton = new JButton("Guardar");
		saveButton.setBounds(79, 317, 175, 30);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addClient();
			}
		});
		getContentPane().add(saveButton);
		
		setFood();
		
	}
	
	// Agregar cliente al restaurante
	private void addClient() {
		Comida selectedFood = (Comida) favFoodComboBox.getSelectedItem(); 
		// campos vacios
        if (documentField.getText().isEmpty() || nameField.getText().isEmpty() || addressField.getText().isEmpty() || phoneField.getText().isEmpty() || selectedFood.getNombre().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Hay campos vacíos", "Alerta", JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        // verificar existencia de cliente
        if (editClient == null && restauranteDonJuan.verificarCedula(documentField.getText().trim())) {
        	JOptionPane.showMessageDialog(this, "La cédula ya existe", "Alerta", JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        String document = documentField.getText().trim();
        String name = nameField.getText().trim();
        String address = addressField.getText().trim();
        String phoneText = phoneField.getText().trim();

        // validar que el documento tenga numeros
        try {
            Long.parseLong(document); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa una cédula válida", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        // validar telefono
        int phone;
        try {
            phone = Integer.parseInt(phoneText); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un teléfono válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // si todo es valido, crear el cliente
        Cliente newClient = new Cliente(document, name, address, phone, selectedFood);

        // agregar o editar cliente
        if (editClient == null) {
            this.restauranteDonJuan.agregarCliente(newClient);
        } else {
            this.restauranteDonJuan.modificarCliente(newClient);
        }

        JOptionPane.showMessageDialog(this, "Cliente guardado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        clientActions.onClientSaved();
        setVisible(false);
	}
	
	// setear el cliente a editar en los campos del formulario
	private void setFood() {
		if (editClient != null) {
			documentField.setText(editClient.getCedula());
			documentField.setEnabled(false);
			nameField.setText(editClient.getNombre());
			addressField.setText(editClient.getDireccion());
			phoneField.setText(String.valueOf(editClient.getTelefono()));
			favFoodComboBox.setSelectedItem(editClient.getComida());
		}
	}
}
