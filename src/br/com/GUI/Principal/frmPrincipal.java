package br.com.GUI.Principal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.GUI.Advogado.Cadastro.frmCadastroAdvogado;
import br.com.GUI.Advogado.Consulta.frmConsultaAdvogado;
import br.com.GUI.Agenda.Cadastro.frmCadastroAgenda;
import br.com.GUI.Agenda.Consulta.frmConsultaAgenda;
import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Cliente.Consulta.frmConsultaCliente;
import br.com.GUI.Financeiro.Despesa.Cadastro.frmCadastroDespesa;
import br.com.GUI.Financeiro.Despesa.Consulta.frmConsultaDespesa;
import br.com.GUI.Login.frmLogin;

import br.com.GUI.Processo.Cadastro.frmCadastroProcesso;
import br.com.GUI.Processo.Consulta.frmConsultaProcesso;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	public static JDesktopPane desktopPane;

	//Formulários a serem chamados pelos botões.	
	private frmCadastroCliente _frmCadastroCliente;
	private frmCadastroAdvogado _frmCadastroAdvogado;
	private frmConsultaCliente _frmConsultaCliente;
	private frmConsultaProcesso _frmConsultaProcesso;
	private frmConsultaAdvogado _frmConsultaAdvogado;
	private frmCadastroProcesso _frmCadastroProcesso;
	private frmConsultaDespesa _frmConsultaDespesa;
	private frmConsultaAgenda _frmConsultaAgenda;
	private frmCadastroAgenda _frmCadastroAgenda;
	private frmLogin _frmLogin =null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("HNAdvoga");
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels() ) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		inicializarComponentes();

		this.setMinimumSize(new Dimension(500,500));
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		this.addWindowListener(new PrincipalListener());
	}

	private void inicializarComponentes() {

		getContentPane().setLayout(new BorderLayout());

		desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		getContentPane().add(menuBar, BorderLayout.NORTH);

		JMenu botaoCliente = new JMenu("Cliente");
		
		botaoCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!verificaFormularioAberto(_frmLogin)) {
					if (!verificaFormularioAberto(_frmConsultaCliente)) {
						_frmConsultaCliente = new frmConsultaCliente();
						_frmConsultaCliente.setVisible(true);

						desktopPane.add(_frmConsultaCliente);

					}
				}				
				_frmConsultaCliente.moveToFront();

			}
		});


		botaoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		botaoCliente.setIcon(null);
		menuBar.add(botaoCliente);

		JMenu botaoAdvogado = new JMenu("Advogado");
		botaoAdvogado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (!verificaFormularioAberto(_frmLogin)) {

					if (!verificaFormularioAberto(_frmConsultaAdvogado)) {
						_frmConsultaAdvogado = new frmConsultaAdvogado();
						_frmConsultaAdvogado.setVisible(true);

						desktopPane.add(_frmConsultaAdvogado);
						_frmConsultaAdvogado.moveToFront();
					}

					_frmConsultaAdvogado.moveToFront();

				}
			}
		});

		menuBar.add(botaoAdvogado);

		JMenu botaoProcesso = new JMenu("Processo");
		botaoProcesso.setEnabled(false);
		botaoProcesso.setVisible(false);
		botaoProcesso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!verificaFormularioAberto(_frmConsultaProcesso)) {
					_frmConsultaProcesso = new frmConsultaProcesso();
					_frmConsultaProcesso.setVisible(true);

					desktopPane.add(_frmConsultaProcesso);

				}
				_frmConsultaProcesso.moveToFront();
			}
		});
		menuBar.add(botaoProcesso);
		
		JMenu mnNewMenu = new JMenu("Agenda");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!verificaFormularioAberto(_frmConsultaAgenda)) {
					_frmConsultaAgenda = new frmConsultaAgenda();
					_frmConsultaAgenda.setVisible(true);

					desktopPane.add(_frmConsultaAgenda);

				}
				_frmConsultaAgenda.moveToFront();
				
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Produto");
		menuBar.add(mnNewMenu_1);

		JMenu botaoFinanceiro = new JMenu("Financeiro");
		menuBar.add(botaoFinanceiro);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Contas \u00E0 pagar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!verificaFormularioAberto(_frmConsultaDespesa)) {
					_frmConsultaDespesa = new frmConsultaDespesa();
					_frmConsultaDespesa.setVisible(true);

					desktopPane.add(_frmConsultaDespesa);

				}
				_frmConsultaDespesa.moveToFront();
			}
		});
		botaoFinanceiro.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Contas \u00E0 receber");
		botaoFinanceiro.add(mntmNewMenuItem_6);

		JMenu botaoContratoFicha = new JMenu("Contratos");
		menuBar.add(botaoContratoFicha);

		JMenu botaoBloquear = new JMenu("Bloquear");
		botaoBloquear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (!verificaFormularioAberto(_frmLogin)) {

					if (contaFormAbertos()>0) {
						JOptionPane.showMessageDialog(null, "Não é possívela logar-se com janela(s) aberta(s)");
					}else {
						_frmLogin = new frmLogin();
						_frmLogin.setVisible(true);
						_frmLogin.setClosable(true);
						desktopPane.add(_frmLogin);	
						_frmLogin.setLocale(null);
						_frmLogin.moveToFront();
					}

				}
			}});

		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatrio);

		JMenuItem mntmNewMenuItem = new JMenuItem("Cliente");
		mnRelatrio.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Advogado");
		mnRelatrio.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Financeiro");
		mnRelatrio.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Processos");
		mnRelatrio.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Contratos");
		mnRelatrio.add(mntmNewMenuItem_4);

		menuBar.add(botaoBloquear);

		super.setPreferredSize(new Dimension(500,500));
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);		

		super.setVisible(true);

	}
	private class PrincipalListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			//JOptionPane.showMessageDialog(null, "Seja bem vindo ao HNAdvoga");

		}

		@Override
		public void windowClosing(WindowEvent e) {

			int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");

			if (opcao == JOptionPane.OK_OPTION) {
				System.exit(0);
			}

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowActivated(WindowEvent e) {


		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}}
	public static boolean verificaFormularioAberto(JInternalFrame frame)
	{
		if (frame != null ) {

			if (frame.isVisible()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public static boolean verificaFormularioAberto(String nomeFormulario)
	{
		boolean ret = false;

		for(Component cmp: desktopPane.getComponents()) {

			if (cmp.getClass().getSimpleName().equals(nomeFormulario)) {

			JInternalFrame frm = (JInternalFrame) cmp;
			frm.moveToFront();
			ret = true;
			}
		}

		return ret;
	}
	//Conta a quantidade de formulários abertos dentro do desktopPane
	private int contaFormAbertos()
	{		
		return  desktopPane.getComponents().length;
	}
}
