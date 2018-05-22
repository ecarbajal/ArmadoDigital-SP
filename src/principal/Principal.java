package principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.itextpdf.text.DocumentException;

import componentes.CambioUsuario;
import componentes.HojaMem;
import componentes.PanelAcceso;
import componentes.PanelBotones;
import componentes.PanelCabecera;
import componentes.PanelCabecera2;
import componentes.PanelListaCotizacion;
import componentes.PanelSolicitud;
import componentes.PanelSolicitudContrato;
import componentes.PanelSolicitudContrato2;
import componentes.PanelSolicitudContrato2sp;
import componentes.PanelSolicitudContrato3;
import componentes.PanelSolicitudContrato3sp;
import componentes.PanelSolicitudContratosp;
import componentes.PanelSolicitudc;
import componentes.PanelSolicitudcc;
import componentes.PanelSolicitudl;
import creaDoc.CreaContrato;
import creaDoc.CreaContratoSPv2;
import creaDoc.CreaContratosp;
import creaDoc.CreaCotizacion;
import creaDoc.CreaCotizacion2;
import creaDoc.CreaCotizacionl;
import creaDoc.CreaHoja;
import utils.DBConnect;
import utils.Utils;

public class Principal extends JFrame implements ActionListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	public static String usuario;
	public static String fechacrl;
	public static String fechaal;
	public static String empresal;
	public static String representall;
	public static String inotariall;
	public static String fechainl;
	public static String licenciafl;
	public static String notariopl;
	public static String npdel;
	public static String deledel;
	public static String comerdel;
	public static String folioml;
	public static String domiciliol;
	public static String rfcl;
	
	public static String texto1l;
	public static String texto2l;
	public static String texto3l;
	public static String texto4l;
	public static String texto5l;
	public static String texto6l;
	public static String texto7l;
	public static String fechafcl;
	public static String fechafml;
	public static String montotl;
	public static String mensuall;
	public static String productos;
	public static String cliente;
	public static String cotizacion;
	public static String horariomon;
	public static String horariose;
	public static String horades;
	public static String fecmonta;
	public static String fecha;
	public static String descripcionev;
	public static String horariodesm;
	public static String lugar;
	public static String descripcionh;
	public static String productosl;
	public static String clientel;
	public static String horariomont;
	public static String fechal;
	public static String descripcionevl;
	public static String lugarl;
	public static String descripcionhl;

	public static String fechacrlsp;
	public static String fechaalsp;
	public static String empresalsp;
	public static String representallsp;
	public static String inotariallsp;
	public static String fechainlsp;
	public static String licenciaflsp;
	public static String notarioplsp;
	public static String npdelsp;
	public static String deledelsp;
	public static String comerdelsp;
	public static String foliomlsp;
	public static String domiciliolsp;
	public static String rfclsp;
	public static String texto1lsp;
	public static String texto2lsp;
	public static String texto3lsp;
	public static String texto4lsp;
	public static String texto5lsp;
	public static String texto6lsp;
	public static String texto7lsp;
	public static String fechafclsp;
	public static String fechafmlsp;
	public static String montotlsp;
	public static String mensuallsp;
	public static String productossp;
	public static String clientesp;
	public static String fechasp;
	public static String descripcionevsp;
	public static String lugarsp;
	public static String descripcionhsp;
	public static String productoslsp;
	public static String clientelsp;
	public static String fechalsp;
	public static String descripcionevlsp;
	public static String lugarlsp;
	public static String descripcionhlsp;

	public static String telefono;
	public static String contacto;
	public static String fechaso;
	public static String fechade;
	public static String horariode;
	public static String diasmo;
	public static String diasev;
	public static String email;
	public static String cantidads;
	public static String diass;
	public static String comboBox;
	public static String descripcion;
	public static String preciouni;
	public static String unidad;
	public static String telefonol;
	public static String contactol;
	public static String domicilioenl;
	public static String domiciliorel;
	public static String fechasol;
	public static String fechadel;
	public static String horariodel;
	public static String diasmol;
	public static String diasevl;
	public static String emaill;
	public static String cantidadsl;
	public static String diassl;
	public static String comboBoxl;
	public static String descripcionl;
	public static String preciounil;
	public static String unidadl;
	public static String cua;
	// private static String idUser;
	public static String estructura = "_Certificado_Nombre";
	public static String rfc;
	public static String cobranza;
	public static String fecIniVig;
	public static String fecFinVig;
	private JScrollPane frmPrincipal;
	private PanelBotones panelBotones;
	private CambioUsuario cambioUsuario;
	private PanelAcceso panelAcceso;
	private PanelSolicitud sol;
	private PanelListaCotizacion lc;
	private HojaMem HojaScroll;
	private PanelSolicitudc Solc;
	private PanelSolicitudcc Solcc;
	private PanelSolicitudl Sol2;
	private PanelSolicitudContrato Solcon1;
	private PanelSolicitudContrato2 Solcon2;
	private PanelSolicitudContrato3 Solcon3;
	private PanelSolicitudContratosp Solcon1sp;
	private PanelSolicitudContrato2sp Solcon2sp;
	private PanelSolicitudContrato3sp Solcon3sp;
	private PanelCabecera panelCabecera;
	private PanelCabecera2 panelCabecera2;
	// private String nNegocio = "";
	String[] cargas;
	String[] movimientos;
	String[] polizas;
	String st = "", user = "", Prodcutos = "";
	int contpol = 0, contmov = 0, contpp = 0;
	int contprod = 0;
	int numeroc = 0;
	int ca = 0;
	int contrato = 0;
	int contrato2 = 0;
	int ol = 0;
	int contrato3 = 0;
	int subtotal = 0;
	int grantotal = 0;
	int iva16 = 0;
	int contrato4 = 0;
	int contratosp = 0;
	int contrato2sp = 0;
	int contrato3sp = 0;
	int contrato4sp = 0;
	int fechac = 0;
	int agregal = 0;
	int agrega = 0;
	int contprodl = 0;
	String subtotalc = "";
	String grantotalc = "";
	String iva16c = "";
	public boolean ejecutar = false;
	public boolean ejecutarPool = false;
	String[] datos = new String[] { "", "" };
	int cantidadcl[] = new int[200];
	String clacificaion[] = new String[200];
	int diascl[] = new int[200];
	String boxl[] = new String[200];
	String unidadcl[] = new String[200];
	int precioucl[] = new int[200];
	String descripcioncl[] = new String[200];
	String clacificacion[] = new String[200];
	String box[] = new String[200];
	String unidadc[] = new String[200];
	String descripcionc[] = new String[200];
	String descripcionc0[] = new String[200];
	String descripcionc3[] = new String[200];
	String cad3[] = new String[161];
	String cad4[] = new String[161];
	String cad = "";
	String cad2 = "";

	String cantidadc[] = new String[200];
	int cantidadcm[] = new int[200];

	String importec[] = new String[200];
	int importecm[] = new int[200];

	String diasc[] = new String[200];
	int diascm[] = new int[200];

	String preciouc[] = new String[200];
	int precioucm[] = new int[200];
	DBConnect dbc = new DBConnect();

	// Variables contrato SP
	private static String nombreempresa;
	private static String representanteLegal;
	private static String instrumentoPublico;
	private static String fechaInstPublico;
	private static String notarioPublico;
	private static String licenciado;
	private static String rfcContratoSP;
	private static String objetoSocial;
	private static String domicilioEmpresa;
	private static String rfcPrestador = "";
	private static String nombreEvento;
	private static String diasNaturalesPago;
	private static String inicioContrato;
	private static String finContrato;
	private static String ciudadInstPub;
	private static double primerAnticipo;
	private static double segundoAnticipo;
	private static int DiasSegundoAnticipo;
	private String vacio = "";

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Principal window = new Principal();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		initialize();
		try {
			setIconImage (new ImageIcon(getClass().getResource("/images/logosp.png")).getImage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	private void initialize() {
		setTitle("Armado Digital SP");
		setName("Armado Digital SP");
		setBounds(340, 100, 886, 500);
		setContentPane(getFrmPrincipal());
		getPanelBotones().setVisible(false);
		getCambioUsuario().setVisible(false);
		getPanelSolicitud().setVisible(false);
		getHojaMem().setVisible(false);
		getPanelSolicitudc().setVisible(false);
		getPanelSolicitudcc().setVisible(false);
//		getPanelSolicitudcl().setVisible(false);
		getPanelListaCotizacion().setVisible(false);
		getPanelSolicitud().botonAgregar().addActionListener(this);
		getHojaMem().getbotonGenerar().addActionListener(this);
		getPanelSolicitudcc().BotonSiguientec().addActionListener(this);
		getPanelSolicitudc().BotonSiguientec().addActionListener(this);
		getPanelSolicitudContrato().BotonSiguientec().addActionListener(this);
		getPanelSolicitudContrato2().BotonSiguientec2().addActionListener(this);
		getPanelSolicitudContrato3().BotonSiguientec3().addActionListener(this);
		getPanelSolicitudContratosp().BotonSiguientec().addActionListener(this);
		getPanelSolicitudContrato2sp().BotonSiguientec2().addActionListener(this);
		getPanelSolicitudContrato3sp().BotonSiguientec3().addActionListener(this);
		getPanelSolicitud().btnGenerac().addActionListener(this);
		getPanelSolicitud().btnNueva().addActionListener(this);
		getPanelListaCotizacion().getBtnNueva().addActionListener(this);
		getPanelSolicitudc().btnNueva().addActionListener(this);
		getPanelSolicitudl().botonAgregarl().addActionListener(this);
		getPanelSolicitudl().btnGeneracl().addActionListener(this);
		getCambioUsuario().getBtnCambiou().addActionListener(this);
		getPanelBotones().getBtnCotizadorsp().addActionListener(this);
		getPanelBotones().getBtnContratos().addActionListener(this);
		getPanelBotones().getBtnbtnContratossp().addActionListener(this);
		getPanelBotones().getBtnListacotiza().addActionListener(this);
		getPanelBotones().getBtnHojam().addActionListener(this);
		getPanelBotones().getbtnCotizadorled().addActionListener(this);
		getHojaMem().getBtnRegresar().addActionListener(this);// Action listener boton regresar en hoja membretada
		getPanelSolicitudContratosp().getbtnNueva().addActionListener(this);// Action listener boton regresar a inicio desde contrato sp
		getPanelSolicitudContrato().getBtnNueva().addActionListener(this);// Action listener boton regresar a inicio desde contratos led
		getPanelListaCotizacion().getBtnNuevaCotizacion().addActionListener(this);// Action listener agregar cotizacion desde la lista de cotizaciones

		this.addMouseMotionListener(this);
		this.removeMouseMotionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public JScrollPane getFrmPrincipal() {
		if (frmPrincipal == null) {
			frmPrincipal = new JScrollPane();
			frmPrincipal.setBounds(0, 0, 900, 500);
			frmPrincipal.setBackground(Color.white);
			frmPrincipal.setLayout(null);
			frmPrincipal.add(getPanelBotones());
			frmPrincipal.add(getHojaMem());
			frmPrincipal.add(getPanelSolicitud());
			frmPrincipal.add(getCambioUsuario());
			frmPrincipal.add(getPanelSolicitudContrato());
			frmPrincipal.add(getPanelSolicitudContrato2());
			frmPrincipal.add(getPanelSolicitudContrato3());
			frmPrincipal.add(getPanelSolicitudContratosp());
			frmPrincipal.add(getPanelSolicitudContrato2sp());
			frmPrincipal.add(getPanelSolicitudContrato3sp());
			frmPrincipal.add(getPanelSolicitudl());
			frmPrincipal.add(getPanelSolicitudc());
			frmPrincipal.add(getPanelSolicitudcc());
			frmPrincipal.add(getPanelAcceso());
			frmPrincipal.add(getPanelCabecera());
			frmPrincipal.add(getPanelCabecera2());
			frmPrincipal.add(getPanelListaCotizacion());
			frmPrincipal.setVisible(true);
		}
		return frmPrincipal;
	}

	public PanelAcceso getPanelAcceso() {
		if (panelAcceso == null) {
			panelAcceso = new PanelAcceso();
			panelAcceso.setBounds(0, 368, 1000, 93);
			panelAcceso.getBotonAceptar().setSize(94, 23);
			panelAcceso.getLabelPass().setSize(369, 23);
			panelAcceso.getLabelUser().setSize(369, 23);
			panelAcceso.getTextPass().setSize(394, 23);
			panelAcceso.getTextUser().setSize(394, 23);
			panelAcceso.getTextPass().setLocation(200, 193);
			panelAcceso.getTextUser().setLocation(250, 148);
			panelAcceso.getBotonAceptar().setLocation(388, 257);
			panelAcceso.getBotonAceptar().addActionListener(this);
			panelAcceso.getBotonAceptar().setForeground(new Color(255, 255, 255));
			panelAcceso.getBotonAceptar().setFont(new Font("Tahoma", Font.PLAIN, 11));
			panelAcceso.getBotonAceptar().setBackground(new Color(18, 43, 74));
			panelAcceso.getLabelPass().setText("Contrase\u00F1a");
			panelAcceso.getLabelUser().setText("Usuario");
			panelAcceso.getTextUser().setForeground(new Color(102, 102, 102));
			panelAcceso.getTextPass().setForeground(new Color(102, 102, 102));
			panelAcceso.getLabelUser().setLocation(294, 148);
			panelAcceso.getLabelPass().setLocation(294, 193);
			panelAcceso.setVisible(true);
		}
		return panelAcceso;
	}

	public PanelBotones getPanelBotones() {
		if (panelBotones == null) {

			panelBotones = new PanelBotones();
			panelBotones.setBounds(334, 25, 200, 238);
			panelBotones.getBtnCotizadorsp().setSize(172, 30);
			panelBotones.getBtnCotizadorsp().setLocation(10, 5);
			panelBotones.getbtnCotizadorled().setLocation(10, 46);
			panelBotones.getbtnCotizadorled().setSize(172, 30);
			panelBotones.getBtnListacotiza().setLocation(10, 87);
			panelBotones.getBtnListacotiza().setSize(172, 30);
			panelBotones.getBtnContratos().setSize(172, 30);
			panelBotones.getBtnContratos().setLocation(10, 169);
			panelBotones.getBtnbtnContratossp().setSize(172, 30);
			panelBotones.getBtnbtnContratossp().setLocation(10, 128);
			panelBotones.getBtnHojam().setSize(172, 30);
			panelBotones.getBtnHojam().setLocation(10, 210);
			panelBotones.setVisible(false);
		}
		return panelBotones;
	}

	public CambioUsuario getCambioUsuario() {
		if (cambioUsuario == null) {

			cambioUsuario = new CambioUsuario();
			cambioUsuario.setBounds(740, 360, 125, 100);
			cambioUsuario.getBtnCambiou().setSize(63, 60);

			cambioUsuario.setVisible(true);
		}
		return cambioUsuario;
	}

	public PanelCabecera getPanelCabecera() {
		if (panelCabecera == null) {
			panelCabecera = new PanelCabecera();
			panelCabecera.setBounds(0, 270, 1000, 90);
			panelCabecera.setVisible(true);

		}
		return panelCabecera;
	}

	public PanelCabecera2 getPanelCabecera2() {
		if (panelCabecera2 == null) {
			panelCabecera2 = new PanelCabecera2();
			panelCabecera2.setBounds(-60, 65, 1000, 300);
			panelCabecera2.setVisible(true);

		}
		return panelCabecera2;
	}

	public PanelSolicitud getPanelSolicitud() {
		if (sol == null) {
			sol = new PanelSolicitud();
			sol.setBounds(0, 0, 950, 276);
			sol.getsol().setBounds(0, 0, 900, 274);
			sol.setVisible(false);
		}
		return sol;
	}

	public PanelListaCotizacion getPanelListaCotizacion() {
		if (lc == null) {
			lc = new PanelListaCotizacion();
			lc.setBounds(034, 15, 810, 288);
			lc.setVisible(false);
		}
		return lc;
	}

	public PanelSolicitudContrato getPanelSolicitudContrato() {
		if (Solcon1 == null) {
			Solcon1 = new PanelSolicitudContrato();
			Solcon1.setBounds(0, 0, 886, 276);
			Solcon1.getClientecon().setBounds(0, 0, 800, 274);
			Solcon1.setVisible(false);
		}
		return Solcon1;
	}

	public PanelSolicitudContrato2 getPanelSolicitudContrato2() {
		if (Solcon2 == null) {
			Solcon2 = new PanelSolicitudContrato2();
			Solcon2.setBounds(0, 0, 886, 276);
			Solcon2.getClientecon().setBounds(0, 0, 800, 274);
			Solcon2.setVisible(false);
		}
		return Solcon2;
	}

	public PanelSolicitudContrato3 getPanelSolicitudContrato3() {
		if (Solcon3 == null) {
			Solcon3 = new PanelSolicitudContrato3();
			Solcon3.setBounds(0, 0, 886, 276);
			Solcon3.getClientecon().setBounds(0, 0, 800, 274);
			Solcon3.setVisible(false);
		}
		return Solcon3;
	}

	public PanelSolicitudContratosp getPanelSolicitudContratosp() {
		if (Solcon1sp == null) {
			Solcon1sp = new PanelSolicitudContratosp();
			Solcon1sp.setBounds(0, 0, 886, 276);
			Solcon1sp.getClientecon().setBounds(0, 0, 800, 274);
			Solcon1sp.setVisible(false);
		}
		return Solcon1sp;
	}

	public PanelSolicitudContrato2sp getPanelSolicitudContrato2sp() {
		if (Solcon2sp == null) {
			Solcon2sp = new PanelSolicitudContrato2sp();
			Solcon2sp.setBounds(0, 0, 886, 276);
			Solcon2sp.getClientecon().setBounds(0, 0, 800, 274);
			Solcon2sp.setVisible(false);
		}
		return Solcon2sp;
	}

	public PanelSolicitudContrato3sp getPanelSolicitudContrato3sp() {
		if (Solcon3sp == null) {
			Solcon3sp = new PanelSolicitudContrato3sp();
			Solcon3sp.setBounds(0, 0, 886, 276);
			Solcon3sp.getClientecon().setBounds(0, 0, 800, 274);
			Solcon3sp.setVisible(false);
		}
		return Solcon3sp;
	}

	public PanelSolicitudl getPanelSolicitudl() {
		if (Sol2 == null) {
			Sol2 = new PanelSolicitudl();
			Sol2.setBounds(0, 0, 886, 276);
			Sol2.getsol2().setBounds(0, 0, 800, 274);
			Sol2.setVisible(false);
		}
		return Sol2;
	}

	public HojaMem getHojaMem() {
		if (HojaScroll == null) {
			HojaScroll = new HojaMem();
			HojaScroll.setBounds(0, 0, 1000, 900);
			HojaScroll.setVisible(false);
		}
		return HojaScroll;
	}

	public PanelSolicitudc getPanelSolicitudc() {
		if (Solc == null) {
			Solc = new PanelSolicitudc();
			Solc.setBounds(0, 0, 846, 276);
			Solc.setVisible(false);
		}
		return Solc;
	}

	public PanelSolicitudcc getPanelSolicitudcc() {
		if (Solcc == null) {
			Solcc = new PanelSolicitudcc();
			Solcc.setBounds(0, 0, 846, 276);
			Solcc.getCliente().setBounds(0, 0, 900, 285);
			Solcc.setVisible(false);
		}
		return Solcc;
	}

	// private void ejecutaProcesos() {
	// try {
	// getPanelBotones().getBtnCotizadorsp().setEnabled(false);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	@Override
	@SuppressWarnings("unlikely-arg-type")
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == getPanelAcceso().getBotonAceptar()) {
			if (getPanelAcceso().getTextUser().getText().equals(vacio)
					|| getPanelAcceso().getTextPass().equals(vacio)) {
				String st = "Debe informarse el Usuario y Password";
				JOptionPane.showMessageDialog(null, st);
			} else {
				String datos[] = getPanelAcceso().validar();
				if (!datos[0].equals(vacio)) {
					//usuario = datos[1] + " " + datos[2] + " " + datos[3];
					getPanelAcceso().setVisible(false);
					getPanelBotones().setVisible(true);
					getCambioUsuario().setVisible(true);
					getPanelCabecera2().setVisible(true);
					getPanelCabecera2().setBounds(-400, 350, 1500, 110);
					System.out.println("Logueo correcto");
				}
			}
		}

		else if (arg0.getSource() == getPanelBotones().getBtnListacotiza()) {
			getPanelBotones().setVisible(false);
			getPanelListaCotizacion().setVisible(true);
		}

		else if (arg0.getSource() == getCambioUsuario().getBtnCambiou()) {

			initialize();
			getPanelAcceso().setVisible(true);
			getPanelCabecera2().setVisible(true);

			// Ocultar el formulario de solicitud de contrato
			getPanelSolicitudContrato().setVisible(false);
			// Ocultar el formulario de solicitud de contrato
			getPanelSolicitudContratosp().setVisible(false);
			// Ocultar el formulario de solicitud de contrato sp2
			getPanelSolicitudContrato2sp().setVisible(false);
			

			getPanelCabecera2().setBounds(-60, 65, 1000, 300);
			getPanelAcceso().getTextUser().setText(vacio);
			getPanelAcceso().getTextPass().setText(vacio);

		}

		else if (arg0.getSource() == getPanelSolicitud().btnGenerac()) {
			if (agrega < 1) {
				st = "Favor de agregar minimo 1 producto";
				JOptionPane.showMessageDialog(null, st);
			} else {
				if (agrega > 0 && agrega < 2) {
					subtotal = importecm[0];
				}
				if (agrega > 1 && agrega < 3) {
					subtotal = importecm[0] + importecm[1];
				}
				if (agrega > 2 && agrega < 4) {
					subtotal = importecm[0] + importecm[1] + importecm[2];
				}
				if (agrega > 3 && agrega < 5) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3];
				}
				if (agrega > 4 && agrega < 6) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4];
				}
				if (agrega > 5 && agrega < 7) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5];
				}
				if (agrega > 6 && agrega < 8) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6];
				}
				if (agrega > 7 && agrega < 9) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7];
				}
				if (agrega > 8 && agrega < 10) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8];
				}
				if (agrega > 9 && agrega < 11) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9];
				}
				if (agrega > 10 && agrega < 12) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10];
				}
				if (agrega > 11 && agrega < 13) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11];
				}
				if (agrega > 12 && agrega < 14) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12];
				}
				if (agrega > 13 && agrega < 15) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13];
				}
				if (agrega > 14 && agrega < 16) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14];
				}
				if (agrega > 15 && agrega < 17) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15];
				}
				if (agrega > 16 && agrega < 18) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16];
				}
				if (agrega > 17 && agrega < 19) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17];
				}
				if (agrega > 18 && agrega < 20) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18];
				}
				if (agrega > 19 && agrega < 21) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19];
				}
				if (agrega > 20 && agrega < 22) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20];
				}
				if (agrega > 21 && agrega < 23) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21];
				}
				if (agrega > 22 && agrega < 24) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22];
				}
				if (agrega > 23 && agrega < 25) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23];
				}
				if (agrega > 24 && agrega < 26) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24];
				}
				if (agrega > 25 && agrega < 27) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25];
				}
				if (agrega > 26 && agrega < 28) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25] + importecm[26];
				}
				if (agrega > 27 && agrega < 29) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25] + importecm[26]
							+ importecm[27];
				}
				if (agrega > 28 && agrega < 30) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25] + importecm[26]
							+ importecm[27] + importecm[28];
				}
				if (agrega > 29 && agrega < 31) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25] + importecm[26]
							+ importecm[27] + importecm[28] + importecm[29];
				}
				if (agrega > 30 && agrega < 32) {
					subtotal = importecm[0] + importecm[1] + importecm[2] + importecm[3] + importecm[4] + importecm[5]
							+ importecm[6] + importecm[7] + importecm[8] + importecm[9] + importecm[10] + importecm[11]
							+ importecm[12] + importecm[13] + importecm[14] + importecm[15] + importecm[16]
							+ importecm[17] + importecm[18] + importecm[19] + importecm[20] + importecm[21]
							+ importecm[22] + importecm[23] + importecm[24] + importecm[25] + importecm[26]
							+ importecm[27] + importecm[28] + importecm[29] + importecm[30];
				}

				iva16 = subtotal * 16 / 100;

				grantotal = iva16 + subtotal;

				grantotalc = Integer.toString(grantotal);
				iva16c = Integer.toString(iva16);
				subtotalc = Integer.toString(subtotal);
				if (agrega < 7) {
					CreaCotizacion ccn = new CreaCotizacion(cliente, cantidadc, unidadc, preciouc, descripcionc,
							contacto, telefono, email, lugar, fecha, diasc, descripcionev, box, fechaso, fechade,
							horariode, diasmo, diasev, clacificacion, fecmonta, horades, horariose, horariodesm,
							horariomont, cotizacion, importec, descripcionc0, descripcionc3, agrega, subtotalc,
							grantotalc, iva16c);
					try {
						// fecha = getPanelSolicitudc().getfechas().getText();
						ccn.creaCotizaSP(cliente, cantidadc, unidadc, preciouc, descripcionc, contacto, telefono, email,
								lugar, fecha, diasc, descripcionev, box, fechaso, fechade, horariode, diasmo, diasev,
								clacificacion, fecmonta, horades, horariose, horariodesm, horariomont, cotizacion,
								importec, descripcionc0, descripcionc3, agrega, subtotalc, grantotalc, iva16c);

						st = "La cotizacion se genero Correctamente";
						JOptionPane.showMessageDialog(null, st);
						getPanelBotones().setVisible(true);
						getPanelSolicitud().setVisible(false);
						
						getPanelSolicitud().limpiarFormPanelSolicitud();
						getPanelSolicitud().textArea().setText(vacio);
						getPanelSolicitudc().limpiarFormPanelcolicitudC();
						
						getPanelSolicitudc().getCbCotizacion().setVisible(false);
						int control = 0;
						while (importec[control] != null) {
							unidadc[control] = vacio;
							descripcionc[control] = vacio;
							descripcionc0[control] = vacio;
							descripcionc3[control] = vacio;
							clacificacion[control] = vacio;
							precioucm[control] = 0;
							diascm[control] = 0;
							cantidadcm[control] = 0;
							importecm[control] = 0;
							importec[control] = vacio;
							diasc[control] = vacio;
							cantidadc[control] = vacio;
							preciouc[control] = vacio;
							control++;
						}
						agrega = 0;
						contprod = 0;
					} catch (IOException e) {
						e.printStackTrace();
					} catch (DocumentException e) {
						e.printStackTrace();
					}
				}
				if (agrega > 6 && agrega < 13) {
					CreaCotizacion2 ccn = new CreaCotizacion2(cliente, cantidadc, unidadc, preciouc, descripcionc,
							contacto, telefono, email, lugar, fecha, diasc, descripcionev, box, fechaso, fechade,
							horariode, diasmo, diasev, clacificacion, fecmonta, horades, horariose, horariodesm,
							horariomont, cotizacion, importec, descripcionc0, descripcionc3, agrega, subtotalc,
							grantotalc, iva16c);
					try {
						ccn.creaCotizaSP(cliente, cantidadc, unidadc, preciouc, descripcionc, contacto, telefono, email,
								lugar, fecha, diasc, descripcionev, box, fechaso, fechade, horariode, diasmo, diasev,
								clacificacion, fecmonta, horades, horariose, horariodesm, horariomont, cotizacion,
								importec, descripcionc0, descripcionc3, agrega, subtotalc, grantotalc, iva16c);
						st = "La cotizacion se genero Correctamente";
						JOptionPane.showMessageDialog(null, st);
						getPanelBotones().setVisible(true);
						getPanelSolicitud().setVisible(false);
						
						getPanelSolicitud().limpiarFormPanelSolicitud();
						getPanelSolicitudc().limpiarFormPanelcolicitudC();

						agrega = 0;
						contprod = 0;
					} catch (IOException e) {
						e.printStackTrace();
					} catch (DocumentException e) {
						e.printStackTrace();
					}
				}
				if (agrega > 12) {
					CreaCotizacion2 ccn = new CreaCotizacion2(cliente, cantidadc, unidadc, preciouc, descripcionc,
							contacto, telefono, email, lugar, fecha, diasc, descripcionev, box, fechaso, fechade,
							horariode, diasmo, diasev, clacificacion, fecmonta, horades, horariose, horariodesm,
							horariomont, cotizacion, importec, descripcionc0, descripcionc3, agrega, subtotalc,
							grantotalc, iva16c);
					try {
						ccn.creaCotizaSP(cliente, cantidadc, unidadc, preciouc, descripcionc, contacto, telefono, email,
								lugar, fecha, diasc, descripcionev, box, fechaso, fechade, horariode, diasmo, diasev,
								clacificacion, fecmonta, horades, horariose, horariodesm, horariomont, cotizacion,
								importec, descripcionc0, descripcionc3, agrega, subtotalc, grantotalc, iva16c);
						st = "La cotizacion se genero Correctamente";
						JOptionPane.showMessageDialog(null, st);
						getPanelBotones().setVisible(true);
						getPanelSolicitud().setVisible(false);
						
						getPanelSolicitud().limpiarFormPanelSolicitud();
						getPanelSolicitudc().limpiarFormPanelcolicitudC();
						
						agrega = 0;
						contprod = 0;
					} catch (IOException e) {
						e.printStackTrace();
					} catch (DocumentException e) {
						e.printStackTrace();
					}
				}
			}
		}

		else if (arg0.getSource() == getPanelSolicitudl().btnGeneracl()) {
			if (agregal < 1) {
				st = "Favor de agregar minimo 1 producto";
				JOptionPane.showMessageDialog(null, st);
			} else {
				CreaCotizacionl ccn = new CreaCotizacionl(clientel, cantidadcl, unidadcl, precioucl, descripcioncl,
						contactol, telefonol, emaill, lugarl, fechal, diascl, descripcionevl, boxl, domiciliorel,
						domicilioenl, fechasol, fechadel, horariodel, diasmol, diasevl);
				try {
					ccn.creaCotizaSPl(clientel, cantidadcl, unidadcl, precioucl, descripcioncl, contactol, telefonol,
							emaill, lugarl, fechal, diascl, descripcionevl, boxl, domiciliorel, domicilioenl, fechasol,
							fechadel, horariodel, diasmol, diasevl);
					st = "La cotizacion se genero Correctamente";
					JOptionPane.showMessageDialog(null, st);
					getPanelBotones().setVisible(true);
					getPanelSolicitudl().setVisible(false);
					getPanelSolicitudl().getDescripcionl().setText(vacio);
					getPanelSolicitudl().getUnidadl().setText(vacio);
					getPanelSolicitudl().getPrecioul().setText(vacio);
					getPanelSolicitudl().getUnidadl().setText(vacio);
					getPanelSolicitudl().textArea().setText(vacio);

					agregal = 0;
					contprodl = 0;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (DocumentException e) {
					e.printStackTrace();
				}
			}
		} else if (arg0.getSource() == getPanelSolicitudContrato().BotonSiguientec()) {
			if (getPanelSolicitudContrato().getempresa().getText().equals(vacio)
					|| getPanelSolicitudContrato().getrepresental().getText().equals(vacio)) {
				st = "Favor de llenar los campos solicitados";
				JOptionPane.showMessageDialog(null, st);
			} else {
				empresal = getPanelSolicitudContrato().getempresa().getText();
				representall = getPanelSolicitudContrato().getrepresental().getText();
				inotariall = getPanelSolicitudContrato().getinotarial().getText();
				fechainl = getPanelSolicitudContrato().getfechain().getText();
				licenciafl = getPanelSolicitudContrato().getlicenciaf().getText();
				notariopl = getPanelSolicitudContrato().getnotariop().getText();
				npdel = getPanelSolicitudContrato().getnpde().getText();
				deledel = getPanelSolicitudContrato().getdelede().getText();
				comerdel = getPanelSolicitudContrato().getcomerde().getText();
				folioml = getPanelSolicitudContrato().getfoliom().getText();
				fechafml = getPanelSolicitudContrato().getfechafm().getText();
				domiciliol = getPanelSolicitudContrato().getdomicilio().getText();
				rfcl = getPanelSolicitudContrato().getrfc().getText();
				
				getPanelSolicitud().limpiarFormPanelSolicitud();
				
				contrato++;
				getPanelSolicitudContrato().setVisible(false);
				getPanelSolicitudContrato2().setVisible(true);
			}
		}

		else if (arg0.getSource() == getPanelSolicitudContratosp().BotonSiguientec()) { // Primera pantalla de contrato SP
			try {
				nombreempresa = getPanelSolicitudContratosp().gettxtNombreEmpresa().getText().trim().toUpperCase();
				representanteLegal = getPanelSolicitudContratosp().gettxtRepreLegal().getText().trim().toUpperCase();
				instrumentoPublico = getPanelSolicitudContratosp().gettxtInstPublico().getText().trim().toUpperCase();
				fechaInstPublico = sdf.format(getPanelSolicitudContratosp().getDteInstrumentoPublico().getDate());
				notarioPublico = getPanelSolicitudContratosp().gettxtNotPcoFe().getText().trim().toUpperCase();
				licenciado = getPanelSolicitudContratosp().gettxtLicenciado().getText().trim().toUpperCase();
				rfcContratoSP = getPanelSolicitudContratosp().gettxtRfc().getText().trim().toUpperCase();
				objetoSocial = getPanelSolicitudContratosp().gettxtObjSocial().getText().trim().toUpperCase();
				domicilioEmpresa = getPanelSolicitudContratosp().gettxtDomiclioEmpresa().getText().trim().toUpperCase();
				//rfcPrestador = getPanelSolicitudContratosp().getTxtRFCPrestador().getText().trim().toUpperCase();
				ciudadInstPub = getPanelSolicitudContratosp().getTxtCiudadInstPublico().getText().trim().toUpperCase();
				if (nombreempresa.equals(vacio) || representanteLegal.equals(vacio) || instrumentoPublico.equals(vacio)
						|| fechaInstPublico.equals(vacio) || notarioPublico.equals(vacio) || licenciado.trim().equals(vacio)
						|| rfcContratoSP.equals(vacio) || objetoSocial.equals(vacio) || domicilioEmpresa.equals(vacio)
						|| /*rfcPrestador.equals(vacio) || */ciudadInstPub.equals(vacio) || fechaInstPublico == null) {
					st = "Favor de llenar los campos solicitados";
					Utils.muestraMensaje(st);
				} else {
					getPanelSolicitudContratosp().setVisible(false);
					getPanelSolicitudContrato2sp().setVisible(true);
				}
				
			}catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Debe ingresar una fecha válida", "ERROR", JOptionPane.ERROR_MESSAGE);
				System.out.println("ERROR "+e.getMessage());
			}
			

			

		}

		else if (arg0.getSource() == getPanelSolicitudContrato2sp().BotonSiguientec2()) {
			
			try {

			nombreEvento = getPanelSolicitudContrato2sp().getTxtNombreEvento().getText().trim().toUpperCase();
			diasNaturalesPago = getPanelSolicitudContrato2sp().getTxtDiasNatPago().getText().trim().toUpperCase();
			inicioContrato = sdf.format(getPanelSolicitudContrato2sp().getDteInicioContrato().getDate());
			finContrato = sdf.format(getPanelSolicitudContrato2sp().getDteFinContrato().getDate());
			try {
				
			primerAnticipo = Double.parseDouble(getPanelSolicitudContrato2sp().getTxtPrimerAnticipo().getText().trim());
			segundoAnticipo = Double.parseDouble(getPanelSolicitudContrato2sp().getTxtSegundoAnticipo().getText().trim());
			DiasSegundoAnticipo = Integer.parseInt(getPanelSolicitudContrato2sp().getTxtDiasSegundoPago().getText().trim());
			
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Debe ingresar una valor númerico válido", "ERROR", JOptionPane.ERROR_MESSAGE);
				System.out.println(nfe.getMessage());
			}
			
			

			if (nombreEvento.equals(vacio) || diasNaturalesPago.equals(vacio) || inicioContrato.equals(vacio)
					|| finContrato.equals(vacio) || primerAnticipo == 0.0 || segundoAnticipo == 0.0 || DiasSegundoAnticipo == 0) {
				Utils.muestraMensaje("Debes llenar todos los campos");
			} else {
				CreaContratoSPv2 ccsp = new CreaContratoSPv2();

				ccsp.creaHoja(nombreempresa, representanteLegal, instrumentoPublico, fechaInstPublico, notarioPublico,
						licenciado, rfcContratoSP, objetoSocial, domicilioEmpresa, rfcPrestador, nombreEvento,
						diasNaturalesPago, inicioContrato, finContrato, ciudadInstPub,primerAnticipo,segundoAnticipo, DiasSegundoAnticipo);
				
				getPanelSolicitudContratosp().limpiarFormPnlSolicitudContSP();
				
				getPanelSolicitudContrato2sp().limpiarFormPnlSolicitudCont2SP();

				getPanelSolicitudContratosp().setVisible(false);
				getPanelSolicitudContrato2sp().setVisible(false);
				getPanelBotones().setVisible(true);

			}
			
			}catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Debe ingresar una fecha válida", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			

		}

		else if (arg0.getSource() == getPanelSolicitudContrato2().BotonSiguientec2()) {
			if (getPanelSolicitudContrato2().getmontot().getText().equals(vacio)
					|| getPanelSolicitudContrato2().getmensual().getText().equals(vacio)) {
				st = "Favor de llenar los campos solicitados";
				JOptionPane.showMessageDialog(null, st);
			} else {
				fechacrl = getPanelSolicitudContrato2().getfechacr().getText();
				fechaal = getPanelSolicitudContrato2().getfechaa().getText();
				fechafcl = getPanelSolicitudContrato2().getfechafc().getText();
				montotl = getPanelSolicitudContrato2().getmontot().getText();
				mensuall = getPanelSolicitudContrato2().getmensual().getText();
				getPanelSolicitudContrato2().getfechacr().setText(vacio);
				getPanelSolicitudContrato2().getfechaa().setText(vacio);
				getPanelSolicitudContrato2().getfechafc().setText(vacio);
				getPanelSolicitudContrato2().getmontot().setText(vacio);
				getPanelSolicitudContrato2().getmensual().setText(vacio);
				contrato2++;
				getPanelSolicitudContrato2().setVisible(false);
				getPanelSolicitudContrato3().setVisible(true);
			}
		}

		else if (arg0.getSource() == getPanelSolicitudContrato3().BotonSiguientec3()) {
			if (getPanelSolicitudContrato3().gettexto1().getText().equals(vacio)) {
				st = "Favor de llenar la descripcion";
				JOptionPane.showMessageDialog(null, st);
			} else {
				texto1l = getPanelSolicitudContrato3().gettexto1().getText();
				texto2l = getPanelSolicitudContrato3().gettexto2().getText();
				texto3l = getPanelSolicitudContrato3().gettexto3().getText();
				texto4l = getPanelSolicitudContrato3().gettexto4().getText();
				texto5l = getPanelSolicitudContrato3().gettexto5().getText();
				texto6l = getPanelSolicitudContrato3().gettexto6().getText();
				texto7l = getPanelSolicitudContrato3().gettexto7().getText();
				CreaContrato cch = new CreaContrato(empresal, representall, inotariall, fechainl, licenciafl, notariopl,
						npdel, deledel, comerdel, folioml, fechafml, domiciliol, rfcl, fechacrl, fechaal, fechafcl,
						montotl, mensuall, texto1l, texto2l, texto3l, texto4l, texto5l, texto6l, texto7l);
				try {
					cch.creaHoja(empresal, representall, inotariall, fechainl, licenciafl, notariopl, npdel, deledel,
							comerdel, folioml, fechafml, domiciliol, rfcl, fechacrl, fechaal, fechafcl, montotl,
							mensuall, texto1l, texto2l, texto3l, texto4l, texto5l, texto6l, texto7l);
					st = "El Contrato se genero Correctamente";
					JOptionPane.showMessageDialog(null, st);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (DocumentException e) {
					e.printStackTrace();
				}
				getPanelSolicitudContrato3().gettexto1().setText(vacio);
				getPanelSolicitudContrato3().gettexto2().setText(vacio);
				getPanelSolicitudContrato3().gettexto3().setText(vacio);
				getPanelSolicitudContrato3().gettexto4().setText(vacio);
				getPanelSolicitudContrato3().gettexto5().setText(vacio);
				getPanelSolicitudContrato3().gettexto6().setText(vacio);
				getPanelSolicitudContrato3().gettexto7().setText(vacio);
				contrato3++;
				getPanelBotones().setVisible(true);
				getPanelSolicitudContrato3sp().setVisible(false);
			}
		}

		else if (arg0.getSource() == getPanelSolicitudContrato3sp().BotonSiguientec3()) {
			if (getPanelSolicitudContrato3sp().gettexto1().getText().equals(vacio)) {
				st = "Favor de llenar la descripcion";
				JOptionPane.showMessageDialog(null, st);
			} else {
				texto1lsp = getPanelSolicitudContrato3sp().gettexto1().getText();
				texto2lsp = getPanelSolicitudContrato3sp().gettexto2().getText();
				texto3lsp = getPanelSolicitudContrato3sp().gettexto3().getText();
				texto4lsp = getPanelSolicitudContrato3sp().gettexto4().getText();
				texto5lsp = getPanelSolicitudContrato3sp().gettexto5().getText();
				texto6lsp = getPanelSolicitudContrato3sp().gettexto6().getText();
				texto7lsp = getPanelSolicitudContrato3sp().gettexto7().getText();
				CreaContratosp cch = new CreaContratosp(empresalsp, representallsp, inotariallsp, fechainlsp,
						licenciaflsp, notarioplsp, npdelsp, deledelsp, comerdelsp, foliomlsp, fechafmlsp, domiciliolsp,
						rfclsp, fechacrlsp, fechaalsp, fechafclsp, montotlsp, mensuallsp, texto1lsp, texto2lsp,
						texto3lsp, texto4lsp, texto5lsp, texto6lsp, texto7lsp);
				try {
					cch.creaHoja(empresalsp, representallsp, inotariallsp, fechainlsp, licenciaflsp, notarioplsp,
							npdelsp, deledelsp, comerdelsp, foliomlsp, fechafmlsp, domiciliolsp, rfclsp, fechacrlsp,
							fechaalsp, fechafclsp, montotlsp, mensuallsp, texto1lsp, texto2lsp, texto3lsp, texto4lsp,
							texto5lsp, texto6lsp, texto7lsp);
					st = "El Contrato se genero Correctamente";
					JOptionPane.showMessageDialog(null, st);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (DocumentException e) {
					e.printStackTrace();
				}
				getPanelSolicitudContrato3sp().gettexto1().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto2().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto3().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto4().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto5().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto6().setText(vacio);
				getPanelSolicitudContrato3sp().gettexto7().setText(vacio);
				contrato3++;
				getPanelBotones().setVisible(true);
				getPanelSolicitudContrato3sp().setVisible(false);
			}
		}

		else if (arg0.getSource() == getPanelBotones().getbtnCotizadorled()) {
			setBounds(350, 100, 862, 500);
			getPanelBotones().setVisible(false);
		}

		else if (arg0.getSource() == getPanelSolicitud().botonAgregar()) {// validaciones del boton agregar en la
																			// cotizacion
			if (getPanelSolicitud().getTextFieldPreciou().getText().equals(vacio)) {
				st = "Debe llenar los campos solicitados";
				Utils.muestraMensaje(st);
			} else if (getPanelSolicitud().getCmbClasificacion().getSelectedIndex() == 0) {
				st = "Debe seleccionar una clasificación";
				Utils.muestraMensaje(st);
			} else if (Utils.validaNumerosNegativos(getPanelSolicitud().getcantidads().getValue().toString())
					|| Utils.validaNumerosNegativos(getPanelSolicitud().getdiass().getValue().toString())) {
				st = "Debe ingresar cantidades validas";
				Utils.muestraMensaje(st);

			} else {

				// Recuperar texto del text area

				String[] lineasTexto = getPanelSolicitud().gettaDescripcion().getText().trim().split("\n");
				String vl1;
				String vl2;
				String vl3;

				if (getPanelSolicitud().gettaDescripcion().getText().trim() != null
						|| !getPanelSolicitud().gettaDescripcion().getText().trim().equals(vacio)) {
					try {
						vl1 = !(lineasTexto[0].equals(vacio) || lineasTexto[0] == null) ? lineasTexto[0]
								: "       ---------------------------------------------";
					} catch (ArrayIndexOutOfBoundsException npe) {
						vl1 = "       ---------------------------------------------";
					}

					try {
						vl2 = !(lineasTexto[1].equals(vacio) || lineasTexto[1] == null) ? lineasTexto[1]
								: "       ---------------------------------------------";
					} catch (ArrayIndexOutOfBoundsException npe) {
						vl2 = "       ---------------------------------------------";
					}

					try {
						vl3 = !(lineasTexto[2].equals(vacio) || lineasTexto[2] == null) ? lineasTexto[2]
								: "       ---------------------------------------------";
					} catch (ArrayIndexOutOfBoundsException npe) {
						vl3 = "       ---------------------------------------------";
					}

				} else {
					vl1 = "       ---------------------------------------------";
					vl2 = "       ---------------------------------------------";
					vl3 = "       ---------------------------------------------";
				}

				unidadc[contprod] = getPanelSolicitud().getTextFieldUnidad().getText().toString();
				descripcionc[contprod] = vl1;
				descripcionc0[contprod] = vl2;
				descripcionc3[contprod] = vl3;
				clacificacion[contprod] = getPanelSolicitud().getCmbClasificacion().getSelectedItem().toString();
				precioucm[contprod] = Integer.parseInt(getPanelSolicitud().getTextFieldPreciou().getText());
				diascm[contprod] = (Integer) getPanelSolicitud().getdiass().getValue();
				cantidadcm[contprod] = (Integer) getPanelSolicitud().getcantidads().getValue();
				importecm[contprod] = cantidadcm[contprod] * precioucm[contprod] * diascm[contprod];
				importec[contprod] = Integer.toString(importecm[contprod]);
				diasc[contprod] = Integer.toString(diascm[contprod]);
				cantidadc[contprod] = Integer.toString(cantidadcm[contprod]);
				preciouc[contprod] = Integer.toString(precioucm[contprod]);
				agrega++;
				getPanelSolicitud().textArea()
						.setText(String.valueOf(getPanelSolicitud().textArea().getText() + "           "
								+ clacificacion[contprod] + "\n" + cantidadc[contprod] + " " + descripcionc0[contprod]
								+ " - " + diasc[contprod] + " " + "días" + "     " + "$     " + importec[contprod]
								+ "\n"));
				contprod++;

				getPanelSolicitud().limpiarFormPanelSolicitud();
			}
		}

		else if (arg0.getSource() == getPanelSolicitudl().botonAgregarl()) {
			if (getPanelSolicitudl().getDescripcionl().getText().equals(vacio)
					|| getPanelSolicitudl().getPrecioul().getText().equals(vacio)) {
				st = "Debe llenar los campos solicitados";
				JOptionPane.showMessageDialog(null, st);
			} else {
				cantidadcl[contprodl] = getPanelSolicitudl().getcantidadl().getComponentCount();
				unidadcl[contprodl] = getPanelSolicitudl().getUnidadl().getText();
				precioucl[contprodl] = getPanelSolicitudl().getPrecioul().getComponentCount();
				descripcioncl[contprodl] = getPanelSolicitudl().getDescripcionl().getText();
				agregal++;
				getPanelSolicitudl().textArea()
						.setText(String.valueOf(getPanelSolicitudl().textArea().getText() + cantidadcl[contprodl] + " "
								+ descripcioncl[contprodl] + " - " + diascl[contprodl] + " " + "días" + "\n"));
				contprodl++;
				getPanelSolicitudl().getDescripcionl().setText(vacio);
				getPanelSolicitudl().getcantidadl().setValue(0);
				getPanelSolicitudl().getUnidadl().setText(vacio);
				getPanelSolicitudl().getPrecioul().setText(vacio);
			}
		} else if (arg0.getSource() == getPanelBotones().getBtnHojam()) {
			setBounds(200, 0, 900, 720);
			getHojaMem().setVisible(true);
			getPanelBotones().setVisible(false);
			getPanelCabecera().setVisible(false);
			getPanelSolicitud().setVisible(false);
			getCambioUsuario().setVisible(true);
		} else if (arg0.getSource() == getPanelBotones().getBtnCotizadorsp()) {
			setBounds(350, 100, 862, 500);
			getPanelBotones().setVisible(false);
			getPanelSolicitudc().setVisible(true);
		}

		else if (arg0.getSource() == getPanelBotones().getBtnContratos()) {
			setBounds(350, 100, 862, 500);
			getPanelBotones().setVisible(false);
			getPanelSolicitudContrato().setVisible(true);
		}

		else if (arg0.getSource() == getPanelBotones().getBtnbtnContratossp()) {
			setBounds(350, 100, 862, 500);
			getPanelBotones().setVisible(false);
			getPanelSolicitudContratosp().setVisible(true);
		}

		else if (arg0.getSource() == getPanelSolicitudc().BotonSiguientec()) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			// System.out.println(sdf.format(getPanelSolicitudc().getfechasd().getDate()));

			if (getPanelSolicitudc().getdiassm().getText().equals(vacio)
					|| getPanelSolicitudc().getdiasse().getText().equals(vacio)
					|| getPanelSolicitudc().getHorariodes().getText().equals(vacio)
					|| sdf.format(getPanelSolicitudc().getfechasd().getDate()).equals(vacio)
					|| sdf.format(getPanelSolicitudc().getfechasd().getDate()).equals(vacio)
					|| sdf.format(getPanelSolicitudc().getfechas().getDate()).equals(vacio)
					|| getPanelSolicitudc().getnombredelevento().getText().equals(vacio)
					|| getPanelSolicitudc().getlugars().getText().equals(vacio)
					|| getPanelSolicitudc().getcliente().getText().equals(vacio)
					|| getPanelSolicitudc().getrazonsocial().getText().equals(vacio)
					|| getPanelSolicitudc().gettelefonos().getText().equals(vacio)) {

				st = "Favor de llenar los campos solicitados";
				JOptionPane.showMessageDialog(null, st);
			} else {
				cliente = getPanelSolicitudc().getcliente().getText();
				descripcionev = getPanelSolicitudc().getnombredelevento().getText();
				fecha = sdf.format(getPanelSolicitudc().getfechas().getDate());
				lugar = getPanelSolicitudc().getlugars().getText();
				contacto = getPanelSolicitudc().getrazonsocial().getText();
				telefono = getPanelSolicitudc().gettelefonos().getText();
				email = getPanelSolicitudc().getemails().getText();
				fechaso = sdf.format(getPanelSolicitudc().getfechass().getDate());
				fechade = sdf.format(getPanelSolicitudc().getfechasd().getDate());
				horariode = getPanelSolicitudc().getHorariodes().getText();
				diasmo = getPanelSolicitudc().getdiassm().getText();
				diasev = getPanelSolicitudc().getdiasse().getText();
				fecmonta = sdf.format(getPanelSolicitudc().getFecmontal().getDate());
				horades = getPanelSolicitudc().getHorariodes().getText();
				horariose = getPanelSolicitudc().getHorariose().getText();
				horariomont = getPanelSolicitudc().gethorariomont().getText();
				horariodesm = getPanelSolicitudc().getHorariodes().getText();
				cotizacion = getPanelSolicitudc().getCotizacion().getText();
				getPanelBotones().setVisible(false);
				getPanelSolicitud().textArea()
						.setText(String.valueOf(getPanelSolicitud().textArea().getText() + cliente + "\n"));
				getPanelSolicitud().setVisible(true);
				getPanelSolicitudc().setVisible(false);
			}
		}

		else if (arg0.getSource() == getPanelSolicitudContrato().BotonSiguientec()) {
			setBounds(350, 100, 862, 500);
			getPanelSolicitudContrato2().setVisible(true);
			getPanelSolicitudContrato().setVisible(false);
		}

		else if (arg0.getSource() == getPanelSolicitudContrato2().BotonSiguientec2()) {
			setBounds(350, 100, 862, 500);
			getPanelSolicitudContrato2().setVisible(false);
			getPanelSolicitudContrato().setVisible(false);
			getPanelSolicitudContrato3().setVisible(true);
		}

		else if (arg0.getSource() == getHojaMem().getbotonGenerar()) {
			if (getHojaMem().getTaPrueba().getText().trim().equals(vacio)) {
				st = "Favor de Agregar Texto";
				Utils.muestraMensaje(st);
			} else if (getHojaMem().gettextDescripcionh().getText().trim().equals(vacio)) {
				st = "Debe agregar una descripción";
				Utils.muestraMensaje(st);
			} else {
				descripcionh = getHojaMem().gettextDescripcionh().getText();
				CreaHoja cch = new CreaHoja();
				try {
					cch.creaHojaMem(descripcionh);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (DocumentException e) {
					e.printStackTrace();
				}
				st = "El archivo fue generado correctamente";
				Utils.muestraMensaje(st);
				setBounds(350, 100, 880, 500);
				getPanelCabecera().setVisible(true);
				getPanelBotones().setVisible(true);
				getPanelSolicitud().setVisible(false);
				getHojaMem().setVisible(false);
				getHojaMem().getTaPrueba().setText(vacio);
				getHojaMem().gettextDescripcionh().setText(vacio);
				getHojaMem().getTaPrueba().requestFocus();
			}
		}

		else if (arg0.getSource() == getPanelSolicitud().btnNueva()) {
			getPanelBotones().setVisible(true);
			getPanelSolicitud().setVisible(false);
			getPanelSolicitudc().setVisible(false);
			getPanelSolicitudContratosp().setVisible(false);
			getPanelSolicitudContrato2sp().setVisible(false);
			
			getPanelSolicitudc().limpiarFormPanelcolicitudC();
			
			getPanelSolicitud().limpiarFormPanelSolicitud();
			
			
			int control = 0;
			while (importec[control] != null) {
				unidadc[control] = vacio;
				descripcionc[control] = vacio;
				descripcionc0[control] = vacio;
				descripcionc3[control] = vacio;
				clacificacion[control] = vacio;
				precioucm[control] = 0;
				diascm[control] = 0;
				cantidadcm[control] = 0;
				importecm[control] = 0;
				importec[control] = vacio;
				diasc[control] = vacio;
				cantidadc[control] = vacio;
				preciouc[control] = vacio;
				control++;
			}
		}

		else if (arg0.getSource() == getPanelSolicitud().btnNueva()) {
			getPanelBotones().setVisible(true);
			getPanelSolicitud().setVisible(false);
			getPanelSolicitudc().setVisible(false);
			
			getPanelSolicitudc().limpiarFormPanelcolicitudC();
			
			getPanelSolicitud().limpiarFormPanelSolicitud();
			
			
			int control = 0;
			while (importec[control] != null) {
				unidadc[control] = vacio;
				descripcionc[control] = vacio;
				descripcionc0[control] = vacio;
				descripcionc3[control] = vacio;
				clacificacion[control] = vacio; 
				precioucm[control] = 0;
				diascm[control] = 0;
				cantidadcm[control] = 0;
				importecm[control] = 0;
				importec[control] = vacio;
				diasc[control] = vacio;
				cantidadc[control] = vacio;
				preciouc[control] = vacio;
				control++;
			}
		}

		else if (arg0.getSource() == getPanelListaCotizacion().getBtnNueva()) {

			getPanelBotones().setVisible(true);
			getPanelListaCotizacion().setVisible(false);
		}

		else if (arg0.getSource() == getPanelSolicitudc().btnNueva()) {// Limpiar las cajas de texto cada que se abre el
																		// panel de cotizacion sp
			
			System.out.println("Limpia el formulario");
			getPanelBotones().setVisible(true);
			getPanelSolicitud().setVisible(false);
			getPanelSolicitudc().setVisible(false);
			 
			getPanelSolicitudc().limpiarFormPanelcolicitudC();
			
			getPanelSolicitud().limpiarFormPanelSolicitud();
			
			
			int control = 0;
			while (importec[control] != null) {
				unidadc[control] = vacio;
				descripcionc[control] = vacio;
				descripcionc0[control] = vacio;
				descripcionc3[control] = vacio;
				clacificacion[control] = vacio;
				precioucm[control] = 0;
				diascm[control] = 0;
				cantidadcm[control] = 0;
				importecm[control] = 0;
				importec[control] = vacio;
				diasc[control] = vacio;
				cantidadc[control] = vacio;
				preciouc[control] = vacio;
				control++;
			}
		} else if (arg0.getSource() == getHojaMem().getBtnRegresar()) {// Funcion del boton "Regresar" en la página de
																		// Hoja membretada
			getHojaMem().setVisible(false);
			getPanelBotones().setVisible(true);
			getPanelCabecera().setVisible(true);
			getPanelCabecera2().setVisible(true);
			getCambioUsuario().setVisible(true);
			HojaScroll.setVisible(false);
			setBounds(350, 100, 880, 500);
		} else if (arg0.getSource() == getPanelSolicitudContratosp().getbtnNueva()) {// Boton de regresar a página de
																						// inicio desde la pantalla de
																						// contrato sp
			getPanelSolicitudContratosp().setVisible(false);
			getPanelBotones().setVisible(true);
			getPanelCabecera().setVisible(true);
			getPanelCabecera2().setVisible(true);
			getCambioUsuario().setVisible(true);
			getPanelSolicitudContrato2sp().setVisible(false);
			
			getPanelSolicitudContratosp().limpiarFormPnlSolicitudContSP();
			getPanelSolicitudContrato2sp().limpiarFormPnlSolicitudCont2SP();
			
		} else if (arg0.getSource() == getPanelSolicitudContrato().getBtnNueva()) {
			getPanelSolicitudContrato().setVisible(false);
			getPanelBotones().setVisible(true);
			getPanelCabecera().setVisible(true);
			getPanelCabecera2().setVisible(true);
			getCambioUsuario().setVisible(true);
		} else if (arg0.getSource() == getPanelListaCotizacion().getBtnNuevaCotizacion()) {
			try {
				String[] armarRuta = getPanelListaCotizacion().getArbolDirectorios().getSelectionPath().toString()
						.split(",");
				String ruta = armarRuta[1].trim();
				if (JOptionPane.showConfirmDialog(null, "¿Desea crear una nueva cotización para el cliente "
						+ ruta.substring(0, ruta.length() - 1) + "?") == 0) {
					getPanelSolicitudc().getClienteid().setText(dbc.getIdCliente(ruta.substring(0, ruta.length() - 1)));
					getPanelSolicitudc().cargarDatosCliente();
					getPanelSolicitudc().getnombredelevento().requestFocus();
					getPanelSolicitudc().setVisible(true);
					getPanelListaCotizacion().setVisible(false);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "¡Debe seleccionar un archivo!", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

	}


	public String getIdUser() {
		return this.user;
	}

	/*
	 * public void setIdUser(String idUser) { 
	 * 		Principal.idUser = usuario; this.user = idUser; 
	 * }
	 */

}