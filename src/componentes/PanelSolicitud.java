package componentes;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PanelSolicitud extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JPanel sol;
	private ButtonGroup buttonGroup_Ramo;
	private JTextField textFieldPreciou;
	public JSpinner cantidads;
	public JSpinner diass;
	private JButton btnGenerac;
	private JButton btnNueva;
	private JButton botonAgregar;
	private JTextField textFieldUnidad;
	private JScrollPane Pagregados;
	private JTextArea textArea;
	private JComboBox<String> cmbClasificacion;
	private	JTextArea taDescripcion;
	
	public PanelSolicitud(){
			System.out.println("PanelSolicitud");
		 	setBounds(0,100,916,325);
		 	setBackground(Color.white);
		 	setLayout(null);
//		 	getTextFieldDescripcion().setVisible(true);	
		 	getTextFieldUnidad().setVisible(true);	
		 	getTextFieldPreciou().setVisible(true);	
		 	getcantidads().setVisible(true);
		 	getdiass().setVisible(true);
		 	add(getsol());
			getsol().setVisible(true);
			setVisible(true);	
//			RestrictedTextField restricted = new RestrictedTextField(diass)
		
		
			this.repaint();
		}

	public JTextField getTextFieldUnidad(){
		if(textFieldUnidad == null){
			textFieldUnidad = new JTextField();
			textFieldUnidad.setBounds(104, 202, 85, 20);
		}
		return textFieldUnidad;
	}
	
	/*
	public JTextField getTextFieldDescripcion0(){
		if(textFieldDescripcion0 == null){
			textFieldDescripcion0 = new JTextField();
			textFieldDescripcion0.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(textFieldDescripcion0.getText().trim().length() >= 35) {
						textFieldDescripcion3.requestFocus();
					}
				}
			});
			textFieldDescripcion0.setBounds(294, 72, 18, 20);

							
		}
		return textFieldDescripcion0;
	}
	
	
	public JTextField getTextFieldDescripcion(){
	
		if(textFieldDescripcion == null){
			textFieldDescripcion = new JTextField();
			textFieldDescripcion.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(textFieldDescripcion.getText().trim().length() >= 35) {
						textFieldDescripcion0.requestFocus();
					}
				}
			});
			textFieldDescripcion.setColumns(10);
			textFieldDescripcion.setBounds(294, 44, 18, 20);
		}
		return textFieldDescripcion;
	}
	
	public JTextField getTextFieldDescripcion3() {
		if (textFieldDescripcion3 == null) {
			textFieldDescripcion3 = new JTextField();
			textFieldDescripcion3.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(textFieldDescripcion3.getText().trim().length() >= 35) {
						cantidads.requestFocus();
					}
				}
			});
			textFieldDescripcion3.setBounds(294, 103, 18, 20);
		}
		return textFieldDescripcion3;
	}
	*/

public JSpinner getcantidads(){
	if(cantidads == null){
		cantidads = new JSpinner();
		cantidads.setBounds(104, 104, 70, 25);
		cantidads.addKeyListener(new KeyAdapter() {
			@Override 
			public void keyTyped(KeyEvent arg0) {
				   char cantidad = arg0.getKeyChar();
					
					if(cantidad<'0' || cantidad>'9' ) 
						arg0.consume();
					
					
			}
			
		});				
		
	}
	return cantidads;
}

