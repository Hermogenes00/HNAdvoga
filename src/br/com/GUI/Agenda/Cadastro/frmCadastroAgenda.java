package br.com.GUI.Agenda.Cadastro;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class frmCadastroAgenda extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroAgenda frame = new frmCadastroAgenda();
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
	public frmCadastroAgenda() {
		setClosable(true);
		setBounds(100, 100, 814, 313);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(6, 6, 796, 276);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(6, 83, 263, 28);
		panel_1.add(textField);
		
		JLabel label = new JLabel("Assunto");
		label.setBounds(6, 65, 61, 16);
		panel_1.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(281, 83, 509, 28);
		panel_1.add(textField_1);
		
		JLabel label_1 = new JLabel("Repons\u00E1vel");
		label_1.setBounds(281, 65, 86, 16);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Descri\u00E7\u00E3o");
		label_2.setBounds(6, 123, 86, 16);
		panel_1.add(label_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 139, 588, 91);
		panel_1.add(textArea);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(606, 155, 172, 28);
		panel_1.add(formattedTextField);
		
		JLabel label_3 = new JLabel("Cadastro");
		label_3.setBounds(608, 139, 86, 16);
		panel_1.add(label_3);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(606, 202, 172, 28);
		panel_1.add(formattedTextField_1);
		
		JLabel label_4 = new JLabel("Agendamento");
		label_4.setBounds(608, 186, 86, 16);
		panel_1.add(label_4);
		
		JButton button = new JButton("Novo");
		button.setBounds(6, 242, 90, 28);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Salvar");
		button_1.setBounds(105, 242, 90, 28);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Cancelar");
		button_2.setBounds(207, 242, 90, 28);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Buscar");
		button_3.setBounds(79, 62, 90, 22);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Buscar");
		button_4.setBounds(385, 62, 90, 22);
		panel_1.add(button_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(482, 243, 296, 26);
		panel_1.add(comboBox);
		
		JLabel label_5 = new JLabel("Status");
		label_5.setBounds(485, 229, 55, 16);
		panel_1.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(6, 25, 784, 28);
		panel_1.add(textField_2);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(6, 7, 86, 16);
		panel_1.add(lblCliente);
		
		JButton button_5 = new JButton("Buscar");
		button_5.setBounds(110, 4, 90, 22);
		panel_1.add(button_5);

	}

}
