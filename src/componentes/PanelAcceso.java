package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import utils.DBConnect;

public class PanelAcceso extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labelUser;
	private JLabel labelPass;
	private STextFieldAcceso textUser;
	private JPasswordField textPass;
	private JButton botonAceptar;
	private String idUser;
	private String cua;
	private DBConnect dbc = new DBConnect();

	public PanelAcceso() {
		System.out.println("PanelAcceso");
		setBounds(0, 368, 1000, 93);
		setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(521, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(19)
										.addComponent(getLabelUser(), GroupLayout.PREFERRED_SIZE, 47,
												GroupLayout.PREFERRED_SIZE)
										.addGap(4).addComponent(getTextUser(), GroupLayout.PREFERRED_SIZE, 131,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(getLabelPass(), GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addGap(4)
										.addComponent(getTextPass(), GroupLayout.PREFERRED_SIZE, 131,
												GroupLayout.PREFERRED_SIZE)
										.addGap(29).addComponent(getBotonAceptar(), GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)))
						.addGap(154)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				groupLayout.createSequentialGroup().addContainerGap(23, Short.MAX_VALUE).addGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addComponent(getLabelUser(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup().addGap(1).addComponent(getTextUser(),
								GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addGap(11)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(1).addComponent(getLabelPass(),
										GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addComponent(getTextPass(), GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addGroup(
										groupLayout.createSequentialGroup().addGap(1).addComponent(getBotonAceptar())))
						.addContainerGap()));
		setLayout(groupLayout);
		textUser.setVisible(true);
		labelUser.setVisible(true);

	}

	// etiqueta USUARIO
	public JLabel getLabelUser() {
		if (labelUser == null) {
			try {
				labelUser = new JLabel();
				labelUser.setName("labelUser");
				labelUser.setText("Usuario:");
				labelUser.setVisible(true);
				labelUser.setForeground(new Color(90, 90, 90));
				labelUser.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return labelUser;
	}

	// JTextField del Usuario
	public JTextField getTextUser() {
		if (textUser == null) {
			textUser = new STextFieldAcceso();
			textUser.setVisible(true);
			textUser.setBackground(null);
			textUser.setForeground(new Color(0, 0, 0));
			textUser.setBorder(BorderFactory.createLineBorder(new Color(0, 70, 129)));
			textUser.setVisible(true);
		}
		return textUser;
	}

	// Etiqueta Password
	public JLabel getLabelPass() {
		if (labelPass == null) {
			try {
				labelPass = new JLabel();
				labelPass.setName("labelPss");
				labelPass.setText("Contrase\u00F1a:");
				Font font1 = new Font("Courier New", Font.BOLD, 12);
				textPass.setFont(font1);
				labelPass.setVisible(true);
				labelPass.setForeground(new Color(90, 90, 90));
				labelPass.setVisible(true);

			} catch (java.lang.Throwable ignored) {
			}
		}
		return labelPass;
	}

	// JTextField del password
	public JPasswordField getTextPass() {
		if (textPass == null) {
			try {
				textPass = new JPasswordField();
				textPass.setName("textPath2");
				textPass.setForeground(new Color(0, 0, 0));
				textPass.setVisible(true);
				textPass.setBorder(BorderFactory.createLineBorder(new Color(0, 70, 129)));
				textPass.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return textPass;
	}

	public JButton getBotonAceptar() {
		if (botonAceptar == null) {
			botonAceptar = new JButton();
			botonAceptar.setName("BotonAceptar");
			botonAceptar.setText("Entrar");
			botonAceptar.setVisible(true);
		}
		return botonAceptar;
	}

	public String getIdUser() {
		return idUser;
	}

	public String getCua() {
		return cua;
	}

	public String[] validar() {
		String[] users = new String[4];
		char clave[] = getTextPass().getPassword();
		 String clavedef = new String(clave);
		//String clavedef = new String(getTextPass().getPassword());
		users = dbc.getUser(getTextUser().getText(), clavedef);
		if (users[0] != null) {
			return users;
		} else {
			String st = "El usuario no esta Registrado";
			JOptionPane.showMessageDialog(null, st);
			return users;
		}
	}
}
