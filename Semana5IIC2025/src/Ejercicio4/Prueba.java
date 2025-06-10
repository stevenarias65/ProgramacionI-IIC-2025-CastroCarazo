package Ejercicio4;

public class Prueba {

    public static void main(String[] args) {
        try {
            Ejemplothrow objetoe = new Ejemplothrow();
            System.out.println(objetoe.factorial(12));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
