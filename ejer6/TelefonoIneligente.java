package ejer6;

public class TelefonoIneligente extends Dispositivos implements Conectable {

    public String marca;

    public TelefonoIneligente(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "TelefonoIneligente{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public void setEncendido(String encendido) {
        super.setEncendido(encendido);
    }

    @Override
    public void setApagado(String apagado) {
        super.setApagado(apagado);
    }

    @Override
    public void conectarWifi() {

    }

    @Override
    public void desconectarWifi() {

    }
}

