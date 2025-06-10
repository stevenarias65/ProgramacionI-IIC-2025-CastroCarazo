
package Ejercicio6;


public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String indentificacion;
    private double altura; 
    
    //constructor
    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String nacionalidad, int edad, String indentificacion, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.indentificacion = indentificacion;
        this.altura = altura;
    }

    public Persona() {
    }
    
    
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
}
