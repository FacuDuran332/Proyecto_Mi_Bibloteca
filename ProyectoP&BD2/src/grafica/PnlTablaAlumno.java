package grafica;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logica.AlumnoDAO;
import logica.ArrayAlumno;

import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlTablaAlumno extends JFrame {

	private JPanel contentPane;
	
	private Container pnlAlumno;
	private DefaultTableModel miModelo;
	private JTable tablaAlumno;
	private JScrollPane scrLista;

	private JButton btnActualizar;


	public PnlTablaAlumno() {
		setTitle("Lista de Alumnos");
		setSize(132, 205);
		setBounds(100, 100, 284, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlAlumno = new JPanel();
		pnlAlumno.setBounds(28, 37, 419, 535);
		contentPane.add(pnlAlumno);
		pnlAlumno.setLayout(null);
		
		JScrollPane scrLista = new JScrollPane();
		scrLista.setBounds(0, 0, 419, 535);
		pnlAlumno.add(scrLista);
		
		tablaAlumno = new JTable();
		scrLista.setViewportView(tablaAlumno);
		
		
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTabla();
			}
		});
		
		scrLista = new JScrollPane();
		pnlAlumno.add(scrLista);
		
		tablaAlumno = new JTable();
		scrLista.setViewportView(tablaAlumno);

	
		String titulos[]={"Cedula","Nombre","Telefono","Direccion","Fecha","Edad","Grupo"};
		miModelo=new DefaultTableModel(null,titulos);
		tablaAlumno.setModel(miModelo);
		
		
		btnActualizar.setBounds(57, 594, 89, 23);
		contentPane.add(btnActualizar);
		
		cargarTabla();
		pack();	
	}

	
	
	private void iniciarTabla() {
		
	}
	
	private void cargarTabla() {
		AlumnoDAO aDAO=new AlumnoDAO();						//agregue
		ArrayAlumno listado=aDAO.listaAlumno();  			//cambie
		
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
