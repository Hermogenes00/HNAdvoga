package br.com.GUI.Cliente.Cadastro;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class frmCadastroCliente extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroCliente frame = new frmCadastroCliente();
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
	public frmCadastroCliente() {
		setResizable(true);
		setTitle("Cadastro de Clientes");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 822, 497);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setLayout(null);
		tabbedPane.addTab("Cadastro", null, panel, null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(805, 200));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(6, 6, 805, 200);
		panel.add(panel_1);

		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(50);
		textField.setBounds(10, 43, 61, 25);
		panel_1.add(textField);

		JLabel label = new JLabel("Cod.");
		label.setBounds(10, 21, 46, 14);
		panel_1.add(label);

		textField_1 = new JTextField();
		textField_1.setToolTipText("Informe o nome do Cliente");
		textField_1.setColumns(50);
		textField_1.setBounds(81, 43, 452, 25);
		panel_1.add(textField_1);

		JLabel label_1 = new JLabel("Nome/R.Social");
		label_1.setBounds(81, 21, 78, 14);
		panel_1.add(label_1);

		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(50);
		textField_2.setBounds(542, 43, 237, 25);
		panel_1.add(textField_2);

		JLabel label_2 = new JLabel("CPF/CNPJ");
		label_2.setBounds(542, 21, 97, 14);
		panel_1.add(label_2);

		textField_3 = new JTextField();
		textField_3.setToolTipText("Em caso de pessoa f\u00EDsica, basta repetir o nome do cliente");
		textField_3.setColumns(50);
		textField_3.setBounds(10, 96, 374, 25);
		panel_1.add(textField_3);

		JLabel label_3 = new JLabel("N.Fantasia");
		label_3.setBounds(10, 74, 78, 14);
		panel_1.add(label_3);

		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setColumns(50);
		textField_4.setBounds(394, 96, 385, 25);
		panel_1.add(textField_4);

		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(394, 74, 46, 14);
		panel_1.add(label_4);

		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setColumns(50);
		textField_5.setBounds(10, 154, 237, 25);
		panel_1.add(textField_5);

		JLabel label_5 = new JLabel("Contato 1");
		label_5.setBounds(10, 132, 97, 14);
		panel_1.add(label_5);

		textField_6 = new JTextField();
		textField_6.setToolTipText("");
		textField_6.setColumns(50);
		textField_6.setBounds(276, 154, 237, 25);
		panel_1.add(textField_6);

		JLabel label_6 = new JLabel("Contato 2");
		label_6.setBounds(276, 132, 97, 14);
		panel_1.add(label_6);

		textField_7 = new JTextField();
		textField_7.setToolTipText("");
		textField_7.setColumns(50);
		textField_7.setBounds(542, 154, 237, 25);
		panel_1.add(textField_7);

		JLabel label_7 = new JLabel("Contato 3");
		label_7.setBounds(542, 132, 97, 14);
		panel_1.add(label_7);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(805, 80));
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(6, 397, 805, 39);
		panel.add(panel_2);

		JButton button = new JButton("Salvar");
		button.setBounds(217, 6, 89, 28);
		panel_2.add(button);

		JButton button_1 = new JButton("Imprimir Ficha");
		button_1.setBounds(316, 6, 124, 28);
		panel_2.add(button_1);

		JButton button_2 = new JButton("Cancelar");
		button_2.setBounds(450, 6, 124, 28);
		panel_2.add(button_2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setPreferredSize(new Dimension(818, 80));
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(6, 210, 805, 185);
		panel.add(panel_3);

		textField_8 = new JTextField();
		textField_8.setToolTipText("");
		textField_8.setColumns(50);
		textField_8.setBounds(10, 43, 452, 25);
		panel_3.add(textField_8);

		JLabel label_9 = new JLabel("Endere\u00E7o");
		label_9.setBounds(10, 21, 78, 14);
		panel_3.add(label_9);

		textField_9 = new JTextField();
		textField_9.setToolTipText("");
		textField_9.setColumns(50);
		textField_9.setBounds(10, 101, 145, 25);
		panel_3.add(textField_9);

		JLabel label_10 = new JLabel("CEP");
		label_10.setBounds(10, 79, 97, 14);
		panel_3.add(label_10);

		textField_10 = new JTextField();
		textField_10.setToolTipText("");
		textField_10.setColumns(50);
		textField_10.setBounds(540, 43, 239, 25);
		panel_3.add(textField_10);

		JLabel label_11 = new JLabel("Bairro");
		label_11.setBounds(540, 21, 78, 14);
		panel_3.add(label_11);

		textField_11 = new JTextField();
		textField_11.setToolTipText("Refer\u00EAncias que ajudem na localiza\u00E7\u00E3o do cliente");
		textField_11.setColumns(50);
		textField_11.setBounds(165, 101, 614, 25);
		panel_3.add(textField_11);

		JLabel label_12 = new JLabel("Refer\u00EAncias");
		label_12.setBounds(165, 79, 102, 14);
		panel_3.add(label_12);

		textField_12 = new JTextField();
		textField_12.setToolTipText("");
		textField_12.setColumns(50);
		textField_12.setBounds(469, 43, 61, 25);
		panel_3.add(textField_12);

		JLabel label_13 = new JLabel("N\u00BA");
		label_13.setBounds(469, 21, 46, 14);
		panel_3.add(label_13);

		JLabel label_14 = new JLabel("Situa\u00E7\u00E3o");
		label_14.setBounds(542, 137, 97, 14);
		panel_3.add(label_14);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(542, 151, 237, 31);
		panel_3.add(comboBox);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Agenda", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panel_6.add(tabbedPane_1, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabbedPane_1.addTab("Abertura", null, panel_4, null);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(6, 27, 263, 28);
		panel_4.add(textField_13);

		JLabel label_8 = new JLabel("Assunto");
		label_8.setBounds(6, 9, 61, 16);
		panel_4.add(label_8);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(281, 27, 509, 28);
		panel_4.add(textField_14);

		JLabel label_15 = new JLabel("Repons\u00E1vel");
		label_15.setBounds(281, 9, 86, 16);
		panel_4.add(label_15);

		JLabel label_16 = new JLabel("Descri\u00E7\u00E3o");
		label_16.setBounds(6, 67, 86, 16);
		panel_4.add(label_16);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 83, 588, 91);
		panel_4.add(textArea);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(606, 99, 172, 28);
		panel_4.add(formattedTextField);

		JLabel label_17 = new JLabel("Cadastro");
		label_17.setBounds(608, 83, 86, 16);
		panel_4.add(label_17);

		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(606, 146, 172, 28);
		panel_4.add(formattedTextField_1);

		JLabel label_18 = new JLabel("Agendamento");
		label_18.setBounds(608, 130, 86, 16);
		panel_4.add(label_18);

		JButton button_3 = new JButton("Novo");
		button_3.setBounds(6, 186, 90, 28);
		panel_4.add(button_3);

		JButton button_4 = new JButton("Salvar");
		button_4.setBounds(105, 186, 90, 28);
		panel_4.add(button_4);

		JButton button_5 = new JButton("Cancelar");
		button_5.setBounds(207, 186, 90, 28);
		panel_4.add(button_5);

		JButton button_6 = new JButton("Buscar");
		button_6.setBounds(79, 6, 90, 22);
		panel_4.add(button_6);

		JButton button_7 = new JButton("Buscar");
		button_7.setBounds(385, 6, 90, 22);
		panel_4.add(button_7);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(482, 187, 296, 26);
		panel_4.add(comboBox_1);

		JLabel label_19 = new JLabel("Status");
		label_19.setBounds(485, 173, 55, 16);
		panel_4.add(label_19);

		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("Fechamento", null, panel_5, null);
		panel_5.setLayout(null);

		JFormattedTextField frmtdtxtfldFechamento = new JFormattedTextField();
		frmtdtxtfldFechamento.setBounds(6, 22, 163, 28);
		panel_5.add(frmtdtxtfldFechamento);

		JLabel lblFechamento = new JLabel("Fechamento");
		lblFechamento.setBounds(8, 6, 86, 16);
		panel_5.add(lblFechamento);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(6, 78, 798, 322);
		panel_5.add(textArea_1);

		JLabel lblLaudo = new JLabel("Laudo");
		lblLaudo.setBounds(6, 63, 86, 16);
		panel_5.add(lblLaudo);

		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(653, 38, 151, 28);
		panel_5.add(btnNewButton);

		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Processos", null, panel_7, null);
		panel_7.setLayout(null);

		JButton btnNewButton_1 = new JButton("Novo");
		btnNewButton_1.setBounds(6, 6, 90, 28);
		panel_7.add(btnNewButton_1);

		JButton btnDetalhes = new JButton("Detalhes");
		btnDetalhes.setBounds(108, 6, 90, 28);
		panel_7.add(btnDetalhes);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "New column", "New column", "New column", "New column", "New column", "New column",
						"New column", "New column" }));
		table.setBounds(6, 416, 798, -342);
		panel_7.add(table);

	}
}
