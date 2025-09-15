package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Header extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Header(AppActions appActions) {
		setBackground(new Color(255, 91, 21));
		setBounds(0, 0, 704, 40);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Productos");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(219, 79, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(255, 91, 21));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(255, 91, 21));
		btnNewButton.setBounds(510, 5, 100, 30);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appActions.showPanel(0);
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clientes");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(219, 79, 20));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(255, 91, 21));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appActions.showPanel(1);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 91, 21));
		btnNewButton_1.setBounds(615, 5, 84, 30);
		add(btnNewButton_1);
		
		JLabel titleMenu = new JLabel("FastFoodINC");
		titleMenu.setFont(new Font("Dialog", Font.BOLD, 15));
		titleMenu.setBounds(10, 13, 99, 14);
		add(titleMenu);

	}

}
