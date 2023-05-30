
package ar.com.system2023.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); //Llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca() {
        this.marca = marca;
    }
    public double getTaminio(){
        return this.tamanio;
    }
    public void setTamanio(double tamanio){
        this.tamanio  = tamanio;
    }
    //Ingresamos manuelmente el getldMonitor
    public int getldMonitor(){
        return this.idMonitor;
    }

    //Se coloca un override para incar marca tamaño y ID
    @Override
    public String toString(){
        return "Monitor{" + "idMonitor= " + idMonitor + ", marca=" + ", tamanio=" + "}";
    }
}
