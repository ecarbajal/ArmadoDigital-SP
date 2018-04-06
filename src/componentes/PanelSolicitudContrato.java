package componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSolicitudContrato extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Clientecon;
	private JTextField represental;
	private JTextField licenciaf;
	private JTextField empresa;
	private JTextField fechain;
	private JTextField inotarial;
	private JTextField notariop;
	private JButton BotonSiguientec;
	private JTextField npde;
	private JTextField comerde;
	private JTextField delede;
	private JTextField domicilio;
	private JTextField foliom;
	private JTextField fechafm;
	private JTextField rfc;
	private JLabel lblDatosDelCliente;
	private JButton btnNueva;


	public PanelSolicitudContrato(){		 	 			
		 	setBounds(21, 162, 756, 300);
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
				BotonSiguientec.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				BotonSiguientec.setBounds(352, 249, 106, 23);
				BotonSiguientec.setName("Boton Siguiente");				
				BotonSiguientec.setText("Siguiente");
				BotonSiguientec.setVisible(true);
				BotonSiguientec.setForeground(new Color(255,255,255));
				BotonSiguientec.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec;
	}
	
	
	public JTextField getrepresental(){
		if(represental == null){
			represental = new JTextField();
			represental.setBounds(189, 54, 154, 20);
		}
		return represental;
	}
	
	
	public JTextField getnotariop(){
		if(notariop == null){
			notariop = new JTextField();
			notariop.setBounds(189, 178, 154, 20);
		}
		return notariop;
	}
	
	
	
	public JTextField getempresa(){
		if(empresa == null){
			empresa = new JTextField();
			empresa.setBounds(189, 23, 154, 20);
		}
		return empresa;
	}
	

	public JTextField getnpde(){
		if(npde == null){
			npde = new JTextField();
			npde.setBounds(189, 209, 154, 20);
		}
		return npde;
	}
	
	
	public JTextField getcomerde(){
		if(comerde == null){
			comerde = new JTextField();
			comerde.setBounds(505, 54, 154, 20);
		}
		return comerde;
	}

	public JTextField getfechain(){
		if(fechain == null){
			fechain = new JTextField();
			fechain.setBounds(189, 116, 154, 20);
		}
		return fechain;
	}
	
	public JTextField getinotarial(){
		if(inotarial == null){
			inotarial = new JTextField();
			inotarial.setBounds(189, 85, 154, 20);
		}
		return inotarial;
	}

	
	public JTextField getdelede(){
		if(delede == null){
			delede = new JTextField();
			delede.setBounds(505, 23, 154, 20);
		}
		return delede;
	}
	
	
	public JTextField getfechafm(){
		if(fechafm == null){
			fechafm = new JTextField();
			fechafm.setBounds(505, 116, 154, 20);
		}
		return fechafm;
	}

	
	
	public JTextField getdomicilio(){
		if(domicilio == null){
			domicilio = new JTextField();
			domicilio.setBounds(505, 147, 154, 20);
		}
		return domicilio;
	}
	
	
	public JTextField getfoliom(){
		if(foliom == null){
			foliom = new JTextField();
			foliom.setBounds(505, 87, 154, 20);
		}
		return foliom;
	}
	
	public JTextField getlicenciaf(){
		if(licenciaf == null){
			licenciaf = new JTextField();
			licenciaf.setBounds(189, 147, 154, 20);
		}
		return licenciaf;
	}
	
	public JTextField getrfc(){
		if(rfc == null){
			rfc = new JTextField();
			rfc.setBounds(505, 178, 154, 20);
		}
		return rfc;
	}
	

	public JPanel getClientecon(){
		if(Clientecon == null){
			Clientecon = new JPanel();
			Clientecon.setBackground(Color.WHITE);
			Clientecon.setBounds(-20, 0, 820, 289);
			Clientecon.setLayout(null);
			Clientecon.add(getempresa());
			Clientecon.add(getrepresental());
			Clientecon.add(getinotarial());
			Clientecon.add(getfechain());
			Clientecon.add(getlicenciaf());
			Clientecon.add(getnotariop());
			Clientecon.add(BotonSiguientec());
			Clientecon.add(getnpde());
			Clientecon.add(getdelede());
			Clientecon.add(getcomerde());
			Clientecon.add(getfoliom());
			Clientecon.add(getfechafm());
			Clientecon.add(getdomicilio());
			Clientecon.add(getrfc());
			
			JLabel lblContacto = new JLabel("*Representante legal:");
			lblContacto.setForeground(new Color(0, 70, 129));
			lblContacto.setFont(new Font("Arial", Font.BOLD, 12));
			lblContacto.setBounds(40, 56, 139, 14);
			Clientecon.add(lblContacto);
			
			
			JLabel lblTelefono = new JLabel("*Instrumento Notarial:");
			lblTelefono.setForeground(new Color(0, 70, 129));
			lblTelefono.setFont(new Font("Arial", Font.BOLD, 12));
			lblTelefono.setBounds(40, 85, 139, 14);
			Clientecon.add(lblTelefono);
			
			
			JLabel lblEmail = new JLabel("*Fecha I.N:");
			lblEmail.setForeground(new Color(0, 70, 129));
			lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
			lblEmail.setBounds(40, 116, 129, 14);
			Clientecon.add(lblEmail);
			
			JLabel lblcompañia = new JLabel("*Empresa:");
			lblcompañia.setForeground(new Color(0, 70, 129));
			lblcompañia.setFont(new Font("Arial", Font.BOLD, 12));
			lblcompañia.setBounds(40, 23, 117, 14);
			Clientecon.add(lblcompañia);
			
			JLabel lblfecha = new JLabel("De:");
			lblfecha.setForeground(new Color(0, 70, 129));
			lblfecha.setFont(new Font("Arial", Font.BOLD, 12));
			lblfecha.setBounds(40, 209, 154, 14);
			Clientecon.add(lblfecha);
			
			JLabel lbllugar = new JLabel("Notario Publico:");
			lbllugar.setForeground(new Color(0, 70, 129));
			lbllugar.setFont(new Font("Arial", Font.BOLD, 12));
			lbllugar.setBounds(40, 180, 154, 14);
			Clientecon.add(lbllugar);
			
			
			
			
			JLabel lbldomicilioRecogida = new JLabel("*Fe de Licenciado :");
			lbldomicilioRecogida.setForeground(new Color(0, 70, 129));
			lbldomicilioRecogida.setFont(new Font("Arial", Font.BOLD, 12));
			lbldomicilioRecogida.setBounds(41, 147, 116, 14);
			Clientecon.add(lbldomicilioRecogida);
			
		
			
			JLabel lblfechaDeDesmontaje = new JLabel("*RFC:");
			lblfechaDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblfechaDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeDesmontaje.setBounds(379, 180, 106, 14);
			Clientecon.add(lblfechaDeDesmontaje);
			
			JLabel lblfechaDeSolicitud = new JLabel("*Del Estado de :");
			lblfechaDeSolicitud.setForeground(new Color(0, 70, 129));
			lblfechaDeSolicitud.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeSolicitud.setBounds(379, 29, 116, 14);
			Clientecon.add(lblfechaDeSolicitud);
			
			
			
			JLabel lbltotalDeDas = new JLabel("Folio Mercantil:");
			lbltotalDeDas.setForeground(new Color(0, 70, 129));
			lbltotalDeDas.setFont(new Font("Arial", Font.BOLD, 12));
			lbltotalDeDas.setBounds(379, 87, 106, 14);
			Clientecon.add(lbltotalDeDas);
			
	
			
			JLabel lbltotalDeDias = new JLabel("Comercio de :");
			lbltotalDeDias.setForeground(new Color(0, 70, 129));
			lbltotalDeDias.setFont(new Font("Arial", Font.BOLD, 12));
			lbltotalDeDias.setBounds(379, 56, 138, 14);
			Clientecon.add(lbltotalDeDias);
			
			JLabel label = new JLabel("De fecha:");
			label.setForeground(new Color(0, 70, 129));
			label.setFont(new Font("Arial", Font.BOLD, 12));
			label.setBounds(379, 118, 106, 14);
			Clientecon.add(label);
			
			
			
			JLabel lblDomicilio = new JLabel("Domicilio:");
			lblDomicilio.setForeground(new Color(0, 70, 129));
			lblDomicilio.setFont(new Font("Arial", Font.BOLD, 12));
			lblDomicilio.setBounds(379, 149, 106, 14);
			Clientecon.add(lblDomicilio);
			Clientecon.add(getLblDatosDelCliente());
			Clientecon.add(getBtnNueva());
			
			
		
			
			Clientecon.setVisible(true);
		}
		return Clientecon;
	}
	

	

	public JFileChooser getButtonGenerarcotizacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public Component getSolc() {
		// TODO Auto-generated method stub
		return null;
	}
	private JLabel getLblDatosDelCliente() {
		if (lblDatosDelCliente == null) {
			lblDatosDelCliente = new JLabel("Datos del Cliente");
			lblDatosDelCliente.setForeground(Color.GRAY);
			lblDatosDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
			lblDatosDelCliente.setBounds(341, 0, 117, 14);
		}
		return lblDatosDelCliente;
	}
	
	public JButton getBtnNueva() {
		if (btnNueva == null) {
			btnNueva = new JButton();
			btnNueva.setIcon(new ImageIcon("Images\\home.png"));
			btnNueva.setBounds(669, 23, 76, 70);
			btnNueva.setName("btnNueva");		
		}
		return btnNueva;
	}
}
