package br.com.GUI.Agenda.Consulta;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import br.com.GUI.Agenda.Cadastro.frmCadastroAgenda;
import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Principal.frmPrincipal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmConsultaAgenda extends JInternalFrame {
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaAgenda frame = new frmConsultaAgenda();
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
	public frmConsultaAgenda() {
		setClosable(true);
		setBounds(100, 100, 1094, 660);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1082, 171);
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cliente");
		rdbtnNewRadioButton.setBounds(90, 8, 61, 18);
		
		JRadioButton rdbtnAdvogado = new JRadioButton("Advogado");
		rdbtnAdvogado.setBounds(8, 8, 76, 18);
		
		JRadioButton rdbtnAssunto = new JRadioButton("Assunto");
		rdbtnAssunto.setBounds(157, 8, 67, 18);
		
		JRadioButton rdbtnDescrio = new JRadioButton("Descri\u00E7\u00E3o");
		rdbtnDescrio.setBounds(230, 8, 88, 18);
		
		textField = new JTextField();
		textField.setBounds(8, 32, 398, 28);
		textField.setColumns(10);
		
		JRadioButton rdbtnAssunto_1 = new JRadioButton("Assunto");
		rdbtnAssunto_1.setBounds(324, 8, 82, 18);
		
		textField_2 = new JTextField();
		textField_2.setBounds(8, 118, 136, 28);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnAgendamento = new JRadioButton("Agendamento");
		rdbtnAgendamento.setBounds(8, 66, 113, 18);
		
		JRadioButton rdbtnCadastro = new JRadioButton("Cadastro");
		rdbtnCadastro.setBounds(127, 66, 85, 18);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 118, 136, 28);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("In\u00EDcio");
		lblNewLabel.setBounds(8, 96, 42, 16);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setBounds(153, 96, 28, 16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(497, 8, 577, 61);
		panel_1.setBorder(new TitledBorder(null, "A\u00E7\u00F5es", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setBounds(338, 88, 113, 33);
		panel.setLayout(null);
		panel.add(textField);
		panel.add(rdbtnAdvogado);
		panel.add(rdbtnNewRadioButton);
		panel.add(rdbtnAssunto);
		panel.add(rdbtnDescrio);
		panel.add(rdbtnAssunto_1);
		panel.add(textField_2);
		panel.add(lblNewLabel);
		panel.add(lblFim);
		panel.add(btnNewButton);
		panel.add(textField_1);
		panel.add(rdbtnAgendamento);
		panel.add(rdbtnCadastro);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Novo");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Verifica se o formulário está aberto.
				if (!frmPrincipal.verificaFormularioAberto(frmCadastroAgenda.class.getSimpleName())) {

					frmCadastroAgenda frm = new frmCadastroAgenda();
					frmPrincipal.desktopPane.add(frm);
					frm.setVisible(true);				
					frm.moveToFront();				
				}
			}
		});
		btnNewButton_1.setBounds(90, 16, 90, 28);
		panel_1.add(btnNewButton_1);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(192, 16, 90, 28);
		panel_1.add(btnAlterar);
		
		JButton btnReagendar = new JButton("Reagendar");
		btnReagendar.setBounds(294, 16, 90, 28);
		panel_1.add(btnReagendar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(396, 16, 90, 28);
		panel_1.add(btnExcluir);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(null, "Resumo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(59, 59, 59)));
		panel_2.setBounds(497, 66, 577, 99);
		panel.add(panel_2);
		
		table = new JTable();
		table.setBounds(0, 183, 1082, 440);
		getContentPane().add(table);

	}
}
