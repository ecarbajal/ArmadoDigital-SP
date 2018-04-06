package componentes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class SPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private Image imagen = null;
	
	public SPanel(Image imagen){
		this.imagen = imagen;
		Dimension dim = new Dimension(imagen.getWidth(null),imagen.getHeight(null));
		this.setPreferredSize(dim);
		this.setMaximumSize(dim);
		this.setMinimumSize(dim);
		this.setSize(dim);
		this.setLayout(null);
	}
		
	@Override
	public void paintComponent(Graphics g){				
		g.drawImage(imagen, 0, 0, null);		
	}
				
}
