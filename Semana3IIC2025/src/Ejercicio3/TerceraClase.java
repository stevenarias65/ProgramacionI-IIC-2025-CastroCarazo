
package Ejercicio3;

import java.util.Scanner;

public class TerceraClase {
    
    public static void main(String[] args){
        //objeto o una instancia de una clase
        Scanner digitar = new Scanner(System.in);
        
        int edad = digitar.nextInt();
        
        if ( edad < 18 ){
            System.out.println("la persona es menor de edad");
        }else if (edad < 65){
            System.out.println("Es adulto ");
        }else{
            System.out.println("es adulto mayor");
        }
        
        
        int nota = digitar.nextInt();
        
        switch (nota) {
            case 10:
                System.out.println("tuvo un 10");
                break;
            case 9:
                System.out.println("tuvo un 9");
                break;
            case 8,7,6:
                System.out.println("tuvo un 8");
                break;
            default:
                System.out.println("Se quedo");
                break;
        }
        
        
        
    }
    
    
}
