
package domain;

import java.io.Serializable;

//"Serializable"--->Para poder trasndferirlo de un servidor a otro
public class Persona implements Serializable {
    
    private String nombre;
    private String apellido;
    
    //requerimiento obligatorio: Constructor vacio
    public Persona(){
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Se implementan los get y set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //se puede agragar como complemento pero no haria falta
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
