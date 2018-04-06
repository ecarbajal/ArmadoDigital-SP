package utils;

import javax.swing.JOptionPane;

public class Utils {

	 public static String fillCeros(String valor, int longitud) {
	        while (valor.length() < longitud) {
	            valor = "0" + valor;
	        }
	        return valor;
	    }
	 
	 public static boolean validaNumerosNegativos(String numero) {
		 int num = Integer.valueOf(numero);
		 
		 boolean st = num <= 0 ? true : false;
		 
		 return st;
	 }
	 
	 public static void muestraMensaje(String st) {
		 JOptionPane.showMessageDialog(null, st);
	 }
	 
	 public static String recortarFecha(String fechaOriginal) {
		 String fecha = fechaOriginal.substring(0, fechaOriginal.indexOf(" "));
		 //System.out.println("["+fechaOriginal+"] formated to ["+fecha+"]");
		 return fecha;
	 }
	 
	 public static String convertirFechaATexto(String fecha) {
		 String fechaTexto;
		 String dia = "" , mes = "", anio = "";
		 String mesLetra = "";
		 String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"
		            ,"Octubre","Noviembre","Diciembre"};
		 
		 String fechaTrim[] = fecha.split("-");
			 dia = fechaTrim[2];
			 mes = fechaTrim[1];
			 anio = fechaTrim[0];
		 
		 
		 
		 
		 //Convertir numero de mes a letra
		 mesLetra = meses[Integer.valueOf(mes)-1];
		 
		 //////////////////////////////////////////////////
		 
		 
		 fechaTexto = dia+" de "+mesLetra+" DE "+anio.trim();
		 
		 System.out.println("Convirtiendo ["+fecha+"] a ["+fechaTexto.toUpperCase()+"]");
		 
		 return fechaTexto.toUpperCase();
	 }
	 
	 
}
