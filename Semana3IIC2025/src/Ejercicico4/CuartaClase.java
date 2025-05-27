
package Ejercicico4;

import java.util.Scanner;


public class CuartaClase {
    
    public static void main(String[] args) {
        
   
    
    Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el precio original del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();
       

        System.out.print("Ingrese el tipo de cliente (A, B, C): ");
        String tipoCliente = scanner.next();

        double descuento = 0;

      
        if (edad < 18) {
            descuento = 10;
        } else if (edad <= 60) {
            descuento = 5;
        } else {
            descuento = 15;
        }

        
        switch (tipoCliente) {
            case "A":
                descuento += 5;
                break;
            case "B":
                break;
            case "C":
                descuento += 10;
                break;
            default:
                System.out.println("Tipo de cliente no válido. No se aplicará descuento adicional.");
        }

        
        double precioFinal = precio - (precio * descuento / 100);

        
        System.out.println("Descuento total: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
 }
}
