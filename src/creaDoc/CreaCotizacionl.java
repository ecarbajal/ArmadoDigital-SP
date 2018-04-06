package creaDoc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import utils.CtsArmado;

public class CreaCotizacionl {

	public static final String plantilla = CtsArmado.pathJar + "Plantilla SP cotizacion Led.pdf";
	public static String pathSalled = CtsArmado.pathSalled;

	
	int contCar = 0;
	int largoArregl = 0;	
	int largoArreglodcl = 0;	
	int largoArreglodpl = 0;	
	int largoArreglobol = 0;	
	int largoArreglotl = 0;
	int largoArreglodel = 0;
	int largoArregloel = 0;	
	int largoArregloll = 0;	
	int largoArreglofl = 0;	
	int largoArreglocol = 0;	
	int largoArregloprl = 0;	
	int largoArreglodl = 0;	
	int largoArreglocal = 0;	
	int largoArreglopl = 0;	
	
	int largoArreglorel = 0;	
	int largoArreglodial = 0;	
	int largoArregloenl = 0;	
	int largoArreglosol= 0;	
	int largoArreglofdel = 0;	
	int largoArreglohdel = 0;	
	int largoArreglomol = 0;	
	int largoArregloevl = 0;	
	int largoArreglopul = 0;
	
	int largoArreglodil = 0;	
	int largoArregloprel = 0;
	int largoArreglocanl = 0;	
	int largoArreglounil = 0;	
	int largoArreglodesl = 0;
	int largoArreglocl = 0;
	int largoArregloul = 0;
	int largoArreglol = 0;
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


	public CreaCotizacionl(String clientel, int[] cantidadcl, String unidadcl[], int[] precioucl, String descripcioncl[], String contactol, String telefonol, String emaill,
			String lugarl, String fechal, int[] diascl, String descripcionevl, String boxl[],String domiciliorel,String domicilioenl,String fechasol,String fechadell,String horariodell,String diasmoll,String diasevl) {
			
	}





	public static void main(String clientel, int  cantidadcl[], String unidadcl[], int precioucl[], String descripcioncl[], String contactol, String telefonol, String emaill, String lugarl, String fechal, int diascl[], String descripcionevl, String boxl[],String domiciliorel,String domicilioenl,String fechasol,String fechadell,String horariodell,String diasmoll,String diasevl)  {
		
		try{
			
			CreaCotizacionl ccn = new CreaCotizacionl(clientel, cantidadcl, unidadcl, precioucl, descripcioncl, contactol, telefonol, emaill,lugarl,fechal,diascl,descripcionevl,boxl,domiciliorel,domicilioenl,fechasol,fechadell,horariodell,diasmoll,diasevl);	
			ccn.creaCotizaSPl(clientel, cantidadcl, unidadcl, precioucl, descripcioncl, contactol, telefonol, emaill,lugarl,fechal,diascl,descripcionevl,boxl,domiciliorel,domicilioenl,fechasol,fechadell,horariodell,diasmoll,diasevl);
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (DocumentException e) {			
			e.printStackTrace();
		}
	}


	 public void creaCotizaSPl(String clientel, int[] cantidadcl,  String unidadcl[], int[] precioucl, String[] descripcioncl, String contactol, String telefonol, String emaill, String lugarl, String fechal, int[] diascl, String descripcionevl, String[] boxl,String domiciliorel,String domicilioenl,String fechasol,String fechadell,String horariodell,String diasmoll,String diasevl) throws IOException, DocumentException {
		 
		 Calendar c = new GregorianCalendar();
			String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH));
			String annio = Integer.toString(c.get(Calendar.YEAR));
		    
	        PdfStamper stamper = null;
	        PdfReader reader = new PdfReader("C:\\Armado Digital SP\\Images\\Plantilla SP cotizacion Led.pdf");
	        Font Arial = new Font(Font.getFamily("Arial"), 10.0f);
	        Arial.setColor(23, 54, 93);
	        System.out.println("Cliente");
	        File fl = new File(String.valueOf(pathSalled) + "\\" + "\\"+clientel+"\\");
	        fl.mkdirs();	
	        stamper = new PdfStamper(reader, new FileOutputStream(fl+ "\\" + clientel + "_" + mes + dia + annio + ".pdf"));
	        Phrase phraset = null;
	        PdfContentByte canvas = stamper.getOverContent(1);
	        canvas.beginText();

//

	        largoArreglocl =  clientel.length();	 	 
	        largoArregloul =  unidadcl[0].length();	 
	        largoArreglotl =  telefonol.length();		
	        largoArreglocol =  contactol.length();
	        largoArregloel =  emaill.length();
//	        largoArreglocal =  cantidadcl[0].length();
//	        largoArreglodil =  diascl[0].length();
//	        largoArregloprl =  precioucl[0].length();
	        largoArreglodcl =  descripcioncl[0].length();
	        largoArreglosol =  fechasol.length();

	        
	        Chunk c0c = new Chunk(clientel.substring(0, largoArreglocl).trim(), Arial);		
	        Chunk c0d = new Chunk(descripcioncl[0].substring(0, largoArreglodcl).trim(), Arial);
	        Chunk c0u = new Chunk(unidadcl[0].substring(0, largoArregloul).trim(), Arial);	        
	        Chunk c0t = new Chunk(telefonol.substring(0, largoArreglotl).trim(), Arial);  
	        Chunk c0co = new Chunk(contactol.substring(0, largoArreglocol).trim(), Arial);
	        Chunk c0e = new Chunk(emaill.substring(0, largoArregloel).trim(), Arial);
	        
//	        Chunk c0ca = new Chunk(cantidadcl[0].substring(0, largoArreglocal).trim(), Arial);
//	        Chunk c0pr = new Chunk(precioucl[0].substring(0, largoArregloprl).trim(), Arial);
//	        Chunk c0di = new Chunk(diascl[0].substring(0, largoArreglodil).trim(), Arial);        
	        
     
	        Chunk c0so = new Chunk(fechasol.substring(0, largoArreglosol).trim(), Arial);	
	
	        
	        
	        
//	        descChuck[0] [195]     descripcion de producto 
	        
