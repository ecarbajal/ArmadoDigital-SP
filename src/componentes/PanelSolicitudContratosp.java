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
	private JSeparator separator;
	private JLabel lblDatosDelPrestador;
	private JLabel lblrfcPrestador;
	private JTextField txtRFCPrestador;
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
			txtRepreLegal.setBounds(482, 30, 160, 20);
		}
		return txtRepreLegal;
	}
	
	
	public JTextField gettxtLicenciado(){
		if(txtLicenciado == null){
			txtLicenciado = new JTextField();
			txtLicenciado.setBounds(187, 121, 160, 20);
		}
		return txtLicenciado;
	}
	
	
	
	public JTextField gettxtNombreEmpresa(){
		if(txtNombreEmpresa == null){
			txtNombreEmpresa = new JTextField();
			txtNombreEmpresa.setBounds(187, 30, 160, 20);
		}
		return txtNombreEmpresa;
	}
	

	public JTextField gettxtObjSocial(){
		if(txtObjSocial == null){
			txtObjSocial = new JTextField();
			txtObjSocial.setBounds(187, 90, 160, 20);
		}
		return txtObjSocial;
	}
	
	public JTextField gettxtInstPublico(){
		if(txtInstPublico == null){
			txtInstPublico = new JTextField();
			txtInstPublico.setBounds(482, 91, 160, 20);
		}
		return txtInstPublico;
	}

	
	
	public JTextField gettxtDomiclioEmpresa(){
		if(txtDomiclioEmpresa == null){
			txtDomiclioEmpresa = new JTextField();
			txtDomiclioEmpresa.setBounds(482, 60, 160, 20);
		}
		return txtDomiclioEmpresa;
	}
	
	public JTextField gettxtNotPcoFe(){
		if(txtNotPcoFe == null){
			txtNotPcoFe = new JTextField();
			txtNotPcoFe.setBounds(187, 150, 160, 20);
		}
		return txtNotPcoFe;
	}
	
	public JTextField gettxtRfc(){
		if(txtRfc == null){
			txtRfc = new JTextField();
			txtRfc.setBounds(187, 60, 160, 20);
		}
		return txtRfc;
	}
	
	public JDateChooser getDteFinContrato() {
		return dteInstPub;
	}
	
	public JDateChooser getDteInstrumentoPublico() {
		if(dteInstPub == null) {
			dteInstPub = new JDateChooser();
			dteInstPub.setBounds(482, 120, 160, 20);
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
			lblContacto.setBounds(355, 30, 139, 14);
			Clientecon.add(lblContacto);
			
			
			JLabel lblTelefono = new JLabel("*Instrumento publico:");
			lblTelefono.setForeground(new Color(0, 70, 129));
			lblTelefono.setFont(new Font("Arial", Font.BOLD, 12));
			lblTelefono.setBounds(355, 91, 139, 14);
			Clientecon.add(lblTelefono);
			
			
			JLabel lblEmail = new JLabel("*Fecha inst. publico:");
			lblEmail.setForeground(new Color(0, 70, 129));  
			lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
			lblEmail.setBounds(355, 120, 154, 14);
			Clientecon.add(lblEmail);
			
			JLabel lblcompañia = new JLabel("*Empresa:");
			lblcompañia.setForeground(new Color(0, 70, 129));
			lblcompañia.setFont(new Font("Arial", Font.BOLD, 12));
			lblcompañia.setBounds(60, 30, 117, 14);
			Clientecon.add(lblcompañia);
			
			JLabel lblfecha = new JLabel("*Objeto Social:");
			lblfecha.setForeground(new Color(0, 70, 129));
			lblfecha.setFont(new Font("Arial", Font.BOLD, 12));
			lblfecha.setBounds(60, 90, 154, 14);
			Clientecon.add(lblfecha);
			
			JLabel lbllugar = new JLabel("*Licenciado:");
			lbllugar.setForeground(new Color(0, 70, 129));
			lbllugar.setFont(new Font("Arial", Font.BOLD, 12));
			lbllugar.setBounds(60, 120, 117, 14);
			Clientecon.add(lbllugar);
			
			
			
			
			JLabel lbldomicilioRecogida = new JLabel("*Notario. P. que da fe:");
			lbldomicilioRecogida.setForeground(new Color(0, 70, 129));
			lbldomicilioRecogida.setFont(new Font("Arial", Font.BOLD, 12));
			lbldomicilioRecogida.setBounds(60, 150, 123, 20);
			Clientecon.add(lbldomicilioRecogida);
			
		
			
			JLabel lblfechaDeDesmontaje = new JLabel("*RFC cliente:");
			lblfechaDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblfechaDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeDesmontaje.setBounds(60, 60, 106, 14);
			Clientecon.add(lblfechaDeDesmontaje);
			

			
			JLabel lblDomicilio = new JLabel("*Domicilio empresa:");
			lblDomicilio.setForeground(new Color(0, 70, 129));
			lblDomicilio.setFont(new Font("Arial", Font.BOLD, 12));
			lblDomicilio.setBounds(355, 60, 115, 14);
			Clientecon.add(lblDomicilio);
			Clientecon.add(getLblDatosDelCliente());
			
			btnNueva = new JButton();
			btnNueva.setIcon(new ImageIcon("Images\\home.png"));
			btnNueva.setBounds(702, 4, 76, 70);
			btnNueva.setName("btnNueva");			
			Clientecon.add(btnNueva);

			dteInstPub = new JDateChooser();
			dteInstPub.setBounds(482, 120, 160, 20);
			Clientecon.add(dteInstPub);
			Clientecon.add(getSeparator());
			Clientecon.add(getLblDatosDelPrestador());
			Clientecon.add(getLblrfcPrestador());
			Clientecon.add(getTxtRFCPrestador());
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
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(44, 189, 716, 2);
		}
		return separator;
	}
	private JLabel getLblDatosDelPrestador() {
		if (lblDatosDelPrestador == null) {
			lblDatosDelPrestador = new JLabel("Datos del prestador");
			lblDatosDelPrestador.setForeground(Color.GRAY);
			lblDatosDelPrestador.setFont(new Font("Arial", Font.BOLD, 12));
			lblDatosDelPrestador.setBounds(343, 199, 117, 14);
		}
		return lblDatosDelPrestador;
	}
	private JLabel getLblrfcPrestador() {
		if (lblrfcPrestador == null) {
			lblrfcPrestador = new JLabel("*RFC prestador");
			lblrfcPrestador.setForeground(new Color(0, 70, 129));
			lblrfcPrestador.setFont(new Font("Arial", Font.BOLD, 12));
			lblrfcPrestador.setBounds(65, 226, 106, 14);
		}
		return lblrfcPrestador;
	}
	public JTextField getTxtRFCPrestador() {
		if (txtRFCPrestador == null) {
			txtRFCPrestador = new JTextField();
			txtRFCPrestador.setBounds(190, 224, 160, 20);
		}
		return txtRFCPrestador;
	}
	private JLabel getLblciudadNotarioPublico() {
		if (lblciudadNotarioPublico == null) {
			lblciudadNotarioPublico = new JLabel("*Ciudad inst. publico:");
			lblciudadNotarioPublico.setForeground(new Color(0, 70, 129));
			lblciudadNotarioPublico.setFont(new Font("Arial", Font.BOLD, 12));
			lblciudadNotarioPublico.setBounds(355, 150, 123, 20);
		}
		return lblciudadNotarioPublico;
	}
	public JTextField getTxtCiudadInstPublico() {
		if (txtCiudadInstPublico == null) {
			txtCiudadInstPublico = new JTextField();
			txtCiudadInstPublico.setBounds(482, 150, 160, 20);
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
		getTxtRFCPrestador().setText(vacio);
		getTxtCiudadInstPublico().setText(vacio);
		getDteInstrumentoPublico().setDate(null);
	}
}


