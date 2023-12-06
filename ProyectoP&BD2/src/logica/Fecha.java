package logica;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	//Constructor por defecto;
	public Fecha() {
		
		}
	
	//Constructor espes�fico;
	public Fecha(int dia, int mes, int anio) {
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//Getter y Setters;
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	//ToString;
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio ;
	}

	public Object atStartOfDay() {
		// TODO Auto-generated method stub
		return null;
	}
}
















