package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1 {

    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);

            int x = 10;
            int y, z;

            System.out.println("Ingrese un valor");
            y = s.nextInt();

            z = x / y;

            System.out.println("el valor es " + z);
            
        } catch (ArithmeticException ae) {
            System.out.println("No se puede divir entre 0");
            System.out.println(ae.getMessage());
        } catch (InputMismatchException ex){
            System.out.println("Dato incorrecto, deben de ser numeros");
        }catch (Exception e){
            System.out.println("Ocurrio un error, intente de nuevo");
            System.out.println(e.getMessage());
        }

    }
}
