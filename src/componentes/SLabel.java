package componentes;

import java.awt.Color;

import javax.swing.JLabel;

public class SLabel extends JLabel{

	private static final long serialVersionUID = 1L;
	
	public SLabel(){
		setBackground(Color.white);
		setForeground(new Color(0,70,129));		
	}
	
	public SLabel(String s){
		setBackground(Color.white);
		setForeground(new Color(0,70,129));
		setText(s);
	}
	
}
