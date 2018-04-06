package componentes;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCabecera extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private JLabel labelImagen_sp;
//	private JLabel labelImagen_vivir;
	private JLabel labellineAzul;
//	private SLabel lblArmadoDigitalV;
	
	public PanelCabecera(){
		System.out.println("PanelCabecera");
		setBounds(0, 0, 734, 102);
		setBackground(Color.white);	
		setLayout(null);
//		add(getImagen_sp(), getImagen_sp().getName());
//		add(getImagen_vivir(), getImagen_sp().getName());
		add(getlineAzul(), getlineAzul().getName());		
 	}
	
//	JLabel getImagen_sp() {
//		if (labelImagen_sp == null) {
//			try {
//				labelImagen_sp = new JLabel();
//				labelImagen_sp.setName("labelImagen_sp");
//				ImageIcon ima = new ImageIcon(".. \\..\\images\\accesosp.png");
//				labelImagen_sp.setIcon(ima);
//				labelImagen_sp.setBounds(0,60,300,90);
//				labelImagen_sp.setVisible(true);
//			} catch (java.lang.Throwable ignored) {
//
//			}
//		}
//		return labelImagen_sp;
//	}
	
//	JLabel getImagen_vivir() {
//		if (labelImagen_vivir == null) {
//			try {
//				labelImagen_vivir = new JLabel();
//				labelImagen_vivir.setName("LabelImagen_vivir");
//				ImageIcon ima = new ImageIcon(".. \\..\\images\\vivir.png");
//				labelImagen_vivir.setIcon(ima);
//				labelImagen_vivir.setBounds(178,11,180,58);
//				labelImagen_vivir.setVisible(true);
//			} catch (java.lang.Throwable ignored) {
//
//			}
//		}
//		return labelImagen_vivir;
//	}
	
	JLabel getlineAzul() {
		if (labellineAzul == null) {
			try {
				labellineAzul = new JLabel();
				labellineAzul.setName("labellineAzul");
				labellineAzul.setIcon(new ImageIcon("images\\fondo3.png"));
				labellineAzul.setBounds(0,0,1000,90);
				labellineAzul.setVisible(true);
			} catch (java.lang.Throwable ignored) {

			}
		}
		return labellineAzul;
	}
	
	

}
