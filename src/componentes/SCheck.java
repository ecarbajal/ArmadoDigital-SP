package componentes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;

public class SCheck extends JCheckBox{

	
	private static final long serialVersionUID = 1L;

	public SCheck(){
		Font font1 = new Font("Arial", Font.BOLD, 12);
		setFont(font1);	
		setBackground(Color.white);		
		setForeground(new Color(0,70,129));
		setBorder(BorderFactory.createLineBorder(new Color(0,0,70)));
	}

	public SCheck(String string) {
		Font font1 = new Font("Arial", Font.BOLD, 12);
		setFont(font1);	
		setBackground(Color.white);
		setForeground(new Color(0,70,129));
		setBorder(BorderFactory.createLineBorder(new Color(0,0,70)));
		setText(string);
	}	
}
