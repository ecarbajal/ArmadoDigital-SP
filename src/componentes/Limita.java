package componentes;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Limita extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPanel sol;
	private ButtonGroup buttonGroup_Ramo;
	private JTextField textFieldDescripcion;
	private JTextField textFieldPreciou;
	private JTextField textFieldProductos;
	public JSpinner cantidads;
	private JButton btnGenerac;
	private JButton btnNueva;
	private JButton botonAgregar;
//	private JLabel lblProductos;
//	private JLabel lblDescripcion;
//	private JLabel lblCantidad;
//	private JLabel lblPrecioUnitario;
//	private JTextField textFieldPrecioUnitario;
//	private JLabel lblUnidad;
	private JTextField textFieldUnidad;
	private JScrollPane Pagregados;
	private JTextArea textArea;
	
	public <RestrictedTextField> Limita(){
			System.out.println("Limita");
		 	setBounds(0,100,916,325);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	getTextFieldProductos().setVisible(true);		
		 	getTextFieldDescripcion().setVisible(true);	
		 	getTextFieldUnidad().setVisible(true);	
		 	getTextFieldPreciou().setVisible(true);	
		 	getcantidads().setVisible(true);	
		 	add(getsol());
			getsol().setVisible(true);
			setVisible(true);		
			this.repaint();
		}	
	
	public JTextField getTextFieldPreciou(){
		if(textFieldPreciou == null){
			textFieldPreciou = new JTextField(15);
		}
		return textFieldPreciou;
	}
	
	public JTextField getTextFieldUnidad(){
		if(textFieldUnidad == null){
			textFieldUnidad = new JTextField();
		}
		return textFieldUnidad;
	}
	
	public JTextField getTextFieldDescripcion(){
		if(textFieldDescripcion == null){
			textFieldDescripcion = new JTextField();		
			if (textFieldDescripcion.getText().length()==2)
			{			
				textFieldDescripcion.setText("");
			}							
		}
		return textFieldDescripcion;
	}

public JSpinner getcantidads(){
	if(cantidads == null){
		cantidads = new JSpinner();
	}
	return cantidads;
}

	public JTextField getTextFieldProductos(){
		if(textFieldProductos == null){
			textFieldProductos = new JTextField();
		}
		return textFieldProductos;
	}	

	public JButton btnGenerac() {
		if (btnGenerac == null) {
			try {
				btnGenerac = new JButton();
				btnGenerac.setName("btnGenerac");				
				btnGenerac.setText("Genera Cotizacion");
				btnGenerac.setVisible(true);
				btnGenerac.setForeground(new Color(255,255,255));
				btnGenerac.setBackground(new Color(18,43,74));				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnGenerac;
	}
	
	public JButton btnNueva() {
		if (btnNueva == null) {
			try {
				btnNueva = new JButton();
				btnNueva.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnNueva.setName("btnNueva");				
				btnNueva.setText("Nueva Cotizacion");
				btnNueva.setVisible(true);
				btnNueva.setForeground(new Color(255,255,255));
				btnNueva.setBackground(new Color(18,43,74));				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnNueva;
	}
	
	public JButton botonAgregar() {
		if (botonAgregar == null) {
			try {
				botonAgregar = new JButton();
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
			sol.setBounds(0, 0, 1027, 323);			
			JLabel lblProductos = new JLabel("Productos:");
			lblProductos.setForeground(new Color(0, 70, 129));
			lblProductos.setFont(new Font("Arial", Font.BOLD, 12));			
			JLabel lblDescripcion = new JLabel("Descripcion:");
			lblDescripcion.setForeground(new Color(0, 70, 129));
			lblDescripcion.setFont(new Font("Arial", Font.BOLD, 12));
			JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
			lblPrecioUnitario.setForeground(new Color(0, 70, 129));
			lblPrecioUnitario.setFont(new Font("Arial", Font.BOLD, 12));
			JLabel lblCantidad = new JLabel("Cantidad:");
			lblCantidad.setForeground(new Color(0, 70, 129));
			lblCantidad.setFont(new Font("Arial", Font.BOLD, 12));
			
//			JScrollPane Pagregados = new JScrollPane();
//			Pagregados.setBounds(446, 11, 269, 209);
//			sol.add(Pagregados);
			
			JLabel lblUnidad = new JLabel("Unidad:");
			lblUnidad.setForeground(new Color(0, 70, 129));
			lblUnidad.setFont(new Font("Arial", Font.BOLD, 12));
			GroupLayout gl_sol = new GroupLayout(sol);
			gl_sol.setHorizontalGroup(
				gl_sol.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_sol.createSequentialGroup()
						.addGap(62)
						.addGroup(gl_sol.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_sol.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_sol.createSequentialGroup()
									.addGroup(gl_sol.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_sol.createSequentialGroup()
											.addComponent(lblPrecioUnitario, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addGap(10))
										.addGroup(gl_sol.createSequentialGroup()
											.addComponent(lblUnidad, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)))
									.addGroup(gl_sol.createParallelGroup(Alignment.LEADING)
										.addComponent(botonAgregar(), GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_sol.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(getTextFieldPreciou(), GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
										.addComponent(getTextFieldUnidad(), GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
									.addGap(38))
								.addGroup(gl_sol.createSequentialGroup()
									.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(getcantidads(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_sol.createSequentialGroup()
									.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getTextFieldDescripcion(), GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_sol.createSequentialGroup()
								.addComponent(lblProductos, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addGap(28)
								.addComponent(getTextFieldProductos(), GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_sol.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_sol.createSequentialGroup()
								.addGap(55)
								.addComponent(getPagregados(), GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnNueva()))
							.addGroup(gl_sol.createSequentialGroup()
								.addGap(104)
								.addComponent(btnGenerac(), GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
						.addGap(266))
			);
			gl_sol.setVerticalGroup(
				gl_sol.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_sol.createSequentialGroup()
						.addGroup(gl_sol.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_sol.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_sol.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_sol.createSequentialGroup()
										.addGap(16)
										.addGroup(gl_sol.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblProductos, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addComponent(getTextFieldProductos(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(25)
										.addGroup(gl_sol.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addComponent(getTextFieldDescripcion(), GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_sol.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_sol.createSequentialGroup()
												.addGap(2)
												.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
											.addComponent(getcantidads(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(20)
										.addGroup(gl_sol.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblPrecioUnitario, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addComponent(getTextFieldPreciou(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(37)
										.addGroup(gl_sol.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblUnidad, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
											.addComponent(getTextFieldUnidad(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addComponent(getPagregados(), GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_sol.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnGenerac(), GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addComponent(botonAgregar())))
							.addGroup(gl_sol.createSequentialGroup()
								.addGap(99)
								.addComponent(btnNueva())))
						.addContainerGap(50, Short.MAX_VALUE))
			);
			sol.setLayout(gl_sol);			
			sol.setVisible(true);
		}
		return sol;
	}
	
	public JScrollPane getPagregados(){
		if(Pagregados==null){
			Pagregados = new JScrollPane();
			Pagregados.setViewportView(textArea());
			Pagregados.setVisible(true);			
		}
		return Pagregados;
	}
	

	public JTextArea textArea(){
		if(textArea==null){
			textArea = new JTextArea();
//			textArea.setTabSize(12);		
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
}
