package componentes;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.shaper.StandardButtonShaper;

public class PanelBotones extends JPanel{
	
	public PanelBotones() {
		setBorder(null);
//		System.out.println("PanelBotones");
		setBounds(21, 162, 186, 300);
		setBackground(Color.white);
		setLayout(null);
		add(getBtnCotizadorsp());
		add(getBtnListacotiza());
		add(getBtnHojam());
		add(getbtnCotizadorled());
//		add(getBtnCusuario());
		add(getBtnbtnContratossp());
		add(getBtnContratos());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCotizadorsp;
	private JButton btnHojam;
	private JButton btnListacotizacion;
//	private JButton btnSeparar;
	private JButton btnCotizadorled;
//	private JButton btnCusuario;
	private JButton btnContratos;
	private JButton btnContratossp;
//	private JButton btnReportes;	
	
	public JButton getBtnCotizadorsp(){
		if(btnCotizadorsp == null){
			btnCotizadorsp = new JButton();
			btnCotizadorsp.setBounds(25, 11, 151, 30);
			btnCotizadorsp.setForeground(new Color(255,255,255));
			btnCotizadorsp.setBackground(new Color(18,43,74));
			btnCotizadorsp.setText("Cotizador sp");
			btnCotizadorsp.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnCotizadorsp.setLayout(null);
		}
		return btnCotizadorsp;
	}
	
	public JButton getBtnbtnContratossp(){
		if(btnContratossp == null){
			btnContratossp = new JButton();
			btnContratossp.setBounds(25, 218, 151, 30);
			btnContratossp.setForeground(new Color(255,255,255));
			btnContratossp.setBackground(new Color(18,43,74));
			btnContratossp.setText("Contratos SP");
			btnContratossp.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnContratossp.setLayout(null);
		}
		return btnContratossp;
	}	
	
//	public JButton getBtnCusuario(){
//		if(btnCusuario == null){
//			btnCusuario = new JButton();
//			btnCusuario.setBounds(362, 190, 62, 58);
//			btnCusuario.setIcon(new ImageIcon("C:\\Desarrollos\\Workspace SP\\ARMADIG\\images\\Cambio Usuario.png"));
//			btnCusuario.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
//			btnCusuario.setLayout(null);
//		}
//		return btnCusuario;
//	}	
	
	public JButton getBtnContratos(){
		if(btnContratos == null){
			btnContratos = new JButton();
			btnContratos.setBounds(25, 175, 151, 30);
			btnContratos.setForeground(new Color(255,255,255));
			btnContratos.setBackground(new Color(18,43,74));
			btnContratos.setText("Contratos Led");
			btnContratos.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnContratos.setLayout(null);
		}
		return btnContratos;
	}
	
	public JButton getBtnHojam(){
		if(btnHojam == null){
			btnHojam = new JButton();
			btnHojam.setBounds(25, 134, 151, 30);
			btnHojam.setForeground(new Color(255,255,255));
			btnHojam.setBackground(new Color(18,43,74));
			btnHojam.setText("Hoja Membretada");
			btnHojam.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnHojam.setLayout(null);
		}
		return btnHojam;
	}	

	public JButton getbtnCotizadorled(){
		if(btnCotizadorled == null){
			btnCotizadorled = new JButton();
			btnCotizadorled.setBounds(25, 52, 151, 30);
			btnCotizadorled.setForeground(new Color(255,255,255));
			btnCotizadorled.setBackground(new Color(18,43,74));
			btnCotizadorled.setText("Cotizador Led");
			btnCotizadorled.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnCotizadorled.setLayout(null);
		}
		return btnCotizadorled;
	}	
	
	public JButton getBtnListacotiza(){
		if(btnListacotizacion == null){
			btnListacotizacion = new JButton("Lista de Cotizaciones");
			btnListacotizacion.setBounds(25, 93, 151, 30);
			btnListacotizacion.setForeground(new Color(255,255,255));
			btnListacotizacion.setBackground(new Color(18,43,74));
		}
		return btnListacotizacion;		
	}
	
}
