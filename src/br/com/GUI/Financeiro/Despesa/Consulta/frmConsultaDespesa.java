package br.com.GUI.Financeiro.Despesa.Consulta;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import br.com.GUI.Financeiro.Despesa.Cadastro.frmCadastroDespesa;
import br.com.GUI.Principal.frmPrincipal;

public class frmConsultaDespesa extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaDespesa frame = new frmConsultaDespesa();
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
	public frmConsultaDespesa() {
		setClosable(true);
		setBounds(100, 100, 937, 483);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(6, 6, 913, 145);
		getContentPane().add(panel);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(8, 32, 398, 28);
		panel.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(8, 89, 136, 28);
		panel.add(textField_1);

		JLabel label = new JLabel("In\u00EDcio");
		label.setBounds(8, 67, 42, 16);
		panel.add(label);

		JLabel label_1 = new JLabel("Fim");
		label_1.setBounds(153, 67, 28, 16);
		panel.add(label_1);

		JButton button = new JButton("Filtrar");
		button.setBounds(353, 87, 113, 33);
		panel.add(button);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 89, 136, 28);
		panel.add(textField_2);

		JRadioButton rdbtnVencimento = new JRadioButton("Vencimento");
		rdbtnVencimento.setBounds(46, 7, 113, 18);
		panel.add(rdbtnVencimento);

		JRadioButton radioButton_6 = new JRadioButton("Cadastro");
		radioButton_6.setBounds(142, 7, 85, 18);
		panel.add(radioButton_6);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "A\u00E7\u00F5es", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(497, 9, 221, 58);
		panel.add(panel_1);

		JButton button_1 = new JButton("Novo");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Verifica se o formulário está aberto.
				if (!frmPrincipal.verificaFormularioAberto(frmCadastroDespesa.class.getSimpleName())) {

					frmCadastroDespesa frm = new frmCadastroDespesa();
					frmPrincipal.desktopPane.add(frm);
					frm.setVisible(true);
					frm.moveToFront();
				}

			}
		});
		button_1.setBounds(6, 16, 90, 28);
		panel_1.add(button_1);

		JButton btnBaixar = new JButton("Baixar");
		btnBaixar.setBounds(108, 16, 90, 28);
		panel_1.add(btnBaixar);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(
				new TitledBorder(null, "Resumo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(59, 59, 59)));
		panel_2.setBounds(497, 67, 410, 72);
		panel.add(panel_2);

		JLabel lblNewLabel = new JLabel("Item");
		lblNewLabel.setBounds(8, 9, 55, 16);
		panel.add(lblNewLabel);

		JRadioButton rdbtnVencer = new JRadioButton("\u00C0 vencer");
		rdbtnVencer.setBounds(224, 7, 85, 18);
		panel.add(rdbtnVencer);

		JRadioButton rdbtnVencidos = new JRadioButton("Vencidos");
		rdbtnVencidos.setBounds(309, 7, 85, 18);
		panel.add(rdbtnVencidos);

		table = new JTable();
		table.setBounds(6, 163, 913, 283);
		getContentPane().add(table);

	}
}
