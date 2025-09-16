package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controlador.Restaurante;
import modelo.Comida;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

public class Products extends JPanel {

	private static final long serialVersionUID = 1L;
	private ProductForm productForm;
	Restaurante restauranteDonJuan;

	/**
	 * Create the panel.
	 */
	public Products(Restaurante restauranteDonJuan) {
		this.restauranteDonJuan = restauranteDonJuan;
		
		setBackground(new Color(255, 255, 255));
		setBounds(0, 40, 704, 401);
		setLayout(null);
		
        JLabel TitlePage = new JLabel("Productos");
        TitlePage.setBackground(new Color(255, 255, 255));
        TitlePage.setFont(new Font("Tahoma", Font.BOLD, 15));
        TitlePage.setHorizontalAlignment(SwingConstants.CENTER);
        TitlePage.setBounds(140, 11, 440, 28);
        add(TitlePage);
		
        JPanel productsList = new JPanel();
        productsList.setBackground(new Color(255, 255, 255));

        JScrollPane scrollPane_1 = new JScrollPane(productsList);
        productsList.setLayout(new BoxLayout(productsList, BoxLayout.Y_AXIS));
        scrollPane_1.setBounds(0, 50, 704,300);
        add(scrollPane_1);
        
        getProducts(productsList);
        
        JButton addButton = new JButton("Agregar producto");
        addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        addButton.setBounds(277, 361, 150, 29);
        addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productForm = new ProductForm(restauranteDonJuan, new ProductActions() {
					@Override
					public void onProductAdded() {
						getProducts(productsList); 
					}
				});
			    productForm.setVisible(true);
			}
		});
        add(addButton);
	}
	
	private void getProducts(JPanel productsList) {
		productsList.removeAll(); // limpiar panel
		
		for (Comida food : this.restauranteDonJuan.listarProductos()) {
	        JPanel productPanel = new JPanel();
	        productPanel.setBackground(new Color(255, 255, 255));
	        productPanel.setPreferredSize(new Dimension(667, 139));
	        productsList.add(productPanel);
	        productPanel.setLayout(null);
	        
	        // panel info principal
	        JPanel productMainPanel = new JPanel();
	        productMainPanel.setBounds(0, 0, 140, 134);
	        productPanel.add(productMainPanel);
	        productMainPanel.setLayout(new BoxLayout(productMainPanel, BoxLayout.Y_AXIS));
	        
	        JLabel foodName = new JLabel("<html>"+food.getNombre()+"</html>");
	        foodName.setFont(new Font("Tahoma", Font.BOLD, 14));
	        productMainPanel.add(foodName);
	        
	        JLabel price = new JLabel(String.valueOf(food.getPrecio()));
	        price.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productMainPanel.add(price);
	        
	        JLabel description = new JLabel("<html>"+food.getDescripcion()+"</html>");
	        description.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productMainPanel.add(description);
	        
	        // panel ingredientes 
	        JPanel productIngredients = new JPanel();
	        productIngredients.setBounds(140, 0, 171, 134);
	        productPanel.add(productIngredients);
	        productIngredients.setLayout(new BoxLayout(productIngredients, BoxLayout.Y_AXIS));
	        
	        JLabel IngredientsTitle = new JLabel("Ingredientes");
	        IngredientsTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
	        productIngredients.add(IngredientsTitle);
	        
	        for(String ingredient : food.getIngredientes()) {
	        	JLabel ingredient_1 = new JLabel(ingredient);
		        ingredient_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		        productIngredients.add(ingredient_1);
	        }
	        
	        JPanel recipePanel = new JPanel();
	        recipePanel.setBounds(311, 0, 312, 134);
	        productPanel.add(recipePanel);
	        recipePanel.setLayout(new BoxLayout(recipePanel, BoxLayout.Y_AXIS));
	        
	        JLabel recipeTitle = new JLabel("Preparación");
	        recipeTitle.setAlignmentY(Component.TOP_ALIGNMENT);
	        recipeTitle.setVerticalAlignment(SwingConstants.TOP);
	        recipeTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
	        recipePanel.add(recipeTitle);
	        
	        JLabel recipeDetails = new JLabel("<html>"+food.getReceta()+"</html>");
	        recipeDetails.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        recipePanel.add(recipeDetails);
	        
	        JPanel productButtons = new JPanel();
	        productButtons.setBounds(623, 0, 64, 134);
	        productPanel.add(productButtons);
	        productButtons.setLayout(new GridLayout(0, 1, 0, 0));
	        
	        JLabel lblNewLabel_7 = new JLabel("Editar");
	        lblNewLabel_7.setForeground(new Color(0, 255, 64));
	        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
	        productButtons.add(lblNewLabel_7);
	        
	        JLabel lblNewLabel_8 = new JLabel("Eliminar");
	        lblNewLabel_8.setForeground(new Color(255, 0, 0));
	        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
	        productButtons.add(lblNewLabel_8);
	        
	        productsList.add(productPanel);
		}

	    productsList.revalidate(); 
	    productsList.repaint(); 
	}
}

// para que el formulario de producto pueda refrescar la lista de productos
interface ProductActions {
    void onProductAdded();
}
