package componentes;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.shaper.StandardButtonShaper;

public class CambioUsuario extends JPanel{
	
	public CambioUsuario() {
		setBorder(null);
//		System.out.println("PanelBotones");
		setBounds(21, 162, 109, 113);
		setBackground(Color.white);
		setLayout(null);
		add(getBtnCambiou());

		
		
		JLabel lblCambioDeUsuario = new JLabel("Cambio de Usuario");
		lblCambioDeUsuario.setForeground(Color.GRAY);
		lblCambioDeUsuario.setBounds(10, 82, 166, 14);
		add(lblCambioDeUsuario);

	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private JButton btnCotizadorsp;
	private JButton btnHojam;
	private JButton btnListacotizacion;
	private JButton btnSeparar;
	private JButton btnCotizadorled;
		private JButton btnCusuario;
	private JButton btnContratos;
	private JButton btnContratossp;
	private JButton btnReportes;	*/
	

	private JButton btnCambiou;
	
	public JButton getBtnCambiou(){
		if(btnCambiou == null){
			btnCambiou = new JButton();
			btnCambiou.setIcon(new ImageIcon("C:\\Desarrollos\\Workspace SP\\ARMADIG\\images\\Cambio Usuario.png"));
			btnCambiou.setBounds(26, 11, 63, 60);
			btnCambiou.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
			btnCambiou.setLayout(null);
		}
		return btnCambiou;
	}
	

}
