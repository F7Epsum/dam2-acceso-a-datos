package RepasoJAVA;

abstract class Figura {

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarFigura() {
        System.out.println("Esto es una figura geometrica");
    }

}
