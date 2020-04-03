package br.com.GUI.Processo.Consulta;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import br.com.GUI.Principal.frmPrincipal;
import br.com.GUI.Processo.Cadastro.frmCadastroProcesso;

public class frmConsultaProcesso extends JInternalFrame {

	private JTextField textField;
	private JTable tabelaCliente;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaProcesso frame = new frmConsultaProcesso();
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

	public frmConsultaProcesso() {
		setResizable(true);

		setTitle("Consulta Processos");
		setIconifiable(true);

		// setClosed(true);

		setClosable(true);

		setBounds(100, 100, 870, 500);

		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pnTopo = new JPanel();
		pnTopo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		pnTopo.setPreferredSize(new Dimension(super.getWidth(), 100));
		pnTopo.setLayout(null);
		getContentPane().add(pnTopo, BorderLayout.NORTH);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(10, 64, 404, 25);
		pnTopo.add(textField);
		textField.setColumns(20);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(10, 34, 109, 23);
		pnTopo.add(rdbtnNewRadioButton);

		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(121, 34, 109, 23);
		pnTopo.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("New radio button");
		radioButton_1.setBounds(232, 34, 109, 23);
		pnTopo.add(radioButton_1);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(424, 64, 96, 25);
		pnTopo.add(btnNewButton);

		JButton button = new JButton("Buscar");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (!frmPrincipal.verificaFormularioAberto(frmCadastroProcesso.class.getSimpleName())) {

					frmCadastroProcesso frm = new frmCadastroProcesso();
					frmPrincipal.desktopPane.add(frm);
					frm.setVisible(true);
					frm.moveToFront();
				}
			}
		});
		button.setBounds(748, 6, 96, 25);
		pnTopo.add(button);

		JButton button_1 = new JButton("Buscar");
		button_1.setBounds(748, 37, 96, 25);
		pnTopo.add(button_1);

		JButton button_2 = new JButton("Buscar");
		button_2.setBounds(748, 68, 96, 25);
		pnTopo.add(button_2);

		JPanel pnCentro = new JPanel();
		getContentPane().add(pnCentro, BorderLayout.CENTER);
		pnCentro.setLayout(new BorderLayout(0, 0));

		String colunas[] = { "Nome:", "Idade:", "Sexo:" };
		String dados[][] = { { "Jack", "19", "Masculino" }, { "Eddie", "56", "Masculino" },
				{ "Gina", "34", "Feminino" }, { "Klaus", "18", "Masculino" }, { "Erika", "20", "Feminino" },
				{ "Roberto", "29", "Masculino" }, { "Maria", "30", "Feminino" } };

		tabelaCliente = new JTable(dados, colunas);
		tabelaCliente.setPreferredScrollableViewportSize(new Dimension(500, 100));// barra de rolagem
		tabelaCliente.setFillsViewportHeight(true);

		JScrollPane scrollPane = new JScrollPane(tabelaCliente);

		pnCentro.add(scrollPane);

	}

}
