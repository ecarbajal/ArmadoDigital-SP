package componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import utils.DBConnect;
import utils.Utils;


public class PanelSolicitudc extends JPanel implements ActionListener, FocusListener{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel Cliente;
	private JTextField razonsociall;
	private JTextField telefonosl;
	private JTextField clientel;
	private JTextField lugarsl;
	private JTextField emailsl;
	private JButton BotonSiguientec;
	private JTextField nombredelevento;
	private JTextField fechasdl_;
	private JTextField diassel;
	private JTextField diassml;
	private JLabel lblNombreDelEvento;
	private JTextField fecmontal_;
	private JLabel lblhorarioDeDesmontaje_1;
	private JTextField horariodes;
	private JLabel lblHorariosDelEvento;
	private JTextField horariosel;
	private JTextField horariomont;
	private JTextField cotizacion;
	private JButton btnNueva;
	private JTextField Clienteid;
	private JComboBox<String> cbCotizacion;
	private JDateChooser fechaEvento;
	private JDateChooser fechasdl;
	private JDateChooser fecmontal;
	private JDateChooser fechassl;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private DBConnect dbc;



	public PanelSolicitudc(){		 	 			
		 	setBounds(21, 162, 807, 300);
		 	setBackground(Color.white);
		 	setLayout(null);
		 	add(getCliente());
			setVisible(true);
			this.repaint();
			dbc = new DBConnect();
		}
	
