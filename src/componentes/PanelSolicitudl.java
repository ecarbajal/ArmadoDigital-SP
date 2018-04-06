package componentes;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelSolicitudl extends JPanel{	
	
	private static final long serialVersionUID = 1L;
	private JPanel sol2;
	private ButtonGroup buttonGroup_Ramo;
	private JTextField descripcionl;
	private JTextField Precioul;
	public JSpinner cantidadl;
	private JButton btnGeneracl;
	private JButton btnNueval;
	private JButton botonAgregarl;
//	private JLabel lblDescripcion;
//	private JLabel lblCantidad;
//	private JLabel lblPrecioUnitario;
//	private JTextField textFieldPrecioUnitario;
//	private JLabel lblUnidad;
	private JTextField unidadl;
	private JScrollPane Pagregadosl;
	private JTextArea textAreall;
	private JLabel lblClacificacion;
	private JTextField Articulosl;
	private JLabel lblSubtotal;
	private JTextField subtotall;
	
	public PanelSolicitudl(){
		System.out.println("PanelSolicitudl");
		 	setBounds(0,100,916,325);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	getDescripcionl().setVisible(true);	
		 	getUnidadl().setVisible(true);	
		 	getPrecioul().setVisible(true);	
		 	getcantidadl().setVisible(true);
		 	add(getsol2());
			getsol2().setVisible(true);
			setVisible(true);		
			this.repaint();
		}	
	
	public JTextField getPrecioul(){
		if(Precioul == null){
			Precioul = new JTextField(15);
			Precioul.setBounds(123, 139, 107, 20);
		}
		return Precioul;
	}
	
	public JTextField getUnidadl(){
		if(unidadl == null){
			unidadl = new JTextField();
			unidadl.setBounds(124, 115, 106, 20);
		}
		return unidadl;
	}
	
	public JTextField getDescripcionl(){
		if(descripcionl == null){
			descripcionl = new JTextField();
			descripcionl.setBounds(124, 87, 195, 20);		
			if (descripcionl.getText().length()==2)
			{			
				descripcionl.setText("");
			}							
		}
		return descripcionl;
	}	

public JSpinner getcantidadl(){
	if(cantidadl == null){
		cantidadl = new JSpinner();
		cantidadl.setBounds(124, 33, 37, 20);
	}
	return cantidadl;
}	

	public JButton btnGeneracl() {
		if (btnGeneracl == null) {
			try {
				btnGeneracl = new JButton();
				btnGeneracl.setBounds(403, 224, 143, 30);
				btnGeneracl.setName("btnGenerac");				
				btnGeneracl.setText("Genera Cotizacion");
				btnGeneracl.setVisible(true);
				btnGeneracl.setForeground(new Color(255,255,255));
				btnGeneracl.setBackground(new Color(18,43,74));				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnGeneracl;
	}	
	
	public JButton btnNueval() {
		if (btnNueval == null) {
			try {
				btnNueval = new JButton();
				btnNueval.setBounds(622, 225, 134, 28);
				btnNueval.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnNueval.setName("btnNueva");				
				btnNueval.setText("Nueva Cotizacion");
				btnNueval.setVisible(true);
				btnNueval.setForeground(new Color(255,255,255));
				btnNueval.setBackground(new Color(18,43,74));				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnNueval;
	}
	
	public JButton botonAgregarl() {
		if (botonAgregarl == null) {
			try {
				botonAgregarl = new JButton();
				botonAgregarl.setBounds(121, 224, 85, 30);
				botonAgregarl.setName("boton Agregar");				
				botonAgregarl.setText("Agregar");
				botonAgregarl.setVisible(true);
				botonAgregarl.setForeground(new Color(255,255,255));
				botonAgregarl.setBackground(new Color(18,43,74));				
			} catch (java.lang.Throwable ignored) {	}
		}
		return botonAgregarl;
	}
	
	public JPanel getsol2(){
		if(sol2 == null){
			sol2 = new JPanel();
			sol2.setBackground(Color.WHITE);
			sol2.setBounds(-11, 11, 886, 323);			
			JLabel lblDescripcion = new JLabel("Descripcion:");
			lblDescripcion.setBounds(26, 90, 76, 14);
			lblDescripcion.setForeground(new Color(0, 70, 129));
			lblDescripcion.setFont(new Font("Arial", Font.BOLD, 12));		
			
			JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
			lblPrecioUnitario.setBounds(25, 141, 94, 14);
			lblPrecioUnitario.setForeground(new Color(0, 70, 129));
			lblPrecioUnitario.setFont(new Font("Arial", Font.BOLD, 12));			
			
			JLabel lblCantidad = new JLabel("Cantidad:");
			lblCantidad.setBounds(26, 35, 94, 14);
			lblCantidad.setForeground(new Color(0, 70, 129));
			lblCantidad.setFont(new Font("Arial", Font.BOLD, 12));			
			
//			JScrollPane Pagregados = new JScrollPane();
//			Pagregados.setBounds(446, 11, 269, 209);
//			sol.add(Pagregados);			
			
			JLabel lblUnidad = new JLabel("Unidad:");
			lblUnidad.setBounds(26, 117, 94, 14);
			lblUnidad.setForeground(new Color(0, 70, 129));
			lblUnidad.setFont(new Font("Arial", Font.BOLD, 12));
			sol2.setLayout(null);
			sol2.add(lblDescripcion);
			sol2.add(getDescripcionl());
			sol2.add(lblCantidad);
			sol2.add(getcantidadl());
			sol2.add(lblPrecioUnitario);
			sol2.add(getPrecioul());
			sol2.add(lblUnidad);
			sol2.add(getUnidadl());
			sol2.add(getPagregadosl());
			sol2.add(botonAgregarl());
			sol2.add(btnGeneracl());
			sol2.add(btnNueval());
			sol2.add(getLblClacificacion());			
			JLabel lblArticulo = new JLabel("Articulo:");
			lblArticulo.setForeground(new Color(0, 70, 129));
			lblArticulo.setFont(new Font("Arial", Font.BOLD, 12));
			lblArticulo.setBounds(23, 62, 76, 14);
			sol2.add(lblArticulo);			
			Articulosl = new JTextField();
			Articulosl.setBounds(124, 60, 195, 20);
			sol2.add(Articulosl);
			Articulosl.setColumns(10);
			sol2.add(getLblSubtotal());
			sol2.add(getSubtotall());
			sol2.setVisible(true);
		}
		return sol2;
	}
	
	public JScrollPane getPagregadosl(){
		if(Pagregadosl==null){
			Pagregadosl = new JScrollPane();
			Pagregadosl.setBounds(351, 13, 386, 205);
			Pagregadosl.setViewportView(textArea());
			Pagregadosl.setVisible(true);			
		}
		return Pagregadosl;
	}	

	public JTextArea textArea(){
		if(textAreall==null){
			textAreall = new JTextArea();	
			textAreall.setEnabled(false);	
			textAreall.setVisible(true);
		}
		return textAreall;
	}
	
	public ButtonGroup getbuttonGroup_Ramo(){
		if(buttonGroup_Ramo==null){
			buttonGroup_Ramo = new ButtonGroup();
		}
		return buttonGroup_Ramo;
	}

	private JLabel getLblClacificacion() {
		if (lblClacificacion == null) {
			lblClacificacion = new JLabel("Clacificacion");
			lblClacificacion.setForeground(Color.GRAY);
			lblClacificacion.setBounds(156, 11, 107, 14);
		}
		return lblClacificacion;
	}
	private JLabel getLblSubtotal() {
		if (lblSubtotal == null) {
			lblSubtotal = new JLabel("Subtotal:");
			lblSubtotal.setForeground(new Color(0, 70, 129));
			lblSubtotal.setFont(new Font("Arial", Font.BOLD, 12));
			lblSubtotal.setBounds(26, 200, 94, 14);
		}
		return lblSubtotal;
	}
	private JTextField getSubtotall() {
		if (subtotall == null) {
			subtotall = new JTextField();
			subtotall.setBounds(124, 198, 195, 20);
			subtotall.setColumns(10);
		}
		return subtotall;
	}
}
