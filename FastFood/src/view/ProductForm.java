package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controlador.Restaurante;
import modelo.Comida;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ProductForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField priceField;
	private JTextField descriptionField;
	private JTextField ingredientsField;
	private JTextArea recipeField;
	
	Restaurante restauranteDonJuan;
	ProductActions productActions;

	/**
	 * Create the panel.
	 */
	public ProductForm(Restaurante restauranteDonJuan, ProductActions productActions) {
		this.restauranteDonJuan = restauranteDonJuan;
		this.productActions = productActions;
		
		setBounds(100, 100, 350, 460);
		setLocationRelativeTo(null);
		setTitle("Producto");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel newProductTitle = new JLabel("Agregar nuevo producto");
		newProductTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		newProductTitle.setHorizontalAlignment(SwingConstants.CENTER);
		newProductTitle.setBounds(36, 11, 262, 27);
		contentPane.add(newProductTitle);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setBounds(79, 49, 175, 14);
		contentPane.add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(79, 65, 175, 25);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblPrice = new JLabel("Precio");
		lblPrice.setBounds(79, 101, 175, 14);
		contentPane.add(lblPrice);
		
		priceField = new JTextField();
		priceField.setColumns(10);
		priceField.setBounds(79, 117, 175, 25);
		contentPane.add(priceField);
		
		JLabel lblDescription = new JLabel("Descripción");
		lblDescription.setBounds(79, 153, 175, 14);
		contentPane.add(lblDescription);

		descriptionField = new JTextField();
		descriptionField.setColumns(10);
		descriptionField.setBounds(79, 169, 175, 25);
		contentPane.add(descriptionField);
		
		JLabel lblIngredients = new JLabel("Ingredientes");
		lblIngredients.setBounds(79, 205, 219, 14);
		contentPane.add(lblIngredients);
		
		JLabel lblIngredientes2 = new JLabel("(Separados por comas)");
		lblIngredientes2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblIngredientes2.setBounds(79, 217, 219, 14);
		contentPane.add(lblIngredientes2);

		ingredientsField = new JTextField();
		ingredientsField.setColumns(10);
		ingredientsField.setBounds(79, 232, 175, 25);
		contentPane.add(ingredientsField);
		
		JLabel lblRecipe = new JLabel("Receta");
		lblRecipe.setBounds(79, 268, 175, 14);
		contentPane.add(lblRecipe);
		
		recipeField = new JTextArea();
		recipeField.setLineWrap(true);    
		recipeField.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(recipeField);
		scrollPane.setBounds(79, 283, 175, 63);
		contentPane.add(scrollPane);
		
		JButton saveButton = new JButton("Guardar");
		saveButton.setBounds(79, 357, 175, 30);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProduct();
			}
		});
		getContentPane().add(saveButton);
		
	}
	
	// Agregar producto al restaurante
	private void addProduct() {
		// campos vacios
        if (nameField.getText().isEmpty() || priceField.getText().isEmpty() || descriptionField.getText().isEmpty() || ingredientsField.getText().isEmpty() || recipeField.getText().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Hay campos vacios", "Alerta", JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        try {
	    	String nombre = nameField.getText().trim();
	        double precio = Double.parseDouble(priceField.getText().trim());
	        String descripcion = descriptionField.getText().trim();
	        ArrayList<String> ingredientes = new ArrayList<>(
				Arrays.asList(ingredientsField.getText().split(","))
	        );
	        String receta = recipeField.getText().trim();
	  
	        Comida newProduct = new Comida(1, nombre, precio, descripcion, ingredientes, receta);
	        
	        this.restauranteDonJuan.agregarProducto(newProduct); // adicion
	        
	        JOptionPane.showMessageDialog(this, "Producto agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	        productActions.onProductAdded();
	        
	        setVisible(false);
	        
        } catch (NumberFormatException e) {
        	JOptionPane.showMessageDialog(this, "Ingresa un precio valido", "Error", JOptionPane.ERROR_MESSAGE);
        } 
	}
}
