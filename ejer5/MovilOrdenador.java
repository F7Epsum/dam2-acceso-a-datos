package ejer5;

public class MovilOrdenador {
    public static void main(String[] args) {

        Movil movil = new Movil();
        PC pc = new PC();

        movil.encender();
        movil.apagar();
        movil.cargar();
        movil.nivelDeBateria();

        pc.encender();
        pc.apagar();
        pc.cargar();
        pc.nivelDeBateria();

    }
}
