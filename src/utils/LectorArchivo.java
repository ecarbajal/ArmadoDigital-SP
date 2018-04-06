package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LectorArchivo {


	public static final String solicitudR = CtsArmado.ArchSal;
	
	public static void main(String[] args) {
		try{
			LectorArchivo cc = new LectorArchivo();		
//			cc.leerArchivoExcel("C:\\Users\\Jorgais\\Documents\\GNP\\ejemplo_polizas.xls");
			cc.leerArchivoExcel(cc.selecArchivo()); // Selecciona el archivo excel
		} catch (IOException e) {			
																																																																																																																																																																																																																																															e.printStackTrace();
		}
	}

	
public String[] leerArchivoExcel(String path) throws IOException{
	int cont = 0;	
	String a1Val = "";
	String a2Val = "";
	String polizas[] = new String[80];
	RandomAccessFile archWrite;
	if(!path.equals("")){
		System.out.println("path: " + path);
		archWrite = new RandomAccessFile(solicitudR,"rw");
		archWrite.seek(archWrite.length());	
		FileInputStream fileInputStream = new FileInputStream(path);
		HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
		HSSFSheet worksheet = workbook.getSheetAt(0);
		HSSFRow row1 = worksheet.getRow(cont);
		do
		{				
			HSSFCell cellA1 = row1.getCell((short) 0);
			HSSFCell cellA2 = row1.getCell((short) 1);
			if(cellA1 != null)
			{
				if(cellA1.getCellType()== HSSFCell.CELL_TYPE_NUMERIC)
				{
					int val = (int)cellA1.getNumericCellValue();
					a1Val = String.valueOf(val);
				}else{
					a1Val = cellA1.getStringCellValue();
				}
				if(a1Val.length() <= 8)
				{
					a1Val = ponerCeros(a1Val,8);			
				}else if (a1Val.length() > 8){
					a1Val = a1Val.replaceAll("-", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
					a1Val = a1Val.replaceAll(" ", "");
				}				
				if(cellA2 != null){
					if(cellA2.getCellType()== HSSFCell.CELL_TYPE_NUMERIC)	
					{
						int val2 = (int)cellA2.getNumericCellValue();
						a2Val = String.valueOf(val2);
					}else{
						a2Val = cellA2.getStringCellValue();
					}
					if(a2Val.length() <= 8)
					{
						a2Val = ponerCeros(a2Val,8);
						a2Val = "C" + a2Val;
					}else if (a2Val.length() > 8){
						a2Val = a2Val.replaceAll("-", "");
						a2Val = a2Val.replaceAll(" ", "");
						a2Val = a2Val.replaceAll("-", "");
						a2Val = a2Val.replaceAll(" ", "");
						a2Val = a2Val.replaceAll(" ", "");
						a2Val = a2Val.replaceAll(" ", "");
						a2Val = a2Val.replaceAll(" ", "");
						a2Val = a2Val.replaceAll(" ", "");
					}
				}else{
					a2Val="000000000";
				}
			}		
			archWrite.writeBytes(a1Val+a2Val+"\r\n");
			polizas[cont]=a1Val+a2Val;
			cont++;
			row1 = worksheet.getRow(cont);
		}while(row1!=null);
		System.out.println("Número de registros procesados en el excel: " + Integer.toString(cont));
		try {
			archWrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	return polizas;
}


public String selecArchivo() {
	JFileChooser filechoose = new JFileChooser("C:\\");
	filechoose.showOpenDialog(null);
	File file = filechoose.getSelectedFile();
	if (file!=null&&file.exists()) {
		return file.getAbsolutePath();
	} else {
		System.out.println("No se encontro el Archivo");
	}
	return "";
}

	public String ponerCeros(String numero,int longitud) {
		
		int i;
		int j=0;
		
		String num = null;

		if (numero.length() < longitud)	{
			i=longitud-numero.length();
			for(j=0;j<i;j++){
				numero="0"+numero;
			}
			for(j=longitud;j>0;j--){
				if (j==longitud){
					if (numero.substring(j-1).trim().equals(""))
						//num="0";
						return null;
						else
							num = numero.substring(j-1);
				}
				else
				
				if (numero.substring(j-1,j).trim().equals(""))
					//num="0" + num;
					return null;
					else
						num = numero.substring(j-1,j) + num;
			}
			return num;
		}
		if (numero.length() == longitud){
			for(j=longitud;j>0;j--){
				if (j==longitud){
					if (numero.substring(j-1).trim().equals(""))
						//num="0";
						return null;
						else
							num = numero.substring(j-1);
				}
				else
				
				if (numero.substring(j-1,j).trim().equals(""))
					//num="0" + num;
					return null;
					else
						num = numero.substring(j-1,j) + num;
			}
			return num;
		}
		else {
			return null;
		}
	}
}
