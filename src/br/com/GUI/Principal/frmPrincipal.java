package br.com.GUI.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.io.File;
import java.time.chrono.JapaneseDate;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.GUI.Advogado.Cadastro.frmCadastroAdvogado;
import br.com.GUI.Advogado.Consulta.frmConsultaAdvogado;
import br.com.GUI.Cliente.Cadastro.frmCadastroCliente;
import br.com.GUI.Cliente.Consulta.frmConsultaCliente;
import br.com.GUI.Login.frmLogin;
import br.com.GUI.Processo.Cadastro.frmCadastroProcesso;


public class frmPrincipal extends JFrame{


	//Formulários a serem chamados pelos botões.	
	private frmCadastroCliente _frmCadastroCliente;
	private frmCadastroAdvogado _frmCadastroAdvogado;
	private frmConsultaCliente _frmConsultaCliente;
	private frmConsultaAdvogado _frmConsultaAdvogado;
	private frmCadastroProcesso _frmCadastroProcesso;



	public static JDesktopPane _desktopPane = new JDesktopPane() {

		ImageIcon fundo = new ImageIcon(getClass().getResource("/br/com/Imagens/fundo.jpeg"));
		Image imagem = fundo.getImage();


		@Override
		public void setBackground(Color bgColor) {
			// TODO Auto-generated method stub
			super.setBackground(bgColor.darker());
		}
	};


	//Composição deste formulário (JPanel,JInternalFrame ...)

	Topo topo;
	private frmLogin _frmLogin =null;


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

		this.setMinimumSize(new Dimension(500,500));
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		this.addWindowListener(new PrincipalListener());

	}



	private void inicializarComponentes() {


		topo = new Topo();

		super.setLayout(new BorderLayout());
		super.getContentPane().add(BorderLayout.NORTH,topo);
		super.getContentPane().add(BorderLayout.CENTER,_desktopPane);
		super.setPreferredSize(new Dimension(500,500));
		super.setExtendedState(JFrame.MAXIMIZED_BOTH);		

		super.setVisible(true);

	}


	public  class Topo extends JMenuBar{

		//Botões do menu 
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
			this.add(botaoOrdemServico);
			this.add(botaoProcesso);			
			this.add(botaoRelatorio);
			this.add(botaoFinanceiro);
			this.add(botaoBloquear);


			botaoClienteCadastro.addActionListener(new botaoClienteCadastroListener());
			botaoClienteConsulta.addActionListener(new botaoClienteConsultaListener());

			botaoAdvogadoCadastro.addActionListener(new botaoAdvogadoCadastroListener());
			botaoAdvogadoConsulta.addActionListener(new botaoAdvogadoConsultaListener());
			botaoProcessoCadastro.addActionListener(new botaoProcessoCadastroListener());
			botaoBloquear.addMouseListener(new botaoBloquearListener());

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

	private class Rodape extends JPanel{

	}

	public static void main(String[] args) {
		new frmPrincipal();
	}

	//Verifica se determinado formulario está aberto retornando true ou false

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

		for(Component cmp: _desktopPane.getComponents()) {

			if (cmp.getClass().getSimpleName().equals(nomeFormulario)) {

				ret = true;
			}
		}

		return ret;
	}

	//Conta a quantidade de formulários abertos dentro do desktopPane
	private int contaFormAbertos()
	{		
		return  _desktopPane.getComponents().length;
	}


	//Listeners
	private class botaoAdvogadoConsultaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if (!verificaFormularioAberto(_frmLogin)) {

				if (!verificaFormularioAberto(_frmConsultaAdvogado)) {
					_frmConsultaAdvogado = new frmConsultaAdvogado();
					_frmConsultaAdvogado.setVisible(true);

					_desktopPane.add(_frmConsultaAdvogado);
					_frmConsultaAdvogado.moveToFront();
				}else {
					_frmConsultaAdvogado.moveToFront();
				}

			}

		}

	}
	private class botaoProcessoCadastroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (!verificaFormularioAberto(_frmLogin)) {

				if (!verificaFormularioAberto(frmCadastroProcesso.class.getSimpleName())) {

					_frmCadastroProcesso = new frmCadastroProcesso();
					_frmCadastroProcesso.setVisible(true);
					_desktopPane.add(_frmCadastroProcesso);
					_frmCadastroProcesso.moveToFront();
				}

			}

		}

	}
	private class botaoAdvogadoCadastroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if (!verificaFormularioAberto(_frmLogin)) {

				if (!verificaFormularioAberto(frmCadastroAdvogado.class.getSimpleName())) {

					_frmCadastroAdvogado = new frmCadastroAdvogado();
					_frmCadastroAdvogado.setVisible(true);
					_desktopPane.add(_frmCadastroAdvogado);
					_frmCadastroAdvogado.moveToFront();
				}

			}
		}


	}
	private class botaoClienteConsultaListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!verificaFormularioAberto(_frmLogin)) {
				_frmConsultaCliente = new frmConsultaCliente();
				_frmConsultaCliente.setVisible(true);

				_desktopPane.add(_frmConsultaCliente);
				_frmConsultaCliente.moveToFront();}

		}

	}
	private class botaoBloquearListener implements MouseListener{


		@Override
		public void mouseClicked(MouseEvent e) {


			if (!verificaFormularioAberto(_frmLogin)) {

				if (contaFormAbertos()>0) {
					JOptionPane.showMessageDialog(null, "Não é possívela logar-se com janela(s) aberta(s)");
				}else {
					_frmLogin = new frmLogin();
					_frmLogin.setVisible(true);
					_frmLogin.setClosable(true);
					_desktopPane.add(_frmLogin);	
					_frmLogin.setLocale(null);
					_frmLogin.moveToFront();
				}


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
	private class botaoClienteCadastroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if (!verificaFormularioAberto(_frmLogin)) {
				_frmCadastroCliente = new frmCadastroCliente();
				_frmCadastroCliente.setVisible(true);
				_desktopPane.add(_frmCadastroCliente);
				_frmCadastroCliente.moveToFront();}

		}

	}


}
