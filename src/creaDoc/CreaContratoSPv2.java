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
			 String nombreEvento, String diasNaturalesPago, String inicioContrato, String finContrato, String ciudadInstPub, 
			 double porcentPrimerPago, double porcentSegundoPago, int DiasSegundoAnticipo) {
		    
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
	        PdfContentByte canvas5 = stamper.getOverContent(5);
	        PdfContentByte canvas9 = stamper.getOverContent(9);

	        canvas.beginText();
	        canvas2.beginText();
	        canvas3.beginText();
	        canvas4.beginText();
	        canvas9.beginText();

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
	        Chunk c0PorcPrimerPago = new Chunk(String.valueOf(porcentPrimerPago), Arial);
	        Chunk c0PorcSegundoPago = new Chunk(String.valueOf(porcentSegundoPago), Arial);
	        Chunk c0DiasSegundoPago = new Chunk(DiasSegundoAnticipo+"", Arial);
	        
	        
	        Chunk c0ciudadInstPub = new Chunk(ciudadInstPub, Arial);
	        
	        Chunk c0FinContrato = new Chunk(Utils.convertirFechaATexto(finContrato), Arial);
	        Chunk c0InicioContrato = new Chunk(Utils.convertirFechaATexto(inicioContrato), Arial);

	        Arial.setSize(11.0f);
	        //Arial.setStyle(1);
	        
	        phraset = new Phrase(c0empresa);
	        ColumnText.showTextAligned(canvas, 10, phraset, 54.0f, 653.7f, 0.0f);
	        System.out.println("Generando empresa: " + phraset);

	        phraset = new Phrase(  c0represental);	
	        ColumnText.showTextAligned(canvas, 30, phraset, 260.0f, 489.0f, 0.0f);
	        System.out.println("Generando c0representalegal: " + phraset);

	        phraset = new Phrase(c0inotarial);	
	        ColumnText.showTextAligned(canvas, 90, phraset, 260.0f, 336.0f, 0.0f);
	        System.out.println("Generando c0inotarial: " + phraset);

	        phraset = new Phrase(c0fechain);	
	        ColumnText.showTextAligned(canvas, 10, phraset, 87.0f, 432.0f, 0.0f);
	        System.out.println("Generando c0fechainstrumentoPublico: " + phraset);

	        phraset = new Phrase(c0notariop);	
	        ColumnText.showTextAligned(canvas, 46, phraset, 465.0f, 432.0f, 0.0f);
	        System.out.println("Generando c0notariop: " + phraset);
	        
	        phraset = new Phrase(c0ciudadInstPub);	
	        ColumnText.showTextAligned(canvas, 46, phraset, 142.0f, 419.0f, 0.0f);
	        System.out.println("Generando c0ciudadInstPub: " + phraset);
	        
	        phraset = new Phrase(c0licenciaf);	
	        ColumnText.showTextAligned(canvas, 65, phraset, 390.0f, 420.0f, 0.0f);
	        System.out.println("Generando c0licenciaf: " + phraset);

	        phraset = new Phrase(c0rfc);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 435.0f, 378.0f, 0.0f);
	        System.out.println("Generando c0rfc: " + phraset);

	        phraset = new Phrase(c0instPubC);//Primer instrumento
	        ColumnText.showTextAligned(canvas, 40, phraset, 460.0f, 447.0f, 0.0f);
	        System.out.println("Generando c0InstrumentoPublicoC: " + phraset);

	        phraset = new Phrase(c0ObjetoSocial);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 200.0f, 295.0f, 0.0f);
	        System.out.println("Generando c0ObjetoSocial: " + phraset);

	        phraset = new Phrase(c0DomicilioEmp);	
	        ColumnText.showTextAligned(canvas, 40, phraset, 54.0f, 255.0f, 0.0f);
	        System.out.println("Generando c0DomicilioEmp: " + phraset);
	        
	        //Pagina dos del PDF

	        phraset = new Phrase(c0rfcPrestador);
	        ColumnText.showTextAligned(canvas2, 10, phraset, 54.0f, 598.7f, 0.0f);
	        System.out.println("Generando c0rfcPrestador: " + phraset);
	        
	        //Página tres del PDF

	        phraset = new Phrase(c0NombreEvento);
	        ColumnText.showTextAligned(canvas3, 10, phraset, 54.0f, 572.0f, 0.0f);
	        System.out.println("Generando c0NombreEvento: " + phraset);
	        
	        
	        
	        
	        
	        //Página cuatro del PDF

	        phraset = new Phrase(c0DiasNatPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 330.0f, 432.5f, 0.0f);
	        System.out.println("Generando c0DiasNatPago: " + phraset);

	        phraset = new Phrase(c0PorcPrimerPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 238.0f, 254.5f, 0.0f);
	        System.out.println("Generando c0PorcPrimerPago: " + phraset);

	        phraset = new Phrase(c0PorcSegundoPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 255.0f, 198.0f, 0.0f);
	        System.out.println("Generando c0PorcSegundoPago: " + phraset);
	        
	        phraset = new Phrase(c0DiasSegundoPago);	
	        ColumnText.showTextAligned(canvas4, 40, phraset, 385.0f, 198.0f, 0.0f);
	        System.out.println("Generando c0DiasSegundoPago: " + phraset);
	        
	        

	        
	        
	        
	        
	        //Pagina cinco del contrato
	        phraset = new Phrase(c0FinContrato);	
	        ColumnText.showTextAligned(canvas5, 40, phraset, 60.0f, 627.0f, 0.0f);
	        System.out.println("Generando c0FinContrato: " + phraset);
	        
	        
	        
	        
	        
	        
	        
	        //Página nueve del contrato
	        phraset = new Phrase(c0InicioContrato);	
	        ColumnText.showTextAligned(canvas9, 40, phraset, 120.0f, 640.0f, 0.0f);
	        System.out.println("Generando c0InicioContrato: " + phraset);
	        
	        if(nombreEmpresa.length() <= 18) {
	        	phraset = new Phrase(c0empresa);	
		        ColumnText.showTextAligned(canvas9, 40, phraset, 320.0f, 328.0f, 0.0f);
		        System.out.println("Generando c0empresa: " + phraset);
	        }else {
	        	String c1 = nombreEmpresa.substring(0, 25)+"-".trim();
	        	String c2 = nombreEmpresa.substring(25,nombreEmpresa.length()).trim();
	        	Chunk c0empresa1 = new Chunk(c1, Arial);
	        	phraset = new Phrase(c0empresa1);	
	        	ColumnText.showTextAligned(canvas9, 40, phraset, 320.0f, 328.0f, 0.0f);
	        	
	        	Chunk c0empresa2 = new Chunk(c2, Arial);
		        phraset = new Phrase(c0empresa2);
	        	ColumnText.showTextAligned(canvas9, 40, phraset, 320.0f, 313.0f, 0.0f);
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