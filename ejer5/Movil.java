package ejer5;

public class Movil implements Conectable, Regargable{

    @Override
    public void apagar() {
        System.out.println("Apagar movil");
    }

    @Override
    public void encender() {
        System.out.println("Encender movil");
    }

    @Override
    public int nivelDeBateria() {
        System.out.println(50);
    }

    @Override
    public void cargar() {
        System.out.println("Cargar Movil");
    }
}
