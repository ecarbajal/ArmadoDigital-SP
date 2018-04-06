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

import com.toedter.calendar.JDateChooser;

public class PanelSolicitudContrato2sp extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Clientecon;
	private JButton BotonSiguientec2;
	private JTextField txtNombreEvento;
	private JTextField txtDiasNatPago;
	private JDateChooser dteInicioContrato;
	private JDateChooser dteFinContrato;


	public PanelSolicitudContrato2sp(){		 	 			
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
				BotonSiguientec2.setBounds(273, 237, 142, 23);
				BotonSiguientec2.setName("Boton Siguiente");				
				BotonSiguientec2.setText("Generar contrato");
				BotonSiguientec2.setVisible(true);
				BotonSiguientec2.setForeground(new Color(255,255,255));
				BotonSiguientec2.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec2;
	}
	



	public JDateChooser getDteInicioContrato() {
		if(dteInicioContrato == null) {
			dteInicioContrato = new JDateChooser();
			dteInicioContrato.setBounds(152, 68, 160, 20);
			Clientecon.add(dteInicioContrato);
		}
		return dteInicioContrato;
	}

	public JDateChooser getDteFinContrato() {
		if(dteFinContrato == null) {
			dteFinContrato = new JDateChooser();
			dteFinContrato.setBounds(437, 68, 160, 20);
			Clientecon.add(dteFinContrato);
		}
		return dteFinContrato;
	}

	public JTextField getTxtNombreEvento() {
		if(txtNombreEvento==null) {
			txtNombreEvento = new JTextField();
			txtNombreEvento.setBounds(152, 38, 445, 20);
			Clientecon.add(txtNombreEvento);
		}
		return txtNombreEvento;
	}


	public JTextField getTxtDiasNatPago() {
		if(txtDiasNatPago == null) {
			txtDiasNatPago = new JTextField();
			txtDiasNatPago.setBounds(152, 98, 154, 20);
			Clientecon.add(txtDiasNatPago);
		}
		return txtDiasNatPago;
	}


	public JPanel getClientecon(){
		if(Clientecon == null){
			Clientecon = new JPanel();
			Clientecon.setBackground(Color.WHITE);
			Clientecon.setBounds(-20, 0, 820, 260);
			Clientecon.setLayout(null);
			Clientecon.add(BotonSiguientec2());
			
			JLabel lblClausulasDelContrato = new JLabel("Clausulas del contrato");
			lblClausulasDelContrato.setForeground(Color.GRAY);
			lblClausulasDelContrato.setFont(new Font("Arial", Font.BOLD, 12));
			lblClausulasDelContrato.setBounds(309, 11, 151, 14);
			Clientecon.add(lblClausulasDelContrato);
			
			JLabel label_1 = new JLabel("*Nombre evento:");
			label_1.setForeground(new Color(0, 70, 129));
			label_1.setFont(new Font("Arial", Font.BOLD, 12));
			label_1.setBounds(25, 38, 154, 14);
			Clientecon.add(label_1);
			
			
			
			JLabel label_2 = new JLabel("*Inicio contrato:");
			label_2.setForeground(new Color(0, 70, 129));
			label_2.setFont(new Font("Arial", Font.BOLD, 12));
			label_2.setBounds(25, 68, 154, 14);
			Clientecon.add(label_2);
			
			JLabel label_3 = new JLabel("*Termino contrato:");
			label_3.setForeground(new Color(0, 70, 129));
			label_3.setFont(new Font("Arial", Font.BOLD, 12));
			label_3.setBounds(322, 68, 154, 14);
			Clientecon.add(label_3);
			
			
			
			JLabel label_4 = new JLabel("*D\u00EDas naturales pago:");
			label_4.setForeground(new Color(0, 70, 129));
			label_4.setFont(new Font("Arial", Font.BOLD, 12));
			label_4.setBounds(25, 98, 154, 14);
			Clientecon.add(label_4);
			
			Clientecon.add(getTxtDiasNatPago());
			Clientecon.add(getTxtNombreEvento());
			Clientecon.add(getDteFinContrato());
			Clientecon.add(getDteInicioContrato());

			Clientecon.setVisible(true);
		}
		return Clientecon;
	}
	

	public void limpiarFormPnlSolicitudCont2SP() {
		String vacio = "";
		getTxtNombreEvento().setText(vacio);
		getTxtDiasNatPago().setText(vacio);
		getDteInicioContrato().setDate(null);
		getDteFinContrato().setDate(null);
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
