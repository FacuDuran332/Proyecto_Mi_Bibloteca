package grafica;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.PopupMenu;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logica.AlumnoDAO;
import logica.ArrayAlumno;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PnlTablaAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel miModelo;
	private Vector<?> titilos;
	private JScrollPane scrPanel;//barra de desplazamiento	
	private Component pnlAlumno;
	private JTable tablaAlumno;

	public PnlTablaAlumno() {
		setTitle("Lista de Alumnos Registrados");
		setSize(265, 226);
		iniciarComponentes();
		iniciarManejadoresEventos();
		cargarTabla();
		iniciarTabla();
	}

	//Metodo donde se ordena los compenentes
	private void iniciarComponentes() {
		setBounds(100, 100, 280, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlAlumno = new JPanel();
		pnlAlumno.setBounds(38, 38, 421, 491);
		contentPane.add(pnlAlumno);
		pnlAlumno.setLayout(null);
		
		JScrollPane scrPane = new JScrollPane();
		scrPane.setBounds(10, 11, 401, 469);
		pnlAlumno.add(scrPane);
		
		tablaAlumno = new JTable();
		scrPane.setColumnHeaderView(tablaAlumno);
		
		JLabel lblBackGroundTabla = new JLabel("");
		lblBackGroundTabla.setIcon(new ImageIcon(PnlTablaAlumno.class.getResource("/images/Backgroud_Buscar_Alumno.png")));
		lblBackGroundTabla.setBounds(0, 0, 502, 579);
		contentPane.add(lblBackGroundTabla);
		
	}
	
	//Metodo donde se ordena los eventos
	private void iniciarManejadoresEventos() {
		// TODO Auto-generated method stub
		
	}
	
	//Se crearia la tabla
	private void iniciarTabla() {
		scrPanel = new JScrollPane();
		//pnlAlumno.add(scrPanel, BorderLayout.CENTER);
		
		tablaAlumno = new JTable();
		scrPanel.setViewportView(tablaAlumno);
		
		getContentPane().add(pnlAlumno);
		pack();	
		String titulos[]={"Cedula","Nombre","Telefono","Direccion","Fecha","Edad","Grupo"};
		miModelo=new DefaultTableModel(null,titulos);
		tablaAlumno.setModel(miModelo);
	}

	
	//Se cargaria los datos a la tabla
	private void cargarTabla() {
		AlumnoDAO aDAO=new AlumnoDAO();						//agregue
		ArrayAlumno listado=aDAO.ArrayAlumno();  			//cambie
		
		String fila[]=new String[miModelo.getColumnCount()];
       	try{
	      	for(int i=0;i<listado.cantidad();i++){
	      		fila[0]=String.valueOf(listado.devolver(i).getCIa());
	      		fila[1]=listado.devolver(i).getNombre();
	      		fila[2]=String.valueOf(listado.devolver(i).getTelefono());
	      		fila[3]=listado.devolver(i).getDireccion();
	      		fila[4]=String.valueOf(listado.devolver(i).getfNac());
	      		fila[5]=String.valueOf(listado.devolver(i).getEdad());
	      		fila[6]=listado.devolver(i).getGrupo();
	      		miModelo.addRow(fila);
	      	}
	        tablaAlumno.setModel(miModelo);
       	}catch (Exception e) {
       		System.out.println("error"+e);
       	}
	}
}
