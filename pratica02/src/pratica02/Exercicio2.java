package pratica02;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;

	/**
	 * @author Eliezer
	 * @version 1.0
	 * 
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		
		JTextField dado1 = new JTextField();
		dado1.setBounds(58, 68, 86, 20);
		contentPane.add(dado1);
		dado1.setColumns(10);
		
		JTextField dado2 = new JTextField();
		dado2.setBounds(58, 111, 86, 20);
		contentPane.add(dado2);
		dado2.setColumns(10);
		
		JTextField dado3 = new JTextField();
		dado3.setText("");
		dado3.setBounds(58, 163, 86, 20);
		contentPane.add(dado3);
		dado3.setColumns(10);
		
		JButton calcula = new JButton("Verificar qual tri\u00E2ngulo \u00E9:");
		calcula.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		calcula.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  l1 = dado1.getText();
				String  l2 = dado2.getText();
				String  l3 = dado3.getText();
				
				if (! l1 . isEmpty () && ! l2 . isEmpty () && ! l3 . isEmpty ()) {
					Integer  numero1 = Integer.valueOf ( l1 );
					Integer  numero2 = Integer.valueOf ( l2 );
					Integer  numero3 = Integer.valueOf ( l3 );
					
					if ( numero1 == numero2 && numero1 == numero3 && numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , " Equilátero" );
					}
					else 
						if ( numero1 == numero2 || numero1 == numero3 || numero2 == numero3 ) {
						JOptionPane . showMessageDialog ( null , " Isoceles" );
					}
						else 
							if ( numero1 != numero2 && numero1 != numero3 && numero2 != numero3 ) {
						JOptionPane . showMessageDialog ( null , " Escaleno" );
						
					}
				}
				
			}
			
			
		});
		calcula.setBounds(10, 194, 192, 20);
		contentPane.add(calcula);
		
		JLabel lblNewLabel = new JLabel("Informe o ângulo  ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 11, 334, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("valor 1:");
		lblNewLabel_1.setBounds(78, 53, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("valor 2:");
		lblNewLabel_2.setBounds(78, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("valor 3:");
		lblNewLabel_3.setBounds(78, 148, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
	}


