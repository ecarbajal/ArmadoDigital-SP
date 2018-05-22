package componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class PanelSolicitudContratosp extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Clientecon;
	private JTextField txtRepreLegal;
	private JTextField txtNotPcoFe;
	private JTextField txtNombreEmpresa;
	private JTextField txtInstPublico;
	private JTextField txtLicenciado;
	private JButton BotonSiguientec;
	private JTextField txtObjSocial;
	private JTextField txtDomiclioEmpresa;
	private JTextField txtRfc;
	private JLabel lblDatosDelCliente;
	private JButton btnNueva;
	private JDateChooser dteInstPub = new JDateChooser();
	private JLabel lblciudadNotarioPublico;
	private JTextField txtCiudadInstPublico;


	public PanelSolicitudContratosp(){		 	 			
		 	setBounds(21, 162, 771, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getClientecon());
			setVisible(true);			
			this.repaint();
		}
	
	public JButton BotonSiguientec() {
		if (BotonSiguientec == null) {
			try {
				BotonSiguientec = new JButton();
				BotonSiguientec.setBounds(672, 241, 117, 23);
				BotonSiguientec.setName("Boton Siguiente");				
				BotonSiguientec.setText("Siguiente");
				BotonSiguientec.setVisible(true);
				BotonSiguientec.setForeground(new Color(255,255,255));
				BotonSiguientec.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec;
	}
	
	
	public JTextField gettxtRepreLegal(){
		if(txtRepreLegal == null){
			txtRepreLegal = new JTextField();
			txtRepreLegal.setToolTipText("Nombre del representante legal, comenzando por el cargo de la persona, ejemplo: representante ...");
			txtRepreLegal.setBounds(187, 97, 228, 20);
		}
		return txtRepreLegal;
	}
	
	
	public JTextField gettxtLicenciado(){
		if(txtLicenciado == null){
			txtLicenciado = new JTextField();
			txtLicenciado.setToolTipText("Nombre del licenciado que da fe");
			txtLicenciado.setBounds(187, 242, 160, 20);
		}
		return txtLicenciado;
	}
	
	
	
	public JTextField gettxtNombreEmpresa(){
		if(txtNombreEmpresa == null){
			txtNombreEmpresa = new JTextField();
			txtNombreEmpresa.setToolTipText("Nombre de la empresa ");
			txtNombreEmpresa.setBounds(187, 30, 457, 20);
		}
		return txtNombreEmpresa;
	}
	

	public JTextField gettxtObjSocial(){
		if(txtObjSocial == null){
			txtObjSocial = new JTextField();
			txtObjSocial.setToolTipText("Objeto social de la empresa del cliente");
			txtObjSocial.setBounds(187, 128, 457, 20);
		}
		return txtObjSocial;
	}
	
	public JTextField gettxtInstPublico(){
		if(txtInstPublico == null){
			txtInstPublico = new JTextField();
			txtInstPublico.setToolTipText("N\u00FAmero del instrumento p\u00FAblico");
			txtInstPublico.setBounds(187, 179, 160, 20);
		}
		return txtInstPublico;
	}

	
	
	public JTextField gettxtDomiclioEmpresa(){
		if(txtDomiclioEmpresa == null){
			txtDomiclioEmpresa = new JTextField();
			txtDomiclioEmpresa.setToolTipText("Domicilio donde esta ubicada la empresa");
			txtDomiclioEmpresa.setBounds(187, 66, 457, 20);
		}
		return txtDomiclioEmpresa;
	}
	
	public JTextField gettxtNotPcoFe(){
		if(txtNotPcoFe == null){
			txtNotPcoFe = new JTextField();
			txtNotPcoFe.setToolTipText("N\u00FAmero de notario que da fe");
			txtNotPcoFe.setBounds(484, 210, 160, 20);
		}
		return txtNotPcoFe;
	}
	
	public JTextField gettxtRfc(){
		if(txtRfc == null){
			txtRfc = new JTextField();
			txtRfc.setToolTipText("RFC de la empresa");
			txtRfc.setBounds(484, 97, 160, 20);
		}
		return txtRfc;
	}
	
	public JDateChooser getDteFinContrato() {
		return dteInstPub;
	}
	
	public JDateChooser getDteInstrumentoPublico() {
		if(dteInstPub == null) {
			dteInstPub = new JDateChooser();
			dteInstPub.setToolTipText("Fecha de expedici\u00F3n del instrumento p\u00FAblico");
			dteInstPub.setBounds(187, 210, 160, 20);
			Clientecon.add(dteInstPub);
			
		}
		return dteInstPub;
	}
	



	

	

	

	public JPanel getClientecon(){
		if(Clientecon == null){
			Clientecon = new JPanel();
			Clientecon.setBackground(Color.WHITE);
			Clientecon.setBounds(-20, 0, 820, 275);
			Clientecon.setLayout(null);
			
						dteInstPub = new JDateChooser();
						dteInstPub.setBounds(187, 210, 160, 20);
						Clientecon.add(dteInstPub);
			Clientecon.add(gettxtDomiclioEmpresa());
			Clientecon.add(gettxtInstPublico());
			Clientecon.add(gettxtLicenciado());
			Clientecon.add(gettxtNombreEmpresa());
			Clientecon.add(gettxtNotPcoFe());
			Clientecon.add(BotonSiguientec());
			Clientecon.add(gettxtObjSocial());
			Clientecon.add(gettxtRepreLegal());
			Clientecon.add(gettxtRfc());
			Clientecon.add(getDteInstrumentoPublico());
			
			
			JLabel lblContacto = new JLabel("*Representante legal:");
			lblContacto.setForeground(new Color(0, 70, 129));
			lblContacto.setFont(new Font("Arial", Font.BOLD, 12));
			lblContacto.setBounds(60, 97, 139, 14);
			Clientecon.add(lblContacto);
			
			
			JLabel lblTelefono = new JLabel("*Instrumento publico:");
			lblTelefono.setForeground(new Color(0, 70, 129));
			lblTelefono.setFont(new Font("Arial", Font.BOLD, 12));
			lblTelefono.setBounds(60, 179, 139, 14);
			Clientecon.add(lblTelefono);
			
			
			JLabel lblEmail = new JLabel("*Fecha inst. publico:");
			lblEmail.setForeground(new Color(0, 70, 129));  
			lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
			lblEmail.setBounds(60, 209, 154, 14);
			Clientecon.add(lblEmail);
			
			JLabel lblcompañia = new JLabel("*Empresa:");
			lblcompañia.setForeground(new Color(0, 70, 129));
			lblcompañia.setFont(new Font("Arial", Font.BOLD, 12));
			lblcompañia.setBounds(60, 30, 117, 14);
			Clientecon.add(lblcompañia);
			
			JLabel lblfecha = new JLabel("*Objeto Social:");
			lblfecha.setForeground(new Color(0, 70, 129));
			lblfecha.setFont(new Font("Arial", Font.BOLD, 12));
			lblfecha.setBounds(60, 128, 154, 14);
			Clientecon.add(lblfecha);
			
			JLabel lbllugar = new JLabel("*Licenciado:");
			lbllugar.setForeground(new Color(0, 70, 129));
			lbllugar.setFont(new Font("Arial", Font.BOLD, 12));
			lbllugar.setBounds(60, 241, 117, 14);
			Clientecon.add(lbllugar);
			
			
			
			
			JLabel lbldomicilioRecogida = new JLabel("*Notario. P. que da fe:");
			lbldomicilioRecogida.setForeground(new Color(0, 70, 129));
			lbldomicilioRecogida.setFont(new Font("Arial", Font.BOLD, 12));
			lbldomicilioRecogida.setBounds(357, 210, 123, 20);
			Clientecon.add(lbldomicilioRecogida);
			
		
			
			JLabel lblfechaDeDesmontaje = new JLabel("*RFC:");
			lblfechaDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblfechaDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeDesmontaje.setBounds(433, 97, 106, 14);
			Clientecon.add(lblfechaDeDesmontaje);
			

			
			JLabel lblDomicilio = new JLabel("*Domicilio empresa:");
			lblDomicilio.setForeground(new Color(0, 70, 129));
			lblDomicilio.setFont(new Font("Arial", Font.BOLD, 12));
			lblDomicilio.setBounds(60, 66, 115, 14);
			Clientecon.add(lblDomicilio);
			Clientecon.add(getLblDatosDelCliente());
			
			btnNueva = new JButton();
			btnNueva.setIcon(new ImageIcon("Images\\home.png"));
			btnNueva.setBounds(702, 4, 76, 70);
			btnNueva.setName("btnNueva");			
			Clientecon.add(btnNueva);
			Clientecon.add(getLblciudadNotarioPublico());
			Clientecon.add(getTxtCiudadInstPublico());
			
			
		
			
			Clientecon.setVisible(true);
		}
		return Clientecon;
	}
	

	public JButton getbtnNueva() {
		if(btnNueva == null) {
			JButton btnNueva = new JButton();
			btnNueva.setIcon(new ImageIcon("Images\\home.png"));
			btnNueva.setBounds(672, 0, 76, 70);
			btnNueva.setName("btnNueva");	
		}
		return btnNueva;
	}
	

	public JFileChooser getButtonGenerarcotizacion() {
		return null;
	}

	public Component getSolc() {
		return null;
	}
	private JLabel getLblDatosDelCliente() {
		if (lblDatosDelCliente == null) {
			lblDatosDelCliente = new JLabel("Datos del Cliente");
			lblDatosDelCliente.setForeground(Color.GRAY);
			lblDatosDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
			lblDatosDelCliente.setBounds(343, 6, 117, 14);
		}
		return lblDatosDelCliente;
	}
	private JLabel getLblciudadNotarioPublico() {
		if (lblciudadNotarioPublico == null) {
			lblciudadNotarioPublico = new JLabel("*Ciudad inst. publico:");
			lblciudadNotarioPublico.setForeground(new Color(0, 70, 129));
			lblciudadNotarioPublico.setFont(new Font("Arial", Font.BOLD, 12));
			lblciudadNotarioPublico.setBounds(357, 179, 123, 20);
		}
		return lblciudadNotarioPublico;
	}
	public JTextField getTxtCiudadInstPublico() {
		if (txtCiudadInstPublico == null) {
			txtCiudadInstPublico = new JTextField();
			txtCiudadInstPublico.setToolTipText("Ciudad donde se expide el instrumento p\u00FAblico");
			txtCiudadInstPublico.setBounds(484, 179, 160, 20);
		}
		return txtCiudadInstPublico;
	}
	
	public void limpiarFormPnlSolicitudContSP() {
		String vacio = "";
		gettxtNombreEmpresa().setText(vacio);
		gettxtRepreLegal().setText(vacio);
		gettxtInstPublico().setText(vacio);
		getDteInstrumentoPublico().getDate();
		gettxtNotPcoFe().setText(vacio);
		gettxtLicenciado().setText(vacio);
		gettxtRfc().setText(vacio);
		gettxtObjSocial().setText(vacio);
		gettxtDomiclioEmpresa().setText(vacio);
		getTxtCiudadInstPublico().setText(vacio);
		getDteInstrumentoPublico().setDate(null);
	}
}


