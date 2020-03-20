package br.com.GUI.Principal;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
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
	
	//Composição deste formulário (JPanel,JInternalFrame ...)
	Centro centro;
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
		centro = new Centro();
		super.setLayout(new BorderLayout());
		super.getContentPane().add(BorderLayout.NORTH,topo);
		super.getContentPane().add(BorderLayout.CENTER,centro);
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

		public Topo(){
			
			configurandoBotao();
			
			incializaTopo();
			
			botaoCliente.addMouseListener(new botaoClienteListener());
			botaoAdvogado.addMouseListener(new botaoAdvogadoListener());
		}
		
		private void incializaTopo() {
			
			this.add(botaoCliente);
			this.add(botaoAdvogado);
			this.add(botaoProcesso);
			this.add(botaoRelatorio);
			this.add(botaoFinanceiro);
			this.add(botaoBloquear);
			
		}
		
		void configurandoBotao()
		{
			botaoCliente.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icon_cliente.png")));
			botaoAdvogado.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-funcionário-homem-40.png")));
			botaoProcesso.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-fluxograma-40.png")));
			botaoRelatorio.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-histórico-médico-40.png")));
			botaoFinanceiro.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-restituição-40.png")));
			botaoBloquear.setIcon(new ImageIcon(getClass().getResource("/br/com/Imagens/icons8-bloquear-modo-paisagem-40.png")));
		}
	}
	

	private class botaoClienteListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			_frmConsultaCliente = new frmConsultaCliente();
			_frmConsultaCliente.setVisible(true);
			centro.add(_frmConsultaCliente);
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
	
	private class botaoAdvogadoListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			_frmConsultaAdvogado = new frmConsultaAdvogado();
			_frmConsultaAdvogado.setVisible(true);
			centro.add(_frmConsultaAdvogado);
			
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

	private class Centro extends JDesktopPane{

	}


	private class Rodape extends JPanel{

	}


	public static void main(String[] args) {
		new frmPrincipal();
	}
}
