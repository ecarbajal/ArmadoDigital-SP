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

public class CreaCotizacion {

	
	public static final String plantilla = CtsArmado.pathJar + "Cotizacion SP 1.1.pdf";
	
	public static String pathSal = CtsArmado.pathSalSPC;

	
	int contCar = 0;
	int largoArreg = 0;	
	int largoArreglodc1 = 0;	
	int largoArreglofmon = 0;	
	int largoArreglogran = 0;	
	int largoArreglodp = 0;	
	int largoArreglobo = 0;	
	int largoArreglot = 0;
	int largoArreglode = 0;
	int largoArregloe = 0;	
	int largoArreglol = 0;	
	int largoArreglof = 0;	
	int largoArregloco = 0;	
	int largoArreglosub = 0;	
	int largoArreglopr = 0;	
	int largoArreglod = 0;	
	int largoArregloca = 0;	
	int largoArreglop = 0;	
	
	int largoArregloiva = 0;	
	int largoArreglou1 = 0;		 
	int largoArregloca1 =  0;	
	int largoArreglodi1 =  0;	
	int largoArreglopr1 =   0;	
	int largoArreglodc11 =  0;	
	int largoArreglodc21 =   0;	
	int largoArreglodc31 =  0;	
	int largoArreglocla1 =  0;	
	int largoArregloimpor1 =  0;	
	
	int largoArreglou2 = 0;		 
	int largoArregloca2 =  0;	
	int largoArreglodi2 =  0;	
	int largoArreglopr2 =   0;	
	int largoArreglodc12 =  0;	
	int largoArreglodc22 =   0;	
	int largoArreglodc32 =  0;	
	int largoArreglocla2 =  0;	
	int largoArregloimpor2 =  0;	
	
	int largoArreglou3 = 0;		 
	int largoArregloca3 =  0;	
	int largoArreglodi3 =  0;	
	int largoArreglopr3 =   0;	
	int largoArreglodc13 =  0;	
	int largoArreglodc23 =   0;	
	int largoArreglodc33 =  0;	
	int largoArreglocla3 =  0;	
	int largoArregloimpor3 =  0;	
	
	int largoArreglou4 = 0;		 
	int largoArregloca4 =  0;	
	int largoArreglodi4 =  0;	
	int largoArreglopr4 =   0;	
	int largoArreglodc14 =  0;	
	int largoArreglodc24 =   0;	
	int largoArreglodc34 =  0;	
	int largoArreglocla4 =  0;	
	int largoArregloimpor4 =  0;	
	
	int largoArreglou5 = 0;		 
	int largoArregloca5 =  0;	
	int largoArreglodi5 =  0;	
	int largoArreglopr5 =   0;	
	int largoArreglodc15 =  0;	
	int largoArreglodc25 =   0;	
	int largoArreglodc35 =  0;	
	int largoArreglocla5 =  0;	
	int largoArregloimpor5 =  0;	
	
	int largoArreglou6 = 0;		 
	int largoArregloca6 =  0;	
	int largoArreglodi6 =  0;	
	int largoArreglopr6 =   0;	
	int largoArreglodc16 =  0;	
	int largoArreglodc26 =   0;	
	int largoArreglodc36 =  0;	
	int largoArreglocla6 =  0;	
	int largoArregloimpor6 =  0;	
	
	int largoArreglou7 = 0;		 
	int largoArregloca7 =  0;	
	int largoArreglodi7 =  0;	
	int largoArreglopr7 =   0;	
	int largoArreglodc17 =  0;	
	int largoArreglodc27 =   0;	
	int largoArreglodc37 =  0;	
	int  largoArreglocla7 =  0;	
	int largoArregloimpor7 =  0;	
	
	int largoArreglou8 = 0;		 
	int  largoArregloca8 =  0;	
	int largoArreglodi8 =  0;	
	int  largoArreglopr8 =   0;	
    int  largoArreglodc18 =  0;	
    int  largoArreglodc28 =   0;	
    int  largoArreglodc38 =  0;	
    int   largoArreglocla8 =  0;	
    int largoArregloimpor8 =  0;	
	
    int largoArreglou9 = 0;		 
    int  largoArregloca9 =  0;	
    int  largoArreglodi9 =  0;	
    int  largoArreglopr9 =   0;	
    int   largoArreglodc19 =  0;	
    int  largoArreglodc29 =   0;	
    int largoArreglodc39 =  0;	
    int largoArreglocla9 =  0;	
    int largoArregloimpor9 =  0;	
	
    int largoArreglou10 = 0;		 
    int largoArregloca10 =  0;	
    int largoArreglodi10 =  0;	
    int largoArreglopr10 =   0;	
    int largoArreglodc110 =  0;	
    int  largoArreglodc210 =   0;	
    int largoArreglodc310 =  0;	
    int largoArreglocla10 =  0;	
    int largoArregloimpor10 =  0;	
	
    int largoArreglou11 = 0;		 
    int  largoArregloca11 =  0;	
    int  largoArreglodi11 =  0;	
    int largoArreglopr11 =   0;	
    int  largoArreglodc111 =  0;	
    int largoArreglodc211 =   0;	
    int  largoArreglodc311 =  0;	
    int  largoArreglocla11 =  0;	
    int largoArregloimpor11 =  0;	
	
    int largoArreglou12 = 0;		 
    int  largoArregloca12 =  0;	
    int largoArreglodi12 =  0;	
    int largoArreglopr12 =   0;	
    int  largoArreglodc112 =  0;	
    int  largoArreglodc212 =   0;	
    int  largoArreglodc312 =  0;	
    int largoArreglocla12 =  0;	
    int largoArregloimpor12 =  0;	
	
    int largoArreglou13 = 0;		 
    int  largoArregloca13 =  0;	
    int largoArreglodi13 =  0;	
    int largoArreglopr13 =   0;	
    int  largoArreglodc113 =  0;	
    int largoArreglodc213 =   0;	
    int  largoArreglodc313 =  0;	
    int  largoArreglocla13 =  0;	
    int largoArregloimpor13 =  0;	
	
    int largoArreglou14 = 0;		 
    int  largoArregloca14 =  0;	
    int  largoArreglodi14 =  0;	
    int largoArreglopr14 =   0;	
    int  largoArreglodc114 =  0;	
    int largoArreglodc214 =   0;	
    int largoArreglodc314 =  0;	
    int largoArreglocla14 =  0;	
    int largoArregloimpor14 =  0;	
	
	
    int largoArreglou15 = 0;		 
    int  largoArregloca15 =  0;	
    int  largoArreglodi15 =  0;	
    int largoArreglopr15 =   0;	
    int  largoArreglodc115 =  0;	
    int  largoArreglodc215 =   0;	
    int  largoArreglodc315 =  0;	
    int  largoArreglocla15 =  0;	
    int largoArregloimpor15 =  0;	
	
    int largoArreglou16 = 0;		 
    int  largoArregloca16 =  0;	
    int  largoArreglodi16 =  0;	
    int  largoArreglopr16 =   0;	
    int  largoArreglodc116 =  0;	
    int  largoArreglodc216 =   0;	
    int largoArreglodc316 =  0;	
    int  largoArreglocla16 =  0;	
    int largoArregloimpor16 =  0;	
    
    int largoArreglou17 = 0;		 
    int  largoArregloca17 =  0;	
    int  largoArreglodi17 =  0;	
    int  largoArreglopr17 =   0;	
    int  largoArreglodc117 =  0;	
    int  largoArreglodc217 =   0;	
    int largoArreglodc317 =  0;	
    int  largoArreglocla17 =  0;	
    int largoArregloimpor17 =  0;	
    
    int largoArreglou18 = 0;		 
    int  largoArregloca18 =  0;	
    int  largoArreglodi18 =  0;	
    int  largoArreglopr18 =   0;	
    int  largoArreglodc118 =  0;	
    int  largoArreglodc218 =   0;	
    int largoArreglodc318 =  0;	
    int  largoArreglocla18 =  0;	
    int largoArregloimpor18 =  0;	
    
    int largoArreglou19 = 0;		 
    int  largoArregloca19 =  0;	
    int  largoArreglodi19 =  0;	
    int  largoArreglopr19 =   0;	
    int  largoArreglodc119 =  0;	
    int  largoArreglodc219 =   0;	
    int largoArreglodc319 =  0;	
    int  largoArreglocla19 =  0;	
    int largoArregloimpor19 =  0;	
    
    int largoArreglou20 = 0;		 
    int  largoArregloca20 =  0;	
    int  largoArreglodi20 =  0;	
    int  largoArreglopr20 =   0;	
    int  largoArreglodc120 =  0;	
    int  largoArreglodc220 =   0;	
    int largoArreglodc320 =  0;	
    int  largoArreglocla20 =  0;	
    int largoArregloimpor20 =  0;	
    
    int largoArreglou21 = 0;		 
    int  largoArregloca21 =  0;	
    int  largoArreglodi21 =  0;	
    int  largoArreglopr21 =   0;	
    int  largoArreglodc121 =  0;	
    int  largoArreglodc221 =   0;	
    int largoArreglodc321 =  0;	
    int  largoArreglocla21 =  0;	
    int largoArregloimpor21 =  0;	
    
    int largoArreglou22 = 0;		 
    int  largoArregloca22 =  0;	
    int  largoArreglodi22 =  0;	
    int  largoArreglopr22 =   0;	
    int  largoArreglodc122 =  0;	
    int  largoArreglodc222 =   0;	
    int largoArreglodc322 =  0;	
    int  largoArreglocla22 =  0;	
    int largoArregloimpor22 =  0;	
    
    int largoArreglou23 = 0;		 
    int  largoArregloca23 =  0;	
    int  largoArreglodi23 =  0;	
    int  largoArreglopr23 =   0;	
    int  largoArreglodc123 =  0;	
    int  largoArreglodc223 =   0;	
    int largoArreglodc323 =  0;	
    int  largoArreglocla23 =  0;	
    int largoArregloimpor23 =  0;	
    
