package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;

public class SComboBox extends JComboBox<Object> {
	
	private static final long serialVersionUID = 1L;

	
	public SComboBox(){		
		Font font1 = new Font("Arial", Font.BOLD, 12);
		setFont(font1);	
		setBackground(Color.white);
		setForeground(new Color(0,0,70));
	}
}
