package logica;

public class Electrodomestico {
	private String nombre;
    private String marca;
    private double consumo;

    
    public Electrodomestico(String nombre, String marca, double consumo) {
        this.nombre = nombre;
        this.marca = marca;
        this.consumo = consumo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getConsumo() {
        return consumo;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

   
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", consumo=" + consumo +
                '}';
    }

    
    public double calculoConsumo(int horas) {
        return consumo * horas;
    }
}
