package ModeloClases;

public class Habitacion {
/*
    Cada clase debe de tener atributos y metodos
    
    Declaramos Atributos
    No es solo declarar por declarar, cada objeto va a poder utilizar estos atributos
    */
    //Sistema para reservar habitaciones de hotel 
    //ATRIBUTO 
    private double tamaño; 
    private int numeroHabitacion;
    private String tipoHabitacion;
    private int capacidadPersonas; 
    private double precio;
    private boolean estado; 
    
    
    //Crear los metodos GET y SET
    //cuando decimos GET srive para obtener la informacion
    //cuando es SET establecemos la informacion 
    public double getTamaño(){
        return tamaño;
    }
    
    public void setTamaño(  double tamaño  ){
        if (tamaño < 0) {
            System.out.println("No se permite numeros negativos");
        }else{
            this.tamaño = tamaño;
        }      
    }
    
    public int getNumeroHabitacion(){
        return numeroHabitacion;
    }
    
    public void setNumeroHabitacion(int numeroHabitacion){
        this.numeroHabitacion = numeroHabitacion;
    }
    
    
    //Crear un metodo que me muestre la habitacion 
    //encapsulamiento + tipo + nombre + parametros
    //public
    //private
    //protected
    //default
    //Tipos: void,String,int o cual tipo de datos privitivo
    public void mostrarInformacion(){
        System.out.println("Estoy en la habitacion: " + numeroHabitacion );
    }
    
}
