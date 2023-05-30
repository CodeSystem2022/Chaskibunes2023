
package ar.com.system2023.mundopc;

import javax.lang.model.util.ElementScanner6;

public class Orden {
  private final int idOrden;
  private Computadora computadora[]; //Arreglo de objetos
  private static int ContadorOrdenes;
  private static final int MAX_COMPUTADORAS = 10;
  private int contadorComputadoras;

  //Constructor vacio
  public Orden(){
    this.idOrden = ++Orden.ContadorOrdenes;
    this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
  }

  //Metodo para agregar una nueva computadora al arrelgo
  public void agregarComputadora(Computadora computadora){
    if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
        this.computadora[this.contadorComputadoras++] = computadora;
    } else{ //Si se sepuera el numero de computadoras
        System.out.println("Has superado el limite: "+Orden.MAX_COMPUTADORAS);
    }
  }

  //Mostrar orden
  public void mostrarOrden(){
    System.out.println("Orden #: "+this.idOrden);
    System.out.println("Computadoras de la orden: "+this.idOrden);
    for(int i = 0; i < this.contadorComputadoras; i++){
        System.out.println(this.computadora[i]);
    }
  }
}
