package Ejercicio4;

public class Ejemplothrow {

    public int factorial(int numero) {

        //1*2*3*4*5
        //1*2*3*4
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular el factorial");
        }

        if (numero > 12) {
            throw new IllegalArgumentException("Por limitaciones tecnicas, no puede ser un numero mayor a 12");

        }

        int factorial = 1;

        for (int i = 2; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

}
