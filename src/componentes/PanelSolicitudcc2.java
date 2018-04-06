package componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelSolicitudcc2 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Cliente;
	private JButton BotonSiguientec;
	private JButton NuevaOrden;
	private JLabel lblAdicionales;
	private JList<?> list;
	private JScrollPane scrollPane;


	public PanelSolicitudcc2(){		 	 			
		 	setBounds(21, 162, 618, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getCliente());
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
				BotonSiguientec.setBounds(390, 159, 150, 23);
				BotonSiguientec.setName("Boton Siguiente");				
				BotonSiguientec.setText("Generar Orden de Salida");
				BotonSiguientec.setVisible(true);
				BotonSiguientec.setForeground(new Color(255,255,255));
				BotonSiguientec.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec;
	}
	
	public JButton NuevaOrden() {
		if (NuevaOrden == null) {
			try {
				NuevaOrden = new JButton();
				NuevaOrden.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				NuevaOrden.setBounds(390, 202, 150, 23);
				NuevaOrden.setName("NuevaOrden");				
				NuevaOrden.setText("Crear Nueva Orden");
				NuevaOrden.setVisible(true);
				NuevaOrden.setForeground(new Color(255,255,255));
				NuevaOrden.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return NuevaOrden;
	}
	
	

	public JPanel getCliente(){
		if(Cliente == null){
			Cliente = new JPanel();
			Cliente.setBackground(Color.WHITE);
			Cliente.setBounds(-20, 0, 820, 260);
			Cliente.setLayout(null);
			Cliente.add(BotonSiguientec());
			Cliente.add(NuevaOrden());
			JLabel lbldescripcionDelEvento = new JLabel("*Seleccionar Cotizaci\u00F3n:");
			lbldescripcionDelEvento.setForeground(new Color(0, 70, 129));
			lbldescripcionDelEvento.setFont(new Font("Arial", Font.BOLD, 12));
			lbldescripcionDelEvento.setBounds(198, 103, 173, 14);
			Cliente.add(lbldescripcionDelEvento);
			Cliente.add(getLblAdicionales());
			Cliente.add(getScrollPane());
			
			
		
			
			Cliente.setVisible(true);
		}
		return Cliente;
	}
	

	

	public JFileChooser getButtonGenerarcotizacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public Component getSolc() {
		// TODO Auto-generated method stub
		return null;
	}
	private JLabel getLblAdicionales() {
		if (lblAdicionales == null) {
			lblAdicionales = new JLabel("ADICIONALES");
			lblAdicionales.setForeground(Color.GRAY);
			lblAdicionales.setFont(new Font("Arial", Font.BOLD, 12));
			lblAdicionales.setBounds(401, 0, 116, 14);
		}
		return lblAdicionales;
	}
	@SuppressWarnings("rawtypes")
	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(360, 91, 192, 31);
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}
	
}
