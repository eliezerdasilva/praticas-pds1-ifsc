package pratica01;

import java.awt.BorderLayout;
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

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField dado1;
	private JTextField dado2;
	private JButton calcula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe dois números");
		lblNewLabel.setBounds(29, 44, 250, 33);
		contentPane.add(lblNewLabel);
		
		dado1 = new JTextField();
		dado1.setBounds(39, 98, 86, 20);
		contentPane.add(dado1);
		dado1.setColumns(10);
		
		dado2 = new JTextField();
		dado2.setBounds(184, 98, 86, 20);
		contentPane.add(dado2);
		dado2.setColumns(10);
		
		calcula = new JButton("calcular");
		calcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = dado1.getText();
				String n2 = dado2.getText();
				
				Double dado = Double.valueOf(n1);
				Double dado1 = Double.valueOf(n2);
				
				JOptionPane.showMessageDialog(null, dado1+dado );
			}
		});
		calcula.setBounds(39, 145, 89, 23);
		contentPane.add(calcula);
	}
}
