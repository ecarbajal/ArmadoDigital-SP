package creaDoc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import utils.CtsArmado;
import utils.Utils;

public class CreaContratoSPv2 {

	public static final String plantilla = CtsArmado.pathJar + "Plantilla contratosp.pdf";
	public static String pathSalSP = CtsArmado.pathSalSP;


	 public void creaHoja(String nombreEmpresa, String representanteLegal, String instrumentoPublico, String fechaInstPublico, String notarioPublico,
			 String licenciado, String rfc, String objetoSocial, String domicilioEmpresa, String rfcPrestador,
			 String nombreEvento, String diasNaturalesPago, String inicioContrato, String finContrato, String ciudadInstPub) {
		    
	        PdfStamper stamper = null;
	        PdfReader reader;
	        Font Arial = new Font(Font.getFamily("Arial"), 10.0f);
	        //Arial.setColor(23, 54, 93);
	        
			try {
				reader = new PdfReader("C:\\Armado Digital SP\\Images\\Plantilla Contratosp.pdf");
				 
			        System.out.println("Cliente");
			        File fl = new File(String.valueOf(pathSalSP) + "\\" + "\\"+nombreEmpresa+"\\");
			        fl.mkdirs();
			        stamper = new PdfStamper(reader, new FileOutputStream(fl+ "\\" + "Contrato" + "_" +nombreEmpresa + "_"+nombreEvento+".pdf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	        Phrase phraset = null;
	        PdfContentByte canvas = stamper.getOverContent(1);
	        PdfContentByte canvas2 = stamper.getOverContent(2);
	        PdfContentByte canvas3 = stamper.getOverContent(3);
	        PdfContentByte canvas4 = stamper.getOverContent(4);
	        PdfContentByte canvas8 = stamper.getOverContent(8);

	        canvas.beginText();
	        canvas2.beginText();
	        canvas3.beginText();
	        canvas4.beginText();
	        canvas8.beginText();

	        Chunk c0empresa = new Chunk(nombreEmpresa, Arial);		
	        Chunk c0represental = new Chunk(representanteLegal, Arial);
	        Chunk c0inotarial = new Chunk(instrumentoPublico, Arial);	        
	        Chunk c0fechain = new Chunk(Utils.convertirFechaATexto(fechaInstPublico), Arial);  
	        Chunk c0licenciaf = new Chunk(licenciado, Arial);
	        Chunk c0notariop = new Chunk(notarioPublico, Arial);
	        Chunk c0instPubC = new Chunk(instrumentoPublico, Arial);
	        Chunk c0ObjetoSocial = new Chunk(objetoSocial, Arial);
	        Chunk c0DomicilioEmp = new Chunk(domicilioEmpresa, Arial);
	        Chunk c0rfc = new Chunk(rfc, Arial);
	        Chunk c0rfcPrestador = new Chunk(rfcPrestador, Arial);
	        Chunk c0NombreEvento = new Chunk(nombreEvento, Arial);
	        Chunk c0DiasNatPago = new Chunk(diasNaturalesPago, Arial);
	        Chunk c0ciudadInstPub = new Chunk(ciudadInstPub, Arial);
	        
	        String[] fechaArray = Utils.convertirFechaATexto(inicioContrato).split("DE");
	        
	        Chunk c0FinContrato = new Chunk(Utils.convertirFechaATexto(finContrato), Arial);
	        Chunk c0InicioContrato = new Chunk(fechaArray[0]+"          "+fechaArray[1]+"                     "+fechaArray[2], Arial);

	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        
	        phraset = new Phrase(c0empresa);
	        ColumnText.showTextAligned(canvas, 10, phraset, 60.0f, 696.0f, 0.0f);
	        System.out.println("Generando empresa: " + phraset);

	        phraset = new Phrase(c0represental);	
	        ColumnText.showTextAligned(canvas, 30, phraset, 100.0f, 516.0f, 0.0f);
	        System.out.println("Generando c0represental: " + phraset);

	        phraset = new Phrase(c0inotarial);	
	        ColumnText.showTextAligned(canvas, 90, phraset, 470.0f, 475.0f, 0.0f);
	        System.out.println("Generando c0inotarial: " + phraset);

	        phraset = new Phrase(c0fechain);	
	        ColumnText.showTextAligned(canvas, 10, phraset, 105.0f, 460.0f, 0.0f);
	        System.out.println("Generando c0fechain: " + phraset);

	        phraset = new Phrase(c0notariop);	
	        ColumnText.showTextAligned(canvas, 46, phraset, 60.0f, 448.0f, 0.0f);
	        System.out.println("Generando c0notariop: " + phraset);
	        
	        phraset = new Phrase(c0ciudadInstPub);	
	        ColumnText.showTextAligned(canvas, 46, phraset, 273.0f, 447.0f, 0.0f);
	        System.out.println("Generando c0ciudadInstPub: " + phraset);
	        
	        phraset = new Phrase(c0licenciaf);	
	        ColumnText.showTextAligned(canvas, 65, phraset, 455.0f, 447.0f, 0.0f);
	        System.out.println("Generando c0licenciaf: " + phraset);

	        phraset = new Phrase(c0rfc);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 435.0f, 405.0f, 0.0f);
	        System.out.println("Generando c0rfc: " + phraset);

	        phraset = new Phrase(c0instPubC);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 273.0f, 364.0f, 0.0f);
	        System.out.println("Generando c0InstPubC: " + phraset);

	        phraset = new Phrase(c0ObjetoSocial);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 200.0f, 322.0f, 0.0f);
	        System.out.println("Generando c0InstPubC: " + phraset);

	        phraset = new Phrase(c0DomicilioEmp);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 235.0f, 295.0f, 0.0f);
	        System.out.println("Generando c0DomicilioEmp: " + phraset);
	        
