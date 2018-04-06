package componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSolicitudContrato3sp extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Clientecon;
	private JTextField texto1;
	private JButton BotonSiguientec3;
	private JLabel lblDatosDelCliente;
	private JTextField texto2;
	private JTextField texto3;
	private JTextField texto4;
	private JTextField texto5;
	private JTextField texto6;
	private JTextField texto7;


	public PanelSolicitudContrato3sp(){		 	 			
		 	setBounds(21, 162, 618, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getClientecon());
		 	getClientecon().setVisible(true);
			setVisible(true);			
			this.repaint();
		}
	
	public JButton BotonSiguientec3() {
		if (BotonSiguientec3 == null) {
			try {
				BotonSiguientec3 = new JButton();
				BotonSiguientec3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				BotonSiguientec3.setBounds(590, 227, 106, 23);
				BotonSiguientec3.setName("Boton Siguiente");				
				BotonSiguientec3.setText("Generar");
				BotonSiguientec3.setVisible(true);
				BotonSiguientec3.setForeground(new Color(255,255,255));
				BotonSiguientec3.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec3;
	}
	
	public JTextField gettexto1(){
		if(texto1 == null){
			texto1 = new JTextField();
			texto1.setBounds(165, 23, 416, 23);
		}
		return texto1;
	}
	
	public JTextField gettexto2(){
		if(texto2 == null){
			texto2 = new JTextField();
			texto2.setBounds(165, 57, 416, 23);
		}
		return texto2;
	}
	
	public JTextField gettexto3(){
		if(texto3 == null){
			texto3 = new JTextField();
			texto3.setBounds(165, 91, 416, 23);
		}
		return texto3;
	}
	
	public JTextField gettexto4(){
		if(texto4 == null){
			texto4 = new JTextField();
			texto4.setBounds(165, 125, 416, 23);
		}
		return texto4;
	}
	
	public JTextField gettexto5(){
		if(texto5 == null){
			texto5 = new JTextField();
			texto5.setBounds(165, 159, 416, 23);
		}
		return texto5;
	}
	
	public JTextField gettexto6(){
		if(texto6 == null){
			texto6 = new JTextField();
			texto6.setBounds(165, 193, 416, 23);
		}
		return texto6;
	}
	
	

	public JTextField gettexto7(){
		if(texto7 == null){
			texto7 = new JTextField();
			texto7.setBounds(165, 227, 416, 23);
		}
		return texto7;
	}
	
	
	
	
	


	public JPanel getClientecon(){
		if(Clientecon == null){
			Clientecon = new JPanel();
			Clientecon.setBackground(Color.WHITE);
			Clientecon.setBounds(-20, 0, 820, 260);
			Clientecon.setLayout(null);
			Clientecon.add(gettexto1());
			Clientecon.add(gettexto2());
			Clientecon.add(gettexto3());
			Clientecon.add(gettexto4());
			Clientecon.add(gettexto5());
			Clientecon.add(gettexto6());
			Clientecon.add(gettexto7());
			Clientecon.add(BotonSiguientec3());
			
			JLabel lblcompañia = new JLabel("*Descripcion de compra:");
			lblcompañia.setForeground(new Color(0, 70, 129));
			lblcompañia.setFont(new Font("Arial", Font.BOLD, 12));
			lblcompañia.setBounds(10, 23, 145, 14);
			Clientecon.add(lblcompañia);
			Clientecon.add(getLblDatosDelCliente());
			
			
	
			
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
			lblDatosDelCliente = new JLabel("Antecedentes");
			lblDatosDelCliente.setForeground(Color.GRAY);
			lblDatosDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
			lblDatosDelCliente.setBounds(382, 0, 117, 14);
		}
		return lblDatosDelCliente;
	}
}
