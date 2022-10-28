package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField Nota3;
	private JTextField Nota2;
	private JTextField Nota1;
	private JTextField txtNome;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(98, 39, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		Nota1 = new JTextField();
		Nota1.setBounds(98, 70, 86, 20);
		contentPane.add(Nota1);
		Nota1.setColumns(10);

		Nota2 = new JTextField();
		Nota2.setBounds(98, 102, 86, 20);
		contentPane.add(Nota2);
		Nota2.setColumns(10);

		Nota3 = new JTextField();
		Nota3.setBounds(98, 137, 86, 20);
		contentPane.add(Nota3);
		Nota3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(26, 42, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(26, 73, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(26, 105, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(26, 140, 46, 14);
		contentPane.add(lblNewLabel_3);

		btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String n1 = Nota1.getText();
				String n2 = Nota2.getText();
				String n3 = Nota3.getText();

				// CONVERTER
				Integer not1 = Integer.valueOf(n1);
				Integer not2 = Integer.valueOf(n2);
				Integer not3 = Integer.valueOf(n3);

				// MEDIA
				JOptionPane.showMessageDialog(null, "Nome: " + nome + "média: " + soma(not1, not2, not3));

			}

		});

		btnCalcular.setBounds(98, 173, 89, 23);
		contentPane.add(btnCalcular);

	}

	public static Integer soma(Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3 / 3;
	}

}
