package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class SButtonAcceso extends JButton{
	
	private static final long serialVersionUID = 1L;
	
	public SButtonAcceso(){		
		Font font = new Font("Arial", Font.BOLD, 14);
		setFont(font);		
		setBackground(new Color(50,50,255));
		setForeground(new Color(255,255,255));            	
		setBorder(BorderFactory.createLineBorder(Color.BLACK));    	
	}

}
