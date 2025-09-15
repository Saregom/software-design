package gui;

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

public class Recipes extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Recipes() {
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
        
        JPanel product = new JPanel();
        product.setBackground(new Color(255, 255, 255));
        product.setPreferredSize(new Dimension(667, 122));
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
        productMainPanel.add(price);
        
        JLabel description = new JLabel("<html>Hamburguesa simple con carne y queso</html>");
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
        
//	    for (int i = 1; i <= 10; i++) {
//	    	JPanel recipe = new JPanel();
//	        recipe.setBackground(new Color(255, 255, 255));
//	        recipe.setPreferredSize(new Dimension(667, 122));
//	        recipesList.add(recipe);
//	        recipe.setLayout(null);
//	        
//	        JPanel recipeDetails = new JPanel();
//	        recipeDetails.setBounds(140, 0, 171, 134);
//	        recipe.add(recipeDetails);
//	        recipeDetails.setLayout(new BoxLayout(recipeDetails, BoxLayout.Y_AXIS));
//	        
//	        JLabel lblNewLabel_1 = new JLabel("Ingredientes");
//	        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
//	        recipeDetails.add(lblNewLabel_1);
//	        
//	        JLabel lblNewLabel_2 = new JLabel("Carne 230g");
//	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
//	        recipeDetails.add(lblNewLabel_2);
//	        
//	        JLabel lblNewLabel_3 = new JLabel("Pan");
//	        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
//	        recipeDetails.add(lblNewLabel_3);
//	        
//	        JLabel lblNewLabel_4 = new JLabel("Lechuga");
//	        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
//	        recipeDetails.add(lblNewLabel_4);
//	        
//	        JLabel lblNewLabel_5 = new JLabel("Queso");
//	        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
//	        recipeDetails.add(lblNewLabel_5);
//	        
//	        JPanel recipeImagePanel = new JPanel();
//	        recipeImagePanel.setBounds(0, 0, 140, 134);
//	        recipe.add(recipeImagePanel);
//	        recipeImagePanel.setLayout(null);
//	        
//	        JLabel recipeImage = new JLabel();
//	        recipeImage.setBounds(20, 22, 100, 100);
//	        ImageIcon imageIcon = new ImageIcon(
//	    	    getClass().getResource("/gui/assets/hamburguesa.jpg")
//	    	);
//	    	recipeImage.setIcon(new ImageIcon(
//	    	    imageIcon.getImage().getScaledInstance(111, 80, Image.SCALE_DEFAULT)
//	    	));
//	        recipeImagePanel.add(recipeImage);
//	        
//	        JLabel lblNewLabel_1_1 = new JLabel("Hamburguesa");
//	        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
//	        lblNewLabel_1_1.setBounds(15, 0, 84, 15);
//	        recipeImagePanel.add(lblNewLabel_1_1);
//	        
//	        JPanel recipePreparation = new JPanel();
//	        recipePreparation.setBounds(311, 0, 312, 134);
//	        recipe.add(recipePreparation);
//	        recipePreparation.setLayout(new BoxLayout(recipePreparation, BoxLayout.Y_AXIS));
//	        
//	        JLabel titlePreparation = new JLabel("Preparación");
//	        titlePreparation.setAlignmentY(Component.TOP_ALIGNMENT);
//	        titlePreparation.setVerticalAlignment(SwingConstants.TOP);
//	        titlePreparation.setFont(new Font("Tahoma", Font.BOLD, 12));
//	        recipePreparation.add(titlePreparation);
//	        
//	        JLabel lblNewLabel_6 = new JLabel("<html>Primero calentar la carne, luego aregar especies al gusto de kevin</html>");
//	        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
//	        recipePreparation.add(lblNewLabel_6);
//	        
//	        JPanel recipeButtons = new JPanel();
//	        recipeButtons.setBounds(623, 0, 64, 134);
//	        recipe.add(recipeButtons);
//	        recipeButtons.setLayout(new GridLayout(0, 1, 0, 0));
//	        
//	        JLabel lblNewLabel_7 = new JLabel("Editar");
//	        lblNewLabel_7.setForeground(new Color(0, 255, 64));
//	        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
//	        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
//	        recipeButtons.add(lblNewLabel_7);
//	        
//	        JLabel lblNewLabel_8 = new JLabel("Eliminar");
//	        lblNewLabel_8.setForeground(new Color(255, 0, 0));
//	        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
//	        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
//	        recipeButtons.add(lblNewLabel_8);
//	        
//			recipesList.add(recipe);
//		}
        
        JButton btnNewButton = new JButton("Agregar Receta");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setBounds(277, 361, 150, 29);
        add(btnNewButton);
	}
}
