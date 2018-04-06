package componentes;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PanelListaCotizacion extends javax.swing.JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnNueva;
	private JTree tree;
	private JButton btnNuevaCotizacion;
  
	public PanelListaCotizacion() {		
		setBackground(Color.white);				
		/*String[]  columnNames = {"Id", "Nombre Evento", "Lugar Evento", "Fecha Inicio", 
				                 "Fecha Fin", "Montaje", "Desmontaje"};		
		DBConnect dbc = new DBConnect();	 
		Vector<String[]> datos = dbc.getCotizaciones();
		Object[][] data = new Object[datos.size()][7];
		for(int i=0; i<datos.size(); i++){           
            data[i]=datos.get(i);           
        }
        */
		 setLayout(null);
		 add(getBtnNueva());
		 
		 JScrollPane scrollPane_1 = new JScrollPane();
		 scrollPane_1.setBounds(0, 0, 714, 188);
		 add(scrollPane_1);
		 
		
		 scrollPane_1.setViewportView(getArbolDirectorios());
		 
		 JButton btnObtenerCotizacion = new JButton("Ver cotizaci\u00F3n");
		 btnObtenerCotizacion.addActionListener(new ActionListener() {
		 	@Override
			public void actionPerformed(ActionEvent arg0) {
		 		String[] armarRuta = tree.getSelectionPath().toString().split(",");
		 		
		 		String ruta = "C:\\Armado Digital SP\\Cotizaciones SP\\"+armarRuta[1].trim()+"\\"+tree.getLastSelectedPathComponent();
		 		
		 		if (ruta.contains(".pdf")) {
		 			try {
		 				File pdf = new File(ruta);
						Desktop.getDesktop().open(pdf);
//			 			JOptionPane.showMessageDialog(null, ruta);
				 		System.out.println("Abrir archivo ["+ruta+"]");
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Ocurrio un error al abrir el archivo");
					} catch (ArrayIndexOutOfBoundsException e) {
						JOptionPane.showMessageDialog(null, "¡Debe seleccionar un archivo!", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}
		 	}
		 });
		 
		 
		 btnObtenerCotizacion.setBounds(0, 223, 163, 23);
		 btnObtenerCotizacion.setForeground(new Color(255,255,255));
		 btnObtenerCotizacion.setBackground(new Color(18,43,74));
		 add(btnObtenerCotizacion);

		
		 add(getBtnNuevaCotizacion());
		 
		 JButton btnActualizarrbol = new JButton("Actualizar \u00E1rbol");
		 btnActualizarrbol.addActionListener(new ActionListener() {
		 	@Override
			public void actionPerformed(ActionEvent arg0) {
		 		actualizarArbolDirectorios();
		 		JOptionPane.showMessageDialog(null, "Árbol de directorios actualizado correctamente", "Notificación", JOptionPane.INFORMATION_MESSAGE);
		 	}
		 });
		 btnActualizarrbol.setForeground(Color.WHITE);
		 btnActualizarrbol.setBackground(new Color(18, 43, 74));
		 btnActualizarrbol.setBounds(173, 223, 163, 23);
		 add(btnActualizarrbol);
		 
		 
		 
		 llenarArbolDirectorios();
		 
		 
	}
	



	public JButton getBtnNuevaCotizacion() {
		if (btnNuevaCotizacion == null) {
			btnNuevaCotizacion = new JButton("Nueva cotizaci\u00F3n");
			btnNuevaCotizacion.setForeground(Color.WHITE);
			btnNuevaCotizacion.setBackground(new Color(18, 43, 74));
			btnNuevaCotizacion.setBounds(348, 223, 163, 23);
		}
		return btnNuevaCotizacion;
	}




	public JTree getArbolDirectorios() {
		if(tree == null) {
			 tree = new JTree();
		}
		return tree;
	}




	public JButton getBtnNueva() {
		if (btnNueva == null) {
			try {
				btnNueva = new JButton();
				btnNueva.setIcon(new ImageIcon("Images\\home.png"));
				btnNueva.setBounds(724, 0, 76, 70);
				btnNueva.setName("btnNueva");					
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnNueva;
	}
	
	
	/*public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(340, 25, 188, 238);
		PanelListaCotizacion pl = new PanelListaCotizacion();
		frame.getContentPane().add(pl);		
		frame.setVisible(true);
	}*/



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	/*public JTable getTblListaCotizaciones() {
		if(tblListaCotizaciones == null) {
			 tblListaCotizaciones.setPreferredScrollableViewportSize(new Dimension(600, 188));
			 tblListaCotizaciones.setForeground(new Color(0, 70, 129));
			 tblListaCotizaciones.setFont(new Font("Arial", Font.BOLD, 12));	
			 JScrollPane scrollPane = new JScrollPane(tblListaCotizaciones);
			 scrollPane.setBounds(0, 0, 600, 200);
			 add(scrollPane);
		}
		return tblListaCotizaciones;
	}*/
	
	public void llenarArbolDirectorios() {
		File f = new File("C:\\Armado Digital SP\\Cotizaciones SP");
		final String[] carpetas = f.list();
		
			 tree.setModel(new DefaultTreeModel(
					 	new DefaultMutableTreeNode("Cotizaciones encontradas") {

							/**
							 * 
							 */
							private static final long serialVersionUID = 1L;

							{
					 			for (int i = 0; i < carpetas.length; i++) {
					 				DefaultMutableTreeNode node_1;
						 			node_1 = new DefaultMutableTreeNode(carpetas[i]);
						 			
						 			File file = new File("C:\\Armado Digital SP\\Cotizaciones SP\\"+carpetas[i]);
						 			final String[] archivos = file.list();
						 			
							 			for (int j = 0; j < archivos.length; j++) {
							 				node_1.add(new DefaultMutableTreeNode(archivos[j]));
										}
						 			add(node_1);
					 			}
					 		}
					 	}
					 ));
		
	}
	
	private void actualizarArbolDirectorios() {
		File f = new File("C:\\Armado Digital SP\\Cotizaciones SP");
		final String[] carpetas = f.list();
		
			 tree.setModel(new DefaultTreeModel(
					 	new DefaultMutableTreeNode("Cotizaciones encontradas") {

							/**
							 * 
							 */
							private static final long serialVersionUID = 1L;

							{
					 			for (int i = 0; i < carpetas.length; i++) {
					 				DefaultMutableTreeNode node_1;
						 			node_1 = new DefaultMutableTreeNode(carpetas[i]);
						 			
						 			File file = new File("C:\\Armado Digital SP\\Cotizaciones SP\\"+carpetas[i]);
						 			final String[] archivos = file.list();
						 			
							 			for (int j = 0; j < archivos.length; j++) {
							 				node_1.add(new DefaultMutableTreeNode(archivos[j]));
										}
						 			add(node_1);
					 			}
					 		}
					 	}
					 ));
	}
}
