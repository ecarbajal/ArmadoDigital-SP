package componentes;
/*
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.*;
import com.sun.pdfview.*;

public class VisualizaPDF extends JFrame {

	 PagePanel panelpdf;
	 JFileChooser selector;
	 PDFFile pdffile;
	 int indice=0;

	 public VisualizaPDF(){
	  panelpdf=new PagePanel();
	  JMenuBar barra=new JMenuBar();
	  JMenu archivo=new JMenu("Archivo");
	  JMenuItem ver=new JMenuItem("Buscar Archivo");
	  ver.addActionListener(new ActionListener(){
	  
	   public void actionPerformed(ActionEvent e) {
	    indice=0;
	    selector=new JFileChooser();
	    int op=selector.showOpenDialog(VisualizaPDF.this);
	    if(op==JFileChooser.APPROVE_OPTION){
	     try{
	     File file = selector.getSelectedFile();
	          RandomAccessFile raf = new RandomAccessFile(file, "r");
	          FileChannel channel = raf.getChannel();
	          ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,0, channel.size());
	          pdffile = new PDFFile(buf);
	          PDFPage page = pdffile.getPage(indice);
	          panelpdf.showPage(page);
	          repaint();
	     }catch(IOException ioe){
	      JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
	     }
	    }
	   }
	   
	  });
	  JPanel pabajo=new JPanel();
	  JButton bsiguiente=new JButton("Siguiente");
	  bsiguiente.addActionListener(new ActionListener(){
	  
	   public void actionPerformed(ActionEvent e) {
	    indice++;
	    PDFPage page = pdffile.getPage(indice);
	      panelpdf.showPage(page);
	   }
	   
	  });
	  JButton banterior=new JButton("Anterior");
	  banterior.addActionListener(new ActionListener(){

	  
	   public void actionPerformed(ActionEvent e) {
	    indice--;
	    PDFPage page = pdffile.getPage(indice);
	      panelpdf.showPage(page);
	   }
	   
	  });
	  pabajo.add(banterior);
	  pabajo.add(bsiguiente);
	  archivo.add(ver);
	  barra.add(archivo);
	  setJMenuBar(barra);
	  add(panelpdf);
	  add(pabajo,BorderLayout.SOUTH);
	 }
	 
	 public static void main(String arg[]){
	  VisualizaPDF p=new VisualizaPDF();
	  p.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  p.setVisible(true);
	  p.setBounds(0, 0, 500, 500);
	  p.setLocationRelativeTo(null);
	 }
}

*/


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class VisualizaPDF extends JFrame {

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton crear;
 JFileChooser selector;
 JEditorPane texto;
 
 public VisualizaPDF(){
  
  JPanel p=new JPanel();
  crear=new JButton("Guardar Archivo");
  crear.addActionListener(new ActionListener(){


   @Override
   public void actionPerformed(ActionEvent e) {
    selector=new JFileChooser();
    int op=selector.showSaveDialog(VisualizaPDF.this);
    if(op==JFileChooser.APPROVE_OPTION){
     try {
      OutputStream archivo=new FileOutputStream(selector.getSelectedFile());
      Document doc=new Document();
      PdfWriter.getInstance(doc, archivo);
       doc.open();
      doc.add(new Paragraph(texto.getText()));
      doc.close();
      archivo.close();
     } catch (FileNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
     } catch (DocumentException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
     } catch (IOException ex2) {
      // TODO Auto-generated catch block
      ex2.printStackTrace();
     }
    }
   }
   
  });
  p.add(crear);  
  add(p,BorderLayout.NORTH);  
  texto=new JEditorPane();
  texto.setContentType("text/html");
//  texto.setText("<font face='Arial'><img src='file:C:/GNP/Documentos/Jorgie/plantilla_EJ.jpg'/></font>");
  
  texto.setText("<TABLE background='file:C:\\Desarrollos\\Workspace SP\\ARMADIG\\images\\PlantillaAP.jpg' cellspacing=0 cellspadding=0 border=0 width=500, height=0 >" +
  "<tr><td width=500, height=0></td></tr></TABLE>"); 

//  texto.setText("<div><img src='file:C:/GNP/Documentos/Jorgie/plantilla_EJ.jpg' style='position: absolute; top: 0; left: 0;' width='400'>"+
//"<div style='position: absolute; top: 0; left: 0; margin: 1px; width: 400px;'></div><div>");
  
  add(new JScrollPane(texto));                     
 }
 
 public static void main(String arg[]){
  VisualizaPDF p=new VisualizaPDF();
  p.setVisible(true);
  p.setBounds(0, 0, 500, 500);
  p.setDefaultCloseOperation(EXIT_ON_CLOSE);
  p.setLocationRelativeTo(null);
 }


}
//Image imagen = Image.getInstance("C://Blog/Itext/images/00.jpg");
//documento.add(imagen);
 
 

