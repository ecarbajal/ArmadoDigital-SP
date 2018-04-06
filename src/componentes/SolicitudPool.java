package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SolicitudPool extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPanel panelPool;
	private JButton buttonEnviar;
	private JButton buttonSalir;
	private JButton btnNuevaSolicitud;
	private JLabel lblNegocioActual;
	private JLabel lblNegocio;
	private JTextField textFieldNegoActual;	
	private JTextField textFieldNegocio;

	public SolicitudPool(){		 	 			
		 	setBounds(0,100,710,420);
		 	setBackground(Color.white);
		 	setLayout(null);
//		 	add(getButtonEnviar());
//		 	add(getButtonSalir());
		 	add(getPanelPool());
		 	getButtonEnviar().setVisible(true);
		 	getButtonSalir().setVisible(true);
			getPanelPool().setVisible(true);
			setVisible(true);			
			this.repaint();
		}
	
	public JPanel getPanelPool(){
		if(panelPool == null){
			panelPool = new JPanel();
			panelPool.setBackground(Color.WHITE);
			panelPool.setBounds(0, 0, 800, 525);
			panelPool.setLayout(null);
			panelPool.add(getLblNegocioActual());
			panelPool.add(getTextFieldNegoActual());
			panelPool.add(getBtnNuevaSolicitud());
			panelPool.add(getLblNegocio());
			panelPool.add(getTextFieldNegocio());	
			panelPool.add(getButtonEnviar());
			panelPool.add(getButtonSalir());
			
			panelPool.setVisible(true);
		}
		return panelPool;
	}
	
	public JButton getButtonEnviar(){
		if(buttonEnviar == null){
			buttonEnviar = new JButton("Enviar");
			buttonEnviar.setBounds(461, 135, 123, 23);
			buttonEnviar.setBackground(new Color(0,70,129));
			buttonEnviar.setForeground(Color.WHITE);
			
		}
		return buttonEnviar;
	}

	public JButton getButtonSalir(){
		if(buttonSalir == null){
			buttonSalir = new JButton("Salir");
			buttonSalir.setBounds(461, 220, 123, 23);
			buttonSalir.setBackground(new Color(0,70,129));
			buttonSalir.setForeground(Color.WHITE);
		}
		return buttonSalir;
	}
	
	public JButton getBtnNuevaSolicitud(){
		if(btnNuevaSolicitud == null){
			btnNuevaSolicitud = new JButton("Nueva Solicitud");
			btnNuevaSolicitud.setBackground(new Color(0,70,129));
			btnNuevaSolicitud.setForeground(Color.WHITE);
			btnNuevaSolicitud.setBounds(461, 53, 123, 25);					
		}
		return btnNuevaSolicitud;
	}
	
	public JButton getBtnGenerarCotizacion(){
		if(btnNuevaSolicitud == null){
			btnNuevaSolicitud = new JButton("Generar Cotizacion");
			btnNuevaSolicitud.setBackground(new Color(0,70,129));
			btnNuevaSolicitud.setForeground(Color.WHITE);
			btnNuevaSolicitud.setBounds(461, 53, 123, 25);					
		}
		return btnNuevaSolicitud;
	}
	
	public JButton getBtnReset(){
		if(btnNuevaSolicitud == null){
			btnNuevaSolicitud = new JButton("Reset");
			btnNuevaSolicitud.setBackground(new Color(0,70,129));
			btnNuevaSolicitud.setForeground(Color.WHITE);
			btnNuevaSolicitud.setBounds(461, 53, 123, 25);					
		}
		return btnNuevaSolicitud;
	}
	
	public JLabel getLblNegocioActual(){
		if(lblNegocioActual == null){
			lblNegocioActual = new JLabel("Negocio Anterior:");
			lblNegocioActual.setFont(new Font("Arial", Font.BOLD, 12));
			lblNegocioActual.setForeground(new Color(0,70,129));
			lblNegocioActual.setBounds(130, 58, 106, 20);
		}
		return lblNegocioActual;
	}
	
	public JLabel getLblNegocio(){
		if(lblNegocio == null){
			lblNegocio = new JLabel("Solicitar Negocio:");
			lblNegocio.setFont(new Font("Arial", Font.BOLD, 12));
			lblNegocio.setForeground(new Color(0,70,129));
			lblNegocio.setBounds(130, 139, 115, 20);
		}
		return lblNegocio;
	}

	public JTextField getTextFieldNegoActual(){
		if(textFieldNegoActual == null){
			textFieldNegoActual = new JTextField();
			textFieldNegoActual.setEditable(false);
			textFieldNegoActual.setFocusable(false);
			textFieldNegoActual.setBounds(248, 55, 175, 25);		
		}
		return textFieldNegoActual;
	}
	
	public JTextField getTextFieldNegocio(){
		if(textFieldNegocio == null){
			textFieldNegocio = new JTextField();
			textFieldNegocio.setBounds(248, 136, 175, 25);
//			textFieldNegocio.addFocusListener(this);		
			//			textFieldNegocio.setColumns(10);
		}
		return textFieldNegocio;
	}

	public JComponent getButtonGenerarcotizacion() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
