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

public class PanelSolicitudContrato2 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Clientecon;
	private JTextField fechaa;
	private JTextField fechacr;
	private JButton BotonSiguientec2;
	private JLabel lblDatosDelCliente;
	private JTextField fechafc;
	private JTextField montot;
	private JTextField mensual;


	public PanelSolicitudContrato2(){		 	 			
		 	setBounds(21, 162, 618, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getClientecon());
		 	getClientecon().setVisible(true);
		
			setVisible(true);			
			this.repaint();
		}
	
	public JButton BotonSiguientec2() {
		if (BotonSiguientec2 == null) {
			try {
				BotonSiguientec2 = new JButton();
				BotonSiguientec2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				BotonSiguientec2.setBounds(309, 237, 106, 23);
				BotonSiguientec2.setName("Boton Siguiente");				
				BotonSiguientec2.setText("Siguiente");
				BotonSiguientec2.setVisible(true);
				BotonSiguientec2.setForeground(new Color(255,255,255));
				BotonSiguientec2.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec2;
	}
	
	
	public JTextField getfechaa(){
		if(fechaa == null){
			fechaa = new JTextField();
			fechaa.setBounds(227, 74, 234, 20);
		}
		return fechaa;
	}
	
	public JTextField getfechacr(){
		if(fechacr == null){
			fechacr = new JTextField();
			fechacr.setBounds(227, 43, 234, 20);
		}
		return fechacr;
	}
	
	public JTextField getmensual(){
		if(mensual == null){
			mensual = new JTextField();
			mensual.setBounds(227, 206, 165, 20);
		}
		return mensual;
	}
	
	public JTextField getfechafc(){
		if(fechafc == null){
			fechafc = new JTextField();
			fechafc.setBounds(227, 111, 234, 20);
		}
		return fechafc;
	}
	

	public JTextField getmontot(){
		if(montot == null){
			montot = new JTextField();
			montot.setBounds(227, 162, 165, 20);
		}
		return montot;
	}
	



	public JPanel getClientecon(){
		if(Clientecon == null){
			Clientecon = new JPanel();
			Clientecon.setBackground(Color.WHITE);
			Clientecon.setBounds(-20, 0, 820, 260);
			Clientecon.setLayout(null);
			Clientecon.add(getfechacr());
			Clientecon.add(getfechaa());
			Clientecon.add(getfechafc());
			Clientecon.add(getmontot());
			Clientecon.add(getmensual());
			Clientecon.add(BotonSiguientec2());
			
			JLabel lblContacto = new JLabel("*Fecha de aprovacion :");
			lblContacto.setForeground(new Color(0, 70, 129));
			lblContacto.setFont(new Font("Arial", Font.BOLD, 12));
			lblContacto.setBounds(37, 76, 139, 14);
			Clientecon.add(lblContacto);
			
			JLabel lblcompañia = new JLabel("*Fecha de Cotizacion relativa:");
			lblcompañia.setForeground(new Color(0, 70, 129));
			lblcompañia.setFont(new Font("Arial", Font.BOLD, 12));
			lblcompañia.setBounds(37, 45, 174, 14);
			Clientecon.add(lblcompañia);
			Clientecon.add(getLblDatosDelCliente());
			
			JLabel lblfechaDeFirma = new JLabel("*Fecha de firma de contrato:");
			lblfechaDeFirma.setForeground(new Color(0, 70, 129));
			lblfechaDeFirma.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeFirma.setBounds(37, 113, 202, 14);
			Clientecon.add(lblfechaDeFirma);
			
			
			JLabel lblmontoTotal = new JLabel("*Monto Total:");
			lblmontoTotal.setForeground(new Color(0, 70, 129));
			lblmontoTotal.setFont(new Font("Arial", Font.BOLD, 12));
			lblmontoTotal.setBounds(37, 164, 202, 14);
			Clientecon.add(lblmontoTotal);
			
			
			JLabel lblmensualidad = new JLabel("*Mensualidad:");
			lblmensualidad.setForeground(new Color(0, 70, 129));
			lblmensualidad.setFont(new Font("Arial", Font.BOLD, 12));
			lblmensualidad.setBounds(37, 208, 202, 14);
			Clientecon.add(lblmensualidad);
			
			
			
		
			
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
			lblDatosDelCliente = new JLabel("Datos de Contrato");
			lblDatosDelCliente.setForeground(Color.GRAY);
			lblDatosDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
			lblDatosDelCliente.setBounds(309, 0, 117, 14);
		}
		return lblDatosDelCliente;
	}
}
