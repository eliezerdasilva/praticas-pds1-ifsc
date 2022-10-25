package janela;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Exercicio extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JTextField cpf;
	ArrayList<String> lista = new ArrayList<>();
	private JTextField nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio frame = new Exercicio();
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
	public Exercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 11, 89, 22);
		contentPane.add(comboBox);
		comboBox.setBounds(93, 11, 112, 22);
		
		
		comboBox.addItem("Sr");
		comboBox.addItem("Srta");
		
		contentPane.add(comboBox);
	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pronome");
		lblNewLabel.setBounds(26, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(26, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		cpf = new JTextField();
		cpf.setBounds(85, 88, 86, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cpf");
		lblNewLabel_2.setBounds(26, 91, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 134, 420, 64);
		contentPane.add(scrollPane);
		
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nom = nome.getText();
				String cpf1 = cpf.getText();
				String pronome = comboBox.getSelectedItem().toString();
				
				if(nom.length() == 0) {
					JOptionPane.showMessageDialog(null, " valor incoreto: informe novamente ");
				}if(cpf1.length() != 11) {
					JOptionPane.showMessageDialog(null, " valor incoreto: informe novamente ");
				}else {
		
				lista.add(comboBox.getSelectedItem()+ " nome : "+ nom+ " cpf : "+ cpf1); 
				
				textArea.setText(lista.toString());
			}
			}
		});
		btnNewButton.setBounds(233, 29, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		nome = new JTextField();
		nome.setBounds(85, 51, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		
		
		
		
	}
}
