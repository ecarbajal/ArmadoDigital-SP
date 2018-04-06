package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class STextField extends JTextField{
	
	private static final long serialVersionUID = 1L;

	public STextField(){
		Font font1 = new Font("Arial", Font.BOLD, 12);
		setFont(font1);				
		setForeground(new Color(0,0,70));
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(new Color(0,70,129)));   			
	}
}
