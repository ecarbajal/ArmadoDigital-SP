package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class STextFieldAcceso extends JTextField{

	private static final long serialVersionUID = 1L;

	public STextFieldAcceso(){	
		Font font1 = new Font("Courier New", Font.BOLD, 12);
		setFont(font1);				
		setForeground(new Color(250,250,250));
		setBackground(new Color(0,0,120));
		setBorder(null);	
	}
}
