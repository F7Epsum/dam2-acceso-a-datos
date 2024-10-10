package ejer34;

public class Coche extends Vehiculo {

    private double capacidadCombustible;

    public Coche(double velocidadMaxima, String marca) {
        super(velocidadMaxima, marca);
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void acelerar() {
        System.out.println("Coche Acelerando");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "capacidadCombustible=" + capacidadCombustible +
                '}';
    }
}
