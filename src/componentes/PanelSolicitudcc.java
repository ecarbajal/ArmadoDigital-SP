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

public class PanelSolicitudcc extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Cliente;
	private JButton BotonGenerao;
	private JButton NuevaOrden;
	private JButton btnNueva;

	public PanelSolicitudcc() {		 	 			
		 	setBounds(21, 162, 769, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getCliente());
			setVisible(true);			
			this.repaint();
		}
	
	public JButton BotonSiguientec() {
		if (BotonGenerao == null) {
			try {
				BotonGenerao = new JButton();
				BotonGenerao.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
					}
				});
				BotonGenerao.setBounds(315, 143, 179, 23);
				BotonGenerao.setName("Boton Generao");				
				BotonGenerao.setText("Generar Orden de Salida");
				BotonGenerao.setVisible(true);
				BotonGenerao.setForeground(new Color(255,255,255));
				BotonGenerao.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonGenerao;
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
				NuevaOrden.setBounds(315, 195, 179, 23);
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
			JLabel lbldescripcionDelEvento = new JLabel("*Seleccionar Cotizaci\u00F3n");
			lbldescripcionDelEvento.setForeground(new Color(0, 70, 129));
			lbldescripcionDelEvento.setFont(new Font("Arial", Font.BOLD, 12));
			lbldescripcionDelEvento.setBounds(332, 70, 150, 14);
			Cliente.add(lbldescripcionDelEvento);			
			Cliente.setVisible(true);
		}
		return Cliente;
	}
	
	public JButton btnNueva() {
		if (btnNueva == null) {
			try {
				btnNueva = new JButton();
				btnNueva.setIcon(new ImageIcon("Images\\home.png"));
				btnNueva.setBounds(747, 18, 76, 70);
				btnNueva.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnNueva.setName("btnNueva");				
				btnNueva.setVisible(true);
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnNueva();
	}

	

	public JFileChooser getButtonGenerarcotizacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public Component getSolc() {
		// TODO Auto-generated method stub
		return null;
	}
	

	}
