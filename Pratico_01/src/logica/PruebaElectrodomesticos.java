package logica;

public class PruebaElectrodomesticos {
    public static void main(String[] args) {
        
        Electrodomestico electrodomestico1 = new Electrodomestico("Lavadora", "Samsung", 1.5);
        Electrodomestico electrodomestico2 = new Electrodomestico("Refrigerador", "LG", 2.0);

        
        System.out.println("Datos del electrodomestico 1:");
        System.out.println(electrodomestico1.toString());
        System.out.println("Consumo para 5 horas: " + electrodomestico1.calculoConsumo(5));

        System.out.println("\nDatos del electrodomestico 2:");
        System.out.println(electrodomestico2.toString());
        System.out.println("Consumo para 3 horas: " + electrodomestico2.calculoConsumo(3));
    }
}
