package br.com.GUI.Cliente.Consulta;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Principal.frmPrincipal;

public class frmConsultaCliente extends JInternalFrame {
	private JTextField textField;
	private JTable tabelaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaCliente frame = new frmConsultaCliente();
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
	public frmConsultaCliente() {

		setFrameIcon(new ImageIcon(
				frmConsultaCliente.class.getResource("/br/com/Imagens/icons8-funcion\u00E1rio-homem-40.png")));
		setResizable(true);

		setTitle("Consulta Clientes");
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
		button.setBounds(748, 6, 96, 25);
		pnTopo.add(button);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(748, 37, 96, 25);
		pnTopo.add(btnAlterar);

		JButton btnDetalhes = new JButton("Detalhes");

		btnDetalhes.setBounds(748, 68, 96, 25);

		btnDetalhes.addMouseListener(new btnDetalhesListener());
		pnTopo.add(btnDetalhes);

		JPanel pnCentro = new JPanel();
		getContentPane().add(pnCentro, BorderLayout.CENTER);
		pnCentro.setLayout(new BorderLayout(0, 0));

		tabelaCliente = new JTable();
		tabelaCliente.setShowVerticalLines(true);
		tabelaCliente.setShowHorizontalLines(true);
		tabelaCliente.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		tabelaCliente.setModel(new DefaultTableModel(
				new Object[][] { { "New column", "New column", "New column", "New column", "New column" },
						{ "New column", "New column", "New column", "New column", "New column" },
						{ "New column", "New column", "New column", "New column", "New column" }, },
				new String[] { "New column", "New column", "New column", "New column", "New column" }));
		pnCentro.add(tabelaCliente);

	}

	private class btnDetalhesListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

			// Verifica se o formulário está aberto.
			if (!frmPrincipal.verificaFormularioAberto(frmCadastroCliente.class.getSimpleName())) {

				frmCadastroCliente frm = new frmCadastroCliente();
				frmPrincipal.desktopPane.add(frm);
				frm.setVisible(true);
				frm.moveToFront();
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
