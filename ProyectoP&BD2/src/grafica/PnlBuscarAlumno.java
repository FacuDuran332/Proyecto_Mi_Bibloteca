package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import logica.AlumnoDAO;
import logica.AlumnoVO;


import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlBuscarAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCI;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtFecha;
	private JTextField txtEdad;
	private JTextField txtGrupo;

	public PnlBuscarAlumno() {
		setTitle("Buscar Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolverBuscar = new JButton("Volver");
		btnVolverBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmPrincipal MePri = new FrmPrincipal();
				MePri.setVisible(true);
				dispose();
			}
		});
		btnVolverBuscar.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		btnVolverBuscar.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/IcAtras.png")));
		btnVolverBuscar.setBounds(69, 521, 141, 42);
		contentPane.add(btnVolverBuscar);
		
		JPanel pnlIngresar = new JPanel();
		pnlIngresar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingrese C\u00E9dula:", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlIngresar.setBounds(69, 48, 339, 127);
		contentPane.add(pnlIngresar);
		pnlIngresar.setLayout(null);
		
		JLabel lblCI = new JLabel("CÃ©dula:");
		lblCI.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblCI.setBounds(28, 32, 70, 23);
		pnlIngresar.add(lblCI);
		
		txtCI = new JTextField();
		txtCI.setBounds(110, 30, 133, 25);
		pnlIngresar.add(txtCI);
		txtCI.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			private Object coleccion;

			public void actionPerformed(ActionEvent e) {
				AlumnoVO BusAl=new AlumnoVO();
				int CedulaAl = 0;
				try{
					CedulaAl=Integer.parseInt(txtCI.getText());
					//BusAl=coleccion.obtenerXCedula(CedulaAl); 	//
					AlumnoDAO alDAO=new AlumnoDAO();	     //agregue
					BusAl=alDAO.buscarXCedula(CedulaAl); 	//cambie
					if (BusAl!=null){
							txtNombre.setText(BusAl.getNombre());
							txtDireccion.setText(BusAl.getDireccion());
							txtTelefono.setText(String.valueOf(BusAl.getTelefono()));
							txtFecha.setText(String.valueOf(BusAl.getfNac()));
							txtEdad.setText(String.valueOf(BusAl.getEdad()));
							txtGrupo.setText(BusAl.getGrupo());
					}if (BusAl==null) { 
						
					
						JOptionPane.showMessageDialog(null, "Alumno no" + " encontrada \n");
					limpiarInfo();
					}
				}catch (Exception e1){
							JOptionPane.showMessageDialog(null, "La cÃ©dula "
							+ "debe ser numÃ©rica  \n");
				}
				
			}
				
		});
		
		btnBuscar.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		btnBuscar.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/IcBuscar.png")));
		btnBuscar.setBounds(180, 73, 133, 38);
		pnlIngresar.add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnoVO ElAl=new AlumnoVO();
				int CedulaAl = 0;
				int eliminarOky;
				try{
					CedulaAl=Integer.parseInt(txtCI.getText());
					AlumnoDAO alDAO=new AlumnoDAO();
					eliminarOky=alDAO.eliminarAlumno(CedulaAl);
					if (eliminarOky == 1){
						JOptionPane.showMessageDialog(null, "Alumno"
								+ " eliminado \n");
					
						
							
					
				}else
					if (eliminarOky == 0) {
						JOptionPane.showMessageDialog(null, "Alumno no"
								+ " eliminado \n");
					}
					
			}catch (Exception e1){
						JOptionPane.showMessageDialog(null, "La cÃ©dula "
						+ "debe ser numÃ©rica  \n");
			}
				
		}
		});
		
		
		
		btnEliminar.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/IcEliminar.png")));
		btnEliminar.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		btnEliminar.setBounds(10, 73, 145, 38);
		pnlIngresar.add(btnEliminar);
		
		JButton btnLimpiarCi = new JButton("");
		btnLimpiarCi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCI.setText(null);
			}
		});
		
		btnLimpiarCi.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/IcLimpiar.png")));
		btnLimpiarCi.setBounds(253, 24, 60, 33);
		pnlIngresar.add(btnLimpiarCi);
		
		JPanel pnlInformacion = new JPanel();
		pnlInformacion.setBorder(new TitledBorder(null, "Informaci\u00F3n del Alumno:", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		pnlInformacion.setBounds(69, 195, 339, 304);
		contentPane.add(pnlInformacion);
		pnlInformacion.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblNombre.setBounds(24, 32, 67, 14);
		pnlInformacion.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setFont(txtNombre.getFont().deriveFont(txtNombre.getFont().getStyle() | Font.BOLD));
		txtNombre.setEnabled(false);
		txtNombre.setEditable(false);
		txtNombre.setBounds(166, 31, 150, 20);
		pnlInformacion.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("DirecciÃ³n:");
		lblDireccion.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblDireccion.setBounds(24, 65, 75, 14);
		pnlInformacion.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setEnabled(false);
		txtDireccion.setEditable(false);
		txtDireccion.setBounds(166, 64, 150, 20);
		pnlInformacion.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("TelefÃ³no:");
		lblTelefono.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblTelefono.setBounds(24, 99, 67, 14);
		pnlInformacion.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setEnabled(false);
		txtTelefono.setBounds(166, 98, 150, 20);
		pnlInformacion.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha de Nacimiento:");
		lblFecha.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblFecha.setBounds(24, 134, 141, 14);
		pnlInformacion.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setEditable(false);
		txtFecha.setBounds(166, 133, 150, 20);
		pnlInformacion.add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblEdad.setBounds(24, 170, 67, 14);
		pnlInformacion.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		txtEdad.setEnabled(false);
		txtEdad.setBounds(166, 169, 150, 20);
		pnlInformacion.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Grupo:");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 209, 54, 14);
		pnlInformacion.add(lblNewLabel);
		
		txtGrupo = new JTextField();
		txtGrupo.setEditable(false);
		txtGrupo.setEnabled(false);
		txtGrupo.setBounds(166, 208, 150, 20);
		pnlInformacion.add(txtGrupo);
		txtGrupo.setColumns(10);
		
		JButton btnLimpiarInfo = new JButton("Limpiar");
		btnLimpiarInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				limpiarInfo();
				
			}
		});
		btnLimpiarInfo.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/IcLimpiar.png")));
		btnLimpiarInfo.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		btnLimpiarInfo.setBounds(105, 248, 141, 34);
		pnlInformacion.add(btnLimpiarInfo);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon(PnlBuscarAlumno.class.getResource("/images/Backgroud_Original.png")));
		lblBackGround.setBounds(0, 0, 475, 632);
		contentPane.add(lblBackGround);
	}
	
	public void limpiarInfo() {
		txtNombre.setText(null);
		txtDireccion.setText(null);
		txtTelefono.setText(" ");
		txtFecha.setText(null);
		txtEdad.setText(" ");
		txtGrupo.setText(null);
	}
}
