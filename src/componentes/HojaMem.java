package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;



public class HojaMem extends JPanel{

	private static final long serialVersionUID = 1L;
	Font fuente=new Font("Dialog", Font.LAYOUT_NO_LIMIT_CONTEXT, 15);
	
	private JButton botonGenerar;
	private JLabel  lblDescricpion;
	private JTextField textDescripcionh;
	private JPanel Hoja;	
	private JScrollPane HojaScroll;
	private JLabel labellineah;
	private JLabel pieMembretada;
	private JButton btnRegresar;
	private static JTextArea taPrueba;

	
	public HojaMem() {
		setBounds(21, 162, 1066, 716);
		setBackground(Color.WHITE);
		gettextDescripcionh().setVisible(true);		
		getlblDescricpion().setVisible(true);		
	    getbotonGenerar().setVisible(true);
	 	setLayout(null);
		add(getHojaScroll());
		getHojaScroll().setVisible(true);
		getHoja().setVisible(true);
		getHojaScroll().setVisible(true);		
		setVisible(true);
		this.repaint();		
	}	

	JLabel getpieMembretada() {
		if (pieMembretada == null) {
			try {
				pieMembretada = new JLabel();
				pieMembretada.setName("labellineah");
				pieMembretada.setIcon(new ImageIcon("images\\piemembretada.png"));
				pieMembretada.setBounds(20, 1050, 815, 137);
				pieMembretada.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return pieMembretada;
	}	

	JLabel getlineah() {
		if (labellineah == null) {
			try {
				labellineah = new JLabel();
				labellineah.setName("labellineah");
				labellineah.setIcon(new ImageIcon("images\\membretada1.png"));
				labellineah.setBounds(20,10,815,137);
				labellineah.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return labellineah;
	}

	public JButton getbotonGenerar() {
		if (botonGenerar == null) {
			try {
				botonGenerar = new JButton();
				botonGenerar.setBounds(404, 1180, 108, 23);
				botonGenerar.setName("botonGenerar");				
				botonGenerar.setText("Generar");
				botonGenerar.setForeground(new Color(255,255,255));
				botonGenerar.setBackground(new Color(18,43,74));
				botonGenerar.setVisible(true);				
			} catch (java.lang.Throwable ignored) {	}
		}
		return botonGenerar;
	}	
	
	public JTextField gettextDescripcionh(){
		if(textDescripcionh == null){
			textDescripcionh = new JTextField();
			textDescripcionh.setBounds(115, 1180, 169, 20);
			textDescripcionh.setVisible(true);
		}
		return textDescripcionh;
	}	
	
	JLabel getlblDescricpion() {
		if (lblDescricpion == null) {
			try {
				lblDescricpion = new JLabel();
				lblDescricpion.setBounds(38, 1180, 96, 23);
				lblDescricpion.setName("lblDescricpion");
				lblDescricpion.setText("Descripcion:");
				lblDescricpion.setVisible(true);
				lblDescricpion.setForeground(new Color(90,90,90));
				lblDescricpion.setVisible(true);
			} catch (java.lang.Throwable ignored) {
			}
		}
		return lblDescricpion;
	}	
	
//	public JTextField getjtextArea() {
//		if (jtextArea == null) {
//			try {
//				jtextArea = new AutoCompleteTextField(100);
//				jtextArea.setBounds(10, 155, 750, 23);
//				jtextArea.setVisible(true);
//				jtextArea.setFont ( fuente );
//				jtextArea.setWrapStyleWord(true);
//				jtextArea.setBorder(null);
//				jtextArea.setLineWrap(true);
//				jtextArea.addKeyListener(new KeyListener(){					 
//					public void keyTyped(KeyEvent e){						
//						if (jtextArea.getText().length() == jtextArea.getHeight()) {					 
//					     e.consume(); 
//					     jtextArea2.requestFocus();
//						}
//						
//					}					 
//					public void keyPressed(KeyEvent arg0) {	
//						if((arg0.getKeyCode() == KeyEvent.VK_ENTER)||(arg0.getKeyCode() == KeyEvent.VK_TAB)){							
//							jtextArea2.requestFocus();
//						}						
//					}					 
//					public void keyReleased(KeyEvent arg0) {
//					}
//					});				
//				
//			} catch (java.lang.Throwable ignored) {
//			}
//		}
//		return jtextArea;
//	}
	
	public static String getTextTaPrueba() {
		return taPrueba.getText();
		
	}
	
	public JTextArea getTaPrueba() {
		if(taPrueba == null) {
			taPrueba.setLineWrap(true);
			taPrueba.setWrapStyleWord(true);
			taPrueba.invalidate();
		}
		
		return taPrueba;
	}


	

	

	
	public JPanel getHoja(){
		if(Hoja == null){
			Hoja = new JPanel();
//			Hoja.setBounds(0, 0, 900, 800);
			Hoja.setBackground(Color.WHITE);
			Hoja.setPreferredSize(new Dimension(2000, 1250));
			Hoja.setLayout(null);
			Hoja.add(getlineah());
			Hoja.add(getpieMembretada());
			Hoja.add(getlblDescricpion());
			Hoja.add(gettextDescripcionh());
			Hoja.add(getbotonGenerar());
			Hoja.add(getBtnRegresar());
			
			taPrueba = new JTextArea();
			taPrueba.setFont(new Font("Arial", Font.PLAIN, 20));
			taPrueba.setBackground(SystemColor.control);
			taPrueba.setWrapStyleWord(true);
			taPrueba.setLineWrap(true);
			taPrueba.setBounds(20, 159, 815, 900);
			Hoja.add(taPrueba);
			Hoja.setVisible(true);
			
			
		}
		return Hoja;
	}
	
//	hojas

	public JScrollPane getHojaScroll(){
		if(HojaScroll == null){
			HojaScroll = new JScrollPane();
			HojaScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			HojaScroll.setBounds(5, 5, 876, 675);
			HojaScroll.setBackground(Color.WHITE);
			HojaScroll.setViewportView(getHoja());
			HojaScroll.getViewport().setView(getHoja());
			HojaScroll.setVisible(true);
			

	
		}
		return HojaScroll;

		
	}
	public JButton getBtnRegresar() {
		if (btnRegresar == null) {
			btnRegresar = new JButton("Regresar");
			btnRegresar.setBounds(600, 1180, 108, 23);
			btnRegresar.setForeground(new Color(255,255,255));
			btnRegresar.setBackground(new Color(18,43,74));
		}
		return btnRegresar;
	}
}