    int largoArreglou24 = 0;		 
    int  largoArregloca24 =  0;	
    int  largoArreglodi24 =  0;	
    int  largoArreglopr24 =   0;	
    int  largoArreglodc124 =  0;	
    int  largoArreglodc224 =   0;	
    int largoArreglodc324 =  0;	
    int  largoArreglocla24 =  0;	
    int largoArregloimpor24 =  0;	
	
    
	
	
	int largoArreglore = 0;	
	int largoArreglodia = 0;	
	int largoArregloen = 0;	
	int largoArreglodc2 = 0;	
	int largoArreglodc3 = 0;	
	int largoArregloso = 0;	
	int largoArreglofde = 0;	
	int largoArreglohde = 0;	
	int largoArreglohoe = 0;	
	int largoArreglocoti = 0;	
	int largoArreglomo = 0;	
	int largoArregloev = 0;	
	int largoArreglopu = 0;
	int largoArreglohdes = 0;	
	int largoArregloimpor = 0;	

	int largoArreglodi = 0;	
	int largoArreglopre = 0;
	int largoArreglocan = 0;	
	int largoArreglouni = 0;	
	int largoArreglodes = 0;
	int largoArreglocla = 0;
	int largoArreglohomo = 0;
	int largoArregloc = 0;
	int largoArreglou = 0;
	int largoArreglo = 0;
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
	String sig = "$";

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
	
	
	Chunk c0d12 =null;
	Chunk c0d22 =null;
	
	Chunk c0d13 =null;
	Chunk c0d23 =null;
	
	Chunk c0d14 =null;
	Chunk c0d24 =null;
	
	Chunk c0d15 =null;
	Chunk c0d25 =null;
	
	Chunk c0d16 =null;
	Chunk c0d26 =null;
	
	Chunk c0d17 =null;
	Chunk c0d27 =null;
	
	Chunk c0d18 =null;
	Chunk c0d28 =null;
	
	Chunk c0d19 =null;
	Chunk c0d29 =null;
	
	Chunk c0d110 =null;
	Chunk c0d210 =null;
	
	Chunk c0d111 =null;
	Chunk c0d211 =null;
	
	Chunk c0d112 =null;
	Chunk c0d212 =null;
	
	Chunk c0d113 =null;
	Chunk c0d213 =null;
	
	Chunk c0d114 =null;
	Chunk c0d214 =null;
	
	Chunk c0d115 =null;
	Chunk c0d215 =null;
	
	Chunk c0d116 =null;
	Chunk c0d216 =null;
	
	Chunk c0d117 =null;
	Chunk c0d217 =null;
	
	Chunk c0d118 =null;
	Chunk c0d218 =null;
	
	Chunk c0d119 =null;
	Chunk c0d219 =null;

	
	Chunk c0d120 =null;
	Chunk c0d220 =null;
	
	Chunk c0d121 =null;
	Chunk c0d221 =null;
	
	Chunk c0d122 =null;
	Chunk c0d222 =null;
	
	Chunk c0d123 =null;
	Chunk c0d223 =null;
	
	Chunk c0d124 =null;
	Chunk c0d224 =null;

	
	
//	Chunk c0d01 =null;
//	Chunk c0d01 =null;


	
	
	Chunk c0d01 =null;
	 Chunk c0d11 = null;
     Chunk c0d21 =null;
     Chunk c0d31 =null;
     Chunk c0u1 = null;        
     Chunk c0ca1 =null;
     Chunk c0pr1 = null;
     Chunk c0di1 = null;    
     Chunk c0cla1 = null;	
     Chunk c0import1 = null;	
     
     Chunk c0d02 = null;
     Chunk c0d32 =null;
     Chunk c0u2 = null;        
     Chunk c0ca2 =null;
     Chunk c0pr2 = null;
     Chunk c0di2 = null;    
     Chunk c0cla2 = null;	
     Chunk c0import2 = null;	
     
     Chunk c0d03 = null;
     Chunk c0d33 =null;
     Chunk c0u3 = null;        
     Chunk c0ca3 =null;
     Chunk c0pr3 = null;
     Chunk c0di3 = null;    
     Chunk c0cla3 = null;	
     Chunk c0import3 = null;	
     
     Chunk c0d04 = null;
     Chunk c0d34 =null;
     Chunk c0u4 = null;        
     Chunk c0ca4 =null;
     Chunk c0pr4 = null;
     Chunk c0di4 = null;    
     Chunk c0cla4 = null;	
     Chunk c0import4 = null;	
     
     Chunk c0d05 = null;
     Chunk c0d35 =null;
     Chunk c0u5 = null;        
     Chunk c0ca5 =null;
     Chunk c0pr5 = null;
     Chunk c0di5 = null;    
     Chunk c0cla5 = null;	
     Chunk c0import5 = null;	
     
     Chunk c0d06 = null;
     Chunk c0d36 =null;
     Chunk c0u6 = null;        
     Chunk c0ca6 =null;
     Chunk c0pr6 = null;
     Chunk c0di6 = null;    
     Chunk c0cla6 = null;	
     Chunk c0import6 = null;	
     
     Chunk c0d07 = null;
     Chunk c0d37 =null;
     Chunk c0u7 = null;        
     Chunk c0ca7 =null;
     Chunk c0pr7 = null;
     Chunk c0di7 = null;    
     Chunk c0cla7 = null;	
     Chunk c0import7 = null;	
     
     Chunk c0d08 = null;
     Chunk c0d38 =null;
     Chunk c0u8 = null;        
     Chunk c0ca8 =null;
     Chunk c0pr8 = null;
     Chunk c0di8 = null;    
     Chunk c0cla8 = null;	
     Chunk c0import8 = null;	
     
     Chunk c0d09 = null;
     Chunk c0d39 =null;
     Chunk c0u9 = null;        
     Chunk c0ca9 =null;
     Chunk c0pr9 = null;
     Chunk c0di9 = null;    
     Chunk c0cla9 = null;	
     Chunk c0import9 = null;	
     
     Chunk c0d010 = null;
     Chunk c0d310 =null;
     Chunk c0u10 = null;        
     Chunk c0ca10 =null;
     Chunk c0pr10 = null;
     Chunk c0di10 = null;    
     Chunk c0cla10 = null;	
     Chunk c0import10 = null;	
     
     Chunk c0d011 = null;
     Chunk c0d311 =null;
     Chunk c0u11 = null;        
     Chunk c0ca11 =null;
     Chunk c0pr11 = null;
     Chunk c0di11 = null;    
     Chunk c0cla11 = null;	
     Chunk c0import11 = null;	
     
     Chunk c0d012 = null;
     Chunk c0d312 =null;
     Chunk c0u12 = null;        
     Chunk c0ca12 =null;
     Chunk c0pr12 = null;
     Chunk c0di12 = null;    
     Chunk c0cla12 = null;	
     Chunk c0import12 = null;	
     
     Chunk c0d013 = null;
     Chunk c0d313 =null;
     Chunk c0u13 = null;        
     Chunk c0ca13 =null;
     Chunk c0pr13 = null;
     Chunk c0di13 = null;    
     Chunk c0cla13 = null;	
     Chunk c0import13 = null;	
     
     Chunk c0d014 = null;
     Chunk c0d314 =null;
     Chunk c0u14 = null;        
     Chunk c0ca14 =null;
     Chunk c0pr14 = null;
     Chunk c0di14 = null;    
     Chunk c0cla14 = null;	
     Chunk c0import14 = null;	
     
     Chunk c0d015 = null;
     Chunk c0d315 =null;
     Chunk c0u15 = null;        
     Chunk c0ca15 =null;
     Chunk c0pr15 = null;
     Chunk c0di15 = null;    
     Chunk c0cla15 = null;	
     Chunk c0import15 = null;	
     
     Chunk c0d016 = null;
     Chunk c0d316 =null;
     Chunk c0u16 = null;        
     Chunk c0ca16 =null;
     Chunk c0pr16 = null;
     Chunk c0di16 = null;    
     Chunk c0cla16 = null;	
     Chunk c0import16 = null;	
     
     Chunk c0d017 = null;
     Chunk c0d317 =null;
     Chunk c0u17 = null;        
     Chunk c0ca17 =null;
     Chunk c0pr17 = null;
     Chunk c0di17 = null;    
     Chunk c0cla17 = null;	
     Chunk c0import17 = null;	
     
     Chunk c0d018 = null;
     Chunk c0d318 =null;
     Chunk c0u18 = null;        
     Chunk c0ca18 =null;
     Chunk c0pr18 = null;
     Chunk c0di18 = null;    
     Chunk c0cla18 = null;	
     Chunk c0import18 = null;	
     
     Chunk c0d019 = null;
     Chunk c0d319 = null;
     Chunk c0u19 = null;        
     Chunk c0ca19 = null;
     Chunk c0pr19 = null;
     Chunk c0di19 = null;    
     Chunk c0cla19 = null;	
     Chunk c0import19 = null;	
     
     Chunk c0d020 = null;
     Chunk c0d320 =null;
     Chunk c0u20 = null;        
     Chunk c0ca20 =null;
     Chunk c0pr20 = null;
     Chunk c0di20 = null;    
     Chunk c0cla20 = null;	
     Chunk c0import20 = null;	
     
     Chunk c0d021 = null;
     Chunk c0d321 =null;
     Chunk c0u21 = null;        
     Chunk c0ca21 =null;
     Chunk c0pr21 = null;
     Chunk c0di21 = null;    
     Chunk c0cla21 = null;	
     Chunk c0import21 = null;	
     
     Chunk c0d022 = null;
     Chunk c0d322 =null;
     Chunk c0u22 = null;        
     Chunk c0ca22 =null;
     Chunk c0pr22 = null;
     Chunk c0di22 = null;    
     Chunk c0cla22 = null;	
     Chunk c0import22 = null;	
     
     Chunk c0d023 = null;
     Chunk c0d323 =null;
     Chunk c0u23 = null;        
     Chunk c0ca23 =null;
     Chunk c0pr23 = null;
     Chunk c0di23 = null;    
     Chunk c0cla23 = null;	
     Chunk c0import23 = null;	
     
