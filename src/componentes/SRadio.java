package componentes;

import java.awt.Color;

import javax.swing.JRadioButton;

public class SRadio extends JRadioButton{

	private static final long serialVersionUID = 1L;
	
	public SRadio(){
		setBackground(Color.white);
		setForeground(new Color(0,0,70));
	}
	
	public SRadio(String s){
		setBackground(Color.white);
		setForeground(new Color(0,0,70));
		setText(s);
	}
	

}
