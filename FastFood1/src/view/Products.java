package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Component;

public class Products extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Products() {
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
        
	    for (int i = 1; i <= 10; i++) {
	        JPanel product = new JPanel();
	        product.setBackground(new Color(255, 255, 255));
	        product.setPreferredSize(new Dimension(667, 139));
	        productsList.add(product);
	        product.setLayout(null);
	        
	        JPanel productIngredients = new JPanel();
	        productIngredients.setBounds(140, 0, 171, 134);
	        product.add(productIngredients);
	        productIngredients.setLayout(new BoxLayout(productIngredients, BoxLayout.Y_AXIS));
	        
	        JLabel IngredientsTitle = new JLabel("Ingredientes");
	        IngredientsTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
	        productIngredients.add(IngredientsTitle);
	        
	        JLabel ingredient_1 = new JLabel("Carne 230g");
	        ingredient_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productIngredients.add(ingredient_1);
	        
	        JLabel ingredient_2 = new JLabel("Pan");
	        ingredient_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productIngredients.add(ingredient_2);
	        
	        JLabel ingredient_3 = new JLabel("Lechuga");
	        ingredient_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productIngredients.add(ingredient_3);
	        
	        JLabel ingredient_4 = new JLabel("Queso");
	        ingredient_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productIngredients.add(ingredient_4);
	        
	        JPanel productMainPanel = new JPanel();
	        productMainPanel.setBounds(0, 0, 140, 134);
	        product.add(productMainPanel);
	        productMainPanel.setLayout(new BoxLayout(productMainPanel, BoxLayout.Y_AXIS));
	        
	        JLabel foodName = new JLabel("<html>Hamburguesa</html>");
	        foodName.setFont(new Font("Tahoma", Font.BOLD, 14));
	        productMainPanel.add(foodName);
	        
	        JLabel price = new JLabel("$10000");
	        price.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productMainPanel.add(price);
	        
	        JLabel description = new JLabel("<html>Hamburguesa simple con carne y queso</html>");
	        description.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productMainPanel.add(description);
	        
	        JPanel productRecipe = new JPanel();
	        productRecipe.setBounds(311, 0, 312, 134);
	        product.add(productRecipe);
	        productRecipe.setLayout(new BoxLayout(productRecipe, BoxLayout.Y_AXIS));
	        
	        JLabel preparationTitle = new JLabel("Preparación");
	        preparationTitle.setAlignmentY(Component.TOP_ALIGNMENT);
	        preparationTitle.setVerticalAlignment(SwingConstants.TOP);
	        preparationTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
	        productRecipe.add(preparationTitle);
	        
	        JLabel preparationDetails = new JLabel("<html>Primero calentar la carne, luego aregar especies al gusto de kevin, Primero calentar la carne, luego aregar especies al gusto de kevin, Primero calentar la carne, luego aregar especies al gusto de kevin</html>");
	        preparationDetails.setFont(new Font("Tahoma", Font.PLAIN, 11));
	        productRecipe.add(preparationDetails);
	        
	        JPanel productButtons = new JPanel();
	        productButtons.setBounds(623, 0, 64, 134);
	        product.add(productButtons);
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
	        
	        productsList.add(product);
		}
        
        JButton addButton = new JButton("Agregar producto");
        addButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        addButton.setBounds(277, 361, 150, 29);
        add(addButton);
	}
}
