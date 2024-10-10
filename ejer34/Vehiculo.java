package ejer34;

public class Vehiculo {

    private double velocidadMaxima;
    private String marca;

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(double velocidadMaxima, String marca) {
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", marca='" + marca + '\'' +
                '}';
    }
}
