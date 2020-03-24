package br.com.GUI.Advogado.Cadastro;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class frmCadastroAdvogado extends JInternalFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCadastroAdvogado frame = new frmCadastroAdvogado();
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
	public frmCadastroAdvogado() {
		setResizable(true);
		setTitle("Cadastro de Advogados");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 805, 499);
		
		JPanel pnRodape = new JPanel();
		getContentPane().add(pnRodape, BorderLayout.SOUTH);
		pnRodape.setPreferredSize(new Dimension(this.getWidth(),80));
		pnRodape.setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(216, 28, 89, 28);
		pnRodape.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00C7\u00D5ES");
		lblNewLabel_1.setBounds(364, 11, 64, 14);
		pnRodape.add(lblNewLabel_1);
		
		JButton btnImprimirFicha = new JButton("Imprimir Ficha");
		btnImprimirFicha.setBounds(315, 28, 124, 28);
		pnRodape.add(btnImprimirFicha);
		
		JButton btnExcluir = new JButton("Cancelar");
		btnExcluir.setBounds(449, 28, 124, 28);
		pnRodape.add(btnExcluir);
		
		JPanel pnTopo = new JPanel();
		pnTopo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnTopo.setPreferredSize(new Dimension(this.getWidth(),200));
		getContentPane().add(pnTopo, BorderLayout.NORTH);
		pnTopo.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 43, 61, 25);
		textField.setToolTipText("Informe o nome do Cliente");
		textField.setColumns(50);
		pnTopo.add(textField);
		
		JLabel lblNewLabel = new JLabel("Cod.");
		lblNewLabel.setBounds(10, 21, 46, 14);
		pnTopo.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Nome do Advogado");
		textField_1.setColumns(50);
		textField_1.setBounds(81, 43, 452, 25);
		pnTopo.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome/R.Social");
		lblNome.setBounds(81, 21, 78, 14);
		pnTopo.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Cpf/Cnpj");
		textField_2.setColumns(50);
		textField_2.setBounds(542, 43, 237, 25);
		pnTopo.add(textField_2);
		
		JLabel lblCpfcnpj = new JLabel("CPF/CNPJ");
		lblCpfcnpj.setBounds(542, 21, 97, 14);
		pnTopo.add(lblCpfcnpj);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Nome Fantasia, caso seja pessoa f\u00EDsica bastar repetir o nome");
		textField_3.setColumns(50);
		textField_3.setBounds(10, 96, 141, 25);
		pnTopo.add(textField_3);
		
		JLabel lblNfantasia = new JLabel("OAB");
		lblNfantasia.setBounds(10, 74, 78, 14);
		pnTopo.add(lblNfantasia);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Informe o nome do Cliente");
		textField_4.setColumns(50);
		textField_4.setBounds(160, 96, 385, 25);
		pnTopo.add(textField_4);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(160, 74, 46, 14);
		pnTopo.add(lblEmail);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("Informe o nome do Cliente");
		textField_10.setColumns(50);
		textField_10.setBounds(10, 154, 237, 25);
		pnTopo.add(textField_10);
		
		JLabel lblContato = new JLabel("Celular");
		lblContato.setBounds(10, 132, 97, 14);
		pnTopo.add(lblContato);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("Informe o nome do Cliente");
		textField_11.setColumns(50);
		textField_11.setBounds(276, 154, 237, 25);
		pnTopo.add(textField_11);
		
		JLabel lblContato_1 = new JLabel("Celular");
		lblContato_1.setBounds(276, 132, 97, 14);
		pnTopo.add(lblContato_1);
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("Informe o nome do Cliente");
		textField_12.setColumns(50);
		textField_12.setBounds(552, 96, 227, 25);
		pnTopo.add(textField_12);
		
		JLabel lblContato_2 = new JLabel("Telefone");
		lblContato_2.setBounds(552, 74, 97, 14);
		pnTopo.add(lblContato_2);
		
		JPanel pnCentro = new JPanel();
		pnCentro.setLayout(null);
		pnCentro.setPreferredSize(new Dimension(818, 80));
		pnCentro.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getContentPane().add(pnCentro, BorderLayout.CENTER);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Informe o nome do Cliente");
		textField_6.setColumns(50);
		textField_6.setBounds(10, 43, 452, 25);
		pnCentro.add(textField_6);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 21, 78, 14);
		pnCentro.add(lblEndereo);
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Informe o nome do Cliente");
		textField_7.setColumns(50);
		textField_7.setBounds(10, 101, 145, 25);
		pnCentro.add(textField_7);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(10, 79, 97, 14);
		pnCentro.add(lblCep);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("Informe o nome do Cliente");
		textField_8.setColumns(50);
		textField_8.setBounds(540, 43, 239, 25);
		pnCentro.add(textField_8);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(540, 21, 78, 14);
		pnCentro.add(lblBairro);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("Refer\u00EAncias que ajudem na localiza\u00E7\u00E3o.");
		textField_9.setColumns(50);
		textField_9.setBounds(165, 101, 614, 25);
		pnCentro.add(textField_9);
		
		JLabel lblReferncias = new JLabel("Refer\u00EAncias");
		lblReferncias.setBounds(165, 79, 102, 14);
		pnCentro.add(lblReferncias);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Informe o nome do Cliente");
		textField_5.setColumns(50);
		textField_5.setBounds(469, 43, 61, 25);
		pnCentro.add(textField_5);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(469, 21, 46, 14);
		pnCentro.add(lblN);
		
		JLabel label = new JLabel("Situa\u00E7\u00E3o");
		label.setBounds(542, 137, 97, 14);
		pnCentro.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(542, 151, 237, 31);
		pnCentro.add(comboBox);

	}
}
