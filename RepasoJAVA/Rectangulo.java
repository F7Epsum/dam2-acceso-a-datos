package RepasoJAVA;

public class Rectangulo extends Figura {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea(){
        return  this.ancho + this.largo;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (this.largo + this.ancho);
    }
}