     Chunk c0d024 = null;
     Chunk c0d324 =null;
     Chunk c0u24 = null;        
     Chunk c0ca24 =null;
     Chunk c0pr24 = null;
     Chunk c0di24 = null;    
     Chunk c0cla24 = null;	
     Chunk c0import24 = null;
     
    
     
     
	


	public CreaCotizacion(String cliente, String cantidadc[], String unidadc[], String[] preciouc, String descripcionc[], String contacto, 
			String telefono, String email,String lugar, String fecha, String[] diasc, String descripcionev, String box[],String fechaso,
			String fechade,String horariode,String diasmo,String diasev, String  clacificacion [], String  fecmonta,String horades,
			String horariose, String horariodesm, String horariomont, String cotizacion, String importec [], String[] descripcionc0, 
			String[] descripcionc3, int agrega, String subtotalc, String grantotalc, String iva16c) {
			
	}

	public static void prueba(String cliente, String  cantidadc[], String unidadc [], String preciouc[], String descripcionc[], String contacto, String telefono, String email, String lugar, String fecha, String diasc[], String descripcionev, String box[],String fechaso,String fechade,String horariode,String diasmo,String diasev, String clacificacion[], String  fecmonta,String horades,String horariose,String horariodesm, String horariomont, String cotizacion,String importec [], String[] descripcionc0, String[] descripcionc3,int agrega, String subtotalc,String grantotalc,String iva16c)  {
		try{			
			CreaCotizacion ccn = new CreaCotizacion(cliente, cantidadc, unidadc, preciouc, descripcionc, contacto, telefono, email,lugar,fecha,diasc,descripcionev,box,fechaso,fechade,horariode,diasmo,diasev,clacificacion,fecmonta,horades, horariose,horariodesm,horariomont,cotizacion,importec,descripcionc0,descripcionc3,agrega,subtotalc,grantotalc,iva16c);	
			ccn.creaCotizaSP(cliente, cantidadc, unidadc, preciouc, descripcionc, contacto, telefono, email,lugar,fecha,diasc,descripcionev,box,fechaso,fechade,horariode,diasmo,diasev,clacificacion,fecmonta,horades,horariose,horariodesm,horariomont,cotizacion,importec,descripcionc0,descripcionc3,agrega,subtotalc,grantotalc,iva16c);
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (DocumentException e) {			
			e.printStackTrace();
		}
	}


	 public void creaCotizaSP(String cliente, String[] cantidadc,  String unidadc[], String[] preciouc, String[] descripcionc, 
			 String contacto, String telefono, String email, String lugar, String fecha, String[] diasc, String descripcionev, 
			 String[] box,String fechaso,String fechade,String horariode,String diasmo,String diasev, String clacificacion [], 
			 String fecmonta, String horades, String horariose, String horariodesm, String horariomont, String cotizacion, 
			 String[] importec, String[] descripcionc0, String[] descripcionc3, int agrega, String subtotalc, String grantotalc, 
			 String iva16c) throws IOException, DocumentException {
		 
		 	Calendar c = new GregorianCalendar();
			String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH));
			String annio = Integer.toString(c.get(Calendar.YEAR));
		    
	        PdfStamper stamper = null;
	        
	  
	        PdfReader reader = new PdfReader("C:\\Armado Digital SP\\Images\\Cotizacion SP 1.1.pdf");
	        Font Arial = new Font(Font.getFamily("Arial"), 10.0f);
	        Arial.setColor(23, 54, 93);
	        System.out.println("Cliente");
	        File fl = new File(String.valueOf(pathSal) + "\\" + "\\"+cliente+"\\");
	        fl.mkdirs();
	        stamper = new PdfStamper(reader, new FileOutputStream(fl+ "\\" + cliente + "_" + mes + "-" + dia+ "-"  + annio + ".pdf"));
	        Phrase phraset = null;
	        PdfContentByte canvas = stamper.getOverContent(1);
	        canvas.beginText();
	        


//

	        largoArregloc =  cliente.length();	 	 
	        largoArreglou =  unidadc[0].length();	 
	        largoArreglot =  telefono.length();	 	
	        largoArregloco =  contacto.length();
	        largoArregloe =  email.length();
	        largoArregloca =  cantidadc[0].length();
	        largoArreglol =  lugar.length();
	        largoArreglof =  fecha.length();
	        largoArreglode =  descripcionev.length();
	        largoArreglodi =  diasc[0].length();
	        largoArreglopr =  preciouc[0].length();
	        largoArreglodc1 =  descripcionc[0].length();
	        largoArreglodc2 =  descripcionc0[0].length();
	        largoArreglodc3 =  descripcionc3[0].length();
	        largoArreglofmon =  fecmonta.length();	 	 
	        largoArreglohoe =  horariose.length();	 	 
	        largoArreglocla =  clacificacion[0].length();
	        largoArreglosub =  subtotalc.length();	        
	        largoArregloiva =  iva16c.length();	        
	        largoArregloso =  fechaso.length();
	        largoArreglofde =  fechade.length();
	        largoArreglohde =  horariode.length();
	        largoArreglomo =  diasmo.length();
	        largoArregloev =  diasev.length();
	        largoArreglohdes =  horades.length();
	        largoArreglohomo =  horariomont.length();
	        largoArreglocoti =  cotizacion.length();
	        largoArregloimpor =  importec[0].length();
	        largoArreglogran =  grantotalc.length();

	        
	        Chunk c0c = new Chunk(cliente.substring(0, largoArregloc).trim(), Arial);		
	        Chunk c0d1 = new Chunk(descripcionc[0].substring(0, largoArreglodc1).trim(), Arial);
	        Chunk c0d2 = new Chunk(descripcionc0[0].substring(0, largoArreglodc2).trim(), Arial);
	        Chunk c0d3 = new Chunk(descripcionc3[0].substring(0, largoArreglodc3).trim(), Arial);
	        Chunk c0u = new Chunk(unidadc[0].substring(0, largoArreglou).trim(), Arial);	        
	        Chunk c0t = new Chunk(telefono.substring(0, largoArreglot).trim(), Arial);  
	        Chunk c0co = new Chunk(contacto.substring(0, largoArregloco).trim(), Arial);
	        Chunk c0e = new Chunk(email.substring(0, largoArregloe).trim(), Arial);
	        Chunk c0ca = new Chunk(cantidadc[0].substring(0, largoArregloca).trim(), Arial);
	        Chunk c0pr = new Chunk("$  " + preciouc[0].substring(0, largoArreglopr).trim(), Arial);
	        Chunk c0l = new Chunk(lugar.substring(0, largoArreglol).trim(), Arial);
	        Chunk c0f = new Chunk(fecha.substring(0, largoArreglof).trim(), Arial);
	        Chunk c0de = new Chunk(descripcionev.substring(0, largoArreglode).trim(), Arial);
	        Chunk c0di = new Chunk(diasc[0].substring(0, largoArreglodi).trim(), Arial);        
	        Chunk c0iva = new Chunk("$  " + iva16c.substring(0, largoArregloiva).trim(), Arial);        
	        Chunk c0so = new Chunk(fechaso.substring(0, largoArregloso).trim(), Arial);	
	        Chunk c0fde = new Chunk(fechade.substring(0, largoArreglofde).trim(), Arial);	
	        Chunk c0mo = new Chunk(diasmo.substring(0, largoArreglomo).trim(), Arial);	
	        Chunk c0ev = new Chunk(diasev.substring(0, largoArregloev).trim(), Arial);	
	        Chunk c0dfm = new Chunk(fecmonta.substring(0, largoArreglofmon).trim(), Arial);	
	        Chunk c0cla = new Chunk(clacificacion[0].substring(0, largoArreglocla).trim(), Arial);	
	        Chunk c0hdes = new Chunk(horades.substring(0, largoArreglohdes).trim(), Arial);	
	        Chunk c0hoe = new Chunk(horariose.substring(0, largoArreglohoe).trim(), Arial);	
	        Chunk c0homo = new Chunk(horariomont.substring(0, largoArreglohomo).trim(), Arial);	
	        Chunk c0coti = new Chunk(cotizacion.substring(0, largoArreglocoti).trim(), Arial);		        
	        Chunk c0import = new Chunk("$  " + importec[0].substring(0, largoArregloimpor).trim(), Arial);		
	        Chunk c0sub = new Chunk("$  " + subtotalc.substring(0, largoArreglosub).trim(), Arial);		
	        Chunk c0gran = new Chunk("$  " + grantotalc.substring(0, largoArreglogran).trim(), Arial);		

	        ////importe
	        
	      
	        
	        /////  linea 2
	        
	        
	        if (agrega > 2 || agrega == 2) { 
	        
	 	        largoArreglou1 =  unidadc[1].length();	 
	 	        largoArregloca1 =  cantidadc[1].length();
	 	        largoArreglodi1 =  diasc[1].length();
	 	        largoArreglopr1 =  preciouc[1].length();
	 	        largoArreglodc11 =  descripcionc[1].length();
	 	        largoArreglodc21 =  descripcionc0[1].length();
	 	        largoArreglodc31 =  descripcionc3[1].length();
	 	        largoArreglocla1 =  clacificacion[1].length();
	 	 	    largoArregloimpor1 =  importec[1].length();
	 	 	    
		        c0d11 = new Chunk(descripcionc[1].substring(0, largoArreglodc11).trim(), Arial);
		        c0d21 = new Chunk(descripcionc0[1].substring(0, largoArreglodc21).trim(), Arial);
		        c0d31 = new Chunk(descripcionc3[1].substring(0, largoArreglodc31).trim(), Arial);
		        c0u1 = new Chunk(unidadc[1].substring(0, largoArreglou1).trim(), Arial);	        
		        c0ca1 = new Chunk(cantidadc[1].substring(0, largoArregloca1).trim(), Arial);
		        c0pr1 = new Chunk(preciouc[1].substring(0, largoArreglopr1).trim(), Arial);
		        c0di1 = new Chunk(diasc[1].substring(0, largoArreglodi1).trim(), Arial);        
		        c0cla1 = new Chunk(clacificacion[1].substring(0, largoArreglocla1).trim(), Arial);	
		        c0import1 = new Chunk(importec[1].substring(0, largoArregloimpor1).trim(), Arial);		
	 	        
	        	

	        }
	        