	public JButton BotonSiguientec() {
		if (BotonSiguientec == null) {
			try {
				BotonSiguientec = new JButton();
				BotonSiguientec.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				BotonSiguientec.setBounds(717, 244, 106, 23);
				BotonSiguientec.setName("Boton Siguiente");				
				BotonSiguientec.setText("Siguiente");
				BotonSiguientec.setVisible(true);
				BotonSiguientec.setForeground(new Color(255,255,255));
				BotonSiguientec.setBackground(new Color(18,43,74));
				
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return BotonSiguientec;
	}
	
	
	public JTextField getrazonsocial(){
		if(razonsociall == null){
			razonsociall = new JTextField();
			razonsociall.setBounds(184, 79, 180, 20);
			razonsociall.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (razonsociall.getText().length()== 37) 
					horariodes.requestFocus();
				}
				
				});
		
		}
		return razonsociall;
	}
	
	
	public JTextField getemails(){
		if(emailsl == null){
			emailsl = new JTextField();
			emailsl.setBounds(184, 106, 180, 20);
			emailsl.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (emailsl.getText().length()== 28) 
					fechasdl_.requestFocus();

				}
				
				});
		}
		return emailsl;
	}
	
	
	public JTextField gettelefonos(){
		if(telefonosl == null){
			telefonosl = new JTextField();
			telefonosl.setBounds(184, 133, 180, 20);
			telefonosl.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (telefonosl.getText().length()== 37) 
					diassml.requestFocus();
			
				}
				
				});
		}
		return telefonosl;
	}
	
	
	public JTextField getnombredelevento(){
		if(nombredelevento == null){
			nombredelevento = new JTextField();
			nombredelevento.setBounds(184, 25, 180, 20);
			nombredelevento.getMaximumSize();
			nombredelevento.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (nombredelevento.getText().length()== 35)
				horariomont.requestFocus();

				}
				
				});
			
		}
		return nombredelevento;
		
	}
	
	public JTextField getcliente(){
		if(clientel == null){
			clientel = new JTextField();
			clientel.setBounds(184, 54, 180, 20);
			clientel.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (clientel.getText().length()== 33) 
					horariosel.requestFocus();

				}
				
				});
		}
		return clientel;
	}
	
	
	@SuppressWarnings("deprecation")
	public JDateChooser getfechasd(){
		if(fechasdl == null){
			fechasdl = new JDateChooser();
			fechasdl.setLocale(new Locale("es"));
			fechasdl.setDateFormatString("yyyy-MM-dd");
			fechasdl.setBounds(509, 137, 180, 20);
			Cliente.add(fechasdl);
			fechasdl.setNextFocusableComponent(telefonosl);
			fechasdl.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent ke) {
					if (fechasdl_.getText().length() == 26) {
						telefonosl.requestFocus();
					}
				}
				
				});
		}
		return fechasdl;
	}

	public JTextField getlugars(){
		if(lugarsl == null){
			lugarsl = new JTextField();
			lugarsl.setBounds(184, 195, 180, 20);
			lugarsl.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (lugarsl.getText().length()== 36) 
					fechassl.requestFocus();
			
				}
				
				});
		}
		return lugarsl;
	}
	
	public JDateChooser getfechas() {
		if(fechaEvento == null) {
			fechaEvento = new JDateChooser();
			//fechaEvento.setToolTipText("aaaa-MM-dd");
			fechaEvento.setLocale(new Locale("es"));
			fechaEvento.setDateFormatString("yyyy-MM-dd");
			fechaEvento.setBounds(184, 164, 180, 20);
			Cliente.add(fechaEvento);
		}
		return fechaEvento;
	}


	public JDateChooser getfechass(){
		if(fechassl == null){
			fechassl = new JDateChooser();
			fechassl.setLocale(new Locale("es"));
			fechassl.setDateFormatString("yyyy-MM-dd");
			fechassl.setBounds(509, 195, 180, 20);
			fechassl.setDate(new Date());
			
			fechassl.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (sdf.format(fechassl.getDate()).length()== 36) 
					diassel.requestFocus();
			
				}
				
				});
		}
		return fechassl;
	}
	
	
	@SuppressWarnings("deprecation")
	public JTextField getdiassm(){
		if(diassml == null){
			diassml = new JTextField();
			diassml.setBounds(509, 110, 180, 20);
			diassml.setNextFocusableComponent(telefonosl);
			diassml.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (diassml.getText().length()== 25) 
					telefonosl.requestFocus();
			
				}
				
				});
		}
		return diassml;
	}

	
	
	public JTextField getdiasse(){
		if(diassel == null){
			diassel = new JTextField();
			diassel.setBounds(184, 226, 180, 20);
			diassel.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (diassel.getText().length()== 25) 
					arg0.consume();			
				}
				
				});
		}
		return diassel;
	}
	
	
	
	public JTextField gethorariomont(){
		if(horariomont == null){
			horariomont = new JTextField();
			horariomont.setBounds(509, 79, 180, 20);
			horariomont.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (horariomont.getText().length()== 28) 
					clientel.requestFocus();

				}
				
				});
		}
		return horariomont;
	}

	

	public JPanel getCliente(){
		if(Cliente == null){
			Cliente = new JPanel();
			Cliente.setBackground(Color.WHITE);
			Cliente.setBounds(0, 0, 841, 278);
			Cliente.setLayout(null);
			Cliente.add(getrazonsocial());
			Cliente.add(getcliente());
			Cliente.add(getnombredelevento());
			Cliente.add(getlugars());
			Cliente.add(getfechas());
			Cliente.add(gettelefonos());
			Cliente.add(getemails());
			Cliente.add(BotonSiguientec());
			Cliente.add(getfechass());
			Cliente.add(getfechasd());
			Cliente.add(getHorariose());
			Cliente.add(getdiasse());
			Cliente.add(gethorariomont());
			Cliente.add(getCotizacion());
			Cliente.add(getCbCotizacion());
			getClienteid().addFocusListener(this);
			getCbCotizacion().setVisible(false);
			Cliente.addFocusListener(this);

			JLabel lblContacto = new JLabel("*Razon Social:");
			lblContacto.setForeground(new Color(0, 70, 129));
			lblContacto.setFont(new Font("Arial", Font.BOLD, 12));
			lblContacto.setBounds(65, 81, 117, 14);
			Cliente.add(lblContacto);
			
			
			JLabel lblTelefono = new JLabel("*Telefono:");
			lblTelefono.setForeground(new Color(0, 70, 129));
			lblTelefono.setFont(new Font("Arial", Font.BOLD, 12));
			lblTelefono.setBounds(65, 135, 76, 14);
			Cliente.add(lblTelefono);
			
			
			JLabel lblEmail = new JLabel("*Email:");
			lblEmail.setForeground(new Color(0, 70, 129));
			lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
			lblEmail.setBounds(65, 108, 39, 14);
			Cliente.add(lblEmail);
			
			JLabel lblcliente = new JLabel("*Nombre del Cliente:");
			lblcliente.setForeground(new Color(0, 70, 129));
			lblcliente.setFont(new Font("Arial", Font.BOLD, 12));
			lblcliente.setBounds(65, 56, 117, 14);
			Cliente.add(lblcliente);
			
			JLabel lblfecha = new JLabel("*Fecha del Evento:");
			lblfecha.setForeground(new Color(0, 70, 129));
			lblfecha.setFont(new Font("Arial", Font.BOLD, 12));
			lblfecha.setBounds(65, 166, 106, 14);
			Cliente.add(lblfecha);
			
			JLabel lbllugar = new JLabel("*Lugar del Evento:");
			lbllugar.setForeground(new Color(0, 70, 129));
			lbllugar.setFont(new Font("Arial", Font.BOLD, 12));
			lbllugar.setBounds(65, 197, 106, 14);
			Cliente.add(lbllugar);
			
		
			
			JLabel lblfechaDeDesmontaje = new JLabel("*Fecha desmontaje:");
			lblfechaDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblfechaDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeDesmontaje.setBounds(383, 139, 138, 14);
			Cliente.add(lblfechaDeDesmontaje);
			
			JLabel lblfechaDeSolicitud = new JLabel("*Fecha solicitud:");
			lblfechaDeSolicitud.setForeground(new Color(0, 70, 129));
			lblfechaDeSolicitud.setFont(new Font("Arial", Font.BOLD, 12));
			lblfechaDeSolicitud.setBounds(383, 197, 116, 14);
			Cliente.add(lblfechaDeSolicitud);
			
			
			
			JLabel lbltotalDeDas = new JLabel("*Total d\u00EDas evento:");
			lbltotalDeDas.setForeground(new Color(0, 70, 129));
			lbltotalDeDas.setFont(new Font("Arial", Font.BOLD, 12));
			lbltotalDeDas.setBounds(65, 228, 139, 14);
			Cliente.add(lbltotalDeDas);
			
			JLabel lblhorarioDeDesmontaje = new JLabel("*Clave cotizacion:");
			lblhorarioDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblhorarioDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblhorarioDeDesmontaje.setBounds(383, 228, 138, 14);
			Cliente.add(lblhorarioDeDesmontaje);
			Cliente.add(getLblNombreDelEvento());
			Cliente.add(getLblhorarioDeDesmontaje_1());
			Cliente.add(getHorariodes());
			Cliente.add(getLblHorariosDelEvento());
			Cliente.add(getHorariose());
			Cliente.add(btnNueva());

			
			JLabel lblhorariosDeDesmontaje = new JLabel("*Horarios de Montaje:");
			lblhorariosDeDesmontaje.setForeground(new Color(0, 70, 129));
			lblhorariosDeDesmontaje.setFont(new Font("Arial", Font.BOLD, 12));
			lblhorariosDeDesmontaje.setBounds(382, 81, 154, 14);
			Cliente.add(lblhorariosDeDesmontaje);
			Cliente.add(getCotizacion());
			
			JLabel lblClienteId = new JLabel("Cliente ID:");
			lblClienteId.setForeground(new Color(0, 70, 129));
			lblClienteId.setFont(new Font("Arial", Font.BOLD, 12));
			lblClienteId.setBounds(713, 93, 56, 14);
			Cliente.add(lblClienteId);
			Cliente.add(getClienteid());		
			
			JLabel lbCotizaciones = new JLabel("Cotizaciones");
			lbCotizaciones.setForeground(new Color(0, 70, 129));
			lbCotizaciones.setFont(new Font("Arial", Font.BOLD, 12));
			lbCotizaciones.setBounds(717, 151, 82, 14);
			Cliente.add(lbCotizaciones);
			
			JLabel lbldescripcionDelEvento = new JLabel("*Fecha de Montaje:");
			lbldescripcionDelEvento.setBounds(382, 54, 117, 14);
			Cliente.add(lbldescripcionDelEvento);
			lbldescripcionDelEvento.setForeground(new Color(0, 70, 129));
			lbldescripcionDelEvento.setFont(new Font("Arial", Font.BOLD, 12));
			Cliente.add(getFecmontal());
			
	
			
			JLabel lbltotalDeDias = new JLabel("*Total d\u00EDas montaje:");
			lbltotalDeDias.setBounds(382, 112, 154, 14);
			Cliente.add(lbltotalDeDias);
			lbltotalDeDias.setForeground(new Color(0, 70, 129));
			lbltotalDeDias.setFont(new Font("Arial", Font.BOLD, 12));
			Cliente.add(getdiassm());

			Cliente.setVisible(true);
		}
		return Cliente;
	}
	
	public JButton btnNueva() {
		if (btnNueva == null) {
			try {
				btnNueva = new JButton();
				btnNueva.setIcon(new ImageIcon("Images\\home.png"));
				btnNueva.setBounds(717, 4, 76, 70);
				btnNueva.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnNueva.setName("btnNueva");				
				btnNueva.setVisible(true);
				
			} catch (java.lang.Throwable ignored) {	}
		}
		return btnNueva;
	}

	private JLabel getLblNombreDelEvento() {
		if (lblNombreDelEvento == null) {
			lblNombreDelEvento = new JLabel("*Nombre del Evento:");
			lblNombreDelEvento.setForeground(new Color(0, 70, 129));
			lblNombreDelEvento.setFont(new Font("Arial", Font.BOLD, 12));
			lblNombreDelEvento.setBounds(65, 27, 117, 14);
		}
		return lblNombreDelEvento;
	}
	@SuppressWarnings("deprecation")
	public JDateChooser getFecmontal() {
		if (fecmontal == null) {
			fecmontal = new JDateChooser();
			fecmontal.setBounds(509, 52, 180, 20);
			fecmontal.setLocale(new Locale("es"));
			fecmontal.setDateFormatString("yyyy-MM-dd");
			
			fecmontal.setNextFocusableComponent(lugarsl);
			fecmontal.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (fecmontal_.getText().length()== 33) 
					lugarsl.requestFocus();
			
				}
				
				});
		}
		return fecmontal;
	}
	private JLabel getLblhorarioDeDesmontaje_1() {
		if (lblhorarioDeDesmontaje_1 == null) {
			lblhorarioDeDesmontaje_1 = new JLabel("*Horario desmontaje:");
			lblhorarioDeDesmontaje_1.setForeground(new Color(0, 70, 129));
			lblhorarioDeDesmontaje_1.setFont(new Font("Arial", Font.BOLD, 12));
			lblhorarioDeDesmontaje_1.setBounds(383, 170, 138, 14);
		}
		return lblhorarioDeDesmontaje_1;
	}
	public JTextField getHorariodes() {
		if (horariodes == null) {
			horariodes = new JTextField();
			horariodes.setBounds(510, 168, 179, 20);
			horariodes.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (horariodes.getText().length()== 25) 
					emailsl.requestFocus();

				}
				
				});
		}
		return horariodes;
	}
	private JLabel getLblHorariosDelEvento() {
		if (lblHorariosDelEvento == null) {
			lblHorariosDelEvento = new JLabel("*Horarios del Evento:");
			lblHorariosDelEvento.setForeground(new Color(0, 70, 129));
			lblHorariosDelEvento.setFont(new Font("Arial", Font.BOLD, 12));
			lblHorariosDelEvento.setBounds(382, 27, 127, 14);
		}
		return lblHorariosDelEvento;
	}
	public JTextField getHorariose() {
		if (horariosel == null) {
			horariosel = new JTextField();
			horariosel.setBounds(509, 25, 180, 20);
			horariosel.addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyTyped(KeyEvent arg0) {
				if (horariosel.getText().length()== 28) 
					razonsociall.requestFocus();

				}
				
				});
		}
		return horariosel;
	}
	
	public JTextField getCotizacion() {
		if (cotizacion == null) {
			cotizacion = new JTextField();
			cotizacion.setText("SPC_001");
			cotizacion.setBounds(510, 226, 179, 20);
		}
		return cotizacion;
	}
	
	public JComboBox<String> getCbCotizacion() {
		if (cbCotizacion == null) {			
			cbCotizacion = new JComboBox<String>();
			cbCotizacion.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent arg0) {
				    //DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
					try {
						
						String[] evento;
						evento = datosEvento(cbCotizacion.getSelectedItem().toString());
						getnombredelevento().setText(evento[0]);
						getfechas().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(Utils.recortarFecha(evento[2])));
						getlugars().setText(evento[1]);
						getfechasd().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(Utils.recortarFecha(evento[3])));
						getFecmontal().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(Utils.recortarFecha(evento[4])));	
						getfechass().setDate(new Date());
						
						try {
							cbCotizacion.getSelectedItem().toString();
						}catch(NumberFormatException nfe) {
							System.out.println(nfe.getMessage());
						}
						System.out.println("Evento cargado ["+evento[0]+"]");

					}catch(NullPointerException npe) {
						System.out.println("Error de evento al obtener datos del evento");
						limpiarCamposEvento();
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
			});
			
			cbCotizacion.setBounds(717, 180, 82, 20);
			//cbCotizacion.addActionListener(this);
		}
		return cbCotizacion;
	}
	
		
