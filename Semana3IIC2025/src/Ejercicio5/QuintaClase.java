package Ejercicio5;

import java.util.Scanner;

public class QuintaClase {
  
    public static void main(String[] args){
        //Cliclos
        //while
        //do while
        //for * hay 2 foreach y for normal
        
        int numero = 1;
        while ( numero <= 5 ){
            System.out.println(numero);
            //numero = numero + 1;
            //numero += 1;
            numero++;
        }
        
        Scanner e = new Scanner(System.in);
        String respuesta;
        while(true){
            
            System.out.println("Si desea no continuar digite sino");
            respuesta =e.next().toLowerCase();
            if (respuesta.equals("no")) {
                break;
            }
            
        }
        
        
        for (int j = 20; j <= 30; j++) {
            System.out.println(j);
        }
        
        
    }
    
    
}
