package creaDoc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import utils.CtsArmado;

public class CreaContratosp {

	public static final String plantilla = CtsArmado.pathJar + "Plantilla contratosp.pdf";
	public static String pathSalSP = CtsArmado.pathSalSP;

	int largoArregloem = 0;	
	int largoArreglorep = 0;	
	int largoArregloino = 0;	
	int largoArreglofecin = 0;	
	int largoArreglolicf = 0;	
	int largoArreglonot = 0;	
	int largoArreglonp = 0;	
	int largoArreglodel = 0;	
	int largoArreglonpd = 0;	
	int largoArregloin = 0;	
	int largoArreglonop = 0;	
	int largoArreglocom = 0;	
	int largoArreglofol = 0;
	int largoArreglofecfm = 0;
	int largoArreglodom = 0;
	int largoArreglorfc = 0;
	int largoArreglofeccr = 0;
	int largoArreglofecaa = 0;
	int largoArreglomont = 0;
	int largoArreglomens = 0;
	int largoArreglofecfc = 0;
	
	int largoArreglot1 = 0;
	int largoArreglot2 = 0;
	int largoArreglot3 = 0;
	int largoArreglot4 = 0;
	int largoArreglot5 = 0;
	int largoArreglot6 = 0;
	int largoArreglot7 = 0;
	

	
	int Periodo = 0;
	double ComTotal = 0.00;
	String sComTotal = "";
	double ComPar=0.00;
	String sComPar= "";
	double PrimaNeta = 0.00;
	double Comision = 0.00;
	String poliza = "";
	String Pago = "";
	String sComision = "";
	String com2 = "";
	String com3 = "";
	String com4 = "";

	String[] descn= new String[200] ;
	int var = 0;
	int año = 0; 
	int mes = 0; 
	int dia = 0;
	int desc = 1;
	int llen = 1;
	int a = 1;
	int b = 1;
	int ca = 1;
	int d = 1;
	int e = 1;
	int f = 1;
	

	Chunk c1= null;
	Chunk c2= null;
	Chunk c3= null;		
	Chunk c4= null;
	Chunk c5= null;
	Chunk c6= null;
	Chunk c7= null;
	Chunk c8= null;
	Chunk c9= null;
	Chunk c10= null;		
	Chunk c11= null;
	Chunk c12= null;
	Chunk c13= null;
	Chunk c14= null;
	Chunk c15= null;
	Chunk c16= null;
	Chunk c17= null;		
	Chunk c18= null;
	Chunk c19= null;
	Chunk c20= null;
	Chunk c21= null;
	Chunk c22= null;
	Chunk c23= null;
	Chunk c24= null;		
	Chunk c25= null;
	Chunk c26= null;
	Chunk c27= null;
	Chunk c28= null;
	Chunk c29= null;
	Chunk c30= null;
	Chunk c31= null;		
	Chunk c32= null;
	Chunk c33= null;
	Chunk c34= null;
	Chunk c35= null;
	Chunk c36= null;
	Chunk c37= null;
	Chunk c38= null;


	public CreaContratosp(String empresalsp,String representallsp,String inotariallsp,String fechainlsp,String licenciaflsp,String notarioplsp,String npdelsp,String deledelsp,String comerdelsp,String foliomlsp,String fechafmlsp,String domiciliolsp,String rfclsp,String fechacrlsp,String fechaalsp,String fechafclsp,String montotlsp,String mensuallsp,String texto1lsp,String texto2lsp,String texto3lsp,String texto4lsp,String texto5lsp,String texto6lsp,String texto7lsp) {
			
	}