		       a =0;

	        Chunk descChuck[] = new Chunk[195];
	        
	    	while(descripcioncl[a] != null){	
	    		
	    		
	    	     largoArreglodpl =  descripcioncl[a].length();
	    		 descChuck[a-1]= new Chunk(descripcioncl[a].substring(0, largoArreglodpl).trim(), Arial); 
	    		 a++;
	    	}
	       
//	        descChuck[0] [195]     unidad 
	        
		       b =0;

	    	
	        Chunk unidChuck[] = new Chunk[195];
	        
	    	while(unidadcl[b] != null){	
	    		
	    		
	    	     largoArreglodpl =  unidadcl[b].length();
	    	     unidChuck[b-1]= new Chunk(unidadcl[b].substring(0, largoArreglodpl).trim(), Arial); 
	    		 b++;
	    	}
	        
//	        cantChuck[0] [195]     cantidad 
	        
		       ca =0;	  
 	
//	        Chunk cantChuck[] = new Chunk[195];
	        
//	    	while(cantidadcl[ca] != null){	
//	    		
//	    		
//	    	     largoArreglocanl =  cantidadcl[ca].length();
//	    	     cantChuck[ca-1]= new Chunk(cantidadcl[ca].substring(0, largoArreglocanl).trim(), Arial); 
//	    		 ca++;
//	    	}
	       
//	        cantChuck[0] [195]     preciounitario 
	        
		       d =0;	        
	    	
//	        Chunk precChuck[] = new Chunk[195];
	        
//	    	while(precioucl[d] != null){	
//	    		
//	    		
//	    	     largoArregloprel =  precioucl[d].length();
//	    	     precChuck[d-1]= new Chunk(precioucl[d].substring(0, largoArregloprel).trim(), Arial); 
//	    		 d++;
//	    	}
	       
//	       cantChuck[0] [195]     diasc 
	        
		       e =0;	        
	    	
//	        Chunk diasChuck[] = new Chunk[195];
	        
//	    	while(diascl[e] != null){	
//	    		
//	    		
//	    	     largoArreglodial =  diascl[e].length();
//	    	     diasChuck[e-1]= new Chunk(diascl[e].substring(0, largoArreglodial).trim(), Arial); 
//	    		 e++;
//	    	}
	        
///	        imprime en pdf
	        
	    
	            
	      
	 
	        Arial.setSize(11.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0c);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 20.0f, 650.0f, 0.0f);
	        System.out.println("Generando Cliente: " + phraset);
	
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0u);
	        ColumnText.showTextAligned(canvas, 0, phraset, 196.0f, 640.0f, 0.0f);
	        System.out.println("Generando unidad : " + phraset);
	 
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0t);
	        ColumnText.showTextAligned(canvas, 0, phraset, 123.0f, 630.0f, 0.0f);
	        System.out.println("Generando telefono : " + phraset);
	  
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0co);
	        ColumnText.showTextAligned(canvas, 0, phraset, 134.0f, 620.0f, 0.0f);
	        System.out.println("Generando contacto : " + phraset);
	
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0e);
	        ColumnText.showTextAligned(canvas, 0, phraset, 198.0f, 610.0f, 0.0f);
	        System.out.println("Generando email : " + phraset);
	
//	        
//	        Arial.setSize(10.0f);
//	        Arial.setStyle(0);
//	        phraset = new Phrase(c0ca);
//	        ColumnText.showTextAligned((PdfContentByte)canvas, (int)0, (Phrase)phraset, (float)187.0f, (float)600.0f, (float)0.0f);
//	        System.out.println("Generando cantidad : " + (Object)phraset);
//	
//	        
//	        Arial.setSize(10.0f);
//	        Arial.setStyle(0);
//	        phraset = new Phrase(c0pr);
//	        ColumnText.showTextAligned((PdfContentByte)canvas, (int)0, (Phrase)phraset, (float)156.0f, (float)590.0f, (float)0.0f);
//	        System.out.println("Generando precio : " + (Object)phraset);
//
//	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0d);
	        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 580.0f, 0.0f);
	        System.out.println("Generando descripcion de producto : " + phraset);
	
	        
//	        
//	        Arial.setSize(10.0f);
//	        Arial.setStyle(0);
//	        phraset = new Phrase(c0di);
//	        ColumnText.showTextAligned((PdfContentByte)canvas, (int)0, (Phrase)phraset, (float)134.0f, (float)550.0f, (float)0.0f);
//	        System.out.println("Generando dias : " + (Object)phraset);
//	 
//	     
	   
	    
	      
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0so);
	        ColumnText.showTextAligned(canvas, 0, phraset, 45.0f, 510.0f, 0.0f);
	        System.out.println("Generando fecha de solicitud : " + phraset);



	        
	        
	        
	        
	        
	        
	    
	        System.out.println("Se generó cotizacion: ");
	        canvas.endText();
	        stamper.close();
	    }


	 }


	
	
	

