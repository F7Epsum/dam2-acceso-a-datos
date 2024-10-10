package RepasoJAVA;

class circulo extends Figura {

    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public void mostrarDimensiones(){
        System.out.println("l radio del circulo es: " + this.radio);
    }
}