	        /////  linea 3

	        
	        if (agrega > 3 || agrega == 3  ) { 
		        
	 	        largoArreglou2 =  unidadc[2].length();	 
	 	        largoArregloca2 =  cantidadc[2].length();
	 	        largoArreglodi2 =  diasc[2].length();
	 	        largoArreglopr2 =  preciouc[2].length();
	 	        largoArreglodc12 =  descripcionc[2].length();
	 	        largoArreglodc22 =  descripcionc0[2].length();
	 	        largoArreglodc32 =  descripcionc3[2].length();
	 	        largoArreglocla2 =  clacificacion[2].length();
	 	 	    largoArregloimpor2 =  importec[2].length();
	 	 	    
		        c0d12 = new Chunk(descripcionc[2].substring(0, largoArreglodc12).trim(), Arial);
		        c0d22 = new Chunk(descripcionc0[2].substring(0, largoArreglodc22).trim(), Arial);
		        c0d32 = new Chunk(descripcionc3[2].substring(0, largoArreglodc32).trim(), Arial);
		        c0u2 = new Chunk(unidadc[2].substring(0, largoArreglou2).trim(), Arial);	        
		        c0ca2 = new Chunk(cantidadc[2].substring(0, largoArregloca2).trim(), Arial);
		        c0pr2 = new Chunk(preciouc[2].substring(0, largoArreglopr2).trim(), Arial);
		        c0di2 = new Chunk(diasc[2].substring(0, largoArreglodi2).trim(), Arial);        
		        c0cla2 = new Chunk(clacificacion[2].substring(0, largoArreglocla2).trim(), Arial);	
		        c0import2 = new Chunk(importec[2].substring(0, largoArregloimpor2).trim(), Arial);		
	 	        
	        	

	        }
	        
	        /////  linea 4

	        
	        if (agrega > 4 || agrega == 4 ) { 
		        
	 	        largoArreglou3 =  unidadc[3].length();	 
	 	        largoArregloca3 =  cantidadc[3].length();
	 	        largoArreglodi3 =  diasc[3].length();
	 	        largoArreglopr3 =  preciouc[3].length();
	 	        largoArreglodc13 =  descripcionc[3].length();
	 	        largoArreglodc23 =  descripcionc0[3].length();
	 	        largoArreglodc33 =  descripcionc3[3].length();
	 	        largoArreglocla3 =  clacificacion[3].length();
	 	 	    largoArregloimpor3 =  importec[3].length();
	 	 	    
		        c0d13 = new Chunk(descripcionc[3].substring(0, largoArreglodc13).trim(), Arial);
		        c0d23 = new Chunk(descripcionc0[3].substring(0, largoArreglodc23).trim(), Arial);
		        c0d33 = new Chunk(descripcionc3[3].substring(0, largoArreglodc33).trim(), Arial);
		        c0u3 = new Chunk(unidadc[3].substring(0, largoArreglou3).trim(), Arial);	        
		        c0ca3 = new Chunk(cantidadc[3].substring(0, largoArregloca3).trim(), Arial);
		        c0pr3 = new Chunk(preciouc[3].substring(0, largoArreglopr3).trim(), Arial);
		        c0di3 = new Chunk(diasc[3].substring(0, largoArreglodi3).trim(), Arial);        
		        c0cla3 = new Chunk(clacificacion[3].substring(0, largoArreglocla3).trim(), Arial);	
		        c0import3 = new Chunk(importec[3].substring(0, largoArregloimpor3).trim(), Arial);		
	 	        
	        	

	        }
	        
	        /////  linea 5

	        
	        if (agrega > 5 || agrega == 5 ) { 
		        
	 	        largoArreglou4 =  unidadc[4].length();	 
	 	        largoArregloca4 =  cantidadc[4].length();
	 	        largoArreglodi4 =  diasc[4].length();
	 	        largoArreglopr4 =  preciouc[4].length();
	 	        largoArreglodc14 =  descripcionc[4].length();
	 	        largoArreglodc24 =  descripcionc0[4].length();
	 	        largoArreglodc34 =  descripcionc3[4].length();
	 	        largoArreglocla4 =  clacificacion[4].length();
	 	 	    largoArregloimpor4 =  importec[4].length();
	 	 	    
		        c0d14 = new Chunk(descripcionc[4].substring(0, largoArreglodc14).trim(), Arial);
		        c0d24 = new Chunk(descripcionc0[4].substring(0, largoArreglodc24).trim(), Arial);
		        c0d34 = new Chunk(descripcionc3[4].substring(0, largoArreglodc34).trim(), Arial);
		        c0u4 = new Chunk(unidadc[4].substring(0, largoArreglou4).trim(), Arial);	        
		        c0ca4 = new Chunk(cantidadc[4].substring(0, largoArregloca4).trim(), Arial);
		        c0pr4 = new Chunk(preciouc[4].substring(0, largoArreglopr4).trim(), Arial);
		        c0di4 = new Chunk(diasc[4].substring(0, largoArreglodi4).trim(), Arial);        
		        c0cla4 = new Chunk(clacificacion[4].substring(0, largoArreglocla4).trim(), Arial);	
		        c0import4 = new Chunk(importec[4].substring(0, largoArregloimpor4).trim(), Arial);		
	 	        
	        	

	        }
	        
