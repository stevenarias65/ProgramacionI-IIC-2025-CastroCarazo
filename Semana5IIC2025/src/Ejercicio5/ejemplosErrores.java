package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplosErrores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            System.out.println("El número ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Datos incorrectos");
        }catch (Exception e ){
            System.out.println("a ocurrido un error");
        }

    }
}
