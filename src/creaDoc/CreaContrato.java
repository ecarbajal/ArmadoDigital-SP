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

public class CreaContrato {

	public static final String plantilla = CtsArmado.pathJar + "Plantilla contratol.pdf";
	public static String pathSal = CtsArmado.pathSal;
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
	int ano = 0; 
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

	public CreaContrato(String empresal,String representall,String inotariall,String fechainl,String licenciafl,String notariopl,String npdel,String deledel,String comerdel,String folioml,String fechafml,String domiciliol,String rfcl,String fechacrl,String fechaal,String fechafcl,String montotl,String mensuall,String texto1l,String texto2l,String texto3l,String texto4l,String texto5l,String texto6l,String texto7l) {
			
	}

	public static void main(String empresal,String representall,String inotariall,String fechainl,String licenciafl,String notariopl,String npdel,String deledel,String comerdel,String folioml,String fechafml,String domiciliol,String rfcl,String fechacrl,String fechaal,String fechafcl,String montotl,String mensuall,String texto1l,String texto2l,String texto3l,String texto4l,String texto5l,String texto6l,String texto7l)  {
		try{
			CreaContrato ccn = new CreaContrato(empresal, representall, inotariall, fechainl, licenciafl, notariopl, npdel,deledel,comerdel,folioml,fechafml,domiciliol,rfcl,fechacrl,fechaal,fechafcl,montotl,mensuall, texto1l,texto2l,texto3l, texto4l, texto5l, texto6l, texto7l);	
			ccn.creaHoja(empresal, representall, inotariall, fechainl, licenciafl, notariopl, npdel,deledel,comerdel,folioml,fechafml,domiciliol,rfcl,fechacrl,fechaal,fechafcl,montotl,mensuall, texto1l, texto2l, texto3l, texto4l, texto5l, texto6l, texto7l);
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (DocumentException e) {			
			e.printStackTrace();
		}
	}

	 public void creaHoja(String empresal,String representall,String inotariall,String fechainl,String licenciafl,String notariopl,String npdel,String deledel,String comerdel,String folioml,String fechafml,String domiciliol,String rfcl,String fechacrl,String fechaal,String fechafcl,String montotl,String mensuall, String texto1l, String texto2l, String texto3l, String texto4l, String texto5l, String texto6l, String texto7l) throws IOException, DocumentException {
	        PdfStamper stamper = null;
	        PdfReader reader = new PdfReader("C:\\Armado Digital SP\\Images\\Plantilla Contratol.pdf");
	        Font Arial = new Font(Font.getFamily("Arial"), 10.0f);
	        Arial.setColor(23, 54, 93);
	        System.out.println("Cliente");
	        File fl = new File(String.valueOf(pathSal) + "\\" + "\\"+empresal+"\\");
	        fl.mkdirs();
	        stamper = new PdfStamper(reader, new FileOutputStream(fl+ "\\" + "Contrato" + "_" +"empresal" + ".pdf"));
	        Phrase phraset = null;
	        PdfContentByte canvas = stamper.getOverContent(1);
	        canvas.beginText();
	        largoArregloem =  empresal.length();
	        largoArreglorep = representall.length();
	        largoArregloin =  inotariall.length();
	        largoArreglofecin =  fechainl.length();
	        largoArreglolicf =  licenciafl.length();
	        largoArreglonop =  notariopl.length();
	        largoArreglonpd =  npdel.length();
	        largoArreglodel =  deledel.length();
	        largoArreglocom =  comerdel.length();
	        largoArreglofol =  folioml.length();
	        largoArreglofecfm =  fechafml.length();
	        largoArreglodom =  domiciliol.length();
	        largoArreglorfc =  rfcl.length();
	        largoArreglofeccr =  fechacrl.length();
	        largoArreglofecaa =  fechaal.length();
	        largoArreglofecfc =  fechafcl.length();
	        largoArreglomont =  montotl.length();
	        largoArreglomens =  mensuall.length();
	        largoArreglot1 =  texto1l.length();
	        largoArreglot2 =  texto2l.length();
	        largoArreglot3 =  texto3l.length();
	        largoArreglot4 =  texto4l.length();
	        largoArreglot5 =  texto5l.length();
	        largoArreglot6 =  texto6l.length();
	        largoArreglot7 =  texto7l.length();	        
	        Chunk c0empresa = new Chunk(empresal.substring(0, largoArregloem).trim(), Arial);		
	        Chunk c0represental = new Chunk(representall.substring(0, largoArreglorep).trim(), Arial);
	        Chunk c0inotarial = new Chunk(inotariall.substring(0, largoArregloin).trim(), Arial);	        
	        Chunk c0fechain = new Chunk(fechainl.substring(0, largoArreglofecin).trim(), Arial);  
	        Chunk c0licenciaf = new Chunk(licenciafl.substring(0, largoArreglolicf).trim(), Arial);
	        Chunk c0notariop = new Chunk(notariopl.substring(0, largoArreglonop).trim(), Arial);
	        Chunk c0npde = new Chunk(npdel.substring(0, largoArreglonpd).trim(), Arial);
	        Chunk c0delede = new Chunk(deledel.substring(0, largoArreglodel).trim(), Arial);
	        Chunk c0comerde = new Chunk(comerdel.substring(0, largoArreglocom).trim(), Arial);
	        Chunk c0foliom = new Chunk(folioml.substring(0, largoArreglofol).trim(), Arial);
	        Chunk c0fechafm = new Chunk(fechafml.substring(0, largoArreglofecfm).trim(), Arial);
	        Chunk c0domicilio = new Chunk(domiciliol.substring(0, largoArreglodom).trim(), Arial);        
	        Chunk c0rfc = new Chunk(rfcl.substring(0, largoArreglorfc).trim(), Arial);	
	        Chunk c0fechacr = new Chunk(fechacrl.substring(0, largoArreglofeccr).trim(), Arial);	
	        Chunk c0fechaa = new Chunk(fechaal.substring(0, largoArreglofecaa).trim(), Arial);	
	        Chunk c0fechafc = new Chunk(fechafcl.substring(0, largoArreglofecfc).trim(), Arial);	
	        Chunk c0montot = new Chunk(montotl.substring(0, largoArreglomont).trim(), Arial);	
	        Chunk c0mensual = new Chunk(mensuall.substring(0, largoArreglomens).trim(), Arial);		        
	        Chunk c0t1 = new Chunk(texto1l.substring(0, largoArreglot1).trim(), Arial);	
	        Chunk c0t2 = new Chunk(texto2l.substring(0, largoArreglot2).trim(), Arial);	
	        Chunk c0t3 = new Chunk(texto3l.substring(0, largoArreglot3).trim(), Arial);	
	        Chunk c0t4 = new Chunk(texto4l.substring(0, largoArreglot4).trim(), Arial);	
	        Chunk c0t5 = new Chunk(texto5l.substring(0, largoArreglot5).trim(), Arial);	
	        Chunk c0t6 = new Chunk(texto6l.substring(0, largoArreglot6).trim(), Arial);	
	        Chunk c0t7 = new Chunk(texto7l.substring(0, largoArreglot7).trim(), Arial);	 
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0empresa);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando empresa: " + phraset);
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0represental);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0represental: " + phraset);
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t1);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t1: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t2);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t2: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t3);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t3: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t4);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t4: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t5);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t5: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t6);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t6: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0t7);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0t7: " + phraset);
        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechaa);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechaa: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechacr);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechacr: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0inotarial);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0inotarial: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechain);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 70.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechain: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0licenciaf);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0licenciaf: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0delede);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0delede: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0notariop);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0notariop: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0npde);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0npde: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0comerde);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0comerde: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0foliom);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0foliom: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechafm);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 550.0f, 0.0f);
	        System.out.println("Generando c0fechafm: " + phraset);
        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0domicilio);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0domicilio: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0rfc);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0rfc: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0fechafc);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0fechafc: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0montot);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0montot: " + phraset);
	        
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0mensual);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando c0mensual: " + phraset);
	    
	        System.out.println("Se generó cotizacion: ");
	        canvas.endText();
	        stamper.close();
	    }
	 }
