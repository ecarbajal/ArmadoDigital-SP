package creaDoc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import componentes.HojaMem;
import utils.CtsArmado;

public class CreaHoja {
	
	public CreaHoja() {
			
		}

	public static final String plantilla = CtsArmado.pathJar + "Hoja membretada SP.pdf";
	public static String pathSalh = CtsArmado.pathSalh;
	
	 public void creaHojaMem(String descripcionh) throws IOException, DocumentException {
		 
		 Calendar c = new GregorianCalendar();
		 	String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH));
			String annio = Integer.toString(c.get(Calendar.YEAR));
		   
	        Document document = new Document(PageSize.A4, 36, 72, 100, 50);
	        File fl = new File(String.valueOf(pathSalh) + "\\" + "\\"+descripcionh+"\\");
	        fl.mkdirs();
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fl+ "\\" + descripcionh + "_" + mes + dia + annio + ".pdf"));
	        document.open();
	       
	        PdfContentByte canvass = writer.getDirectContentUnder();
	        Image image = Image.getInstance("C:\\Desarrollos\\Workspace SP\\ARMADIG\\images\\hoja membretada1.png");
	        image.scaleAbsolute(PageSize.A4);
	        image.setAbsolutePosition(0, 0);
	        canvass.addImage(image);
	       
	        document.add(new Paragraph(HojaMem.getTextTaPrueba()));

	        document.close();
	    
	        System.out.println("Generación de hoja membretada");
	        //canvass.endText();
	    }


	 }


	
	
	

