package br.com.GUI.Financeiro.Despesa.Cadastro;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class frmCadastroDespesa extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroDespesa frame = new frmCadastroDespesa();
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
	public frmCadastroDespesa() {
		setTitle("Cadastro de Despesas");
		setClosable(true);
		setBounds(100, 100, 678, 369);
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(6, 35, 59, 28);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Cod");
		lblNewLabel.setBounds(10, 18, 55, 16);
		getContentPane().add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 35, 339, 28);
		getContentPane().add(textField_1);

		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(72, 18, 55, 16);
		getContentPane().add(lblItem);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(119, 15, 90, 22);
		getContentPane().add(btnNewButton);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(408, 35, 142, 28);
		getContentPane().add(textField_2);

		JLabel lblDataVencimento = new JLabel("Data Vencimento");
		lblDataVencimento.setBounds(412, 18, 109, 16);
		getContentPane().add(lblDataVencimento);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(553, 35, 79, 28);
		getContentPane().add(textField_3);

		JLabel lblQtdparcela = new JLabel("QTDParcela");
		lblQtdparcela.setBounds(557, 18, 90, 16);
		getContentPane().add(lblQtdparcela);

		table = new JTable();
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "New column", "New column", "New column",
				"New column", "New column", "New column", "New column", "New column" }));
		table.setBounds(10, 205, 622, -114);
		getContentPane().add(table);

		JButton btnNewButton_1 = new JButton("Gerar Parcelas");
		btnNewButton_1.setBounds(327, 282, 121, 28);
		getContentPane().add(btnNewButton_1);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(450, 282, 90, 28);
		getContentPane().add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(542, 282, 90, 28);
		getContentPane().add(btnCancelar);

	}
}
