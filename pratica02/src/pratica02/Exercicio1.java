package pratica02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Eliezer
 * @version 1.0
 *  * 
 */
public class Exercicio1 extends JFrame {
	
	/* 
	 * Resolucao do exercicio 1 
	 */

	private JPanel contentPane;
	private JTextField dado1;
	private JTextField dado2;
	private JButton menos;
	private JButton divisao;
	private JButton vezes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("calculadora");
		lblNewLabel.setBounds(42, 25, 79, 14);
		contentPane.add(lblNewLabel);
		
		dado1 = new JTextField();
		dado1.setBounds(25, 66, 86, 20);
		contentPane.add(dado1);
		dado1.setColumns(10);
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n1 = dado1.getText();
				String n2 = dado2.getText();
				Double d1 = Double.valueOf(n1);
				Double d2 = Double.valueOf(n2);
				JOptionPane.showMessageDialog(null, d1+d2);
			}
		});
		mais.setBounds(140, 65, 89, 23);
		contentPane.add(mais);
		
		dado2 = new JTextField();
		dado2.setBounds(25, 110, 86, 20);
		contentPane.add(dado2);
		dado2.setColumns(10);
		
		menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String n1 = dado1.getText();
				String n2 = dado2.getText();
				Double d1 = Double.valueOf(n1);
				Double d2 = Double.valueOf(n2);
				JOptionPane.showMessageDialog(null, d1-d2);
			}
		});
		menos.setBounds(140, 109, 89, 23);
		contentPane.add(menos);
		
		divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String n1 = dado1.getText();
				String n2 = dado2.getText();
				Double d1 = Double.valueOf(n1);
				Double d2 = Double.valueOf(n2);
				JOptionPane.showMessageDialog(null, d1/d2);
				
			}
		});
		divisao.setBounds(256, 65, 89, 23);
		contentPane.add(divisao);
		
		vezes = new JButton("*");
		vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n1 = dado1.getText();
				String n2 = dado2.getText();
				Double d1 = Double.valueOf(n1);
				Double d2 = Double.valueOf(n2);
				JOptionPane.showMessageDialog(null, d1*d2);
			}
		});
		vezes.setBounds(256, 109, 89, 23);
		contentPane.add(vezes);
	}
}
