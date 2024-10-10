package RepasoJAVA;

public class Calculadora {

    public double dividir(double numerador, double denominador) throws ArithmeticException{
        if (denominador == 0){
            throw new ArithmeticException("Error no se puede dividir entre 0");
        }
        return numerador / denominador;

    }

    public int factorial(int numero){
        if (numero<0){
            throw new IllegalArgumentException("error no se puede calcular el factorial de un numero negativo");
        }
        int resultado = 0;
        for (int i = 1; 1<=numero; i++){
            resultado += 1;
        }
        return resultado;
    }

}
