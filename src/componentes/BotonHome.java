package componentes;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BotonHome extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JPanel BotonHome;
	private JButton btnNueva;
//	private BotonHome botonhome;
	
	public BotonHome(){	
			System.out.println("BotonHome");
		 	setBounds(0,100,163,107);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getbotonhome());
			getbotonhome().setVisible(true);
			setVisible(true);	
			this.repaint();
		}

public JButton btnNueva() {
	if (btnNueva == null) {
		try {
			btnNueva = new JButton();
			btnNueva.setBounds(10, 11, 81, 74);
			btnNueva.setVisible(true);
			btnNueva.setIcon(new ImageIcon("C:\\Armado Digital SP\\Images\\home.png"));
			btnNueva.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNueva.setName("btnNueva");				
			
		} catch (java.lang.Throwable ignored) {	}
	}
	return btnNueva;
}
	
	public JPanel getbotonhome(){
		if(BotonHome == null){
			BotonHome = new JPanel();
			BotonHome.setBackground(Color.WHITE);
			BotonHome.setBounds(28, 11, 103, 96);
			BotonHome.setLayout(null);
			BotonHome.add(btnNueva());
			BotonHome.setVisible(true);
		}
		return BotonHome;
	}
}
