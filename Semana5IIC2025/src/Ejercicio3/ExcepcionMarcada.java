
package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExcepcionMarcada {
    
    //Atribitos
    //metodos
    
    public static void main(String[] args) throws IOException {
        
       
        try {
            leerdatos("text.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExcepcionMarcada.class.getName()).log(Level.SEVERE, null, ex);
        }
      
            
        
    }
    
    public static void leerdatos(String nombreArchivo) throws FileNotFoundException, IOException{
        BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo));
        String linea = leer.readLine();
        leer.close();
    }
    
    
}
