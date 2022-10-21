import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame {

	private JPanel contentPane;
	private String nova;
	private String info;
	private JComboBox<String> txtcombobox;
	private JTextArea textArea;

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
		txtcombobox = new JComboBox<>();
		txtcombobox.setBounds(98, 35, 71, 45);
		contentPane.add(txtcombobox);

		// String[]vetorfut= {"chuteira","pé","caneleira","bicicleta"};
		// for (int i = 0; i < vetorfut.length; i++) {
		// txtcombobox.addItem(vetorfut[i]);

		txtcombobox.setBounds(93, 11, 112, 22);
		txtcombobox.addItem("chuteira");
		txtcombobox.addItem("pé");
		txtcombobox.addItem("biclicleta");
		txtcombobox.addItem("CANELEIRA");
		contentPane.add(txtcombobox);

		// }

		JButton txtadicionar = new JButton("adicionar");
		txtadicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorselecionado = (String) txtcombobox.getSelectedItem();
				if (info == null) {
					info = valorselecionado;
				} else {
					info = info + "," + valorselecionado;
				}

				textArea.setText(info);

			}
		});
		txtadicionar.setBounds(232, 35, 89, 23);
		contentPane.add(txtadicionar);

		JLabel lblNewLabel = new JLabel("opções:");
		lblNewLabel.setBounds(42, 39, 46, 14);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 311, 191);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
}
