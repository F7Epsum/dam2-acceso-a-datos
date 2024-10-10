package ejer6;

public class DispositivosMain {

    public static void main(String[] args) {
        TelefonoIneligente ti = new TelefonoIneligente("Apple");
        Tablet tab = new Tablet("Samsung");

        tab.setEncendido("Dispositivo encendido");
        System.out.println("Tablet encendido");
        ti.setEncendido("Dispositivo encendido");
        System.out.println("Movil encendido");

        ti.conectarWifi();
        tab.conectarWifi();

        ti.desconectarWifi();
        tab.desconectarWifi();
    }

}