	public static void main(String empresalsp,String representallsp,String inotariallsp,String fechainlsp,String licenciaflsp,String notarioplsp,String npdelsp,String deledelsp,String comerdelsp,String foliomlsp,String fechafmlsp,String domiciliolsp,String rfclsp,String fechacrlsp,String fechaalsp,String fechafclsp,String montotlsp,String mensuallsp,String texto1lsp,String texto2lsp,String texto3lsp,String texto4lsp,String texto5lsp,String texto6lsp,String texto7lsp)  {
		
		try{
			
			CreaContratosp ccn = new CreaContratosp(empresalsp, representallsp, inotariallsp, fechainlsp, licenciaflsp, notarioplsp, npdelsp,deledelsp,comerdelsp,foliomlsp,fechafmlsp,domiciliolsp,rfclsp,fechacrlsp,fechaalsp,fechafclsp,montotlsp,mensuallsp, texto1lsp,texto2lsp,texto3lsp, texto4lsp, texto5lsp, texto6lsp, texto7lsp);	
			ccn.creaHoja(empresalsp, representallsp, inotariallsp, fechainlsp, licenciaflsp, notarioplsp, npdelsp,deledelsp,comerdelsp,foliomlsp,fechafmlsp,domiciliolsp,rfclsp,fechacrlsp,fechaalsp,fechafclsp,montotlsp,mensuallsp, texto1lsp, texto2lsp, texto3lsp, texto4lsp, texto5lsp, texto6lsp, texto7lsp);
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (DocumentException e) {			
			e.printStackTrace();
		}
	}


	 public void creaHoja(String empresalsp,String representallsp,String inotariallsp,String fechainlsp,String licenciaflsp,String notarioplsp,String npdelsp,String deledelsp,String comerdelsp,String foliomlsp,String fechafmlsp,String domiciliolsp,String rfclsp,String fechacrlsp,String fechaalsp,String fechafclsp,String montotlsp,String mensuallsp, String texto1lsp, String texto2lsp, String texto3lsp, String texto4lsp, String texto5lsp, String texto6lsp, String texto7lsp) throws IOException, DocumentException {
		 
//		 Calendar c = new GregorianCalendar();
//			String dia = Integer.toString(c.get(Calendar.DATE));
//			String mes = Integer.toString(c.get(Calendar.MONTH));
//			String annio = Integer.toString(c.get(Calendar.YEAR));
		    
	        PdfStamper stamper = null;
	        PdfReader reader = new PdfReader("C:\\Armado Digital SP\\Images\\Plantilla Contratosp.pdf");
	        Font Arial = new Font(Font.getFamily("Arial"), 10.0f);
	        Arial.setColor(23, 54, 93);
	        System.out.println("Cliente");
	        File fl = new File(String.valueOf(pathSalSP) + "\\" + "\\"+empresalsp+"\\");
	        fl.mkdirs();
	        stamper = new PdfStamper(reader, new FileOutputStream(fl+ "\\" + "Contrato" + "_" +"empresal" + ".pdf"));
	        Phrase phraset = null;
	        PdfContentByte canvas = stamper.getOverContent(1);
	        PdfContentByte canvas2 = stamper.getOverContent(2);
	        PdfContentByte canvas3 = stamper.getOverContent(3);
	        PdfContentByte canvas4 = stamper.getOverContent(4);
	        PdfContentByte canvas5 = stamper.getOverContent(5);
	        PdfContentByte canvas6 = stamper.getOverContent(6);
	        PdfContentByte canvas7 = stamper.getOverContent(7);
	        PdfContentByte canvas8 = stamper.getOverContent(8);
	        //PdfContentByte canvas9 = stamper.getOverContent(2);

	        canvas.beginText();
	        canvas2.beginText();
	        canvas3.beginText();
	        canvas4.beginText();
	        canvas5.beginText();
	        canvas6.beginText();
	        canvas7.beginText();
	        canvas8.beginText();
	        //canvas9.beginText();


//

	      
	        largoArregloem =  empresalsp.length();
	        largoArreglorep = representallsp.length();
	        largoArregloin =  inotariallsp.length();
	        largoArreglofecin =  fechainlsp.length();
	        largoArreglolicf =  licenciaflsp.length();
	        largoArreglonop =  notarioplsp.length();
	        largoArreglonpd =  npdelsp.length();
	        largoArreglodel =  deledelsp.length();
	        largoArreglocom =  comerdelsp.length();
	        largoArreglofol =  foliomlsp.length();
	        largoArreglofecfm =  fechafmlsp.length();
	        largoArreglodom =  domiciliolsp.length();
	        largoArreglorfc =  rfclsp.length();
	        largoArreglofeccr =  fechacrlsp.length();
	        largoArreglofecaa =  fechaalsp.length();
	        largoArreglofecfc =  fechafclsp.length();
	        largoArreglomont =  montotlsp.length();
	        largoArreglomens =  mensuallsp.length();
	        largoArreglot1 =  texto1lsp.length();
	        largoArreglot2 =  texto2lsp.length();
	        largoArreglot3 =  texto3lsp.length();
	        largoArreglot4 =  texto4lsp.length();
	        largoArreglot5 =  texto5lsp.length();
	        largoArreglot6 =  texto6lsp.length();
	        largoArreglot7 =  texto7lsp.length();
	       
	        
	        Chunk c0empresa = new Chunk(empresalsp.substring(0, largoArregloem).trim(), Arial);		
	        Chunk c0represental = new Chunk(representallsp.substring(0, largoArreglorep).trim(), Arial);
	        Chunk c0inotarial = new Chunk(inotariallsp.substring(0, largoArregloin).trim(), Arial);	        
	        Chunk c0fechain = new Chunk(fechainlsp.substring(0, largoArreglofecin).trim(), Arial);  
	        Chunk c0licenciaf = new Chunk(licenciaflsp.substring(0, largoArreglolicf).trim(), Arial);
	        Chunk c0notariop = new Chunk(notarioplsp.substring(0, largoArreglonop).trim(), Arial);
	        Chunk c0npde = new Chunk(npdelsp.substring(0, largoArreglonpd).trim(), Arial);
	        Chunk c0delede = new Chunk(deledelsp.substring(0, largoArreglodel).trim(), Arial);
	        Chunk c0comerde = new Chunk(comerdelsp.substring(0, largoArreglocom).trim(), Arial);
	        Chunk c0foliom = new Chunk(foliomlsp.substring(0, largoArreglofol).trim(), Arial);
	        Chunk c0fechafm = new Chunk(fechafmlsp.substring(0, largoArreglofecfm).trim(), Arial);
	        Chunk c0domicilio = new Chunk(domiciliolsp.substring(0, largoArreglodom).trim(), Arial);        
	        Chunk c0rfc = new Chunk(rfclsp.substring(0, largoArreglorfc).trim(), Arial);	
	        Chunk c0fechacr = new Chunk(fechacrlsp.substring(0, largoArreglofeccr).trim(), Arial);	
	        Chunk c0fechaa = new Chunk(fechaalsp.substring(0, largoArreglofecaa).trim(), Arial);	
	        Chunk c0fechafc = new Chunk(fechafclsp.substring(0, largoArreglofecfc).trim(), Arial);	
	        Chunk c0montot = new Chunk(montotlsp.substring(0, largoArreglomont).trim(), Arial);	
	        Chunk c0mensual = new Chunk(mensuallsp.substring(0, largoArreglomens).trim(), Arial);	
	        
	        Chunk c0t1 = new Chunk(texto1lsp.substring(0, largoArreglot1).trim(), Arial);	
	        Chunk c0t2 = new Chunk(texto2lsp.substring(0, largoArreglot2).trim(), Arial);	
	        Chunk c0t3 = new Chunk(texto3lsp.substring(0, largoArreglot3).trim(), Arial);	
	        Chunk c0t4 = new Chunk(texto4lsp.substring(0, largoArreglot4).trim(), Arial);	
	        Chunk c0t5 = new Chunk(texto5lsp.substring(0, largoArreglot5).trim(), Arial);	
	        Chunk c0t6 = new Chunk(texto6lsp.substring(0, largoArreglot6).trim(), Arial);	
	        Chunk c0t7 = new Chunk(texto7lsp.substring(0, largoArreglot7).trim(), Arial);	
	        
	       
	      
	 
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0empresa);	
	        ColumnText.showTextAligned(canvas, 50, phraset, 200.0f, 500.0f, 0.0f);
	        System.out.println("Generando empresa: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0represental);	
	        ColumnText.showTextAligned(canvas, 30, phraset, 150.0f, 500.0f, 0.0f);
	        System.out.println("Generando c0represental: " + phraset);
	     
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t1);	
	        ColumnText.showTextAligned(canvas2, 50, phraset, 200.0f, .0f, 0.0f);
	        System.out.println("Generando c0t1: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t2);	
	        ColumnText.showTextAligned(canvas2, 40, phraset, 250.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t2: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t3);	
	        ColumnText.showTextAligned(canvas2, 40, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t3: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t4);	
	        ColumnText.showTextAligned(canvas2, 10, phraset, 280.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t4: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t5);	
	        ColumnText.showTextAligned(canvas2, 20, phraset, 310.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t5: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t6);	
	        ColumnText.showTextAligned(canvas2, 40, phraset, 340.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t6: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t7);	
	        ColumnText.showTextAligned(canvas2, 50, phraset, 350.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t7: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechaa);	
	        ColumnText.showTextAligned(canvas2, 100, phraset, 360.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechaa: " + phraset);
	        
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechacr);	
	        ColumnText.showTextAligned(canvas2, 80, phraset, 380.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechacr: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0inotarial);	
	        ColumnText.showTextAligned(canvas2, 90, phraset, 400.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0inotarial: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechain);	
	        ColumnText.showTextAligned(canvas2, 40, phraset, 420.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechain: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0licenciaf);	
	        ColumnText.showTextAligned(canvas2, 65, phraset, 450.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0licenciaf: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0delede);	
	        ColumnText.showTextAligned(canvas2, 84, phraset, 480.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0delede: " + phraset);
	        
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0notariop);	
	        ColumnText.showTextAligned(canvas2, 46, phraset, 500.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0notariop: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0npde);	
	        ColumnText.showTextAligned(canvas2, 75, phraset, 520.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0npde: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0comerde);	
	        ColumnText.showTextAligned(canvas2, 35, phraset, 530.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0comerde: " + phraset);
	        
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0foliom);	
	        ColumnText.showTextAligned(canvas2, 56, phraset, 580.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0foliom: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechafm);	
	        ColumnText.showTextAligned(canvas2, 78, phraset, 570.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechafm: " + phraset);
	     
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0domicilio);	
	        ColumnText.showTextAligned(canvas2, 50, phraset, 600.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0domicilio: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0rfc);	
	        ColumnText.showTextAligned(canvas2, 40, phraset, 620.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0rfc: " + phraset);
	        
	      
	      
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechafc);	
	        ColumnText.showTextAligned(canvas2, 30, phraset, 650.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0fechafc: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0montot);	
	        ColumnText.showTextAligned(canvas2, 74, phraset, 680.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0montot: " + phraset);
	        
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0mensual);	
	        ColumnText.showTextAligned(canvas2, 85, phraset, 710.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0mensual: " + phraset);

	        
	        System.out.println("Se generó cotizacion: ");
	        canvas.endText();
	        canvas2.endText();
	        stamper.close();
	    }


	 }


	
	
	

