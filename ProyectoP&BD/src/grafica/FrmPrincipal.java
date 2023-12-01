package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logica.AlumnoDAO;
import logica.ArrayAlumno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

public class FrmPrincipal extends JFrame {

	public static ArrayAlumno coleccion = new ArrayAlumno();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public FrmPrincipal() {
		setTitle("Mi Bibloteca");
		setSize(496, 671);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlSocio = new JPanel();
		pnlSocio.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Socios", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSocio.setBounds(43, 71, 395, 190);
		contentPane.add(pnlSocio);
		pnlSocio.setLayout(null);
		
		JButton btnAlumno = new JButton("Nuevo Alumno");
		btnAlumno.setHorizontalAlignment(SwingConstants.LEFT);
		btnAlumno.setFont(new Font("Nirmala UI", Font.PLAIN, 13));
		
		
		btnAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlReAlumno ReAl = new PnlReAlumno();
				ReAl.setVisible(true);
				dispose();	
			}
		});
		
		btnAlumno.setBounds(18, 30, 174, 42);
		btnAlumno.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/IcAgregar.png")));//////////////////////////
		pnlSocio.add(btnAlumno);

		
		JButton btnBuscarAlumno = new JButton("Buscar Alumno");
		btnBuscarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlBuscarAlumno BusAl = new PnlBuscarAlumno();
				BusAl.setVisible(true);
				dispose();	
			}
		});
		
		btnBuscarAlumno.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/IcBuscar.png")));
		btnBuscarAlumno.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnBuscarAlumno.setBounds(18, 136, 174, 42);
		pnlSocio.add(btnBuscarAlumno);
		
		JPanel pnlAdmin = new JPanel();
		pnlAdmin.setBorder(new TitledBorder(null, "Administraci\u00F3n", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		pnlAdmin.setLayout(null);
		pnlAdmin.setBounds(43, 330, 395, 196);
		contentPane.add(pnlAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrmPrincipal.class.getResource("/images/Backgroud_Original.png")));
		//lblNewLabel.setIcon(new ImageIcon("G:\\Proyect_02\\Imag\\BackGround\\Backgroud_Original.png"));
		lblNewLabel.setBounds(0, 0, 480, 632);
		contentPane.add(lblNewLabel);
	}
	
	//La clase principal
		public static void main(String[] args) {
			FrmPrincipal inicio = new FrmPrincipal();
			inicio.setVisible(true);
			

		}
}
