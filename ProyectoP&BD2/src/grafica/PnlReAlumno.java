package grafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.time.LocalDate;/////////////////
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import logica.*;

public class PnlReAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCi, txtNombre, txtTelefono, txtDireccion, txtGrupo;
	private JDateChooser dateChooser;
	private JButton btnRegistrar, btnLimpiar, btnVolverAgregar;
	private LocalDate Ahora;
	


	

	public PnlReAlumno() {
		setTitle("Registar Alumno");
		setSize(436, 566);
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	
		private void iniciarComponentes() {
			setBounds(100, 100, 436, 566);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Registrar Alumno", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(44, 63, 338, 357);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblCIal = new JLabel("C.I :");
			lblCIal.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCIal.setBounds(32, 42, 46, 14);
			panel.add(lblCIal);
			
			JLabel lblNombreAl = new JLabel("Nombre:");
			lblNombreAl.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombreAl.setBounds(32, 78, 63, 14);
			panel.add(lblNombreAl);
			
			JLabel lblTelefono = new JLabel("Teléfono:");
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTelefono.setBounds(32, 113, 63, 14);
			panel.add(lblTelefono);
			
			JLabel lblNewLabel = new JLabel("Dirección:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(32, 148, 63, 14);
			panel.add(lblNewLabel);
			
			JLabel lblfNacimiento = new JLabel("Fecha de Nacimiento:");
			lblfNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblfNacimiento.setBounds(32, 183, 129, 14);
			panel.add(lblfNacimiento);
			
			JLabel lblGrupo = new JLabel("Grupo:");
			lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblGrupo.setBounds(32, 216, 46, 14);
			panel.add(lblGrupo);
			
			txtCi = new JTextField();
			txtCi.setColumns(10);
			txtCi.setBounds(177, 40, 129, 20);
			panel.add(txtCi);
			
			txtNombre = new JTextField();
			txtNombre.setText("");
			txtNombre.setBounds(177, 76, 128, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(177, 111, 129, 20);
			panel.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(177, 146, 128, 20);
			panel.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			txtGrupo = new JTextField();
			txtGrupo.setText("");
			txtGrupo.setBounds(177, 214, 129, 20);
			panel.add(txtGrupo);
			txtGrupo.setColumns(10);
			
			btnLimpiar = new JButton("Limpiar");
			
			btnLimpiar.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
			btnLimpiar.setIcon(new ImageIcon(PnlReAlumno.class.getResource("/images/IcLimpiar.png")));
			btnLimpiar.setBounds(10, 258, 151, 39);
			panel.add(btnLimpiar);
			
			dateChooser = new JDateChooser();
			dateChooser.setBounds(177, 183, 129, 20);
			panel.add(dateChooser);
			
			btnRegistrar = new JButton("Registrar");
			
			btnRegistrar.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
			btnRegistrar.setIcon(new ImageIcon(PnlReAlumno.class.getResource("/images/IcGuardar.png")));
			btnRegistrar.setBounds(171, 258, 152, 39);
			panel.add(btnRegistrar);
			
			btnVolverAgregar = new JButton("Volver");

			btnVolverAgregar.setIcon(new ImageIcon(PnlReAlumno.class.getResource("/images/IcAtras.png")));
			btnVolverAgregar.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
			btnVolverAgregar.setBounds(44, 432, 145, 39);
			contentPane.add(btnVolverAgregar);
			
			JLabel lblBackGroundAlumno = new JLabel("");
			lblBackGroundAlumno.setIcon(new ImageIcon(PnlReAlumno.class.getResource("/images/Backgroud_Alumno.png")));
			lblBackGroundAlumno.setBounds(0, 0, 418, 530);
			contentPane.add(lblBackGroundAlumno);
			
		}
		
	private void iniciarManejadoresEventos() {
			
		
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
							int anio = dateChooser.getCalendar().get(Calendar.YEAR);
							int mes = dateChooser.getCalendar().get(Calendar.MONTH)+1;/////////////////////
							int dia = dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
							
							int CiAl=Integer.valueOf(txtCi.getText());
							String NombreAl=txtNombre.getText();
							int TelefonoAl=Integer.valueOf(txtTelefono.getText());
							String DireccionAl=txtDireccion.getText();
							LocalDate fechaNac = LocalDate.of(anio,mes,dia);///////////////////////
							//int EdadAl=Integer.valueOf(txtEdad.getText());
							String Grupo=txtGrupo.getText();
							
							LocalDate Ahora = LocalDate.now();
						
							
							int edadActual = Ahora.getYear() - fechaNac.getYear();
							
							
							
							AlumnoVO reAl = new AlumnoVO(CiAl, NombreAl, TelefonoAl, DireccionAl, edadActual, Grupo, fechaNac);
							AlumnoDAO aDAO= new AlumnoDAO();/////////////////////////
							
							
							
							
							
							aDAO.insertarAlumno(reAl);/////////////////////////
							 JOptionPane.showMessageDialog(null, 
						    		   "Datos guardados ok","Mensaje ",
						    		   JOptionPane.INFORMATION_MESSAGE);							
						
					}catch (Exception ex ) {
						JOptionPane.showMessageDialog(null, ex);
					}
				}
			});
			
			
			btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtCi.setText(null);
					txtNombre.setText(null);
					txtTelefono.setText(null);
					txtDireccion.setText(null);
					txtGrupo.setText(null);
					dateChooser.setCalendar(null);
					
					
				}
			});
			
			btnVolverAgregar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FrmPrincipal MePri = new FrmPrincipal();
					MePri.setVisible(true);
					dispose();
				}
			});
			
			
			
			
		
	}
}
		

