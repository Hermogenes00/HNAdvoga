package br.com.GUI.Cliente.Consulta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Principal.frmPrincipal;

import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

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
		setResizable(true);
		
		setTitle("Consulta Clientes");
		setIconifiable(true);
		
		//setClosed(true);
		
		setClosable(true);
		
		setBounds(100, 100, 870, 500);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel pnTopo = new JPanel();
		pnTopo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		pnTopo.setPreferredSize(new Dimension(super.getWidth(),100));
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
		tabelaCliente.setBorder(new CompoundBorder());
		tabelaCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		tabelaCliente.setModel(new DefaultTableModel(
			new Object[][] {
				{"New column", "New column", "New column", "New column", "New column"},
				{"New column", "New column", "New column", "New column", "New column"},
				{"New column", "New column", "New column", "New column", "New column"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		pnCentro.add(tabelaCliente);

	}
	
	private class btnDetalhesListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			//JOptionPane.showMessageDialog(null, "Clicou");
			
			frmCadastroCliente frm = new frmCadastroCliente();
			
			frm.setVisible(true);
			
			frmPrincipal._desktopPane.add(frm);
			
			
			
			
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
