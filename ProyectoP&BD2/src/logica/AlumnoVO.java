package logica;
//cambie el atributo de tipo Fecha por LocalDate
import grafica.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JTextField;
public class AlumnoVO {
	private int CIa; // Es la clave;
	private String nombre;
	private int telefono;
	private String direccion;
	private LocalDate fNac;
	private int edad;
	private String grupo;
	
	
	//Constructor por defecto
	public AlumnoVO(){//no va nada
		
	};
     //Constructor especifico
	public AlumnoVO(int CiAl, String NombreAl, int TelefonoAl, String DireccionAl, int EdadAl, String Grupo, LocalDate FechaNac) {
		
		this.CIa = CiAl;
		this.nombre = NombreAl;
		this.telefono = TelefonoAl;
		this.direccion = DireccionAl;
		this.fNac = FechaNac;
		this.edad = EdadAl;
		this.grupo = Grupo;
		

	}
	
	//Metodos Getters and Setters
	public int getCIa() {
		return CIa;
	}

	public void setCIa(int CiAl) {
		CIa = CiAl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String NombreAl) {
		this.nombre = NombreAl;
	}
	

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int TelefonoAl) {
		this.telefono = TelefonoAl;
	}
	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String DireccionAl) {
		this.direccion = DireccionAl;
	}
	
	public LocalDate getfNac() {
		return fNac;
	}

	public void setfNac(LocalDate FechaNac) {
		this.fNac = FechaNac;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int EdadAl) {
		this.edad = EdadAl;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String Grupo) {
		this.grupo = Grupo;
	}
	
	
	//Metodo ToString
	@Override
	public String toString() {
		return " Cedula: " + CIa + ", nombre: " + nombre + ", direccion: " + direccion + ", tel�fono: " + telefono
				+ ", Fecha de Nacimiento: " + fNac + ", edad: " + edad + ", grupo: " + grupo ;
	}

	


}


