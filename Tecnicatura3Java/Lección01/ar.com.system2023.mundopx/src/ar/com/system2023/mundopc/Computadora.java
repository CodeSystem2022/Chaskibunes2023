
package ar.com.system2023.mundopc;

public class Computadora {
    private final int IdComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private int getIdComputadora;
    private static int contadorComputadoras;

    // Constructor vacio
    private Computadora() {
        this.IdComputadora = ++Computadora.contadorComputadoras;
    }

    // Constructor 2
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Colocamos los getters and setters
    public int GetIdComputadora(int getIdComputadora) {
        return IdComputadora;
    }
    
    //Get de Nombre
    public String getNombre() {
        return nombre;
    }

    //Set de Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Get de Monitor
    public Monitor getMonitor() {
        return monitor;
    }

    //Set de Monitor
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    //Get de Teclado
    public Teclado getTeclado() {
        return teclado;
    }

    //Set de Teclado
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    //Get de Raton
    public Raton getRaton() {
        return raton;
    }

    //Set de Raton
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString(){
        return "Computadora{" + "idComputadora= " + IdComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado="+ teclado + ", raton=" + raton + "}";
    }
}
