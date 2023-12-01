package logica;
import grafica.*;
import java.util.ArrayList;

public class ArrayAlumno { 
	
	private ArrayList<AlumnoVO> arrayAl;
	
	public ArrayAlumno() {
		arrayAl=new ArrayList<>();
	}
	
	public void agregar(AlumnoVO ReAl) {
		arrayAl.add(ReAl);
	}
	
	public AlumnoVO devolver(int i) {
		return(arrayAl.get(i));
	}
	
	public String toString() {
		String lista= "Alumnos:\n ";
		
		for(int i=0; i<arrayAl.size(); i++) {
			lista=lista+arrayAl.get(i).toString()+"\n";
		}
		return lista;
		//return "Alumnos:" + ArrayAl;
	}

	public int cantidad() {
		// TODO Auto-generated method stub
		return 0;
	}
}