	        /////  linea 6

	        
	        if (agrega > 6  || agrega == 6 ) { 
		        
	 	        largoArreglou5 =  unidadc[5].length();	 
	 	        largoArregloca5 =  cantidadc[5].length();
	 	        largoArreglodi5 =  diasc[5].length();
	 	        largoArreglopr5 =  preciouc[5].length();
	 	        largoArreglodc15 =  descripcionc[5].length();
	 	        largoArreglodc25 =  descripcionc0[5].length();
	 	        largoArreglodc35 =  descripcionc3[5].length();
	 	        largoArreglocla5 =  clacificacion[5].length();
	 	 	    largoArregloimpor5 =  importec[5].length();
	 	 	    
		        c0d15 = new Chunk(descripcionc[5].substring(0, largoArreglodc15).trim(), Arial);
		        c0d25 = new Chunk(descripcionc0[5].substring(0, largoArreglodc25).trim(), Arial);
		        c0d35 = new Chunk(descripcionc3[5].substring(0, largoArreglodc35).trim(), Arial);
		        c0u5 = new Chunk(unidadc[5].substring(0, largoArreglou5).trim(), Arial);	        
		        c0ca5 = new Chunk(cantidadc[5].substring(0, largoArregloca5).trim(), Arial);
		        c0pr5 = new Chunk(preciouc[5].substring(0, largoArreglopr5).trim(), Arial);
		        c0di5 = new Chunk(diasc[5].substring(0, largoArreglodi5).trim(), Arial);        
		        c0cla5 = new Chunk(clacificacion[5].substring(0, largoArreglocla5).trim(), Arial);	
		        c0import5 = new Chunk(importec[5].substring(0, largoArregloimpor5).trim(), Arial);		
	 	        
	        	

	        }
	        
	        
	        if (agrega > 7 || agrega == 7  ) { 
		        
	 	        largoArreglou6 =  unidadc[6].length();	 
	 	        largoArregloca6 =  cantidadc[6].length();
	 	        largoArreglodi6 =  diasc[6].length();
	 	        largoArreglopr6 =  preciouc[6].length();
	 	        largoArreglodc16 =  descripcionc[6].length();
	 	        largoArreglodc26 =  descripcionc0[6].length();
	 	        largoArreglodc36 =  descripcionc3[6].length();
	 	        largoArreglocla6 =  clacificacion[6].length();
	 	 	    largoArregloimpor6 =  importec[6].length();
	 	 	    
		        c0d16 = new Chunk(descripcionc[6].substring(0, largoArreglodc16).trim(), Arial);
		        c0d26 = new Chunk(descripcionc0[6].substring(0, largoArreglodc26).trim(), Arial);
		        c0d36 = new Chunk(descripcionc3[6].substring(0, largoArreglodc36).trim(), Arial);
		        c0u6 = new Chunk(unidadc[6].substring(0, largoArreglou6).trim(), Arial);	        
		        c0ca6 = new Chunk(cantidadc[6].substring(0, largoArregloca6).trim(), Arial);
		        c0pr6 = new Chunk(preciouc[6].substring(0, largoArreglopr6).trim(), Arial);
		        c0di6 = new Chunk(diasc[6].substring(0, largoArreglodi6).trim(), Arial);        
		        c0cla6 = new Chunk(clacificacion[6].substring(0, largoArreglocla6).trim(), Arial);	
		        c0import6 = new Chunk(importec[6].substring(0, largoArregloimpor6).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 8  || agrega == 8 ) { 
		        
	 	        largoArreglou7 =  unidadc[7].length();	 
	 	        largoArregloca7 =  cantidadc[7].length();
	 	        largoArreglodi7 =  diasc[7].length();
	 	        largoArreglopr7 =  preciouc[7].length();
	 	        largoArreglodc17 =  descripcionc[7].length();
	 	        largoArreglodc27 =  descripcionc0[7].length();
	 	        largoArreglodc37 =  descripcionc3[7].length();
	 	        largoArreglocla7 =  clacificacion[7].length();
	 	 	    largoArregloimpor7 =  importec[7].length();
	 	 	    
		        c0d17 = new Chunk(descripcionc[7].substring(0, largoArreglodc17).trim(), Arial);
		        c0d27 = new Chunk(descripcionc0[7].substring(0, largoArreglodc27).trim(), Arial);
		        c0d37 = new Chunk(descripcionc3[7].substring(0, largoArreglodc37).trim(), Arial);
		        c0u7 = new Chunk(unidadc[7].substring(0, largoArreglou7).trim(), Arial);	        
		        c0ca7 = new Chunk(cantidadc[7].substring(0, largoArregloca7).trim(), Arial);
		        c0pr7 = new Chunk(preciouc[7].substring(0, largoArreglopr7).trim(), Arial);
		        c0di7 = new Chunk(diasc[7].substring(0, largoArreglodi7).trim(), Arial);        
		        c0cla7 = new Chunk(clacificacion[7].substring(0, largoArreglocla7).trim(), Arial);	
		        c0import7 = new Chunk(importec[7].substring(0, largoArregloimpor7).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 9 || agrega == 9) { 
		        
	 	        largoArreglou8 =  unidadc[8].length();	 
	 	        largoArregloca8 =  cantidadc[8].length();
	 	        largoArreglodi8 =  diasc[8].length();
	 	        largoArreglopr8 =  preciouc[8].length();
	 	        largoArreglodc18 =  descripcionc[8].length();
	 	        largoArreglodc28 =  descripcionc0[8].length();
	 	        largoArreglodc38 =  descripcionc3[8].length();
	 	        largoArreglocla8 =  clacificacion[8].length();
	 	 	    largoArregloimpor8 =  importec[8].length();
	 	 	    
		        c0d18 = new Chunk(descripcionc[8].substring(0, largoArreglodc18).trim(), Arial);
		        c0d28 = new Chunk(descripcionc0[8].substring(0, largoArreglodc28).trim(), Arial);
		        c0d38 = new Chunk(descripcionc3[8].substring(0, largoArreglodc38).trim(), Arial);
		        c0u8 = new Chunk(unidadc[8].substring(0, largoArreglou8).trim(), Arial);	        
		        c0ca8 = new Chunk(cantidadc[8].substring(0, largoArregloca8).trim(), Arial);
		        c0pr8 = new Chunk(preciouc[8].substring(0, largoArreglopr8).trim(), Arial);
		        c0di8 = new Chunk(diasc[8].substring(0, largoArreglodi8).trim(), Arial);        
		        c0cla8 = new Chunk(clacificacion[8].substring(0, largoArreglocla8).trim(), Arial);	
		        c0import8 = new Chunk(importec[8].substring(0, largoArregloimpor8).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 10 || agrega == 10) { 
		        
	 	        largoArreglou9 =  unidadc[9].length();	 
	 	        largoArregloca9 =  cantidadc[9].length();
	 	        largoArreglodi9 =  diasc[9].length();
	 	        largoArreglopr9 =  preciouc[9].length();
	 	        largoArreglodc19 =  descripcionc[9].length();
	 	        largoArreglodc29 =  descripcionc0[9].length();
	 	        largoArreglodc39 =  descripcionc3[9].length();
	 	        largoArreglocla9 =  clacificacion[9].length();
	 	 	    largoArregloimpor9 =  importec[9].length();
	 	 	    
		        c0d19 = new Chunk(descripcionc[9].substring(0, largoArreglodc19).trim(), Arial);
		        c0d29 = new Chunk(descripcionc0[9].substring(0, largoArreglodc29).trim(), Arial);
		        c0d39 = new Chunk(descripcionc3[9].substring(0, largoArreglodc39).trim(), Arial);
		        c0u9 = new Chunk(unidadc[9].substring(0, largoArreglou9).trim(), Arial);	        
		        c0ca9 = new Chunk(cantidadc[9].substring(0, largoArregloca9).trim(), Arial);
		        c0pr9 = new Chunk(preciouc[9].substring(0, largoArreglopr9).trim(), Arial);
		        c0di9 = new Chunk(diasc[9].substring(0, largoArreglodi9).trim(), Arial);        
		        c0cla9 = new Chunk(clacificacion[9].substring(0, largoArreglocla9).trim(), Arial);	
		        c0import9 = new Chunk(importec[9].substring(0, largoArregloimpor9).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 11 || agrega == 11 ) { 
		        
	 	        largoArreglou10 =  unidadc[10].length();	 
	 	        largoArregloca10 =  cantidadc[10].length();
	 	        largoArreglodi10 =  diasc[10].length();
	 	        largoArreglopr10 =  preciouc[10].length();
	 	        largoArreglodc110 =  descripcionc[10].length();
	 	        largoArreglodc210 =  descripcionc0[10].length();
	 	        largoArreglodc310 =  descripcionc3[10].length();
	 	        largoArreglocla10 =  clacificacion[10].length();
	 	 	    largoArregloimpor10 =  importec[10].length();
	 	 	    
		        c0d110 = new Chunk(descripcionc[10].substring(0, largoArreglodc110).trim(), Arial);
		        c0d210 = new Chunk(descripcionc0[10].substring(0, largoArreglodc210).trim(), Arial);
		        c0d310 = new Chunk(descripcionc3[10].substring(0, largoArreglodc310).trim(), Arial);
		        c0u10 = new Chunk(unidadc[10].substring(0, largoArreglou10).trim(), Arial);	        
		        c0ca10 = new Chunk(cantidadc[10].substring(0, largoArregloca10).trim(), Arial);
		        c0pr10 = new Chunk(preciouc[10].substring(0, largoArreglopr10).trim(), Arial);
		        c0di10 = new Chunk(diasc[10].substring(0, largoArreglodi10).trim(), Arial);        
		        c0cla10 = new Chunk(clacificacion[10].substring(0, largoArreglocla10).trim(), Arial);	
		        c0import10 = new Chunk(importec[10].substring(0, largoArregloimpor10).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 12|| agrega == 12) { 
		        
	 	        largoArreglou11 =  unidadc[11].length();	 
	 	        largoArregloca11 =  cantidadc[11].length();
	 	        largoArreglodi11 =  diasc[11].length();
	 	        largoArreglopr11 =  preciouc[11].length();
	 	        largoArreglodc111 =  descripcionc[11].length();
	 	        largoArreglodc211 =  descripcionc0[11].length();
	 	        largoArreglodc311 =  descripcionc3[11].length();
	 	        largoArreglocla11 =  clacificacion[11].length();
	 	 	    largoArregloimpor11 =  importec[11].length();
	 	 	    
		        c0d111 = new Chunk(descripcionc[11].substring(0, largoArreglodc111).trim(), Arial);
		        c0d211 = new Chunk(descripcionc0[11].substring(0, largoArreglodc211).trim(), Arial);
		        c0d311 = new Chunk(descripcionc3[11].substring(0, largoArreglodc311).trim(), Arial);
		        c0u11 = new Chunk(unidadc[11].substring(0, largoArreglou11).trim(), Arial);	        
		        c0ca11 = new Chunk(cantidadc[11].substring(0, largoArregloca11).trim(), Arial);
		        c0pr11 = new Chunk(preciouc[11].substring(0, largoArreglopr11).trim(), Arial);
		        c0di11 = new Chunk(diasc[11].substring(0, largoArreglodi11).trim(), Arial);        
		        c0cla11 = new Chunk(clacificacion[11].substring(0, largoArreglocla11).trim(), Arial);	
		        c0import11 = new Chunk(importec[11].substring(0, largoArregloimpor11).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 13|| agrega == 13 ) { 
		        
	 	        largoArreglou12 =  unidadc[12].length();	 
	 	        largoArregloca12 =  cantidadc[12].length();
	 	        largoArreglodi12 =  diasc[12].length();
	 	        largoArreglopr12 =  preciouc[12].length();
	 	        largoArreglodc112 =  descripcionc[12].length();
	 	        largoArreglodc212 =  descripcionc0[12].length();
	 	        largoArreglodc312 =  descripcionc3[12].length();
	 	        largoArreglocla12 =  clacificacion[12].length();
	 	 	    largoArregloimpor12 =  importec[12].length();
	 	 	    
		        c0d112 = new Chunk(descripcionc[12].substring(0, largoArreglodc112).trim(), Arial);
		        c0d212 = new Chunk(descripcionc0[12].substring(0, largoArreglodc212).trim(), Arial);
		        c0d312 = new Chunk(descripcionc3[12].substring(0, largoArreglodc312).trim(), Arial);
		        c0u12 = new Chunk(unidadc[12].substring(0, largoArreglou12).trim(), Arial);	        
		        c0ca12 = new Chunk(cantidadc[12].substring(0, largoArregloca12).trim(), Arial);
		        c0pr12 = new Chunk(preciouc[12].substring(0, largoArreglopr12).trim(), Arial);
		        c0di12 = new Chunk(diasc[12].substring(0, largoArreglodi12).trim(), Arial);        
		        c0cla12 = new Chunk(clacificacion[12].substring(0, largoArreglocla12).trim(), Arial);	
		        c0import12 = new Chunk(importec[12].substring(0, largoArregloimpor12).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 14 || agrega == 14) { 
		        
	 	        largoArreglou13 =  unidadc[13].length();	 
	 	        largoArregloca13 =  cantidadc[13].length();
	 	        largoArreglodi13 =  diasc[13].length();
	 	        largoArreglopr13 =  preciouc[13].length();
	 	        largoArreglodc113 =  descripcionc[13].length();
	 	        largoArreglodc213 =  descripcionc0[13].length();
	 	        largoArreglodc313 =  descripcionc3[13].length();
	 	        largoArreglocla13 =  clacificacion[13].length();
	 	 	    largoArregloimpor13 =  importec[13].length();
	 	 	    
		        c0d113 = new Chunk(descripcionc[13].substring(0, largoArreglodc113).trim(), Arial);
		        c0d213 = new Chunk(descripcionc0[13].substring(0, largoArreglodc213).trim(), Arial);
		        c0d313 = new Chunk(descripcionc3[13].substring(0, largoArreglodc313).trim(), Arial);
		        c0u13 = new Chunk(unidadc[13].substring(0, largoArreglou13).trim(), Arial);	        
		        c0ca13 = new Chunk(cantidadc[13].substring(0, largoArregloca13).trim(), Arial);
		        c0pr13 = new Chunk(preciouc[13].substring(0, largoArreglopr13).trim(), Arial);
		        c0di13 = new Chunk(diasc[13].substring(0, largoArreglodi13).trim(), Arial);        
		        c0cla13 = new Chunk(clacificacion[13].substring(0, largoArreglocla13).trim(), Arial);	
		        c0import13 = new Chunk(importec[13].substring(0, largoArregloimpor13).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 15 || agrega == 15) { 
		        
	 	        largoArreglou14 =  unidadc[14].length();	 
	 	        largoArregloca14 =  cantidadc[14].length();
	 	        largoArreglodi14 =  diasc[14].length();
	 	        largoArreglopr14 =  preciouc[14].length();
	 	        largoArreglodc114 =  descripcionc[14].length();
	 	        largoArreglodc214 =  descripcionc0[14].length();
	 	        largoArreglodc314 =  descripcionc3[14].length();
	 	        largoArreglocla14 =  clacificacion[14].length();
	 	 	    largoArregloimpor14 =  importec[14].length();
	 	 	    
		        c0d114 = new Chunk(descripcionc[14].substring(0, largoArreglodc114).trim(), Arial);
		        c0d214 = new Chunk(descripcionc0[14].substring(0, largoArreglodc214).trim(), Arial);
		        c0d314 = new Chunk(descripcionc3[14].substring(0, largoArreglodc314).trim(), Arial);
		        c0u14 = new Chunk(unidadc[14].substring(0, largoArreglou14).trim(), Arial);	        
		        c0ca14 = new Chunk(cantidadc[14].substring(0, largoArregloca14).trim(), Arial);
		        c0pr14 = new Chunk(preciouc[14].substring(0, largoArreglopr14).trim(), Arial);
		        c0di14 = new Chunk(diasc[14].substring(0, largoArreglodi14).trim(), Arial);        
		        c0cla14 = new Chunk(clacificacion[14].substring(0, largoArreglocla14).trim(), Arial);	
		        c0import14 = new Chunk(importec[14].substring(0, largoArregloimpor14).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 15 || agrega == 15) { 
		        
	 	        largoArreglou15 =  unidadc[15].length();	 
	 	        largoArregloca15 =  cantidadc[15].length();
	 	        largoArreglodi15 =  diasc[15].length();
	 	        largoArreglopr15 =  preciouc[15].length();
	 	        largoArreglodc115 =  descripcionc[15].length();
	 	        largoArreglodc215 =  descripcionc0[15].length();
	 	        largoArreglodc315 =  descripcionc3[15].length();
	 	        largoArreglocla15 =  clacificacion[15].length();
	 	 	    largoArregloimpor15 =  importec[15].length();
	 	 	    
		        c0d115 = new Chunk(descripcionc[15].substring(0, largoArreglodc115).trim(), Arial);
		        c0d215 = new Chunk(descripcionc0[15].substring(0, largoArreglodc215).trim(), Arial);
		        c0d315 = new Chunk(descripcionc3[15].substring(0, largoArreglodc315).trim(), Arial);
		        c0u15 = new Chunk(unidadc[15].substring(0, largoArreglou15).trim(), Arial);	        
		        c0ca15 = new Chunk(cantidadc[15].substring(0, largoArregloca15).trim(), Arial);
		        c0pr15 = new Chunk(preciouc[15].substring(0, largoArreglopr15).trim(), Arial);
		        c0di15 = new Chunk(diasc[15].substring(0, largoArreglodi15).trim(), Arial);        
		        c0cla15 = new Chunk(clacificacion[15].substring(0, largoArreglocla15).trim(), Arial);	
		        c0import15 = new Chunk(importec[15].substring(0, largoArregloimpor15).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 16 || agrega == 16) { 
		        
	 	        largoArreglou16 =  unidadc[16].length();	 
	 	        largoArregloca16 =  cantidadc[16].length();
	 	        largoArreglodi16 =  diasc[16].length();
	 	        largoArreglopr16 =  preciouc[16].length();
	 	        largoArreglodc116 =  descripcionc[16].length();
	 	        largoArreglodc216 =  descripcionc0[16].length();
	 	        largoArreglodc316 =  descripcionc3[16].length();
	 	        largoArreglocla16 =  clacificacion[16].length();
	 	 	    largoArregloimpor16 =  importec[16].length();
	 	 	    
		        c0d116 = new Chunk(descripcionc[16].substring(0, largoArreglodc116).trim(), Arial);
		        c0d216 = new Chunk(descripcionc0[16].substring(0, largoArreglodc216).trim(), Arial);
		        c0d316 = new Chunk(descripcionc3[16].substring(0, largoArreglodc316).trim(), Arial);
		        c0u16 = new Chunk(unidadc[16].substring(0, largoArreglou16).trim(), Arial);	        
		        c0ca16 = new Chunk(cantidadc[16].substring(0, largoArregloca16).trim(), Arial);
		        c0pr16 = new Chunk(preciouc[16].substring(0, largoArreglopr16).trim(), Arial);
		        c0di16 = new Chunk(diasc[16].substring(0, largoArreglodi16).trim(), Arial);        
		        c0cla16 = new Chunk(clacificacion[16].substring(0, largoArreglocla16).trim(), Arial);	
		        c0import16 = new Chunk(importec[16].substring(0, largoArregloimpor16).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 17 || agrega == 17) { 
		        
	 	        largoArreglou17 =  unidadc[17].length();	 
	 	        largoArregloca17 =  cantidadc[17].length();
	 	        largoArreglodi17 =  diasc[17].length();
	 	        largoArreglopr17 =  preciouc[17].length();
	 	        largoArreglodc117 =  descripcionc[17].length();
	 	        largoArreglodc217 =  descripcionc0[17].length();
	 	        largoArreglodc317 =  descripcionc3[17].length();
	 	        largoArreglocla17 =  clacificacion[17].length();
	 	 	    largoArregloimpor17 =  importec[17].length();
	 	 	    
		        c0d117 = new Chunk(descripcionc[17].substring(0, largoArreglodc117).trim(), Arial);
		        c0d217 = new Chunk(descripcionc0[17].substring(0, largoArreglodc217).trim(), Arial);
		        c0d317 = new Chunk(descripcionc3[17].substring(0, largoArreglodc317).trim(), Arial);
		        c0u17 = new Chunk(unidadc[17].substring(0, largoArreglou17).trim(), Arial);	        
		        c0ca17 = new Chunk(cantidadc[17].substring(0, largoArregloca17).trim(), Arial);
		        c0pr17 = new Chunk(preciouc[17].substring(0, largoArreglopr17).trim(), Arial);
		        c0di17 = new Chunk(diasc[17].substring(0, largoArreglodi17).trim(), Arial);        
		        c0cla17 = new Chunk(clacificacion[17].substring(0, largoArreglocla17).trim(), Arial);	
		        c0import17 = new Chunk(importec[17].substring(0, largoArregloimpor17).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 18|| agrega == 18) { 
		        
	 	        largoArreglou18 =  unidadc[18].length();	 
	 	        largoArregloca18 =  cantidadc[18].length();
	 	        largoArreglodi18 =  diasc[18].length();
	 	        largoArreglopr18 =  preciouc[18].length();
	 	        largoArreglodc118 =  descripcionc[18].length();
	 	        largoArreglodc218 =  descripcionc0[18].length();
	 	        largoArreglodc318 =  descripcionc3[18].length();
	 	        largoArreglocla18 =  clacificacion[18].length();
	 	 	    largoArregloimpor18 =  importec[18].length();
	 	 	    
		        c0d118 = new Chunk(descripcionc[18].substring(0, largoArreglodc118).trim(), Arial);
		        c0d218 = new Chunk(descripcionc0[18].substring(0, largoArreglodc218).trim(), Arial);
		        c0d318 = new Chunk(descripcionc3[18].substring(0, largoArreglodc318).trim(), Arial);
		        c0u18 = new Chunk(unidadc[18].substring(0, largoArreglou18).trim(), Arial);	        
		        c0ca18 = new Chunk(cantidadc[18].substring(0, largoArregloca18).trim(), Arial);
		        c0pr18 = new Chunk(preciouc[18].substring(0, largoArreglopr18).trim(), Arial);
		        c0di18 = new Chunk(diasc[18].substring(0, largoArreglodi18).trim(), Arial);        
		        c0cla18 = new Chunk(clacificacion[18].substring(0, largoArreglocla18).trim(), Arial);	
		        c0import18 = new Chunk(importec[18].substring(0, largoArregloimpor18).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 19|| agrega == 19) { 
		        
	 	        largoArreglou19 =  unidadc[19].length();	 
	 	        largoArregloca19 =  cantidadc[19].length();
	 	        largoArreglodi19 =  diasc[19].length();
	 	        largoArreglopr19 =  preciouc[19].length();
	 	        largoArreglodc119 =  descripcionc[19].length();
	 	        largoArreglodc219 =  descripcionc0[19].length();
	 	        largoArreglodc319 =  descripcionc3[19].length();
	 	        largoArreglocla19 =  clacificacion[19].length();
	 	 	    largoArregloimpor19 =  importec[19].length();
	 	 	    
		        c0d119 = new Chunk(descripcionc[19].substring(0, largoArreglodc119).trim(), Arial);
		        c0d219 = new Chunk(descripcionc0[19].substring(0, largoArreglodc219).trim(), Arial);
		        c0d319 =  new Chunk(descripcionc3[19].substring(0, largoArreglodc319).trim(), Arial);
		        c0u19 = new Chunk(unidadc[19].substring(0, largoArreglou19).trim(), Arial);	        
		        c0ca19 = new Chunk(cantidadc[19].substring(0, largoArregloca19).trim(), Arial);
		        c0pr19 = new Chunk(preciouc[19].substring(0, largoArreglopr19).trim(), Arial);
		        c0di19 = new Chunk(diasc[19].substring(0, largoArreglodi19).trim(), Arial);        
		        c0cla19 = new Chunk(clacificacion[19].substring(0, largoArreglocla19).trim(), Arial);	
		        c0import19 = new Chunk(importec[19].substring(0, largoArregloimpor19).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 20|| agrega == 20) { 
		        
	 	        largoArreglou20 =  unidadc[20].length();	 
	 	        largoArregloca20 =  cantidadc[20].length();
	 	        largoArreglodi20 =  diasc[20].length();
	 	        largoArreglopr20 =  preciouc[20].length();
	 	        largoArreglodc120 =  descripcionc[20].length();
	 	        largoArreglodc220 =  descripcionc0[20].length();
	 	        largoArreglodc320 =  descripcionc3[20].length();
	 	        largoArreglocla20 =  clacificacion[20].length();
	 	 	    largoArregloimpor20 =  importec[20].length();
	 	 	    
		        c0d120 = new Chunk(descripcionc[20].substring(0, largoArreglodc120).trim(), Arial);
		        c0d220 = new Chunk(descripcionc0[20].substring(0, largoArreglodc220).trim(), Arial);
		        c0d320 = new Chunk(descripcionc3[20].substring(0, largoArreglodc320).trim(), Arial);
		        c0u20 = new Chunk(unidadc[20].substring(0, largoArreglou20).trim(), Arial);	        
		        c0ca20 = new Chunk(cantidadc[20].substring(0, largoArregloca20).trim(), Arial);
		        c0pr20 = new Chunk(preciouc[20].substring(0, largoArreglopr20).trim(), Arial);
		        c0di20 = new Chunk(diasc[20].substring(0, largoArreglodi20).trim(), Arial);        
		        c0cla20 = new Chunk(clacificacion[20].substring(0, largoArreglocla20).trim(), Arial);	
		        c0import20 = new Chunk(importec[20].substring(0, largoArregloimpor20).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 21 || agrega == 21) { 
		        
	 	        largoArreglou21 =  unidadc[21].length();	 
	 	        largoArregloca21 =  cantidadc[21].length();
	 	        largoArreglodi21 =  diasc[21].length();
	 	        largoArreglopr21 =  preciouc[21].length();
	 	        largoArreglodc121 =  descripcionc[21].length();
	 	        largoArreglodc221 =  descripcionc0[21].length();
	 	        largoArreglodc321 =  descripcionc3[21].length();
	 	        largoArreglocla21 =  clacificacion[21].length();
	 	 	    largoArregloimpor21 =  importec[21].length();
	 	 	    
		        c0d121 = new Chunk(descripcionc[21].substring(0, largoArreglodc121).trim(), Arial);
		        c0d221 = new Chunk(descripcionc0[21].substring(0, largoArreglodc221).trim(), Arial);
		        c0d321 = new Chunk(descripcionc3[21].substring(0, largoArreglodc321).trim(), Arial);
		        c0u21 = new Chunk(unidadc[21].substring(0, largoArreglou21).trim(), Arial);	        
		        c0ca21 = new Chunk(cantidadc[21].substring(0, largoArregloca21).trim(), Arial);
		        c0pr21 = new Chunk(preciouc[21].substring(0, largoArreglopr21).trim(), Arial);
		        c0di21 = new Chunk(diasc[21].substring(0, largoArreglodi21).trim(), Arial);        
		        c0cla21 = new Chunk(clacificacion[21].substring(0, largoArreglocla21).trim(), Arial);	
		        c0import21 = new Chunk(importec[21].substring(0, largoArregloimpor21).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 22  || agrega == 22) { 
		        
	 	        largoArreglou22 =  unidadc[21].length();	 
	 	        largoArregloca22 =  cantidadc[22].length();
	 	        largoArreglodi22 =  diasc[22].length();
	 	        largoArreglopr22 =  preciouc[22].length();
	 	        largoArreglodc122 =  descripcionc[22].length();
	 	        largoArreglodc222 =  descripcionc0[22].length();
	 	        largoArreglodc322 =  descripcionc3[22].length();
	 	        largoArreglocla22 =  clacificacion[22].length();
	 	 	    largoArregloimpor22 =  importec[22].length();
	 	 	    
		        c0d122 = new Chunk(descripcionc[22].substring(0, largoArreglodc122).trim(), Arial);
		        c0d222 = new Chunk(descripcionc0[22].substring(0, largoArreglodc222).trim(), Arial);
		        c0d322 = new Chunk(descripcionc3[22].substring(0, largoArreglodc322).trim(), Arial);
		        c0u22 = new Chunk(unidadc[22].substring(0, largoArreglou22).trim(), Arial);	        
		        c0ca22 = new Chunk(cantidadc[22].substring(0, largoArregloca22).trim(), Arial);
		        c0pr22 = new Chunk(preciouc[22].substring(0, largoArreglopr22).trim(), Arial);
		        c0di22 = new Chunk(diasc[22].substring(0, largoArreglodi22).trim(), Arial);        
		        c0cla22 = new Chunk(clacificacion[22].substring(0, largoArreglocla22).trim(), Arial);	
		        c0import22 = new Chunk(importec[22].substring(0, largoArregloimpor22).trim(), Arial);		
	 	        
	        	

	        }
	        
	        if (agrega > 23  || agrega == 23) { 
		        
	 	        largoArreglou23 =  unidadc[23].length();	 
	 	        largoArregloca23 =  cantidadc[23].length();
	 	        largoArreglodi23 =  diasc[23].length();
	 	        largoArreglopr23 =  preciouc[23].length();
	 	        largoArreglodc123 =  descripcionc[23].length();
	 	        largoArreglodc223 =  descripcionc0[23].length();
	 	        largoArreglodc323 =  descripcionc3[23].length();
	 	        largoArreglocla23 =  clacificacion[23].length();
	 	 	    largoArregloimpor23 =  importec[23].length();
	 	 	    
		        c0d123 = new Chunk(descripcionc[23].substring(0, largoArreglodc123).trim(), Arial);
		        c0d223 = new Chunk(descripcionc0[23].substring(0, largoArreglodc223).trim(), Arial);
		        c0d323 = new Chunk(descripcionc3[23].substring(0, largoArreglodc323).trim(), Arial);
		        c0u23 = new Chunk(unidadc[23].substring(0, largoArreglou23).trim(), Arial);	        
		        c0ca23 = new Chunk(cantidadc[23].substring(0, largoArregloca23).trim(), Arial);
		        c0pr23 = new Chunk(preciouc[23].substring(0, largoArreglopr23).trim(), Arial);
		        c0di23 = new Chunk(diasc[23].substring(0, largoArreglodi23).trim(), Arial);        
		        c0cla23 = new Chunk(clacificacion[23].substring(0, largoArreglocla23).trim(), Arial);	
		        c0import23 = new Chunk(importec[23].substring(0, largoArregloimpor23).trim(), Arial);		
	 	        
	        	

	        }
	      
             if (agrega > 24 || agrega == 24 ) { 
		        
	 	        largoArreglou24 =  unidadc[24].length();	 
	 	        largoArregloca24 =  cantidadc[24].length();
	 	        largoArreglodi24 =  diasc[24].length();
	 	        largoArreglopr24 =  preciouc[24].length();
	 	        largoArreglodc124 =  descripcionc[24].length();
	 	        largoArreglodc224 =  descripcionc0[24].length();
	 	        largoArreglodc324 =  descripcionc3[24].length();
	 	        largoArreglocla24 =  clacificacion[24].length();
	 	 	    largoArregloimpor24 =  importec[24].length();
	 	 	    
		        c0d124 = new Chunk(descripcionc[24].substring(0, largoArreglodc124).trim(), Arial);
		        c0d224 = new Chunk(descripcionc0[24].substring(0, largoArreglodc224).trim(), Arial);
		        c0d324 = new Chunk(descripcionc3[24].substring(0, largoArreglodc324).trim(), Arial);
		        c0u24 = new Chunk(unidadc[24].substring(0, largoArreglou24).trim(), Arial);	        
		        c0ca24 = new Chunk(cantidadc[24].substring(0, largoArregloca24).trim(), Arial);
		        c0pr24 = new Chunk(preciouc[24].substring(0, largoArreglopr24).trim(), Arial);
		        c0di24 = new Chunk(diasc[24].substring(0, largoArreglodi24).trim(), Arial);        
		        c0cla24 = new Chunk(clacificacion[24].substring(0, largoArreglocla24).trim(), Arial);	
		        c0import24 = new Chunk(importec[24].substring(0, largoArregloimpor24).trim(), Arial);		
	 	        
	        	

	        }
	        
	        
             
             //Importes
          

             
             
            Arial.setSize(10.0f);
 	        Arial.setStyle(0);
 	        phraset = new Phrase(c0sub);	
 	        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 196.0f, 0.0f);
 	        System.out.println("Generando subtotal: " + phraset);
	 
 	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0iva);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 173.0f, 0.0f);
	        System.out.println("Generando iva: " + phraset);
 	        
            Arial.setSize(10.0f);
  	        Arial.setStyle(0);
  	        phraset = new Phrase(c0gran);	
  	        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 152.0f, 0.0f);
  	        System.out.println("Generando grantotal: " + phraset);
 	        
  	 //// campos fijos

  	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0c);	
	        ColumnText.showTextAligned(canvas, 0, phraset, 106.0f, 681.0f, 0.0f);
	        System.out.println("Generando nombre Cliente: " + phraset);
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0co);
	        ColumnText.showTextAligned(canvas, 0, phraset, 79.0f, 657.0f, 0.0f);
	        System.out.println("Generando razon social : " + phraset);
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0t);
	        ColumnText.showTextAligned(canvas, 0, phraset, 75.0f, 633.0f, 0.0f);
	        System.out.println("Generando telefono : " + phraset);
	        

	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0e);
	        ColumnText.showTextAligned(canvas, 0, phraset, 46.0f, 609.0f, 0.0f);
	        System.out.println("Generando email : " + phraset);
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0de);
	        ColumnText.showTextAligned(canvas, 0, phraset, 107.0f, 584.0f, 0.0f);
	        System.out.println("Generando nombre de evento : " + phraset);
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0l);
	        ColumnText.showTextAligned(canvas, 0, phraset, 97.0f, 560.0f, 0.0f);
	        System.out.println("Generando lugar del evento: " + phraset);
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0dfm);
	        ColumnText.showTextAligned(canvas, 0, phraset, 102.0f, 536.0f, 0.0f);
	        System.out.println("Generando fecha de montaje : " + phraset);
	        
	        
	        
	       
	        
	       
	        /////////
	     

	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0homo);
	        ColumnText.showTextAligned(canvas, 0, phraset, 431.0f, 680.0f, 0.0f);
	        System.out.println("Generando hoarario de montaje : " + phraset);
	
	        
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0f);
	        ColumnText.showTextAligned(canvas, 0, phraset, 427.0f, 658.0f, 0.0f);
	        System.out.println("Generando fecha del evento: " + phraset);
	        
	        
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0hoe);
	        ColumnText.showTextAligned(canvas, 0, phraset, 429.0f, 633.0f, 0.0f);
	        System.out.println("Generando horararios del evento : " + phraset);
	 
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0fde);
	        ColumnText.showTextAligned(canvas, 0, phraset, 449.0f, 609.0f, 0.0f);
	        System.out.println("Generando fecha de desmontaje : " + phraset);
	
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0hdes);
	        ColumnText.showTextAligned(canvas, 0, phraset, 454.0f, 584.0f, 0.0f);
	        System.out.println("Generando horario de desmontaje : " + phraset);
	        

	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0ev);
	        ColumnText.showTextAligned(canvas, 0, phraset, 456.0f, 560.0f, 0.0f);
	        System.out.println("Generando dias de evento : " + phraset);
	  

	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0mo);
	        ColumnText.showTextAligned(canvas, 0, phraset, 457.0f, 536.0f, 0.0f);
	        System.out.println("Generando dias de montaje : " + phraset);
	   
	        
	        
	        ///	         fila     1
	        
	        
	        
	        

	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0ca);
	        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 466.0f, 0.0f);
	        System.out.println("Generando cantidad : " + phraset);
	 
	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0u);
	        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 466.0f, 0.0f);
	        System.out.println("Generando unidad : " + phraset);
	 

	        Arial.setSize(10.0f);
	        Arial.setStyle(1);
	        phraset = new Phrase(c0cla);
	        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 480.0f, 0.0f);
	        System.out.println("Generando clacificacion : " + phraset);

	   
	        Arial.setSize(09.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0d1);
	        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 471.0f, 0.0f);
	        System.out.println("Generando descripcion de producto 1 : " + phraset);
	        
	  

	        Arial.setSize(09.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0d2);
	        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 461.0f, 0.0f);
	        System.out.println("Generando descripcion de producto 2: " + phraset);
	        
	        Arial.setSize(09.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0d3);
	        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 451.0f, 0.0f);
	        System.out.println("Generando descripcion de producto 3 : " + phraset);


	        
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0pr);
	        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 466.0f, 0.0f);
	        System.out.println("Generando precio unitario : " + phraset);
	       
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0di);
	        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 466.0f, 0.0f);
	        System.out.println("Generando dias de serv renglon 1: " + phraset);
	        
	        

	
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0import);
	        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 466.0f, 0.0f);
	        System.out.println("Generando importe t : " + phraset);
	        
	        
	        
	        
	       ///////////// generando fila 2 
	        
	        if (agrega > 1 ) { 

	        
	        	Arial.setSize(10.0f);
		        Arial.setStyle(0);
				phraset = new Phrase(c0di1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 426.0f, 0.0f);
		        System.out.println("Generando dias de serv renglon 2: " + phraset);
	        
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0ca1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 426.0f, 0.0f);
		        System.out.println("Generando cantidad renglon 2 : " + phraset);
		 
		        
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0u1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 426.0f, 0.0f);
		        System.out.println("Generando unidad renglon 2 : " + phraset);
		 

		        Arial.setSize(10.0f);
		        Arial.setStyle(1);
		        phraset = new Phrase(c0cla1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 440.0f, 0.0f);
		        System.out.println("Generando clacificacion renglon 2: " + phraset);

		   
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d11);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 430.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 1 renglon 2: " + phraset);
		        
		  

		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d21);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 420.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 2: renglon 2 " + phraset);
		        
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d31);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 410.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 3 :  renglon 2" + phraset);


		        
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0pr1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 426.0f, 0.0f);
		        System.out.println("Generando precio unitario : renglon 2 " + phraset);
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0import1);
		        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 426.0f, 0.0f);
		        System.out.println("Generando importe t : fila 2" + phraset);
		       
	 }
	        
		       ///////////// generando fila 3 

	        
	        if (agrega > 2 ) { 

		        
	        	Arial.setSize(10.0f);
		        Arial.setStyle(0);
				phraset = new Phrase(c0di2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 383.0f, 0.0f);
		        System.out.println("Generando dias de serv renglon 2: " + phraset);
	        
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0ca2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 383.0f, 0.0f);
		        System.out.println("Generando cantidad renglon 2 : " + phraset);
		 
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0pr2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 383.0f, 0.0f);
		        System.out.println("Generando precio unitario : renglon 2 " + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0u2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 383.0f, 0.0f);
		        System.out.println("Generando unidad renglon 2 : " + phraset);
		 

		        Arial.setSize(10.0f);
		        Arial.setStyle(1);
		        phraset = new Phrase(c0cla2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 396.0f, 0.0f);
		        System.out.println("Generando clacificacion renglon 2: " + phraset);

		   
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d12);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 387.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 1 renglon 2: " + phraset);
		        
		  

		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d22);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 377.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 2: renglon 2 " + phraset);
		        
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d32);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 367.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 3 :  renglon 2" + phraset);

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0import2);
		        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 383.0f, 0.0f);
		        System.out.println("Generando importe t : fila 3" + phraset);

		        
		       
		       
	 }
	        
	       ///////////// generando fila 4 

	        
	        if (agrega > 3 ) { 

		        
	        	Arial.setSize(10.0f);
		        Arial.setStyle(0);
				phraset = new Phrase(c0di3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 341.0f, 0.0f);
		        System.out.println("Generando dias de serv renglon 2: " + phraset);
	        
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0ca3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 341.0f, 0.0f);
		        System.out.println("Generando cantidad renglon 2 : " + phraset);
		 
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0pr3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 341.0f, 0.0f);
		        System.out.println("Generando precio unitario : renglon 2 " + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0u3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 341.0f, 0.0f);
		        System.out.println("Generando unidad renglon 2 : " + phraset);
		 

		        Arial.setSize(10.0f);
		        Arial.setStyle(1);
		        phraset = new Phrase(c0cla3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 355.0f, 0.0f);
		        System.out.println("Generando clacificacion renglon 2: " + phraset);

		   
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d13);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 346.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 1 renglon 2: " + phraset);
		        
		  

		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d23);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 336.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 2: renglon 2 " + phraset);
		        
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d33);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 326.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 3 :  renglon 2" + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0import3);
		        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 341.0f, 0.0f);
		        System.out.println("Generando importe t : fila 4" + phraset);


		        
		       
		       
	 }
	        
	        
 ///////////// generando fila 5 

	        
	        if (agrega > 4 ) { 

		        
	        	Arial.setSize(10.0f);
		        Arial.setStyle(0);
				phraset = new Phrase(c0di4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 300.0f, 0.0f);
		        System.out.println("Generando dias de serv renglon 5: " + phraset);
	        
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0ca4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 300.0f, 0.0f);
		        System.out.println("Generando cantidad renglon 5 : " + phraset);
		 
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0pr4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 300.0f, 0.0f);
		        System.out.println("Generando precio unitario : renglon 5 " + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0u4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 300.0f, 0.0f);
		        System.out.println("Generando unidad renglon 5 : " + phraset);
		 

		        Arial.setSize(10.0f);
		        Arial.setStyle(1);
		        phraset = new Phrase(c0cla4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 314.0f, 0.0f);
		        System.out.println("Generando clacificacion renglon 5: " + phraset);

		   
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d14);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 305.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 1 renglon 5: " + phraset);
		        
		  

		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d24);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 295.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 2: renglon 5 " + phraset);
		        
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d34);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 285.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 3 :  renglon 5" + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0import4);
		        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 300.0f, 0.0f);
		        System.out.println("Generando importe t : fila 5" + phraset);



		         
		       
		       
	 }
	        
 ///////////// generando fila 6 

	        
	        if (agrega > 5 ) { 

		        
	        	Arial.setSize(10.0f);
		        Arial.setStyle(0);
				phraset = new Phrase(c0di5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 476.0f, 258.0f, 0.0f);
		        System.out.println("Generando dias de serv renglon 6: " + phraset);
	        
		        

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0ca5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 22.0f, 258.0f, 0.0f);
		        System.out.println("Generando cantidad renglon 6 : " + phraset);
		 
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0pr5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 375.0f, 258.0f, 0.0f);
		        System.out.println("Generando precio unitario : renglon 6 " + phraset);
		        
		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0u5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 72.0f, 258.0f, 0.0f);
		        System.out.println("Generando unidad renglon 6 : " + phraset);
		 

		        Arial.setSize(10.0f);
		        Arial.setStyle(1);
		        phraset = new Phrase(c0cla5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 170.0f, 272.0f, 0.0f);
		        System.out.println("Generando clacificacion renglon 6: " + phraset);

		   
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d15);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 263.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 1 renglon 6: " + phraset);
		        
		  

		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d25);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 253.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 2: renglon 6 " + phraset);
		        
		        Arial.setSize(09.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0d35);
		        ColumnText.showTextAligned(canvas, 0, phraset, 120.0f, 243.0f, 0.0f);
		        System.out.println("Generando descripcion de producto 3 :  renglon 6" + phraset);

		        Arial.setSize(10.0f);
		        Arial.setStyle(0);
		        phraset = new Phrase(c0import5);
		        ColumnText.showTextAligned(canvas, 0, phraset, 550.0f, 258.0f, 0.0f);
		        System.out.println("Generando importe t : fila 6" + phraset);

		        
		       
		       
	 }
	        
	        
	        
	        
	        Arial.setSize(08.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0so);
	        ColumnText.showTextAligned(canvas, 0, phraset, 85.0f, 72.0f, 0.0f);
	        System.out.println("Generando fecha de solicitud :  " + phraset);
	        
	        Arial.setSize(10.0f);
	        Arial.setStyle(0);
	        phraset = new Phrase(c0coti);
	        ColumnText.showTextAligned(canvas, 0, phraset, 485.0f, 774.0f, 0.0f);
	        System.out.println("Generando cotizacion :  " + phraset);
	 
	        
	        
	        
	    
	        System.out.println("Se generó cotizacion: ");
	        canvas.endText();
	        stamper.close();
	    }


	 }


	
	
	