public JTextField getTextFieldPreciou(){
	if(textFieldPreciou == null){
		textFieldPreciou = new JTextField(10);
		textFieldPreciou.setBounds(104, 137, 107, 20);
		textFieldPreciou.addKeyListener(new KeyAdapter() {
			
			@Override 
			
			public void keyTyped(KeyEvent arg0) {
				   char preciou = arg0.getKeyChar();
					
					if(preciou<'0' || preciou>'9' ) 
						arg0.consume();
					
					
			}
			
		});				
	}
	return textFieldPreciou;
}
	

	public JButton btnGenerac() {
		if (btnGenerac == null) {
			try {
				btnGenerac = new JButton();
				btnGenerac.setBounds(351, 243, 143, 30);
				btnGenerac.setName("btnGenerac");				
				btnGenerac.setText("Genera Cotizacion");
				btnGenerac.setVisible(true);
				btnGenerac.setForeground(new Color(255,255,255));
				btnGenerac.setBackground(new Color(18,43,74));
				
					
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnGenerac;
	}
	

public JSpinner getdiass(){
	if(diass == null){
		diass = new JSpinner();
		diass.setBounds(294, 104, 70, 25);
	}
	return diass;
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
	return btnNueva;
}


	
	
	
	public JButton botonAgregar() {
		if (botonAgregar == null) {
			try {
				botonAgregar = new JButton();
				botonAgregar.setBounds(121, 243, 85, 30);
				botonAgregar.setName("boton Agregar");				
				botonAgregar.setText("Agregar");
				botonAgregar.setVisible(true);
				botonAgregar.setForeground(new Color(255,255,255));
				botonAgregar.setBackground(new Color(18,43,74));   
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return botonAgregar;
	}

	
	
	
	
	
	
	
	public JPanel getsol(){
		if(sol == null){
			sol = new JPanel();
			sol.setBackground(Color.WHITE);
			sol.setBounds(-11, 11, 900, 323);
			
			JLabel lblDescripcion = new JLabel("*Descripcion:");
			lblDescripcion.setBounds(10, 46, 76, 14);
			lblDescripcion.setForeground(new Color(0, 70, 129));
			lblDescripcion.setFont(new Font("Arial", Font.BOLD, 12));
			
		
			
			JLabel lblPrecioUnitario = new JLabel("*Precio:");
			lblPrecioUnitario.setBounds(10, 139, 59, 14);
			lblPrecioUnitario.setForeground(new Color(0, 70, 129));
			lblPrecioUnitario.setFont(new Font("Arial", Font.BOLD, 12));
			
			
			JLabel lblCantidad = new JLabel("*Cantidad:");
			lblCantidad.setBounds(10, 108, 94, 14);
			lblCantidad.setForeground(new Color(0, 70, 129));
			lblCantidad.setFont(new Font("Arial", Font.BOLD, 12));
			
			
			
//			JScrollPane Pagregados = new JScrollPane();
//			Pagregados.setBounds(446, 11, 269, 209);
//			sol.add(Pagregados);
			
			taDescripcion = new JTextArea();
			taDescripcion.addKeyListener(new KeyAdapter() {
				/*@Override
				public void keyPressed(KeyEvent e) {
					boolean s1 = false, s2 = false, s3 = false;
					
					

					if (!taDescripcion.getText().contains("\n") && taDescripcion.getText().length() == 30) {
						taDescripcion.append("\n");
						s1 = true;
						System.out.println(s1);
					} else if (taDescripcion.getText().length() >= 31 && taDescripcion.getText().length() <= 60 && s1
							&& s2 != true) {
						taDescripcion.append("\n");
						s2 = true;
						System.out.println(s2);
					} else if (taDescripcion.getText().length() >= 61 && taDescripcion.getText().length() <= 89 && s1
							&& s2 != true) {
						taDescripcion.append("\n");
						s3 = true;
						System.out.println(s3);
					} else if (taDescripcion.getText().length() >= 90) {
						e.consume();
						System.out.println("Mayor a 90");
					}
				}*/
			});
			taDescripcion.setLineWrap(true);
			taDescripcion.setRows(5);
			taDescripcion.setColumns(1);
			taDescripcion.setBorder(UIManager.getBorder("TextField.border"));
			taDescripcion.setBounds(103, 41, 261, 55);
			
			JLabel lblUnidad = new JLabel("*Unidad:");
			lblUnidad.setBounds(10, 204, 85, 14);
			lblUnidad.setForeground(new Color(0, 70, 129));
			lblUnidad.setFont(new Font("Arial", Font.BOLD, 12));
			
			JRadioButton rdbtnEspecial = new JRadioButton("Especial 1");
			rdbtnEspecial.setBackground(Color.WHITE);
			rdbtnEspecial.setBounds(23, 172, 110, 23);
			
			JRadioButton rdbtnEspecial_1 = new JRadioButton("Especial 2");
			rdbtnEspecial_1.setBackground(Color.WHITE);
			rdbtnEspecial_1.setBounds(135, 172, 110, 23);
			
			JRadioButton rdbtnEspecial_2 = new JRadioButton("Especial 3");
			rdbtnEspecial_2.setBackground(Color.WHITE);
			rdbtnEspecial_2.setBounds(247, 172, 110, 23);
			
			JLabel lblDias = new JLabel("D\u00EDas:");
			lblDias.setBounds(216, 108, 38, 15);
			lblDias.setForeground(new Color(0, 70, 129));
			lblDias.setFont(new Font("Arial", Font.BOLD, 12));
			sol.setLayout(null);
			sol.add(lblDescripcion);
//			sol.add(getTextFieldDescripcion());
//			sol.add(getTextFieldDescripcion0());
			sol.add(lblCantidad);
			sol.add(getcantidads());	
			sol.add(getdiass());
			sol.add(lblDias);
			sol.add(lblPrecioUnitario);
			sol.add(getTextFieldPreciou());
			sol.add(rdbtnEspecial);
			sol.add(rdbtnEspecial_1);
			sol.add(rdbtnEspecial_2);
			sol.add(lblUnidad);
			sol.add(getTextFieldUnidad());
			sol.add(getPagregados());
			sol.add(botonAgregar());
			sol.add(btnGenerac());
			sol.add(btnNueva());
			//sol.add(getTextFieldClacificacion());
			
			JLabel label = new JLabel("Clasificacion:");
			label.setBounds(10, 10, 76, 14);
			label.setForeground(new Color(0, 70, 129));
			label.setFont(new Font("Arial", Font.BOLD, 12));
			sol.add(label);
			
			cmbClasificacion = new JComboBox<String>();
			cmbClasificacion.setBounds(104, 10, 260, 20);
			cmbClasificacion.addItem("Seleccione una opción");
			cmbClasificacion.addItem("Audio");
			cmbClasificacion.addItem("Video");
			cmbClasificacion.addItem("xxxxxxxxxxxx");
			cmbClasificacion.addItem("xxxxxxxxxxxx");
			sol.add(cmbClasificacion);
			
			
			sol.add(gettaDescripcion());
			
			
			
			
		

			
			sol.setVisible(true);
		}
		return sol;
	}
	
	public JTextArea gettaDescripcion() {
		if(taDescripcion == null){
			taDescripcion.setLineWrap(true);
			taDescripcion.setRows(5);
			taDescripcion.setColumns(1);
			taDescripcion.setBorder(UIManager.getBorder("TextField.border"));
			taDescripcion.setBounds(121, 42, 163, 55);
			
		}
		return taDescripcion;
	}





	public JComboBox<String> getCmbClasificacion(){
		if(cmbClasificacion == null) {
			cmbClasificacion = new JComboBox<String>();
			cmbClasificacion.setBounds(121, 13, 161, 20);
			cmbClasificacion.addItem("Seleccione una opción");
			cmbClasificacion.addItem("Audio");
			cmbClasificacion.addItem("Video");
			cmbClasificacion.addItem("xxxxxxxxxxxx");
			cmbClasificacion.addItem("xxxxxxxxxxxx");
			cmbClasificacion.setSelectedIndex(0);
			sol.add(cmbClasificacion);
		}
		return cmbClasificacion;
	}
	
	public JScrollPane getPagregados(){
		if(Pagregados==null){
			Pagregados = new JScrollPane();
			Pagregados.setBounds(374, 18, 363, 205);
			Pagregados.setViewportView(textArea());
			Pagregados.setVisible(true);
			
			
		}
		return Pagregados;
	}
	

	public JTextArea textArea(){
		if(textArea==null){
			textArea = new JTextArea();	
			textArea.setEnabled(false);	
			textArea.setVisible(true);

		}
		return textArea;
	}
	
	public ButtonGroup getbuttonGroup_Ramo(){
		if(buttonGroup_Ramo==null){
			buttonGroup_Ramo = new ButtonGroup();

		}
		return buttonGroup_Ramo;
	}
	
	public void limpiarFormPanelSolicitud() {
		String vacio = "";
		gettaDescripcion().setText(vacio);
		getCmbClasificacion().setSelectedIndex(0);// Seteamos la opcion 0 del combo
		getTextFieldUnidad().setText(vacio);
		getTextFieldPreciou().setText(vacio);
		getTextFieldUnidad().setText(vacio);
		getcantidads().setValue(0);
		getdiass().setValue(0);
	}
}
