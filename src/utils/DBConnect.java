package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;



public class DBConnect {

	
	public String[] getUser(String usuario, String pass){
		String datos[] = new String[4];
		//String datos2[] = new String[4];
		//String IdEmpleado = "";
		Statement s = conexionAccess();
		//Statement p = conexionAccess();
		try{			
			ResultSet rs = s.executeQuery("SELECT PERMISO, IdEmpleado, rango from usuarios where Login ='"+usuario+"' and Password = '" + pass+"'");	
			while(rs.next()) {			
			if(rs.getBoolean(1)) {
				//IdEmpleado= rs.getString(2)+"";
				datos[0]= rs.getInt(3)+"";
			    /*ResultSet rs2 = s.executeQuery("SELECT Nombre, APaterno, AMaterno from Empleado where IdEmpleado ="+IdEmpleado);
				 rs2.next();  
			   		datos[1] = rs2.getString(1);
				    datos[2] = rs2.getString(2);
				    datos[3] = rs2.getString(3);	
				    
				    ResultSet lp = p.executeQuery("SELECT IdCotiza, calId, IdCliente from RegCotiza");	
					lp.next();				   
				   		datos2[0] = lp.getString(1);
					    datos2[1] = lp.getString(2);
					    datos2[2] = lp.getString(3);
					    datos2[3] = lp.getString(3);*/
					}
				}
			rs.close();
			s.close();			
		}catch(Exception e){
			return datos;
		}		
		return datos;
	}
		
	
	public String[][] getClienteCotizacion(String IdCliente) {		
		String[][] datos = null;
		Statement s = conexionAccess();
		Statement s2 = conexionAccess();
		Statement p = conexionAccess();
		try {
			ResultSet rs = s.executeQuery("SELECT count(IdCotiza) from RegCotiza where IdCliente ='"+IdCliente+"'");	
			while(rs.next()) {				
				datos = new String[rs.getInt(1)][7];
				int cont = 0;
				ResultSet rs2 = s2.executeQuery("SELECT IdCotiza from RegCotiza where IdCliente ='"+IdCliente+"'");			
				while(rs2.next()) {	
					ResultSet ps = p.executeQuery("SELECT IdCotiza, Nombre_Evento, Lugar_Evento, Fecha_Evento_Ini, " +  
				                                  "Fecha_Evento_Fin, Fecha_Montaje, Fecha_Desmontaje from RegEvento where IdCotiza ='"+ rs2.getString(1) +"'");	
					while(ps.next()) {
						datos[cont][0] = ps.getNString("IdCotiza");
						datos[cont][1] = ps.getString(2);
						datos[cont][2] = ps.getString(3);
						datos[cont][3] = ps.getString(4);
						datos[cont][4] = ps.getString(5);			
						datos[cont][5] = ps.getString(6);
						datos[cont][6] = ps.getString(7);
						cont++;
					}
				ps.close();	
				}
			   rs2.close();
			}
			rs.close();	
			s.close();
		}catch(Exception e){			
			return datos;
	}		
		return datos;
	}
	
	public Vector<String> getCotizacionConsulta(String IdCliente) {		
		Vector<String> datosV = new Vector<String>();
		
		Statement s = conexionAccess();
		try {
			ResultSet rs = s.executeQuery("SELECT IdCotiza from RegCotiza where IdCliente ='"+IdCliente+"'");	
			while(rs.next()) {												
					datosV.addElement(rs.getString(1));
				}
			rs.close();	
			s.close();
		}catch(Exception e){			
			return datosV;
	}		
		return datosV;
	}
	
	
	public String[] getEvento(String IdCotiza) {
		String[] datos = new String[5];
		Statement s = conexionAccess();
		try {
			ResultSet ps = s.executeQuery("SELECT Nombre_Evento, Lugar_Evento, Fecha_Evento_Ini, Fecha_Evento_Fin, Fecha_Montaje " + 
					" from RegEventos where IdCotiza ='"+IdCotiza+"'");	
			while(ps.next()) {				
				datos[0] = ps.getString(1);
				datos[1] = ps.getString(2);
				datos[2] = ps.getString(3);
				datos[3] = ps.getString(4);
				datos[4] = ps.getString(5);					
					}
			ps.close();			
			s.close();
		}catch(Exception e){			
			return datos;
		}		
		return datos;
	}
		
	public String[] getCliente(String IdCliente) {		
		String[] datos = new String[7];
		Statement s = conexionAccess();
		try {
			ResultSet ps = s.executeQuery("SELECT IdCliente, Nombre, APaterno, AMaterno, RazonSocial, " + 
					"Email, Telefono1 from Cliente where IdCliente ='"+IdCliente+"'");	
			while(ps.next()) {				
				datos[0] = ps.getString(1);
				datos[1] = ps.getString(2);
				datos[2] = ps.getString(3);
				datos[3] = ps.getString(4);
				datos[4] = ps.getString(5);			
				datos[5] = ps.getString(6);
				datos[6] = ps.getString(7);
				
					}
			ps.close();			
			s.close();
		}catch(Exception e){			
			return datos;
		}		
		return datos;
	}
	
