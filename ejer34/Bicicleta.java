package ejer34;

public class Bicicleta extends Vehiculo{

   private String tipoBicicleta;

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public Bicicleta(double velocidadMaxima, String marca) {
        super(velocidadMaxima, marca);
    }

    public void acelerar() {
        System.out.println("Bicicleta Acelera");
    }

    public Bicicleta(double velocidadMaxima, String marca, String tipoBicicleta) {
        super(velocidadMaxima, marca);
        this.tipoBicicleta = tipoBicicleta;
    }
}
