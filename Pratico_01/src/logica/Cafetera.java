package logica;

public class Cafetera extends Electrodomestico {
    
    private int capacidad;

    
    public Cafetera(String nombre, String marca, double consumo, int capacidad) {
        super(nombre, marca, consumo);
        this.capacidad = capacidad;
    }

    
    public int getCapacidad() {
        return capacidad;
    }

    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    @Override
    public String toString() {
        return "Cafetera{" +
                "nombre='" + getNombre() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", consumo=" + getConsumo() +
                ", capacidad=" + capacidad +
                '}';
    }

    
    @Override
    public double calculoConsumo(int horas) {
        
        if (capacidad == 1000) {
            return super.calculoConsumo(horas);
        } else {
            return super.calculoConsumo(horas) + 100;
        }
    }
}