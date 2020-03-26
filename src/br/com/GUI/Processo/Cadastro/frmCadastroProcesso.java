package br.com.GUI.Processo.Cadastro;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class frmCadastroProcesso extends JInternalFrame {
	
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
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroProcesso frame = new frmCadastroProcesso();
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
	public frmCadastroProcesso() {

		setClosable(true);
		setTitle("Lan\u00E7amento de Processo");
		setBounds(100, 100, 733, 507);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Processo", null, panel, null);
		panel.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 29, 200, 28);
		panel.add(comboBox);

		textField = new JTextField();
		textField.setBounds(6, 29, 122, 28);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("N\u00BA Processo");
		lblNewLabel.setBounds(6, 9, 122, 16);
		panel.add(lblNewLabel);

		JLabel lblVara = new JLabel("Vara");
		lblVara.setBounds(150, 9, 122, 16);
		panel.add(lblVara);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(362, 29, 200, 28);
		panel.add(comboBox_1);

		JLabel lblTipoDaAo = new JLabel("Tipo da A\u00E7\u00E3o");
		lblTipoDaAo.setBounds(362, 9, 122, 16);
		panel.add(lblTipoDaAo);

		textField_1 = new JTextField();
		textField_1.setBounds(574, 29, 122, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(574, 9, 122, 16);
		panel.add(lblData);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(6, 82, 548, 28);
		panel.add(comboBox_2);

		JLabel lblAdvogado = new JLabel("Advogado");
		lblAdvogado.setBounds(6, 62, 122, 16);
		panel.add(lblAdvogado);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(6, 135, 709, 305);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNOab = new JLabel("OAB");
		lblNOab.setBounds(6, 6, 122, 16);
		panel_4.add(lblNOab);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(6, 26, 227, 28);
		panel_4.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(6, 86, 227, 28);
		panel_4.add(textField_3);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(6, 66, 122, 16);
		panel_4.add(lblCep);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(243, 86, 377, 28);
		panel_4.add(textField_4);

		JLabel lblEndereoe = new JLabel("Endere\u00E7o");
		lblEndereoe.setBounds(243, 66, 122, 16);
		panel_4.add(lblEndereoe);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(632, 86, 71, 28);
		panel_4.add(textField_5);

		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(632, 66, 40, 16);
		panel_4.add(lblN);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBounds(6, 146, 270, 28);
		panel_4.add(textField_6);

		JLabel lblCidade = new JLabel("Bairro");
		lblCidade.setBounds(6, 126, 46, 16);
		panel_4.add(lblCidade);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(288, 146, 270, 28);
		panel_4.add(textField_7);

		JLabel lblCidade_1 = new JLabel("Cidade");
		lblCidade_1.setBounds(288, 126, 77, 16);
		panel_4.add(lblCidade_1);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(6, 206, 227, 28);
		panel_4.add(textField_8);

		JLabel lblContato = new JLabel("Contato 1");
		lblContato.setBounds(6, 186, 122, 16);
		panel_4.add(lblContato);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		textField_9.setBounds(243, 206, 227, 28);
		panel_4.add(textField_9);

		JLabel lblContato_1 = new JLabel("Contato 2");
		lblContato_1.setBounds(243, 186, 122, 16);
		panel_4.add(lblContato_1);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		textField_10.setBounds(482, 206, 221, 28);
		panel_4.add(textField_10);

		JLabel lblContato_2 = new JLabel("Contato 3");
		lblContato_2.setBounds(482, 186, 122, 16);
		panel_4.add(lblContato_2);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setEnabled(false);
		textField_11.setColumns(10);
		textField_11.setBounds(6, 266, 464, 28);
		panel_4.add(textField_11);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(6, 246, 122, 16);
		panel_4.add(lblEmail);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Autor", null, panel_1, null);
		panel_1.setLayout(null);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(6, 44, 709, 28);
		panel_1.add(textField_12);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(6, 24, 54, 16);
		panel_1.add(lblCliente);

		JButton btnNewButton = new JButton("Buscar");

		btnNewButton.setBounds(62, 18, 79, 28);
		panel_1.add(btnNewButton);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(6, 84, 709, 356);
		panel_1.add(panel_5);

		JLabel lblCpfcnpj = new JLabel("Cpf/Cnpj");
		lblCpfcnpj.setBounds(6, 6, 122, 16);
		panel_5.add(lblCpfcnpj);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(6, 26, 227, 28);
		panel_5.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(6, 86, 227, 28);
		panel_5.add(textField_14);

		JLabel label_1 = new JLabel("CEP");
		label_1.setBounds(6, 66, 122, 16);
		panel_5.add(label_1);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(243, 86, 377, 28);
		panel_5.add(textField_15);

		JLabel label_2 = new JLabel("Endere\u00E7o");
		label_2.setBounds(243, 66, 122, 16);
		panel_5.add(label_2);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(632, 86, 71, 28);
		panel_5.add(textField_16);

		JLabel label_3 = new JLabel("N\u00BA");
		label_3.setBounds(632, 66, 40, 16);
		panel_5.add(label_3);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(6, 146, 270, 28);
		panel_5.add(textField_17);

		JLabel label_4 = new JLabel("Bairro");
		label_4.setBounds(6, 126, 46, 16);
		panel_5.add(label_4);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(288, 146, 270, 28);
		panel_5.add(textField_18);

		JLabel label_5 = new JLabel("Cidade");
		label_5.setBounds(288, 126, 77, 16);
		panel_5.add(label_5);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(6, 206, 227, 28);
		panel_5.add(textField_19);

		JLabel label_6 = new JLabel("Contato 1");
		label_6.setBounds(6, 186, 122, 16);
		panel_5.add(label_6);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(243, 206, 227, 28);
		panel_5.add(textField_20);

		JLabel label_7 = new JLabel("Contato 2");
		label_7.setBounds(243, 186, 122, 16);
		panel_5.add(label_7);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(482, 206, 221, 28);
		panel_5.add(textField_21);

		JLabel label_8 = new JLabel("Contato 3");
		label_8.setBounds(482, 186, 122, 16);
		panel_5.add(label_8);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(6, 266, 464, 28);
		panel_5.add(textField_22);

		JLabel label_9 = new JLabel("Email");
		label_9.setBounds(6, 246, 122, 16);
		panel_5.add(label_9);

		JLabel lblRgie = new JLabel("Rg/IE");
		lblRgie.setBounds(276, 6, 122, 16);
		panel_5.add(lblRgie);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(276, 26, 227, 28);
		panel_5.add(textField_23);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Audiência", null, panel_2, null);
		panel_2.setLayout(null);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(6, 26, 122, 28);
		panel_2.add(textField_24);

		JLabel lblData_1 = new JLabel("Data");
		lblData_1.setBounds(6, 6, 122, 16);
		panel_2.add(lblData_1);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(140, 26, 122, 28);
		panel_2.add(textField_25);

		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(140, 6, 122, 16);
		panel_2.add(lblHora);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(274, 26, 122, 28);
		panel_2.add(textField_26);

		JLabel lblDataDaPeticao = new JLabel("Data da Peti\u00E7\u00E3o");
		lblDataDaPeticao.setBounds(274, 6, 122, 16);
		panel_2.add(lblDataDaPeticao);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(6, 80, 709, 360);
		panel_2.add(editorPane);

		JLabel lblAnotaes = new JLabel("Anota\u00E7\u00F5es");
		lblAnotaes.setBounds(6, 63, 122, 16);
		panel_2.add(lblAnotaes);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Parte Contrária", null, panel_3, null);
		panel_3.setLayout(null);

		JButton button = new JButton("Buscar");
		button.setBounds(67, 6, 79, 28);
		panel_3.add(button);

		JLabel lblContrrio = new JLabel("Contr\u00E1rio");
		lblContrrio.setBounds(6, 12, 66, 16);
		panel_3.add(lblContrrio);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(6, 32, 709, 28);
		panel_3.add(textField_27);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_6.setBounds(6, 65, 709, 356);
		panel_3.add(panel_6);

		JLabel label = new JLabel("Cpf/Cnpj");
		label.setBounds(6, 6, 122, 16);
		panel_6.add(label);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(6, 26, 227, 28);
		panel_6.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(6, 86, 227, 28);
		panel_6.add(textField_29);

		JLabel label_10 = new JLabel("CEP");
		label_10.setBounds(6, 66, 122, 16);
		panel_6.add(label_10);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(243, 86, 377, 28);
		panel_6.add(textField_30);

		JLabel label_11 = new JLabel("Endere\u00E7o");
		label_11.setBounds(243, 66, 122, 16);
		panel_6.add(label_11);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(632, 86, 71, 28);
		panel_6.add(textField_31);

		JLabel label_12 = new JLabel("N\u00BA");
		label_12.setBounds(632, 66, 40, 16);
		panel_6.add(label_12);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(6, 146, 270, 28);
		panel_6.add(textField_32);

		JLabel label_13 = new JLabel("Bairro");
		label_13.setBounds(6, 126, 46, 16);
		panel_6.add(label_13);

		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(288, 146, 270, 28);
		panel_6.add(textField_33);

		JLabel label_14 = new JLabel("Cidade");
		label_14.setBounds(288, 126, 77, 16);
		panel_6.add(label_14);

		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(6, 206, 227, 28);
		panel_6.add(textField_34);

		JLabel label_15 = new JLabel("Contato 1");
		label_15.setBounds(6, 186, 122, 16);
		panel_6.add(label_15);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(243, 206, 227, 28);
		panel_6.add(textField_35);

		JLabel label_16 = new JLabel("Contato 2");
		label_16.setBounds(243, 186, 122, 16);
		panel_6.add(label_16);

		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(482, 206, 221, 28);
		panel_6.add(textField_36);

		JLabel label_17 = new JLabel("Contato 3");
		label_17.setBounds(482, 186, 122, 16);
		panel_6.add(label_17);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(6, 266, 464, 28);
		panel_6.add(textField_37);

		JLabel label_18 = new JLabel("Email");
		label_18.setBounds(6, 246, 122, 16);
		panel_6.add(label_18);

		JLabel label_19 = new JLabel("Rg/IE");
		label_19.setBounds(276, 6, 122, 16);
		panel_6.add(label_19);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(276, 26, 227, 28);
		panel_6.add(textField_38);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("Anotações", null, panel_7, null);
		tabbedPane.setEnabledAt(4, true);
		panel_7.setLayout(null);

		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(6, 6, 709, 90);
		panel_7.add(editorPane_1);

		JButton btnNewButton_4 = new JButton("Incluir Anota\u00E7\u00E3o");
		btnNewButton_4.setBounds(6, 105, 709, 28);
		panel_7.add(btnNewButton_4);
		
		//102
		
		JTable tabela = new JTable();
		tabela.setShowVerticalLines(true);
		tabela.setShowHorizontalLines(true);
		
		tabela.setSize(709, 248);
		tabela.setLocation(6, 150);
		tabela.setBorder(UIManager.getBorder("TitledBorder.border"));
		tabela.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		
		DefaultTableModel modeloTabela;
		
		modeloTabela = new DefaultTableModel();
		
		modeloTabela.addColumn(new String[] {"Data","Anotação"});
	   
		modeloTabela.addRow(new String[] {"Data","Anotação"});
		modeloTabela.addRow(new String[]{"05/04/2020","Anotação"});
		modeloTabela.addRow(new String[]{"05/04/2020","Anotação"});
		modeloTabela.addRow(new String[]{"05/04/2020","Anotação"});
		modeloTabela.addRow(new String[]{"05/04/2020","Anotação"});
		
		modeloTabela.addColumn(new String[] {"Data","Anotação"});
		
	    tabela.setModel(modeloTabela);
		
	    tabela.getColumnModel().getColumn(0).setPreferredWidth(5);
	    
	    tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
	    
		panel_7.add(tabela);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(panel_8, BorderLayout.SOUTH);

		JButton btnNewButton_1 = new JButton("Salvar");
		panel_8.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Impress\u00E3o");
		panel_8.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Sair");
		panel_8.add(btnNewButton_3);

		
	}
}
