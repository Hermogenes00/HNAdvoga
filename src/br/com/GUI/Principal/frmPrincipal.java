package br.com.GUI.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.time.chrono.JapaneseDate;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.GUI.Advogado.Cadastro.frmCadastroAdvogado;
import br.com.GUI.Advogado.Consulta.frmConsultaAdvogado;
import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Cliente.Consulta.frmConsultaCliente;





public class frmPrincipal extends JFrame{


	//Formulários a serem chamados pelos botões.	
	private frmCadastroCliente _frmCadastroCliente;
	private frmCadastroAdvogado _frmCadastroAdvogado;
	private frmConsultaCliente _frmConsultaCliente;
	private frmConsultaAdvogado _frmConsultaAdvogado;

	public static JDesktopPane _desktopPane = new JDesktopPane();
	//Composição deste formulário (JPanel,JInternalFrame ...)

	Topo topo;

	public frmPrincipal()
	{
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

		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		this.addWindowListener(new PrincipalListener());
	}


	private class PrincipalListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Seja bem vindo ao HNAdvoga");

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
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}}


	private void inicializarComponentes() {


		topo = new Topo();
		_desktopPane.setBackground(Color.gray);
		super.setLayout(new BorderLayout());
		super.getContentPane().add(BorderLayout.NORTH,topo);
		super.getContentPane().add(BorderLayout.CENTER,_desktopPane);
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);		
		super.setVisible(true);

	}


	private class Topo extends JMenuBar{

		JMenu botaoCliente = new JMenu("Clientes");
		JMenu botaoAdvogado = new JMenu("Advogados");
		JMenu botaoProcesso = new JMenu("Processos");
		JMenu botaoRelatorio = new JMenu("Relatorio");
		JMenu botaoFinanceiro = new JMenu("Financeiro");
		JMenu botaoBloquear = new JMenu("Bloquear");
		JMenu botaoOrdemServico = new JMenu("Ordem de Serviço");

		//Botões de Cadastros
		JMenuItem botaoClienteCadastro = new JMenuItem("Cadastrar");
		JMenuItem botaoAdvogadoCadastro = new JMenuItem("Cadastrar");
		JMenuItem botaoProcessoCadastro = new JMenuItem("Cadastrar");

		//Botões de Consultas
		JMenuItem botaoClienteConsulta = new JMenuItem("Consultar");
		JMenuItem botaoAdvogadoConsulta = new JMenuItem("Consultar");
		JMenuItem botaoProcessConsulta = new JMenuItem("Consultar");
		
		
		JMenuItem botaoRelatorioCliente = new JMenuItem("Cliente");
		JMenuItem botaoRelatorioAdvogado = new JMenuItem("Advogado");
		JMenuItem botaoRelatorioProcesso = new JMenuItem("Processo");
		JMenuItem botaoRelatorioOrdemServico = new JMenuItem("Ordem de Serviço");
		JMenuItem botaoRelatorioFinanceiro = new JMenuItem("Financeiro");
		

		public Topo(){

			configurandoBotao();

			incializaTopo();


		}

		private void incializaTopo() {

			botaoCliente.add(botaoClienteCadastro);
			botaoCliente.add(botaoClienteConsulta);

			botaoAdvogado.add(botaoAdvogadoCadastro);
			botaoAdvogado.add(botaoAdvogadoConsulta);

			botaoProcesso.add(botaoProcessoCadastro);
			botaoProcesso.add(botaoProcessConsulta);

			
			
			//Botões de relatórios
			botaoRelatorio.add(botaoRelatorioCliente);
			botaoRelatorio.add(botaoRelatorioAdvogado);
			botaoRelatorio.add(botaoRelatorioProcesso);
			botaoRelatorio.add(botaoRelatorioOrdemServico);
			botaoRelatorio.add(botaoRelatorioFinanceiro);
			
			
			this.add(botaoCliente);
			this.add(botaoAdvogado);
			this.add(botaoProcesso);
			this.add(botaoOrdemServico);
			this.add(botaoRelatorio);
			this.add(botaoFinanceiro);
			this.add(botaoBloquear);


			botaoClienteCadastro.addActionListener(new botaoClienteCadastroListener());
			botaoClienteConsulta.addActionListener(new botaoClienteConsultaListener());

			botaoAdvogadoCadastro.addActionListener(new botaoAdvogadoCadastroListener());
			botaoAdvogadoConsulta.addActionListener(new botaoAdvogadoConsultaListener());

		}

		void configurandoBotao()
		{
			botaoCliente.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icon_cliente.png")));
			botaoAdvogado.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-funcionário-homem-40.png")));
			botaoProcesso.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-fluxograma-40.png")));
			botaoRelatorio.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-histórico-médico-40.png")));
			botaoFinanceiro.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-restituição-40.png")));
			botaoBloquear.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-bloquear-modo-paisagem-40.png")));
			botaoOrdemServico.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-serviço-de-limpeza-40.png")));
		}
	}


	private class botaoClienteCadastroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			_frmCadastroCliente = new frmCadastroCliente();
			_frmCadastroCliente.setVisible(true);
			_desktopPane.add(_frmCadastroCliente);
			_frmCadastroCliente.moveToFront();

		}

	}
	private class botaoClienteConsultaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			_frmConsultaCliente = new frmConsultaCliente();
			_frmConsultaCliente.setVisible(true);
			
			_desktopPane.add(_frmConsultaCliente);
			_frmConsultaCliente.moveToFront();

		}

	}
	private class botaoAdvogadoCadastroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			_frmCadastroAdvogado = new frmCadastroAdvogado();
			_frmCadastroAdvogado.setVisible(true);
			_desktopPane.add(_frmCadastroAdvogado);
			_frmCadastroAdvogado.moveToFront();

		}


	}

	private class botaoAdvogadoConsultaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			_frmConsultaAdvogado = new frmConsultaAdvogado();
			_frmConsultaAdvogado.setVisible(true);
			_desktopPane.add(_frmConsultaAdvogado);
			_frmConsultaAdvogado.moveToFront();
		}

	}

	private class Rodape extends JPanel{

	}


	public static void main(String[] args) {
		new frmPrincipal();
	}
}
