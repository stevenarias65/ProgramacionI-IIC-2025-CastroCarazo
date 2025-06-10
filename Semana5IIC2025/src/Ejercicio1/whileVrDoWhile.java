package Ejercicio1;

import java.util.Scanner;

public class whileVrDoWhile {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
//        System.out.println("Digite un numero mayor a 0");
//        int num = e.nextInt();
//
//        while (num <= 0) {
//            System.out.println("numero no valido");
//            num = e.nextInt();
//        }
        int num;
        do {
            System.out.println("Digite un numero mayor a 0");
            num = e.nextInt();
        } while (num <= 0);

    }

}
