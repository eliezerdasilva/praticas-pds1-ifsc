package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 31));
		lblNewLabel.setBounds(82, 27, 227, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("valor 1 ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(65, 84, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("valor 2 ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(197, 81, 76, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(65, 109, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 111, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String valor1 = textField_1.getText();
			String valor2 = textField.getText();
			int valo1= Integer.parseInt(valor1);
			int valo2 = Integer.parseInt(valor2);
			int total = valo1 + valo2; 
					JOptionPane.showMessageDialog(null,"soma é"+ total);
			
			}
		});
		btnNewButton.setBounds(65, 150, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("vezes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField_1.getText();
				String valor2 = textField.getText();
				int valo1= Integer.parseInt(valor1);
				int valo2 = Integer.parseInt(valor2);
				int total = valo1 * valo2; 
						JOptionPane.showMessageDialog(null,"soma é"+ total);
			}
		});
		btnNewButton_1.setBounds(187, 150, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("difisao");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				int valo1= Integer.parseInt(valor1);
				int valo2 = Integer.parseInt(valor2);
				int total = valo1/valo2; 
						JOptionPane.showMessageDialog(null,"soma é"+ total);
				
			}
		});
		btnNewButton_2.setBounds(62, 192, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Subtracao");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textField.getText();
				String valor2 = textField_1.getText();
				int valo1= Integer.parseInt(valor1);
				int valo2 = Integer.parseInt(valor2);
				int total = valo1 - valo2; 
						JOptionPane.showMessageDialog(null,"soma é"+ total);
			}
		});
		btnNewButton_3.setBounds(187, 192, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
