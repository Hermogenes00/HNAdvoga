package br.com.GUI.Login;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class frmLogin extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {

		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				dispose();

			}
		});

		setTitle("Login");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Miriam", Font.PLAIN, 20));
		textField.setToolTipText("Informe o seu cpf");
		textField.setBounds(6, 54, 426, 45);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Miriam", Font.PLAIN, 20));
		textField_1.setToolTipText("Informe a sua senha");
		textField_1.setColumns(10);
		textField_1.setBounds(6, 124, 426, 45);
		getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("Acessar");
		btnNewButton.setBounds(6, 181, 426, 39);
		getContentPane().add(btnNewButton);

	}

}