//	public JComboBox<String[][]> getCbCotizacion() {
//	if (cbCotizacion == null) {		
//		String[][] prod = null;
//		DBConnect dbc = new DBConnect();
//		Vector<String[]> v = dbc.getProductos();
//		prod = new String[v.size()][2];
//		 for(int i=0; i<v.size(); i++){
//	            prod[i]=v.elementAt(i);		           	
//	        }
//		cbCotizacion = new JComboBox(prod);
//		cbCotizacion.setBounds(698, 219, 94, 20);
//		cbCotizacion.addActionListener(this);
//	}
//	return cbCotizacion;
//}
	
	
	
	
	@SuppressWarnings("deprecation")
	public JTextField getClienteid() {
		if (Clienteid == null) {
			Clienteid = new JTextField();
			Clienteid.setNextFocusableComponent(nombredelevento);
			Clienteid.setBounds(717, 118, 82, 20);
		}
		return Clienteid;
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*try {
		if (e.getSource() == cbCotizacion){
			String[] evento;
			evento = datosEvento(cbCotizacion.getSelectedItem().toString());
			getnombredelevento().setText(evento[0]);
			getfechas().setText(evento[2]);
			getlugars().setText(evento[1]);
			getfechasd().setText(evento[3]);
			getFecmontal().setText(evento[4]);			
					
			getCotizacion().setText(cbCotizacion.getSelectedItem().toString());		
			
		}
		}catch(NullPointerException npe) {
			System.out.println("Error de evento al obtener datos del evento");
		}*/
	}

	@Override

	public void focusLost(FocusEvent e) {//Llenar los datos del cliente en caso de que exista
		if(e.getSource()==getClienteid()&&!getClienteid().getText().equals("")) {
			cargarDatosCliente();	 
		}else {
			limpiarFormulario();
		}
	}


	public void cargarDatosCliente() {
		 String[] datosCliente = null;
		 String[] arrayNumCotizaciones = null;
		 
		 try {
			 datosCliente = datosCliente();
			 
			 if(datosCliente!=null&&!datosCliente[1].equals("")) {
				 getcliente().setText(datosCliente[1] + " " + datosCliente[2] + " " + datosCliente[3]);
				 getrazonsocial().setText(datosCliente[4]);
				 getemails().setText(datosCliente[5]);
				 gettelefonos().setText(datosCliente[6]);

					Vector<String> v = dbc.getCotizacionConsulta(getClienteid().getText());	
	                arrayNumCotizaciones = new String[v.size()];
	                
	                if(getCbCotizacion().getItemCount() != 0) {
	                	cbCotizacion.removeAllItems();
	                }
	                
	                cbCotizacion.setVisible(true);
	                cbCotizacion.addItem("Seleccione una opción");
	                
					for(int i=0; i<v.size(); i++){
							arrayNumCotizaciones[i] = v.elementAt(i);
				    }
					
					Arrays.sort(arrayNumCotizaciones);
					
					for(int j=0; j<arrayNumCotizaciones.length;j++) {
						getCbCotizacion().addItem(arrayNumCotizaciones[j]);
					}
					
					int noCotizacion;
					
					try {
						noCotizacion = Integer.parseInt(arrayNumCotizaciones[arrayNumCotizaciones.length-1])+1;
					}catch (ArrayIndexOutOfBoundsException e) {
						noCotizacion = 1;
					}
					
					cotizacion.setText("SPC_00" + noCotizacion);//asignar el numero de cotización
			 }
			 getCbCotizacion().setVisible(true);		

		 }catch(NullPointerException npe) {
			 limpiarFormulario();
				
		 }
		
	}

	public String[] datosCliente() {				
		String[] cliente;
		DBConnect dbc = new DBConnect();		 		
		cliente = dbc.getCliente(getClienteid().getText());
		if (cliente[0] != null) {						
			return cliente;	
		}
		return cliente;
	}
	
	public String[] datosEvento(String IdCotiza) {				
		String[] evento;
		DBConnect dbc = new DBConnect();		 		
		evento = dbc.getEvento(IdCotiza);
		if (evento[0] != null) {						
			return evento;	
		}
		return evento;
	}
	
	private void limpiarFormulario() {
		getcliente().setText("");
		getrazonsocial().setText("");
		getemails().setText("");
		gettelefonos().setText("");
		getClienteid().setText("");		
		getCbCotizacion().setVisible(false);
		getCotizacion().setText("SPC_001");
		getnombredelevento().setText("");
		getfechas().setCalendar(null);
		getfechasd().setCalendar(null);
		getfechass().setCalendar(null);
		getlugars().setText("");
		getFecmontal().setCalendar(null);
	}
	
	private void limpiarCamposEvento() {
		getnombredelevento().setText("");
		getfechas().setCalendar(null);
		getfechasd().setCalendar(null);
		getfechass().setCalendar(null);
		getlugars().setText("");
		getFecmontal().setCalendar(null);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		
	}
	
	public void limpiarFormPanelcolicitudC() {
		String vacio = "";
		getClienteid().setText(vacio);// limpiar cliente id
		getCbCotizacion().removeAllItems();// limpiar combo de cotizaciones
		getcliente().setText(vacio);
		getnombredelevento().setText(vacio);
		getlugars().setText(vacio);
		getfechas().setCalendar(null);
		gettelefonos().setText(vacio);
		getfechass().setCalendar(null);
		getfechasd().setCalendar(null);
		getHorariodes().setText(vacio);
		getdiassm().setText(vacio);
		getdiasse().setText(vacio);
		getrazonsocial().setText(vacio);
		getemails().setText(vacio);
		getCotizacion().setText(vacio);
		getFecmontal().setCalendar(null);
		gethorariomont().setText(vacio);
		getHorariose().setText(vacio);
		getCotizacion().setText("SPC_001");
	}
}
