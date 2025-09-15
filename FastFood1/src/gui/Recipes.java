package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.BorderLayout;

public class Recipes extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Recipes() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 52, 720, 389);
		setLayout(null);
		
		
        JPanel recipesList = new JPanel();
        recipesList.setBackground(new Color(255, 255, 255));

//        for (int i = 1; i <= 20; i++) {
//            JButton boton = new JButton("Botón " + i);
//            recipesList.add(boton);
//        }

        JScrollPane scrollPane_1 = new JScrollPane(recipesList);
//        recipesList.setLayout(null);
        recipesList.setLayout(new BoxLayout(recipesList, BoxLayout.Y_AXIS));
        
        scrollPane_1.setBounds(0, 50, 705,300);
        add(scrollPane_1);
        
//        JPanel panel = new JPanel();
//        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
//        panel.setBackground(new Color(255, 255, 255));
//        panel.setBounds(10, 11, 668, 122);
//        recipesList.add(panel);
//        panel.setLayout(null);
//        
//        JPanel panel_2 = new JPanel();
//        panel_2.setBounds(130, 0, 538, 122);
//        panel.add(panel_2);
//        panel_2.setLayout(new GridLayout(0, 1, 0, 0));
//        
//        JLabel lblNewLabel_1 = new JLabel("Hamburguesa");
//        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
//        panel_2.add(lblNewLabel_1);
//        
//        JLabel lblNewLabel_2 = new JLabel("Carne 230g");
//        panel_2.add(lblNewLabel_2);
//        
//        JLabel lblNewLabel_3 = new JLabel("Pan");
//        panel_2.add(lblNewLabel_3);
//        
//        JLabel lblNewLabel_4 = new JLabel("Lechuga");
//        panel_2.add(lblNewLabel_4);
//        
//        JLabel lblNewLabel_5 = new JLabel("Queso");
//        panel_2.add(lblNewLabel_5);
//        
//        JPanel panel_1 = new JPanel();
//        panel_1.setBounds(0, 0, 131, 122);
//        panel.add(panel_1);
//        panel_1.setLayout(null);
//        
//        JLabel recipeImage = new JLabel();
//        ImageIcon imageIcon = new ImageIcon(
//    	    getClass().getResource("/gui/assets/hamburguesa.jpg")
//    	);
//    	recipeImage.setIcon(new ImageIcon(
//    	    imageIcon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT)
//    	));
//        recipeImage.setBounds(10, 11, 111, 100);
//        panel_1.add(recipeImage);
        
	    for (int i = 1; i <= 10; i++) {
	    	JPanel panel = new JPanel();
	        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	        panel.setBackground(new Color(255, 255, 255));
//	        panel.setBounds(10, 11, 668, 122);
	        panel.setPreferredSize(new Dimension(668, 122));
	        recipesList.add(panel);
	        panel.setLayout(null);
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(130, 0, 538, 122);
	        panel.add(panel_2);
	        panel_2.setLayout(new GridLayout(0, 1, 0, 0));
	        
	        JLabel lblNewLabel_1 = new JLabel("Hamburguesa");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
	        panel_2.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_2 = new JLabel("Carne 230g");
	        panel_2.add(lblNewLabel_2);
	        
	        JLabel lblNewLabel_3 = new JLabel("Pan");
	        panel_2.add(lblNewLabel_3);
	        
	        JLabel lblNewLabel_4 = new JLabel("Lechuga");
	        panel_2.add(lblNewLabel_4);
	        
	        JLabel lblNewLabel_5 = new JLabel("Queso");
	        panel_2.add(lblNewLabel_5);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(0, 0, 131, 122);
	        panel.add(panel_1);
	        panel_1.setLayout(null);
	        
	        JLabel recipeImage = new JLabel();
	        ImageIcon imageIcon = new ImageIcon(
	    	    getClass().getResource("/gui/assets/hamburguesa.jpg")
	    	);
	    	recipeImage.setIcon(new ImageIcon(
	    	    imageIcon.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT)
	    	));
	        recipeImage.setBounds(10, 11, 111, 100);
	        panel_1.add(recipeImage);
	        
			recipesList.add(panel);
		}
        
        
        JLabel lblNewLabel = new JLabel("Recetas de Comidas");
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(140, 11, 440, 28);
        add(lblNewLabel);
	}
}