	public String getIdCliente(String nombreCliente) {
		String idCliente = "0";
		Statement s = conexionAccess();
		String[] nombreClienteDescompuesto = nombreCliente.split(" ");
		
		String query = "SELECT IdCliente from Cliente " + "where Nombre ='" + nombreClienteDescompuesto[0]
				+ "' " + "and APaterno = '" + nombreClienteDescompuesto[1] + "' and AMaterno = '" + nombreClienteDescompuesto[2]+"';";

		try {
			ResultSet ps = s.executeQuery(query);
			System.out.println(query);
			
			while (ps.next()) {
				idCliente = ps.getString("IdCliente");
			}
			ps.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return idCliente;
		}
		return idCliente;

	}
	
	
	public int setCliente( String RazonSocial, String RFC, String Email, String Telefono1 ) {
		int valor = 0;
		try {
			Statement s = conexionAccess();
			ResultSet rs = s.executeQuery("SELECT maxvalue(IdCliente) from Cliente");	
			while(rs.next()) {
				valor = rs.getInt(1) + 1;
				java.sql.PreparedStatement ps;
				String query = "INSERT INTO Cliente (IdCliente, RazonSocial, RFC,IdGiro, Email, Telefono1) " +
								"VALUES(?,?,?,?,?,?)";
				Connection conn = conexionAccessInsert();
				ps = conn.prepareStatement(query);
				ps.setInt(1, valor);
			    ps.setString(2, RazonSocial);	
			    ps.setString(3, RFC);
			    ps.setInt(4, 1);
			    ps.setString(5, Email);
			    ps.setString(6, Telefono1);
			    ps.executeUpdate();					
				ps.close();
			}	
			return valor;
	}catch(Exception e){			
		return valor;
	}	
	}
	
	public Vector<String[]> getProductos(){		
		Vector<String[]> lista = new Vector<String[]>();
		String datos[]= null;
		Statement s = conexionAccess();
		try{
			ResultSet rs = s.executeQuery("SELECT Descripcion, Precio01 from CatProductos");	
			while(rs.next()) {
				datos = new String[2];
				datos[0] = rs.getString(1);
				datos[1] = rs.getString(2);
				lista.add(datos);
			}
			rs.close();	
			s.close();
		}catch(Exception e){
			
		}
		return lista;		
	}
	
	public Vector<String[]> getCotizaciones() {
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Vector<String[]> lista = new Vector<String[]>();		
		Statement s = conexionAccess();
		try {
			ResultSet rs = s.executeQuery("SELECT IdCotiza, Nombre_Evento, Lugar_Evento, Fecha_Evento_Ini, " +  
				                      "Fecha_Evento_Fin, Fecha_Montaje, Fecha_Desmontaje from RegEventos");	
			while(rs.next()) {
				String[] datos = new String[7];
				datos[0] = rs.getNString("IdCotiza");
				datos[1] = rs.getString(2);
				datos[2] = rs.getString(3);
				datos[3] = f.format(rs.getDate(4));
				datos[4] = f.format(rs.getDate(5));			
				datos[5] = f.format(rs.getDate(6));
				datos[6] = f.format(rs.getDate(7));
				lista.add(datos);
			}
			rs.close();	
			s.close();
		}catch(Exception e){			
			return lista;
		}		
		return lista;
	}
	
	public void setCotizacion() {
		
	}
	
//	public boolean cambioPassword(String usuario, String NewPass) throws SQLException{
//		boolean cambio = false;
//		java.sql.PreparedStatement ps;
//		String query = "Update usuarios set password= ? where name= ?";
//		try{
//			String driver = "org.apache.derby.jdbc.EmbeddedDriver";			
//			Class.forName(driver).newInstance();
//			Connection conn = null;
//			conn = DriverManager.getConnection("jdbc:derby:DBCarpeta");	
//			ps = conn.prepareStatement(query);
//			ps.setString(1, NewPass);
//		    ps.setString(2, usuario);		     
//		    ps.executeUpdate();					
//			ps.close();
//			cambio=true;
//			return cambio;		
//		}catch(Exception e){			
//			return cambio;
//		}
//	}
//		
	
//	private Statement conexion(){
//		Statement s = null;
//		try{
//		String driver = "org.apache.derby.jdbc.EmbeddedDriver";			
//		Class.forName(driver).newInstance();
//		Connection conn = null;
//		conn = DriverManager.getConnection("jdbc:derby:DBCarpeta");
//		s = conn.createStatement();
//		}catch(Exception e){
//			return null;
//		}
//		return s;
//	}
	
	private Statement conexionAccess(){
		Statement s = null;
		try{
		String bd = "BDatos\\ControlEventos.mdb";	
		String pass = "MO64Q10R06";
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:ucanaccess://"+bd,"",pass);
		s = conn.createStatement();
		}catch(Exception e){
			return null;
		}
		return s;
	}
	
	private Connection conexionAccessInsert(){	
		Connection conn = null;
		try{
		String bd = "BDatos\\ControlEventos.mdb";	
		String pass = "MO64Q10R06";		
		 conn = DriverManager.getConnection("jdbc:ucanaccess://"+bd,"",pass);		
		}catch(Exception e){
			return null;
		}
		return conn;
	}
	
}
