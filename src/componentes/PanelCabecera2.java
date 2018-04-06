package componentes;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelCabecera2 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labellineAzul2;
	private BotonHome botonhome;

	public PanelCabecera2(){
		System.out.println("PanelCabecera2");
		setBounds(355,340, 543, 97);
		setBackground(Color.white);	
		setLayout(null);
		add(getlineAzul(), getlineAzul().getName());
		getBotonHome().setVisible(true);

 	}
	
	public BotonHome getBotonHome() {
		if (botonhome == null) {
			botonhome = new BotonHome();
			botonhome.getbotonhome().setLocation(25, 11);
			botonhome.setBounds(0, 0, 138, 91);
			botonhome.btnNueva().setLocation(10, 210);
			botonhome.setVisible(true);
		}
		return botonhome;
	}
	
	JLabel getlineAzul() {
		if (labellineAzul2 == null) {
			try {
				labellineAzul2 = new JLabel();
				labellineAzul2.setName("labellineAzul");
				labellineAzul2.setIcon(new ImageIcon("images\\accesosp.png"));
				labellineAzul2.setBounds(385,-5,280,170);
				labellineAzul2.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return labellineAzul2;

	}
}