	        //Pagina dos del PDF

	        phraset = new Phrase(c0rfcPrestador);
	        ColumnText.showTextAligned(canvas2, 10, phraset, 438.0f, 682.0f, 0.0f);
	        System.out.println("Generando c0rfcPrestador: " + phraset);
	        
	        //Página tres del PDF

	        phraset = new Phrase(c0NombreEvento);
	        ColumnText.showTextAligned(canvas3, 10, phraset, 124.0f, 612.0f, 0.0f);
	        System.out.println("Generando c0NombreEvento: " + phraset);
	        
	        //Página cuatro del PDF

	        phraset = new Phrase(c0DiasNatPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 370.0f, 502.0f, 0.0f);
	        System.out.println("Generando c0DiasNatPago: " + phraset);

	        phraset = new Phrase(c0DiasNatPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 250.0f, 198.0f, 0.0f);
	        System.out.println("Generando c0DiasNatPago: " + phraset);
	        
	        phraset = new Phrase(c0FinContrato);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 60.0f, 102.0f, 0.0f);
	        System.out.println("Generando c0FinContrato: " + phraset);
	        
	        //Página ocho del contrato
	        
	        phraset = new Phrase(c0InicioContrato);	
	        ColumnText.showTextAligned(canvas8, 40, phraset, 120.0f, 267.0f, 0.0f);
	        System.out.println("Generando c0InicioContrato: " + phraset);
	        
	        if(nombreEmpresa.length() <= 18) {
	        	phraset = new Phrase(c0empresa);	
		        ColumnText.showTextAligned(canvas8, 40, phraset, 300.0f, 115.0f, 0.0f);
		        System.out.println("Generando c0empresa: " + phraset);
	        }else {
	        	String c1 = nombreEmpresa.substring(0, 25)+"-".trim();
	        	String c2 = nombreEmpresa.substring(25,nombreEmpresa.length()).trim();
	        	Chunk c0empresa1 = new Chunk(c1, Arial);
	        	phraset = new Phrase(c0empresa1);	
	        	ColumnText.showTextAligned(canvas8, 40, phraset, 300.0f, 115.0f, 0.0f);
	        	
	        	Chunk c0empresa2 = new Chunk(c2, Arial);
		        phraset = new Phrase(c0empresa2);
	        	ColumnText.showTextAligned(canvas8, 40, phraset, 300.0f, 100.0f, 0.0f);
		        System.out.println("Generando c0empresa: " + phraset);
	        }
	        
	        System.out.println("Contrato generado correctamente");
	        JOptionPane.showMessageDialog(null, "Contrato generado correctamente");
	        canvas.endText();
	        canvas2.endText();
	        try {
				stamper.close();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }


	 }