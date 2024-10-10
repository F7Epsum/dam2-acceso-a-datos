package ejer5;

public class PC implements Conectable, Regargable{

    @Override
    public void apagar() {
        System.out.println("Apagar PC");
    }

    @Override
    public void encender() {
        System.out.println("Encender PC");
    }

    @Override
    public void cargar() {
        System.out.println("cargar Movil");
    }

    @Override
    public int nivelDeBateria() {
        System.out.println(20);
    }
}
