package RepasoJAVA;

public class TrabajandoConClases {

    public static void main(String[] args) {
//        Persona persona1 = new Persona("Federico", 31, 78);
//        Persona persona2 = new Persona();
//
//        System.out.println(persona1.getNombre());
//        System.out.println(persona1.getEdad());
//
//        System.out.println();
//
//        persona2.setNombre("Pepe");
//        persona2.setEdad(30);
//        persona2.setPeso(80);
//        System.out.println(persona2.toString());
//
//        Perro perro1 =new Perro("Duque", 10);
//        perro1.hacerSonido();

//        Calculadora calculadora = new Calculadora();
//        try {
//            double resultadoDivision = calculadora.dividir(10, 2);
//            System.out.println("Resultado division " + resultadoDivision);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }

        Figura circulo = new circulo(5);
        circulo.mostrarFigura();
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

//        Figura Recangulo = new Rectangulo(5);
//        Recangulo.mostrarFigura();
//        System.out.println("Area del Recangulo: " + Recangulo.calcularArea());
//        System.out.println("Perimetro del Recangulo: " + Recangulo.calcularPerimetro());


    }
}
